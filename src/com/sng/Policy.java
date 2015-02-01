package com.sng;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;

public class Policy {
	public static int ABONAMENT = 0;
	public static int PREPAID = 1;
	int clientProfile;
	String directory;
	String freeOfChargeNumber;
	double remainingMinutes;
	double moneyToSpend;
	double moneySpent;
	DecimalFormat df = new DecimalFormat();
	
	public Policy(String dir)
	{
		Properties.directory = "Policies/"+dir+".txt";
		readPolicy(Properties.directory);
		df.setMaximumFractionDigits(2);
	    df.setMinimumFractionDigits(2);
	}
	
	public void readPolicy(String dir)
	{
		try
		{
			  FileInputStream fstream = new FileInputStream(dir);
			  // Get the object of DataInputStream
			  DataInputStream in = new DataInputStream(fstream);
			  BufferedReader br = new BufferedReader(new InputStreamReader(in));
			  String strLine;
			  //Read File Line By Line
			  while ((strLine = br.readLine()) != null)   
			  {
				  if(strLine.startsWith("<CLIENT PROFILE>"))
				  {
					  while(!(strLine = br.readLine()).equals("</CLIENT PROFILE>"))
					  {
						  String clntProfile = strLine.substring(strLine.indexOf("\"")+1, strLine.lastIndexOf("\""));
						  if (clntProfile.equals("ABONAMENT"))
						  {
							  clientProfile = ABONAMENT;
						  }
						  else if (clntProfile.equals("PREPAID"))
						  {
							  clientProfile = PREPAID;
						  }
					  }
				  }
				  if(strLine.startsWith("<FREE OF CHARGE NUMBER>"))
				  {
					  while(!(strLine = br.readLine()).equals("</FREE OF CHARGE NUMBER>"))
					  {
						  freeOfChargeNumber = strLine.substring(strLine.indexOf("\"")+1, strLine.lastIndexOf("\""));
					  }
				  }
				  if(strLine.startsWith("<REMAINING MINUTES>"))
				  {
					  while(!(strLine = br.readLine()).equals("</REMAINING MINUTES>"))
					  {
						  remainingMinutes = Double.parseDouble(strLine.substring(strLine.indexOf("\"")+1, strLine.lastIndexOf("\"")));
					  }
				  }
				  if(strLine.startsWith("<MONEY TO SPEND>"))
				  {
					  while(!(strLine = br.readLine()).equals("</MONEY TO SPEND>"))
					  {
						  moneyToSpend = Double.parseDouble(strLine.substring(strLine.indexOf("\"")+1, strLine.lastIndexOf("\"")));
					  }
				  }
				  if(strLine.startsWith("<MONEY SPENT>"))
				  {
					  while(!(strLine = br.readLine()).equals("</MONEY SPENT>"))
					  {
						  moneySpent = Double.parseDouble(strLine.substring(strLine.indexOf("\"")+1, strLine.lastIndexOf("\"")));
					  }
				  }
			  }
			  //Close the input stream
			  in.close();
		}
		catch (Exception e)
		{	//Catch exception if any
			  System.err.println("Error: " + e.getMessage());
		}
	}
	
	public void writePolicy(String fOCN, double rM, double mTS, double mS)
	{
		freeOfChargeNumber = fOCN;
		remainingMinutes = rM;
		moneyToSpend = mTS;
		moneySpent = mS;
		String str = new String();
		str = str.concat("<CLIENT PROFILE>\r\n");
		if (clientProfile == ABONAMENT)
		{
			str = str.concat("<VALUE=\"ABONAMENT\">\r\n");
		}
		else if (clientProfile == PREPAID)
		{
			str = str.concat("\t<VALUE=\"PREPAID\">\r\n");
		}
		str = str.concat("</CLIENT PROFILE>\r\n");
		str = str.concat("\r\n");
		
		str = str.concat("<FREE OF CHARGE NUMBER>\r\n");
		str = str.concat("\t<VALUE=\""+fOCN+"\">\r\n");
		str = str.concat("</FREE OF CHARGE NUMBER>\r\n");
		str = str.concat("\r\n");
		
		str = str.concat("<REMAINING MINUTES>\r\n");
		str = str.concat("\t<VALUE=\""+df.format(rM).replace(',','.')+"\">\r\n");
		str = str.concat("</REMAINING MINUTES>\r\n");
		str = str.concat("\r\n");
		
		str = str.concat("<MONEY TO SPEND>\r\n");
		str = str.concat("\t<VALUE=\""+df.format(mTS).replace(',','.')+"\">\r\n");
		str = str.concat("</MONEY TO SPEND>\r\n");
		str = str.concat("\r\n");

		str = str.concat("<MONEY SPENT>\r\n");
		str = str.concat("\t<VALUE=\""+df.format(mS).replace(',','.')+"\">\r\n");
		str = str.concat("</MONEY SPENT>\r\n");
		str = str.concat("\r\n");
		
		try
		{
			FileOutputStream fstream = new FileOutputStream(Properties.directory);
			//Get the object of DataInputStream
			DataOutputStream out = new DataOutputStream(fstream);
			BufferedWriter br = new BufferedWriter(new OutputStreamWriter(out));
			//Close the input stream
			br.write(str);
			br.close();
			out.close();
		}
		catch (Exception e)
		{	//Catch exception if any
			  System.err.println("Error: " + e.getMessage());
		}
	}
}
	
