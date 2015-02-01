/**
 * XmlPhoneEvents.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package com.alcatel.xmlapi.phone;

public interface XmlPhoneEvents extends java.rmi.Remote {

    // This notification is sent each time a call's state has changed.
    public void onCallState(java.lang.String sessionId, com.alcatel.xmlapi.phone.Call[] calls) throws java.rmi.RemoteException;

    // This notification is sent when another XmlPhone session has been opened
    // for the same user.
    public void onNewSession(java.lang.String sessionId) throws java.rmi.RemoteException;

    // This notification is sent when the XmlPhone session has been closed
    // after a timeout.
    public void onSessionClosed(java.lang.String sessionId) throws java.rmi.RemoteException;

    // This notification is sent when the event connection with the OTS service
    // is broken.
    public void onConnectionDown() throws java.rmi.RemoteException;

    // This notification is sent each time the static state of the phone
    // set changes.
    public void onPhoneSetStaticState(java.lang.String sessionId, com.alcatel.xmlapi.phonesetprogramming.types.AlcStaticState state) throws java.rmi.RemoteException;

    // This notification is sent each time a new incoming call has been unanswered
    // : consult the call log.
    public void onUnansweredCall(java.lang.String sessionId) throws java.rmi.RemoteException;

    // This notification is sent each time the nomadic state has changed.
    public void onNomadState(java.lang.String sessionId, com.alcatel.xmlapi.phone.NomadMode mode, java.lang.String homeNumber) throws java.rmi.RemoteException;
}
