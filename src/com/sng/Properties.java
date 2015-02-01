package com.sng;


import java.net.InetAddress;

import org.apache.log4j.Logger;

public class Properties {
	public static final String FRAMEWORK_HOST = "194.29.169.39";
	public static final String FRAMEWORK_PORT = "8080";
	public static String apiFwUrl = "http://" + FRAMEWORK_HOST + ":" + FRAMEWORK_PORT;
	public static final String NOTIF_SERV_PORT = "10101";
	public static final String EVENT_CONTEXT = "/phone/events";
	public static final String m_httpServerPort = "10101";
	public static String directory;
	public static String user = null;
	public static String pass = null;
	public static double costPerMinute = 0.5;
	protected static final Logger log = Logger.getLogger("Properties");
    public static String getNotifUrl() {
    	String localHost = null;
    	String notifUrl = null;
		try {
			localHost = InetAddress.getLocalHost().getHostAddress();
			log.info("\t\t\tloc-host: " + localHost);
			System.out.println("loc-host: " + localHost);
			notifUrl = "http://" + localHost + ":" + Properties.NOTIF_SERV_PORT
					+ Properties.EVENT_CONTEXT;
			log.info("\t\t\tnotif-URL: " + notifUrl);
			System.out.println("notif-URL: " + notifUrl);
			return notifUrl;
		} catch (Exception ex) {
			log.error("java.net.InetAddress.getLocalHost failed : " + ex.getMessage());
			System.out.println("java.net.InetAddress.getLocalHost failed : " + ex.getMessage());
			ex.printStackTrace();
			return notifUrl;
		}
    }
    
    public static final String CC_NUMBER = "505";
}
