/**
 * XmlPhone.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package com.alcatel.xmlapi.phone;

public interface XmlPhone extends java.rmi.Remote {

    // Open a XmlPhone session and get its identifier.
    public com.alcatel.xmlapi.phone.AlcLogonResult login() throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException;

    // Open a XmlPhone session as a supervisor for a Framework User.
    public com.alcatel.xmlapi.phone.AlcLogonResult loginSupervisor(java.lang.String supervisedAccountId, com.alcatel.xmlapi.common.AlcUserIdType supervisedAccountIdType) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException;

    // Close a Xml Telephony session.
    public com.alcatel.xmlapi.phone.AlcStatus logout(java.lang.String sessionId) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException;

    // Get the capabilities of the XmlPhone session.
    public com.alcatel.xmlapi.phone.AlcPhoneCapabilities getPhoneCapabilities(java.lang.String sessionId) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException;

    // Subscribe for events.
    public com.alcatel.xmlapi.phone.AlcStatus subscribe(java.lang.String sessionId, java.lang.String notificationUrl) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException;

    // Unscribe from events.
    public com.alcatel.xmlapi.phone.AlcStatus unsubscribe(java.lang.String sessionId) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException;

    // Get the nomadic state of the line.
    public com.alcatel.xmlapi.phone.NomadicStateResult getNomadicState(java.lang.String sessionId) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException;

    // Get the nomadic rights of the line.
    public com.alcatel.xmlapi.phone.NomadicRightResult getNomadicRight(java.lang.String sessionId) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException;

    // Switch in nomade mode towards its personal phone set.
    public com.alcatel.xmlapi.phone.AlcStatus nomadLogin(com.alcatel.xmlapi.phone.NomadLogin invoke) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException;

    // Come back in normal mode without disconnect from its session.
    public com.alcatel.xmlapi.phone.AlcStatus nomadLogout(java.lang.String sessionId) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException;

    // Get the telephonic capabilities of the XmlPhone session.
    public com.alcatel.xmlapi.phone.AlcTelephonyCapabilities getTelephonyCapabilities(java.lang.String sessionId) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException;

    // Make a new call.
    public com.alcatel.xmlapi.phone.AlcStatus makeCall(com.alcatel.xmlapi.phone.MakeCallInvoke invoke) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException;
    public com.alcatel.xmlapi.phone.AlcStatus sendAssociateData(com.alcatel.xmlapi.phone.SendAssociateDataInvoke invoke) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException;
    public com.alcatel.xmlapi.phone.AlcStatus takeCall(com.alcatel.xmlapi.phone.TakeCallInvoke invoke) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException;

    // Take the current incoming call.
    public com.alcatel.xmlapi.phone.AlcStatus takeCurrentCall(java.lang.String sessionId) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException;

    // Hold a specified call.
    public com.alcatel.xmlapi.phone.AlcStatus holdCall(com.alcatel.xmlapi.phone.HoldCallInvoke invoke) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException;

    // Hold the current incoming call.
    public com.alcatel.xmlapi.phone.AlcStatus holdCurrentCall(java.lang.String sessionId) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException;

    // Clear a call.
    public com.alcatel.xmlapi.phone.AlcStatus clearCall(com.alcatel.xmlapi.phone.ClearCallInvoke invoke) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException;

    // Clear the current active call.
    public com.alcatel.xmlapi.phone.AlcStatus clearCurrentCall(java.lang.String sessionId) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException;

    // Make a conference with two calls.
    public com.alcatel.xmlapi.phone.AlcStatus conferenceCall(com.alcatel.xmlapi.phone.ConferenceCallInvoke invoke) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException;

    // Make a conference with the current active call and with the current
    // held call.
    public com.alcatel.xmlapi.phone.AlcStatus conferenceCurrentCall(java.lang.String sessionId) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException;

    // Transfer an active call with a held call.
    public com.alcatel.xmlapi.phone.AlcStatus transferCall(com.alcatel.xmlapi.phone.TransferCallInvoke invoke) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException;

    // Transfer the current active call with the current held call.
    public com.alcatel.xmlapi.phone.AlcStatus transferCurrentCall(java.lang.String sessionId) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException;

    // Send one or several digits in DTMF.
    public com.alcatel.xmlapi.phone.AlcStatus sendDTMF(com.alcatel.xmlapi.phone.SendDTMF invoke) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException;

    // Get information about the current call.
    public com.alcatel.xmlapi.phone.CallInfoResult getCurrentCallInfo(java.lang.String sessionId) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException;

    // Get the state of the calls.
    public com.alcatel.xmlapi.phone.AlcCallState getCallState(java.lang.String sessionId) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException;

    // Get the call record capabilities of the XmlPhone session.
    public com.alcatel.xmlapi.phone.AlcCallRecordCapabilities getCallRecordCapabilities(java.lang.String sessionId) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException;

    // Start the voice communication record.
    public com.alcatel.xmlapi.phone.AlcStatus startRecord(java.lang.String sessionId) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException;

    // Stop the voice communication record.
    public com.alcatel.xmlapi.phone.AlcStatus stopRecord(java.lang.String sessionId) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException;

    // Pause the voice recording.
    public com.alcatel.xmlapi.phone.AlcStatus pauseRecord(java.lang.String sessionId) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException;

    // Continue the voice recording.
    public com.alcatel.xmlapi.phone.AlcStatus continueRecord(java.lang.String sessionId) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException;

    // Get the state of the voice recording.
    public com.alcatel.xmlapi.phone.RecordStateResult getRecordState(java.lang.String sessionId) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException;

    // Get the call log capabilities of the XmlPhone session.
    public com.alcatel.xmlapi.phone.AlcCallLogCapabilities getCallLogCapabilities(java.lang.String sessionId) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException;

    // Load the call log.
    public com.alcatel.xmlapi.phone.CallLogResult getCallLog(com.alcatel.xmlapi.phone.GetCallLogInvoke invoke) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException;

    // Get the number of unanswered and not acknowlegded incoming calls.
    public com.alcatel.xmlapi.phone.NbUCallResult getNbUnansweredCall(java.lang.String sessionId) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException;

    // Acknowledge one or several callLog records.
    public com.alcatel.xmlapi.phone.AlcStatus modifyCallLog(com.alcatel.xmlapi.phone.ModifyCallLog invoke) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException;

    // Delete one or several callLog records.
    public com.alcatel.xmlapi.phone.AlcStatus deleteCallLog(com.alcatel.xmlapi.phone.DeleteCallLog invoke) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException;

    // Delete all callLog records.
    public com.alcatel.xmlapi.phone.AlcStatus deleteAllCallLog(java.lang.String sessionId) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException;

    // Get the repertory capabilities of the XmlPhone session.
    public com.alcatel.xmlapi.phone.AlcRepertoryCapabilities getRepertoryCapabilities(java.lang.String sessionId) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException;

    // Load the bookmark of one folder.
    public com.alcatel.xmlapi.phone.RepertoryResult getRepertory(com.alcatel.xmlapi.phone.GetRepertory invoke) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException;

    // Load the bookmark containing all the entries contained in all the
    // folders.
    public com.alcatel.xmlapi.phone.AllRepertoryResult getAllRepertory(java.lang.String sessionId) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException;

    // Create a bookmark entry in an existing folder.
    public com.alcatel.xmlapi.phone.CreateRepertoryResult createRepertory(com.alcatel.xmlapi.phone.CreateOrModifyRepertory invoke) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException;

    // Modify an existing bookmark entry in an existing folder.
    public com.alcatel.xmlapi.phone.AlcStatus modifyRepertory(com.alcatel.xmlapi.phone.CreateOrModifyRepertory invoke) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException;

    // Delete a bookmark entry.
    public com.alcatel.xmlapi.phone.AlcStatus deleteRepertory(com.alcatel.xmlapi.phone.DeleteRepertoryOrFolder invoke) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException;

    // Move a bookmark elt from one folder node to another.
    public com.alcatel.xmlapi.phone.AlcStatus moveRepertory(com.alcatel.xmlapi.phone.MoveRepertoryOrFolder invoke) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException;

    // Load all the folders of the personal phoneBook.
    public com.alcatel.xmlapi.phone.FolderResult getFolder(com.alcatel.xmlapi.phone.GetFolder invoke) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException;

    // Create a new folder node under an existing folder.
    public com.alcatel.xmlapi.phone.AlcStatus createFolder(com.alcatel.xmlapi.phone.CreateFolder invoke) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException;

    // Rename an existing folder.
    public com.alcatel.xmlapi.phone.AlcStatus modifyFolder(com.alcatel.xmlapi.phone.ModifyFolder invoke) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException;

    // Delete a folder node.
    public com.alcatel.xmlapi.phone.AlcStatus deleteFolder(com.alcatel.xmlapi.phone.DeleteRepertoryOrFolder invoke) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException;

    // Move a folder node from one node to another.
    public com.alcatel.xmlapi.phone.AlcStatus moveFolder(com.alcatel.xmlapi.phone.MoveRepertoryOrFolder invoke) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException;
}
