/**
 * XmlApiFramework.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package com.alcatel.xmlapi.framework;

public interface XmlApiFramework extends java.rmi.Remote {

    // Control the validity of the authentication and create the framework
    // session.
    public java.lang.String login(java.lang.String pFwId, java.lang.String pFwUser, java.lang.String pFwPass) throws java.rmi.RemoteException, com.alcatel.xmlapi.framework.types.AlcFwException, com.alcatel.xmlapi.common.AlcServiceException;

    // Authentication of an administrator with supervision previleges and
    // supervise the account specified by the pSupervisedAccount parameter.
    public java.lang.String loginSupervisor(java.lang.String pSupervisorLoginName, java.lang.String pSupervisorPassword, java.lang.String pSupervisedAccountId, com.alcatel.xmlapi.common.AlcUserIdType pSupervisedAccountIdType) throws java.rmi.RemoteException, com.alcatel.xmlapi.framework.types.AlcFwException, com.alcatel.xmlapi.common.AlcServiceException;

    // Close the framework session and release all licenses.
    public void logout() throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException;

    // Get information about the user account.
    public com.alcatel.xmlapi.framework.types.AlcUserInfo getUserInfo() throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException;

    // Restart the session timer.
    public void restartSessionTimer() throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException;

    // Change of the duration of the session timer.
    public void setSessionTimerValue(int pValue) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException;
}
