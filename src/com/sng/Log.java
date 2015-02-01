package com.sng;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import org.apache.log4j.Logger;

import com.alcatel.ServerHTTP.ServerHttp;
import com.alcatel.xmlapi.common.AlcServiceException;
import com.alcatel.xmlapi.framework.XmlApiFramework;
import com.alcatel.xmlapi.framework.XmlApiFrameworkService;
import com.alcatel.xmlapi.framework.XmlApiFrameworkServiceLocator;
import com.alcatel.xmlapi.phone.AlcLogonResult;
import com.alcatel.xmlapi.phone.XmlPhone;
import com.alcatel.xmlapi.phone.XmlPhoneServiceLocator;

public class Log extends JPanel implements ActionListener{
	
	private XmlApiFramework xmlApiFramework = null;
	private String idSesji = null;
	private XmlPhone xmlPhoneSerwis = null;
	private AlcLogonResult alr = null;
	
	
	JButton Submit;
	JButton Close;
	JPanel panel;
	JLabel label1,label2,label3;
	JTextField  text1,text2;
	JComboBox cp;

	ApplicationLogicPanel logic;
	MainWindow mw;
	protected final Logger log = Logger.getLogger(getClass());
	
	public Log(MainWindow mainw){
		logic = mainw.window;
		mw = mainw;
		mw.properties = new Properties();
		  //setDefaultCloseOperation(HIDE_ON_CLOSE);
		  label1 = new JLabel();
		  label1.setText("User:");
		  text1 = new JTextField(15);
		  text1.setText("403");
	
		  label2 = new JLabel();
		  label2.setText("Password:");
		  text2 = new JPasswordField(15);
		  text2.setText("123");
		  
		  label3 = new JLabel();
		  label3.setText("Policy:");
		  String[] clntPrfl = { "ABONAMENT", "PREPAID"};
		  cp = new JComboBox(clntPrfl);
		  cp.setSelectedIndex(0);
		  cp.addActionListener(this);
		 
		  Submit=new JButton("Log in");
		  Submit.setActionCommand("Login");
		  Close = new JButton("Close");	  
		  Close.setActionCommand("Close");
		  panel=new JPanel(new GridLayout(4,1));
		  panel.add(label1);
		  panel.add(text1);
		  panel.add(label2);
		  panel.add(text2);
		  panel.add(label3);
		  panel.add(cp);
		  panel.add(Submit);
		  panel.add(Close);
		  add(panel,BorderLayout.CENTER);
		  Submit.addActionListener(this);
		  Close.addActionListener(this);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent event) {
		if (event.getActionCommand().equals("Login"))
		{
				Properties.user = text1.getText();
				Properties.pass = text2.getText();
				zalogujDoApiFramework();
				zalogujDoXmlPhone();
				this.log.info("\t\t\t-> LOGGED IN!");
				logic.aktywujPobStPol();
				this.mw.policy = new Policy((String)cp.getSelectedItem());
				this.mw.window.logged = true;
				this.mw.window.logOutButton.setEnabled(true);
				this.mw.window.policyButton.setEnabled(true);
				this.mw.getPane().setRightComponent(null);
				this.mw.revalidate();
				this.mw.pack();
		}
		else if(event.getActionCommand().equals("Close"))
		{
			this.log.info("\t\t\t Closed LogIn Window!");
			this.mw.getPane().setRightComponent(null);
			this.mw.revalidate();
			this.mw.pack();
		}
	}
	
	private void zalogujDoApiFramework()
	{
		this.log.info("\t\t\t\n-> LOGGING TO XmlFramework");
		inicjalizujSerwis();
 					
		try 
		{
			this.log.info("\t\t\tuser"+Properties.user);
			this.log.info("\t\t\tpass"+Properties.pass);
			
			idSesji = xmlApiFramework.login(null, "user"+Properties.user, Properties.pass);
		} 
		catch (Exception w) 
		{
			w.printStackTrace();
			String text = "Enter the valid username and password!";
		  System.out.println(text.toUpperCase());
		  JOptionPane.showMessageDialog(new JFrame(),
				    "Incorrect login or password.",
				    "Inane error",
				    JOptionPane.ERROR_MESSAGE); 
		  this.log.error("Incorrect login or password.");
//		  prepareLoginDialog();

		}
		
		if(idSesji != null)
			this.log.info("\t\t\t-> SESSION ID OBTAINED");
			inicjalizujSerwis();
	}
	
	//inicjalizacja serwisu XML API Framework
	private void inicjalizujSerwis()
    {
		this.log.info("\t\t\t\n-> INITIALIZING...");

    	try 
    	{
			XmlApiFrameworkService serwis = new XmlApiFrameworkServiceLocator();
			if (idSesji != null) 
				xmlApiFramework = serwis.getXmlApiFramework
						(new URL(Properties.apiFwUrl + "/api/services/2.2/XMLApiFramework?ApiSessionId=" + idSesji));
			else 
				xmlApiFramework = serwis.getXmlApiFramework
						(new URL(Properties.apiFwUrl + "/api/services/2.2/XMLApiFramework"));
		} 
		catch (Exception w) 
		{
			w.printStackTrace();
		}
	}
	
	//logowanie do Web Serwisu XMLPhone
	private void zalogujDoXmlPhone()
	{
		this.log.info("\t\t\t-> LOGGING TO XmlPhone");
		if(idSesji != null)
		{
			XmlPhoneServiceLocator serwis = new XmlPhoneServiceLocator();
			this.log.info("\t\t\tDB log do XmlPhone 1");
			try 
			{
				xmlPhoneSerwis = serwis.getXmlPhone
						(new URL(Properties.apiFwUrl + "/api/services/2.2/XMLPhone?ApiSessionId=" + idSesji));
				this.log.info("\t\t\tDB log do XmlPhone 2");
				alr = xmlPhoneSerwis.login();
				this.log.info("\t\t\tDB log do XmlPhone 3");
			}
			catch(Exception w) 
			{	
				this.log.error("Error during obtaining ID");
				//w.printStackTrace();
			}
		}
	}

	public void wyloguj(){

		try{
			if (xmlPhoneSerwis != null && xmlApiFramework != null)
			{
				xmlPhoneSerwis.unsubscribe(alr.getSessionId());
				xmlPhoneSerwis.logout(alr.getSessionId());
				xmlApiFramework.logout();
				
			}
		}catch(AlcServiceException e){
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
		this.log.info("\t\t\t-> LOGGED OUT!");
	}

	public String getApiFwUrl() {
		return Properties.apiFwUrl;
	}



	public void setApiFwUrl(String apiFwUrl) {
		Properties.apiFwUrl = apiFwUrl;
	}



	public XmlApiFramework getXmlApiFramework() {
		return xmlApiFramework;
	}



	public void setXmlApiFramework(XmlApiFramework xmlApiFramework) {
		this.xmlApiFramework = xmlApiFramework;
	}



	public String getIdSesji() {
		return idSesji;
	}



	public void setIdSesji(String idSesji) {
		this.idSesji = idSesji;
	}



	public XmlPhone getXmlPhoneSerwis() {
		return xmlPhoneSerwis;
	}



	public void setXmlPhoneSerwis(XmlPhone xmlPhoneSerwis) {
		this.xmlPhoneSerwis = xmlPhoneSerwis;
	}



	public AlcLogonResult getAlr() {
		return alr;
	}



	public void setAlr(AlcLogonResult alr) {
		this.alr = alr;
	}



	public String getUser() {
		return Properties.user;
	}



	public void setUser(String user) {
		Properties.user = user;
	}



	public String getPass() {
		return Properties.pass;
	}



	public void setPass(String pass) {
		Properties.pass = pass;
	}


	
	
	
	


}
