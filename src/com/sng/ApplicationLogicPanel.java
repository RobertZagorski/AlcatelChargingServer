package com.sng;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.InetAddress;
import java.rmi.RemoteException;
import java.text.DecimalFormat;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import org.apache.log4j.Logger;

import com.alcatel.ServerHTTP.AlcEventsRessource;
import com.alcatel.ServerHTTP.ServerHttp;
import com.alcatel.xmlapi.common.AlcServiceException;
import com.alcatel.xmlapi.phone.AlcLogonResult;
import com.alcatel.xmlapi.phone.AlcStatus;
import com.alcatel.xmlapi.phone.Call;
import com.alcatel.xmlapi.phone.CallState;
import com.alcatel.xmlapi.phone.ClearCallInvoke;
import com.alcatel.xmlapi.phone.MakeCallInvoke;
import com.alcatel.xmlapi.phone.NomadMode;
import com.alcatel.xmlapi.phone.TakeCallInvoke;
import com.alcatel.xmlapi.phone.XmlPhone;
import com.alcatel.xmlapi.phone.XmlPhoneEvents;
import com.alcatel.xmlapi.phonesetprogramming.types.AlcForwardTargetType;
import com.alcatel.xmlapi.phonesetprogramming.types.AlcForwardType;
import com.alcatel.xmlapi.phonesetprogramming.types.AlcOverflowType;
import com.alcatel.xmlapi.phonesetprogramming.types.AlcStaticState;

public class ApplicationLogicPanel extends JPanel implements ActionListener, XmlPhoneEvents {

	private static final long serialVersionUID = 1L;
	//Pola tworzące okno
	MainWindow mainframe;
	GroupLayout layout;
	JLabel mainButtonsLabel;
	JPanel mainButtonPanel;
	JTextField mainButtons;
	JButton logInButton;
	JButton logOutButton;
	JButton policyButton;
	JButton endButton;
	
	//Pola od Alcatela
	private AlcLogonResult alr = null;
	private XmlPhone xmlPhone = null;
	private ServerHttp lServerHttp;
	private AlcEventsRessource lEventsRessource;
	
	//Zmienne konieczne do realizacji projektu
	boolean logged;
	boolean freeOfCharge;
	boolean outgoingCall;
	private long startCallTime;
	private long endCallTime;
	private double callDuration;
	private Thread mCT;
	DecimalFormat df = new DecimalFormat();
	
	//Log4j
	protected final Logger log = Logger.getLogger(getClass());
	
	
	public ApplicationLogicPanel(MainWindow main)	{
		layout = new GroupLayout(this);
		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);
		this.mainframe = main;
		this.requestFocusInWindow();
		setDoubleBuffered(true);
		CreateLayout();
		super.setName("SNG");
		this.setLayout(layout);
		df.setMaximumFractionDigits(2);
	    df.setMinimumFractionDigits(2);
		
		// Creation of the instance of ServerHttp
		lServerHttp = ServerHttp.instance(/*m_httpServerPort*/Properties.m_httpServerPort);
		this.log.debug("\t\t\tCreated ServerHttp");
		
		// creation of event ressource
		lEventsRessource = new AlcEventsRessource(this, /*EVENT_CONTEXT*/Properties.EVENT_CONTEXT);
		this.log.debug("\t\t\tCreated AlcEventsRessource");
		logged=false;
	}
	
	private void CreateLayout() {
		mainButtonsLabel = createMainButtonsLabel();
		logInButton = createLogInButton();
		logOutButton = createLogOutButton();
		policyButton = createPolicyButton();
		endButton = createEndButton();
		
		layout.setHorizontalGroup(layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				     	.addComponent(mainButtonsLabel)
				     	.addComponent(logInButton)
				     	.addComponent(logOutButton)
				     	.addComponent(policyButton)
				     	.addComponent(endButton))
			);
		java.awt.Component[] comps = {mainButtonsLabel, 
									  logInButton,
									  logOutButton,
									  policyButton,
									  endButton};
		layout.linkSize(SwingConstants.HORIZONTAL, comps);
		layout.setVerticalGroup(layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				        .addComponent(mainButtonsLabel))
				    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    	.addComponent(logInButton))
				    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    	.addComponent(logOutButton))
				    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    	.addComponent(policyButton))
				    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				    	.addComponent(endButton))
			);
		
		
	}
	
	private JLabel createMainButtonsLabel()
	{
		JLabel label = new JLabel("Panel startowy. Wybierz akcję.");
		return label;
		
	}

	private JButton createLogInButton() {
		logInButton = new JButton("Zaloguj");
		logInButton.setActionCommand("Zaloguj");
		logInButton.addActionListener(this);
		return logInButton;
	}
	
	private JButton createLogOutButton() {
		logOutButton = new JButton("Wyloguj");
		logOutButton.setActionCommand("Wyloguj");
		logOutButton.setEnabled(false);
		logOutButton.addActionListener(this);
		return logOutButton;
	}
	
	private JButton createPolicyButton() {
		policyButton = new JButton("Pokaż polisę");
		policyButton.setActionCommand("Pokaż polisę");
		policyButton.setEnabled(false);
		policyButton.addActionListener(this);
		return policyButton;
	}
	
	private JButton createEndButton() {
		endButton = new JButton("Zakończ");
		endButton.setActionCommand("Zakończ");
		endButton.addActionListener(this);
		return endButton;
	}

	public void actionPerformed(ActionEvent e) {
		if ("Zaloguj".equals(e.getActionCommand()))
		{
			this.log.debug("\t\t\tOpened LogInWindow");
			this.mainframe.getPane().setRightComponent(this.mainframe.logWindow);
			this.mainframe.pack();
			this.mainframe.revalidate();
		}
		else if ("Wyloguj".equals(e.getActionCommand()))
		{
			this.log.debug("\t\t\tUser logged out");
			this.mainframe.logWindow.wyloguj();
		}
		
		else if ("Pokaż polisę".equals(e.getActionCommand()))
		{
			this.log.debug("\t\t\tPolicy shown");
			this.mainframe.getPane().setRightComponent(this.mainframe.policyTable);
			this.mainframe.policyTable.fill();
			this.mainframe.pack();
			this.mainframe.revalidate();
		}
		
		else if ("Zakończ".equals(e.getActionCommand()))
		{
			this.log.debug("\t\t\tProgram exit");
			if(logged==true)
				this.mainframe.logWindow.wyloguj();
			System.exit(0);
		}
		else JOptionPane.showMessageDialog(mainframe, "Wystąpił błąd. Spróbuj ponownie.", "Błąd", JOptionPane.ERROR_MESSAGE);		
	}

	//aktywowanie pobierania stanu polaczen
	public void aktywujPobStPol()
	{
		
		xmlPhone = this.mainframe.logWindow.getXmlPhoneSerwis();
		alr = this.mainframe.logWindow.getAlr();
		this.log.debug("\t\t\t\n-> READING CALL STATES ENABLED");
		
		if (xmlPhone != null) 
		{
			try 
			{
				xmlPhone.subscribe(alr.getSessionId(), Properties.getNotifUrl());
			}
			catch (RemoteException e) {
				System.out.println("subscribe RemoteException : " + e);
			}
		}
		
	}
	
	//metody okreslone w interfejsie XmlPhoneEvents
		public void onCallState(java.lang.String sessionId, Call[] calls) throws java.rmi.RemoteException 
		{	
			this.log.info("\t\t\tonCallStateEvent-------------------");
			if (calls == null) 
			{
				this.log.info("\t\t\tNo calls");
				
				try
				{
					xmlPhone.clearCurrentCall(alr.getSessionId());
				}
				catch(Exception w)
				{
					w.printStackTrace();
				}
			}
			else {
				for (int i = 0; i < calls.length; i++) {
					this.log.info("\t\t\t" + (i+1) + " - ref=" + calls[i].getCallRef() + " / state=" + calls[i].getState().toString() + " (" + calls[i].getName() + " - " + calls[i].getNumber() + ")");
					/////////////////////////////
					if (calls[i].getState().toString().equals("dialing")) 
					{
						this.log.info("\t\t\tState DIALLING");
					}
					if (calls[i].getState().toString().equals("waiting") || calls[i].getState().toString().equals("held"))
					{
						this.log.info("\t\t\tState WAITING");
					}
					////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
					if (calls[i].getState().toString().equals("ringingIncoming"))
					{
						this.log.info("\t\t\tState RINGINGINCOMING");
						String incNumber = calls[i].getNumber();
						this.log.info("\t\t\tFrom: "+incNumber);
						takeCallOperation(calls[i]);
					}				
					////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
					if (calls[i].getState().toString().equals("ringingOutgoing"))
					{
						this.log.info("\t\t\tState RINGINGOUTGOING");
						String outNumber = calls[i].getNumber();
						this.log.info("\t\t\tTo: "+outNumber);
						freeOfCharge=false;
						outgoingCall=true;
						//TODO Sprawdzić poprawność z Polisą
						//Sprawdzić czy numer jest darmowy
						this.log.info("\t\t\tChecking if the called number is Free Of Charge Number: "+this.mainframe.policy.freeOfChargeNumber);
						if (outNumber.equals(this.mainframe.policy.freeOfChargeNumber))
						{
							//Zezwól na połączenie
							this.log.info("\t\t\tFree of charge number");
							//makeCallOperation(calls[i].getNumber());
							freeOfCharge=true;
						}
						else
						{
							//Jeżeli nie jest to numer specjalny
							//Sprawdzenie czy użytkownik ma polisę PREPAID czy ABONAMENT
							if (this.mainframe.policy.clientProfile == Policy.PREPAID)
							{
								//Jeśli są środki do wykorzystania
								if (this.mainframe.policy.moneyToSpend > 0)
								{
									//Zezwól na połączenie
									//makeCallOperation(calls[i].getNumber());
									freeOfCharge=false;
								}
								else if (this.mainframe.policy.moneyToSpend <= 0)
								{
									//Odrzuć możliwość połączenia
									clearCallOperation(calls[i]);
									this.log.info("\t\t\tNo money");
								}
							}
							else if (this.mainframe.policy.clientProfile == Policy.ABONAMENT)
							{
								//Zezwól na połączenie zawsze dla użytkownika o profilu ABONAMENT
								//makeCallOperation(calls[i].getNumber());
								freeOfCharge=false;
							}
						}
						
						////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
					}	
					if (calls[i].getState().toString().equals("active"))
					{
						this.log.info("\t\t\tState ACTIVE");
						String activeCallNumber = calls[i].getNumber();
						this.log.info("\t\t\tactiveCallNumber: "+activeCallNumber);
						double maxcalltime = (this.mainframe.policy.moneyToSpend)/Properties.costPerMinute;
						this.log.info("\t\t\tMax call time: "+df.format(maxcalltime)+" min");
						if (this.mainframe.policy.clientProfile == Policy.PREPAID)
						{
							mCT = new Thread(new maxCallTime(calls[i],maxcalltime));
							mCT.start();
						}
						this.log.info("\t\t\tCall "+calls[i].getCallRef()+" started");
						startCallTime = System.currentTimeMillis();
					}
					if (calls[i].getState().toString().equals("releasing"))
					{
						this.log.info("\t\t\tState RELEASING");
						//Połączenie jest w fazie rozłączania
						if (this.mainframe.policy.clientProfile == Policy.PREPAID)
							if (mCT.isAlive())
								mCT.interrupt();
						//Obliczanie czasu rozmowy
						this.log.info("\t\t\tCall "+calls[i].getCallRef()+" ended");
						endCallTime = System.currentTimeMillis();
						callDuration = (endCallTime - startCallTime)/1000;
						this.log.info("\t\t\tCall duration: "+df.format(callDuration)+ " s");
						callDuration/=60;
						this.log.info("\t\t\tCall duration: "+df.format(callDuration)+ " min");
						double cost = callDuration*Properties.costPerMinute;
						this.log.info("\t\t\tCost: "+df.format(cost));
						//Obliczanie kosztu rozmowy
						if (freeOfCharge==false)
						{
							if(outgoingCall==true)
							{
								this.log.info("\t\t\tCall was not free of charge");
								if (this.mainframe.policy.clientProfile == Policy.PREPAID)
								{ 
									if (this.mainframe.policy.moneySpent >= 0)
									{
										this.mainframe.policy.moneySpent += cost;
										this.log.info("\t\t\tAbsolute cost: "+df.format(this.mainframe.policy.moneySpent));
									}
									if ((this.mainframe.policy.moneyToSpend - cost) > 0)
										this.mainframe.policy.moneyToSpend -= cost;
									else
										this.mainframe.policy.moneyToSpend = 0;
								}
								else if (this.mainframe.policy.clientProfile == Policy.ABONAMENT)
								{
									if ((this.mainframe.policy.remainingMinutes - callDuration) >= 0.0)
									{
										this.mainframe.policy.moneySpent = 0;
										this.mainframe.policy.remainingMinutes -= callDuration;
									}
									else
									{
										this.mainframe.policy.moneySpent += (callDuration - this.mainframe.policy.remainingMinutes)*Properties.costPerMinute;
										this.mainframe.policy.remainingMinutes = 0;
									}
								}
								//Obliczenie pozostałych minut
								this.log.info("\t\t\tRemaining minutes in policy: "+df.format(this.mainframe.policy.remainingMinutes));
								this.log.info("\t\t\tMoney spent: "+df.format(this.mainframe.policy.moneySpent));
								this.log.info("\t\t\tMoney to spend: "+df.format(this.mainframe.policy.moneyToSpend));
								this.mainframe.policy.writePolicy(this.mainframe.policy.freeOfChargeNumber, 
																  this.mainframe.policy.remainingMinutes,
																  this.mainframe.policy.moneyToSpend, 
																  this.mainframe.policy.moneySpent);
							}
							else
							{
								this.log.info("\t\t\tNo cost. Other side was calling");
							}
						}
						else
						{
							this.log.info("\t\t\tNo cost. Free of charge number called");
						}
						startCallTime = 0;
						endCallTime = 0;
						callDuration = 0;
						outgoingCall=false;
						cost=0;
						mCT = null;
					}
					////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
					if ((calls[i].getCorrelator() != null) && (!calls[i].getCorrelator().equals(""))) 
					{
						this.log.info("\t\t\t [Correlator = " + org.apache.axis.types.HexBinary.encode(calls[i].getCorrelator()) + "]");
					
					}
				}
			}
			this.log.info("\t\t\t-------------------");
		}
		
		public void makeCallOperation(String number)
		{
			MakeCallInvoke mci = new MakeCallInvoke();
			mci.setCallee(number);
			mci.setSessionId(alr.getSessionId());
			try
			{
				xmlPhone.makeCall(mci);
				this.log.info("\t\t\t\n\nCall to " + number + " MADE.");
			}
			catch(Exception w)
			{
				w.printStackTrace();
			}
		}
		
		private void clearCallOperation(Call call_)
		{
			ClearCallInvoke cci = new ClearCallInvoke();
			cci.setCallRef(call_.getCallRef());
			cci.setSessionId(alr.getSessionId());
			try {
				xmlPhone.clearCall(cci); // lub clearCurrentCall
			} catch (AlcServiceException e) {
				e.printStackTrace();
			} catch (RemoteException e) {
				e.printStackTrace();
			}										
			this.log.info("\t\t\tCall to " + call_.getNumber() + " CLEARED.");
		}
		
		public void takeCallOperation(Call call_)
		{
			TakeCallInvoke tci = new TakeCallInvoke();
			tci.setSessionId(alr.getSessionId());
			tci.setCallRef(call_.getCallRef());
			AlcStatus t = new AlcStatus();
			try {
				t = xmlPhone.takeCall(tci);
				this.log.info(String.valueOf(t.getCode()));
				this.log.info("\t\t\tCall from " + call_.getNumber() + " TAKEN.");
			} catch (AlcServiceException e) {
				e.printStackTrace();
			} catch (RemoteException e) {
				e.printStackTrace();
			}

		}
	
		public void onNewSession(java.lang.String sessionId) throws java.rmi.RemoteException 
		{
			this.log.info("\t\t\tonNewSession-------------------");
		}

		public void onSessionClosed(java.lang.String sessionId) throws java.rmi.RemoteException 
		{
			this.log.info("\t\t\tonSessionClosed-------------------");
		}

		public void onConnectionDown() throws java.rmi.RemoteException 
		{
			this.log.info("\t\t\tonConnectionDown-------------------");
		}

		public void onPhoneSetStaticState(String sessionId, AlcStaticState state) throws RemoteException 
		{
			this.log.info("\t\t\tonPhoneSetStaticState-------------------");
			if ((state.getForwardState() != null) && (state.getForwardState().getType() != null)) {
				if (state.getForwardState().getType() == AlcForwardType.NO_FORWARD) {
					this.log.info("\t\t\tNo forward");
				}
				else {
					if (state.getForwardState().getType() == AlcForwardType.IMMEDIATE) {
						this.log.info("\t\t\t\tImmediate forward ");
					}
					else if (state.getForwardState().getType() == AlcForwardType.ON_BUSY) {
						this.log.info("\t\t\t\tForward on busy ");
					}
					else if (state.getForwardState().getType() == AlcForwardType.ON_NO_ANSWER) {
						this.log.info("\t\t\t\tForward on no answer ");
					}
					else if (state.getForwardState().getType() == AlcForwardType.ON_BUSY_OR_NO_ANSWER) {
						this.log.info("\t\t\t\tForward on busy or no answer ");
					}
					
					if (state.getForwardState().getTargetType() == AlcForwardTargetType.VOICE_MAIL) {
						this.log.info("\t\t\t\tto voicemail");
					}
					else if (state.getForwardState().getTargetType() == AlcForwardTargetType.ROUTING_SERVICE) {
						this.log.info("\t\t\t\tto routing service");
					}
					else {
						this.log.info("\t\t\t\tto " + state.getForwardState().getTargetNumber() + "(" + state.getForwardState().getFirstName() + " " + state.getForwardState().getName() + ")");
					}
				}
			}
			else {
				this.log.info("\t\t\tNo forward");
			}
			
			if (state.getOverflowType() == AlcOverflowType.NO_OVERFLOW) {
				this.log.info("\t\t\tNo overflow");	
			}
			else if (state.getOverflowType() == AlcOverflowType.ON_BUSY) {
				this.log.info("\t\t\t\tOverflow on busy");	
			}
			else if (state.getOverflowType() == AlcOverflowType.ON_NO_ANSWER) {
				this.log.info("\t\t\t\tOverflow on no answer");	
			}
			else if (state.getOverflowType() == AlcOverflowType.ON_BUSY_OR_NO_ANSWER) {
				this.log.info("\t\t\t\tOverflow on busy or no answer");	
			}
			
			this.log.info("\t\t\tLock " + (state.isLocked() ? "enabled" : "disabled"));
			this.log.info("\t\t\tDo not disturb " + (state.isDoNotDisturbActivated() ? "enabled" : "disabled"));
			this.log.info("\t\t\tCamp on " + (state.isCampOnActivated() ? "enabled" : "disabled"));
			this.log.info("\t\t\t-------------------\n");
		}

		public void onUnansweredCall(String sessionId) throws RemoteException 
		{
			this.log.info("\t\t\tonUnansweredCall-------------------");
		}

	    public void onNomadState(String sessionId, NomadMode mode, String homeNumber) throws RemoteException 
	    {
	    	this.log.info("\t\t\tonNomadState-------------------");
			if (mode == NomadMode.local) {
				this.log.info("\t\t\t\tLOCAL");
			}
			else {
				this.log.info("\t\t\t\tPRIVATE PHONE : " + homeNumber);
			}
			this.log.info("\t\t\t-------------------\n");
	    }
	
	    public class maxCallTime extends Thread 
	    {
	    	protected final Logger log = Logger.getLogger(getClass());
	    	private Call call;
	    	private double maximalCallTime;
	    	boolean interrupt;
	    	private double counter;
	    	
	    	public maxCallTime(Call call_, double maxCallTime_)
	    	{
	    		this.log.debug("\t\t\tCreated maxCallTime thread");
	    		call = call_;
	    		maximalCallTime = maxCallTime_;
	    		interrupt = false;
	    	}
	    	
			public synchronized void run() 
			{
					this.log.debug("\t\t\tThread started. Sleep for max "+maximalCallTime+" ms");
					for (counter=0;counter<maximalCallTime*(60);counter+=1)
					{
						if (interrupt == false)
						{
							try 
							{
								Thread.sleep(1000);
							} 
							catch (InterruptedException e) 
							{
								e.printStackTrace();
								interrupt = true;
							}
						}
						else
							break;
					}
					if (interrupt == false)
					{
						this.log.debug("\tTime is over. clearCallOperation");
						this.log.info("\tCall "+call.getCallRef()+" ended");
						endCallTime = System.currentTimeMillis();
						callDuration = (endCallTime - startCallTime)/1000;
						this.log.info("\tCall duration: "+df.format(callDuration)+ " s");
						callDuration/=60;
						this.log.info("\tCall duration: "+df.format(callDuration)+ " min");
						double cost = callDuration*Properties.costPerMinute;
						this.log.info("\tCost: "+cost);
						if (mainframe.policy.moneySpent >= 0)
							{
								mainframe.policy.moneySpent += cost;
								//cost = cost + this.mainframe.policy.moneySpent;
								this.log.info("\tAbsolute cost: "+df.format(mainframe.policy.moneySpent));
							}
							if ((mainframe.policy.moneyToSpend - cost) > 0)
								mainframe.policy.moneyToSpend -= cost;
							else
								mainframe.policy.moneyToSpend = 0;
						this.log.info("\tRemaining minutes in policy: "+df.format(mainframe.policy.remainingMinutes));
						this.log.info("\tMoney spent: "+df.format(mainframe.policy.moneySpent));
							this.log.info("\tMoney to spend: "+df.format(mainframe.policy.moneyToSpend));
							mainframe.policy.writePolicy(mainframe.policy.freeOfChargeNumber, 
															  mainframe.policy.remainingMinutes,
															  mainframe.policy.moneyToSpend, 
															  mainframe.policy.moneySpent);
						clearCallOperation(call);
					}
					else
						this.log.info("\tCall cleared before limit reached");
				
			}
		}
}
