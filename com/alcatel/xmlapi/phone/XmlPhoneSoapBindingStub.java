/**
 * XmlPhoneSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package com.alcatel.xmlapi.phone;

public class XmlPhoneSoapBindingStub extends org.apache.axis.client.Stub implements com.alcatel.xmlapi.phone.XmlPhone {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[50];
        org.apache.axis.description.OperationDesc oper;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("login");
        oper.setReturnType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "AlcLogonResult"));
        oper.setReturnClass(com.alcatel.xmlapi.phone.AlcLogonResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "loginReturn"));
        oper.setStyle(org.apache.axis.enum.Style.RPC);
        oper.setUse(org.apache.axis.enum.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "fault"),
                      "com.alcatel.xmlapi.common.AlcServiceException",
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcServiceException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("loginSupervisor");
        oper.addParameter(new javax.xml.namespace.QName("", "supervisedAccountId"), new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.addParameter(new javax.xml.namespace.QName("", "supervisedAccountIdType"), new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcUserIdType"), com.alcatel.xmlapi.common.AlcUserIdType.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "AlcLogonResult"));
        oper.setReturnClass(com.alcatel.xmlapi.phone.AlcLogonResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "loginSupervisorReturn"));
        oper.setStyle(org.apache.axis.enum.Style.RPC);
        oper.setUse(org.apache.axis.enum.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "fault"),
                      "com.alcatel.xmlapi.common.AlcServiceException",
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcServiceException"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("logout");
        oper.addParameter(new javax.xml.namespace.QName("", "sessionId"), new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "AlcStatus"));
        oper.setReturnClass(com.alcatel.xmlapi.phone.AlcStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "logoutReturn"));
        oper.setStyle(org.apache.axis.enum.Style.RPC);
        oper.setUse(org.apache.axis.enum.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "fault"),
                      "com.alcatel.xmlapi.common.AlcServiceException",
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcServiceException"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPhoneCapabilities");
        oper.addParameter(new javax.xml.namespace.QName("", "sessionId"), new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "AlcPhoneCapabilities"));
        oper.setReturnClass(com.alcatel.xmlapi.phone.AlcPhoneCapabilities.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.enum.Style.RPC);
        oper.setUse(org.apache.axis.enum.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "fault"),
                      "com.alcatel.xmlapi.common.AlcServiceException",
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcServiceException"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("subscribe");
        oper.addParameter(new javax.xml.namespace.QName("", "sessionId"), new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.addParameter(new javax.xml.namespace.QName("", "notificationUrl"), new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "AlcStatus"));
        oper.setReturnClass(com.alcatel.xmlapi.phone.AlcStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "subscribeReturn"));
        oper.setStyle(org.apache.axis.enum.Style.RPC);
        oper.setUse(org.apache.axis.enum.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "fault"),
                      "com.alcatel.xmlapi.common.AlcServiceException",
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcServiceException"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("unsubscribe");
        oper.addParameter(new javax.xml.namespace.QName("", "sessionId"), new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "AlcStatus"));
        oper.setReturnClass(com.alcatel.xmlapi.phone.AlcStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "unsubscribeReturn"));
        oper.setStyle(org.apache.axis.enum.Style.RPC);
        oper.setUse(org.apache.axis.enum.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "fault"),
                      "com.alcatel.xmlapi.common.AlcServiceException",
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcServiceException"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNomadicState");
        oper.addParameter(new javax.xml.namespace.QName("", "sessionId"), new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "NomadicStateResult"));
        oper.setReturnClass(com.alcatel.xmlapi.phone.NomadicStateResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.enum.Style.RPC);
        oper.setUse(org.apache.axis.enum.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "fault"),
                      "com.alcatel.xmlapi.common.AlcServiceException",
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcServiceException"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNomadicRight");
        oper.addParameter(new javax.xml.namespace.QName("", "sessionId"), new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "NomadicRightResult"));
        oper.setReturnClass(com.alcatel.xmlapi.phone.NomadicRightResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.enum.Style.RPC);
        oper.setUse(org.apache.axis.enum.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "fault"),
                      "com.alcatel.xmlapi.common.AlcServiceException",
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcServiceException"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("nomadLogin");
        oper.addParameter(new javax.xml.namespace.QName("", "invoke"), new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "NomadLogin"), com.alcatel.xmlapi.phone.NomadLogin.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "AlcStatus"));
        oper.setReturnClass(com.alcatel.xmlapi.phone.AlcStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "status"));
        oper.setStyle(org.apache.axis.enum.Style.RPC);
        oper.setUse(org.apache.axis.enum.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "fault"),
                      "com.alcatel.xmlapi.common.AlcServiceException",
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcServiceException"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("nomadLogout");
        oper.addParameter(new javax.xml.namespace.QName("", "sessionId"), new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "AlcStatus"));
        oper.setReturnClass(com.alcatel.xmlapi.phone.AlcStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "status"));
        oper.setStyle(org.apache.axis.enum.Style.RPC);
        oper.setUse(org.apache.axis.enum.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "fault"),
                      "com.alcatel.xmlapi.common.AlcServiceException",
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcServiceException"), 
                      true
                     ));
        _operations[9] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTelephonyCapabilities");
        oper.addParameter(new javax.xml.namespace.QName("", "sessionId"), new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "AlcTelephonyCapabilities"));
        oper.setReturnClass(com.alcatel.xmlapi.phone.AlcTelephonyCapabilities.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.enum.Style.RPC);
        oper.setUse(org.apache.axis.enum.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "fault"),
                      "com.alcatel.xmlapi.common.AlcServiceException",
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcServiceException"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("makeCall");
        oper.addParameter(new javax.xml.namespace.QName("", "invoke"), new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "MakeCallInvoke"), com.alcatel.xmlapi.phone.MakeCallInvoke.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "AlcStatus"));
        oper.setReturnClass(com.alcatel.xmlapi.phone.AlcStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "status"));
        oper.setStyle(org.apache.axis.enum.Style.RPC);
        oper.setUse(org.apache.axis.enum.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "fault"),
                      "com.alcatel.xmlapi.common.AlcServiceException",
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcServiceException"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sendAssociateData");
        oper.addParameter(new javax.xml.namespace.QName("", "invoke"), new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "SendAssociateDataInvoke"), com.alcatel.xmlapi.phone.SendAssociateDataInvoke.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "AlcStatus"));
        oper.setReturnClass(com.alcatel.xmlapi.phone.AlcStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "status"));
        oper.setStyle(org.apache.axis.enum.Style.RPC);
        oper.setUse(org.apache.axis.enum.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "fault"),
                      "com.alcatel.xmlapi.common.AlcServiceException",
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcServiceException"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("takeCall");
        oper.addParameter(new javax.xml.namespace.QName("", "invoke"), new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "TakeCallInvoke"), com.alcatel.xmlapi.phone.TakeCallInvoke.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "AlcStatus"));
        oper.setReturnClass(com.alcatel.xmlapi.phone.AlcStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "status"));
        oper.setStyle(org.apache.axis.enum.Style.RPC);
        oper.setUse(org.apache.axis.enum.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "fault"),
                      "com.alcatel.xmlapi.common.AlcServiceException",
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcServiceException"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("takeCurrentCall");
        oper.addParameter(new javax.xml.namespace.QName("", "sessionId"), new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "AlcStatus"));
        oper.setReturnClass(com.alcatel.xmlapi.phone.AlcStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "status"));
        oper.setStyle(org.apache.axis.enum.Style.RPC);
        oper.setUse(org.apache.axis.enum.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "fault"),
                      "com.alcatel.xmlapi.common.AlcServiceException",
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcServiceException"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("holdCall");
        oper.addParameter(new javax.xml.namespace.QName("", "invoke"), new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "HoldCallInvoke"), com.alcatel.xmlapi.phone.HoldCallInvoke.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "AlcStatus"));
        oper.setReturnClass(com.alcatel.xmlapi.phone.AlcStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "status"));
        oper.setStyle(org.apache.axis.enum.Style.RPC);
        oper.setUse(org.apache.axis.enum.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "fault"),
                      "com.alcatel.xmlapi.common.AlcServiceException",
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcServiceException"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("holdCurrentCall");
        oper.addParameter(new javax.xml.namespace.QName("", "sessionId"), new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "AlcStatus"));
        oper.setReturnClass(com.alcatel.xmlapi.phone.AlcStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "status"));
        oper.setStyle(org.apache.axis.enum.Style.RPC);
        oper.setUse(org.apache.axis.enum.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "fault"),
                      "com.alcatel.xmlapi.common.AlcServiceException",
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcServiceException"), 
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("clearCall");
        oper.addParameter(new javax.xml.namespace.QName("", "invoke"), new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "ClearCallInvoke"), com.alcatel.xmlapi.phone.ClearCallInvoke.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "AlcStatus"));
        oper.setReturnClass(com.alcatel.xmlapi.phone.AlcStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "status"));
        oper.setStyle(org.apache.axis.enum.Style.RPC);
        oper.setUse(org.apache.axis.enum.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "fault"),
                      "com.alcatel.xmlapi.common.AlcServiceException",
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcServiceException"), 
                      true
                     ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("clearCurrentCall");
        oper.addParameter(new javax.xml.namespace.QName("", "sessionId"), new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "AlcStatus"));
        oper.setReturnClass(com.alcatel.xmlapi.phone.AlcStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "status"));
        oper.setStyle(org.apache.axis.enum.Style.RPC);
        oper.setUse(org.apache.axis.enum.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "fault"),
                      "com.alcatel.xmlapi.common.AlcServiceException",
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcServiceException"), 
                      true
                     ));
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("conferenceCall");
        oper.addParameter(new javax.xml.namespace.QName("", "invoke"), new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "ConferenceCallInvoke"), com.alcatel.xmlapi.phone.ConferenceCallInvoke.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "AlcStatus"));
        oper.setReturnClass(com.alcatel.xmlapi.phone.AlcStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "status"));
        oper.setStyle(org.apache.axis.enum.Style.RPC);
        oper.setUse(org.apache.axis.enum.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "fault"),
                      "com.alcatel.xmlapi.common.AlcServiceException",
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcServiceException"), 
                      true
                     ));
        _operations[19] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("conferenceCurrentCall");
        oper.addParameter(new javax.xml.namespace.QName("", "sessionId"), new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "AlcStatus"));
        oper.setReturnClass(com.alcatel.xmlapi.phone.AlcStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "status"));
        oper.setStyle(org.apache.axis.enum.Style.RPC);
        oper.setUse(org.apache.axis.enum.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "fault"),
                      "com.alcatel.xmlapi.common.AlcServiceException",
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcServiceException"), 
                      true
                     ));
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("transferCall");
        oper.addParameter(new javax.xml.namespace.QName("", "invoke"), new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "TransferCallInvoke"), com.alcatel.xmlapi.phone.TransferCallInvoke.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "AlcStatus"));
        oper.setReturnClass(com.alcatel.xmlapi.phone.AlcStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "status"));
        oper.setStyle(org.apache.axis.enum.Style.RPC);
        oper.setUse(org.apache.axis.enum.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "fault"),
                      "com.alcatel.xmlapi.common.AlcServiceException",
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcServiceException"), 
                      true
                     ));
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("transferCurrentCall");
        oper.addParameter(new javax.xml.namespace.QName("", "sessionId"), new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "AlcStatus"));
        oper.setReturnClass(com.alcatel.xmlapi.phone.AlcStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "status"));
        oper.setStyle(org.apache.axis.enum.Style.RPC);
        oper.setUse(org.apache.axis.enum.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "fault"),
                      "com.alcatel.xmlapi.common.AlcServiceException",
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcServiceException"), 
                      true
                     ));
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sendDTMF");
        oper.addParameter(new javax.xml.namespace.QName("", "invoke"), new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "SendDTMF"), com.alcatel.xmlapi.phone.SendDTMF.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "AlcStatus"));
        oper.setReturnClass(com.alcatel.xmlapi.phone.AlcStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "status"));
        oper.setStyle(org.apache.axis.enum.Style.RPC);
        oper.setUse(org.apache.axis.enum.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "fault"),
                      "com.alcatel.xmlapi.common.AlcServiceException",
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcServiceException"), 
                      true
                     ));
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCurrentCallInfo");
        oper.addParameter(new javax.xml.namespace.QName("", "sessionId"), new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "CallInfoResult"));
        oper.setReturnClass(com.alcatel.xmlapi.phone.CallInfoResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.enum.Style.RPC);
        oper.setUse(org.apache.axis.enum.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "fault"),
                      "com.alcatel.xmlapi.common.AlcServiceException",
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcServiceException"), 
                      true
                     ));
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCallState");
        oper.addParameter(new javax.xml.namespace.QName("", "sessionId"), new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "AlcCallState"));
        oper.setReturnClass(com.alcatel.xmlapi.phone.AlcCallState.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.enum.Style.RPC);
        oper.setUse(org.apache.axis.enum.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "fault"),
                      "com.alcatel.xmlapi.common.AlcServiceException",
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcServiceException"), 
                      true
                     ));
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCallRecordCapabilities");
        oper.addParameter(new javax.xml.namespace.QName("", "sessionId"), new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "AlcCallRecordCapabilities"));
        oper.setReturnClass(com.alcatel.xmlapi.phone.AlcCallRecordCapabilities.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.enum.Style.RPC);
        oper.setUse(org.apache.axis.enum.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "fault"),
                      "com.alcatel.xmlapi.common.AlcServiceException",
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcServiceException"), 
                      true
                     ));
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("startRecord");
        oper.addParameter(new javax.xml.namespace.QName("", "sessionId"), new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "AlcStatus"));
        oper.setReturnClass(com.alcatel.xmlapi.phone.AlcStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "status"));
        oper.setStyle(org.apache.axis.enum.Style.RPC);
        oper.setUse(org.apache.axis.enum.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "fault"),
                      "com.alcatel.xmlapi.common.AlcServiceException",
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcServiceException"), 
                      true
                     ));
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("stopRecord");
        oper.addParameter(new javax.xml.namespace.QName("", "sessionId"), new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "AlcStatus"));
        oper.setReturnClass(com.alcatel.xmlapi.phone.AlcStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "status"));
        oper.setStyle(org.apache.axis.enum.Style.RPC);
        oper.setUse(org.apache.axis.enum.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "fault"),
                      "com.alcatel.xmlapi.common.AlcServiceException",
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcServiceException"), 
                      true
                     ));
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("pauseRecord");
        oper.addParameter(new javax.xml.namespace.QName("", "sessionId"), new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "AlcStatus"));
        oper.setReturnClass(com.alcatel.xmlapi.phone.AlcStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "status"));
        oper.setStyle(org.apache.axis.enum.Style.RPC);
        oper.setUse(org.apache.axis.enum.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "fault"),
                      "com.alcatel.xmlapi.common.AlcServiceException",
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcServiceException"), 
                      true
                     ));
        _operations[29] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("continueRecord");
        oper.addParameter(new javax.xml.namespace.QName("", "sessionId"), new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "AlcStatus"));
        oper.setReturnClass(com.alcatel.xmlapi.phone.AlcStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "status"));
        oper.setStyle(org.apache.axis.enum.Style.RPC);
        oper.setUse(org.apache.axis.enum.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "fault"),
                      "com.alcatel.xmlapi.common.AlcServiceException",
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcServiceException"), 
                      true
                     ));
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRecordState");
        oper.addParameter(new javax.xml.namespace.QName("", "sessionId"), new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "RecordStateResult"));
        oper.setReturnClass(com.alcatel.xmlapi.phone.RecordStateResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.enum.Style.RPC);
        oper.setUse(org.apache.axis.enum.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "fault"),
                      "com.alcatel.xmlapi.common.AlcServiceException",
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcServiceException"), 
                      true
                     ));
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCallLogCapabilities");
        oper.addParameter(new javax.xml.namespace.QName("", "sessionId"), new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "AlcCallLogCapabilities"));
        oper.setReturnClass(com.alcatel.xmlapi.phone.AlcCallLogCapabilities.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.enum.Style.RPC);
        oper.setUse(org.apache.axis.enum.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "fault"),
                      "com.alcatel.xmlapi.common.AlcServiceException",
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcServiceException"), 
                      true
                     ));
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCallLog");
        oper.addParameter(new javax.xml.namespace.QName("", "invoke"), new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "GetCallLogInvoke"), com.alcatel.xmlapi.phone.GetCallLogInvoke.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "CallLogResult"));
        oper.setReturnClass(com.alcatel.xmlapi.phone.CallLogResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.enum.Style.RPC);
        oper.setUse(org.apache.axis.enum.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "fault"),
                      "com.alcatel.xmlapi.common.AlcServiceException",
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcServiceException"), 
                      true
                     ));
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNbUnansweredCall");
        oper.addParameter(new javax.xml.namespace.QName("", "sessionId"), new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "NbUCallResult"));
        oper.setReturnClass(com.alcatel.xmlapi.phone.NbUCallResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.enum.Style.RPC);
        oper.setUse(org.apache.axis.enum.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "fault"),
                      "com.alcatel.xmlapi.common.AlcServiceException",
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcServiceException"), 
                      true
                     ));
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("modifyCallLog");
        oper.addParameter(new javax.xml.namespace.QName("", "invoke"), new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "ModifyCallLog"), com.alcatel.xmlapi.phone.ModifyCallLog.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "AlcStatus"));
        oper.setReturnClass(com.alcatel.xmlapi.phone.AlcStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "status"));
        oper.setStyle(org.apache.axis.enum.Style.RPC);
        oper.setUse(org.apache.axis.enum.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "fault"),
                      "com.alcatel.xmlapi.common.AlcServiceException",
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcServiceException"), 
                      true
                     ));
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteCallLog");
        oper.addParameter(new javax.xml.namespace.QName("", "invoke"), new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "DeleteCallLog"), com.alcatel.xmlapi.phone.DeleteCallLog.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "AlcStatus"));
        oper.setReturnClass(com.alcatel.xmlapi.phone.AlcStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "status"));
        oper.setStyle(org.apache.axis.enum.Style.RPC);
        oper.setUse(org.apache.axis.enum.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "fault"),
                      "com.alcatel.xmlapi.common.AlcServiceException",
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcServiceException"), 
                      true
                     ));
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteAllCallLog");
        oper.addParameter(new javax.xml.namespace.QName("", "sessionId"), new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "AlcStatus"));
        oper.setReturnClass(com.alcatel.xmlapi.phone.AlcStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "status"));
        oper.setStyle(org.apache.axis.enum.Style.RPC);
        oper.setUse(org.apache.axis.enum.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "fault"),
                      "com.alcatel.xmlapi.common.AlcServiceException",
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcServiceException"), 
                      true
                     ));
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRepertoryCapabilities");
        oper.addParameter(new javax.xml.namespace.QName("", "sessionId"), new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "AlcRepertoryCapabilities"));
        oper.setReturnClass(com.alcatel.xmlapi.phone.AlcRepertoryCapabilities.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.enum.Style.RPC);
        oper.setUse(org.apache.axis.enum.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "fault"),
                      "com.alcatel.xmlapi.common.AlcServiceException",
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcServiceException"), 
                      true
                     ));
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRepertory");
        oper.addParameter(new javax.xml.namespace.QName("", "invoke"), new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "GetRepertory"), com.alcatel.xmlapi.phone.GetRepertory.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "RepertoryResult"));
        oper.setReturnClass(com.alcatel.xmlapi.phone.RepertoryResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.enum.Style.RPC);
        oper.setUse(org.apache.axis.enum.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "fault"),
                      "com.alcatel.xmlapi.common.AlcServiceException",
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcServiceException"), 
                      true
                     ));
        _operations[39] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAllRepertory");
        oper.addParameter(new javax.xml.namespace.QName("", "sessionId"), new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "AllRepertoryResult"));
        oper.setReturnClass(com.alcatel.xmlapi.phone.AllRepertoryResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.enum.Style.RPC);
        oper.setUse(org.apache.axis.enum.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "fault"),
                      "com.alcatel.xmlapi.common.AlcServiceException",
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcServiceException"), 
                      true
                     ));
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createRepertory");
        oper.addParameter(new javax.xml.namespace.QName("", "invoke"), new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "CreateOrModifyRepertory"), com.alcatel.xmlapi.phone.CreateOrModifyRepertory.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "CreateRepertoryResult"));
        oper.setReturnClass(com.alcatel.xmlapi.phone.CreateRepertoryResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.enum.Style.RPC);
        oper.setUse(org.apache.axis.enum.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "fault"),
                      "com.alcatel.xmlapi.common.AlcServiceException",
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcServiceException"), 
                      true
                     ));
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("modifyRepertory");
        oper.addParameter(new javax.xml.namespace.QName("", "invoke"), new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "CreateOrModifyRepertory"), com.alcatel.xmlapi.phone.CreateOrModifyRepertory.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "AlcStatus"));
        oper.setReturnClass(com.alcatel.xmlapi.phone.AlcStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "status"));
        oper.setStyle(org.apache.axis.enum.Style.RPC);
        oper.setUse(org.apache.axis.enum.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "fault"),
                      "com.alcatel.xmlapi.common.AlcServiceException",
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcServiceException"), 
                      true
                     ));
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteRepertory");
        oper.addParameter(new javax.xml.namespace.QName("", "invoke"), new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "DeleteRepertoryOrFolder"), com.alcatel.xmlapi.phone.DeleteRepertoryOrFolder.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "AlcStatus"));
        oper.setReturnClass(com.alcatel.xmlapi.phone.AlcStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "status"));
        oper.setStyle(org.apache.axis.enum.Style.RPC);
        oper.setUse(org.apache.axis.enum.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "fault"),
                      "com.alcatel.xmlapi.common.AlcServiceException",
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcServiceException"), 
                      true
                     ));
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("moveRepertory");
        oper.addParameter(new javax.xml.namespace.QName("", "invoke"), new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "MoveRepertoryOrFolder"), com.alcatel.xmlapi.phone.MoveRepertoryOrFolder.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "AlcStatus"));
        oper.setReturnClass(com.alcatel.xmlapi.phone.AlcStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "status"));
        oper.setStyle(org.apache.axis.enum.Style.RPC);
        oper.setUse(org.apache.axis.enum.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "fault"),
                      "com.alcatel.xmlapi.common.AlcServiceException",
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcServiceException"), 
                      true
                     ));
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getFolder");
        oper.addParameter(new javax.xml.namespace.QName("", "invoke"), new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "GetFolder"), com.alcatel.xmlapi.phone.GetFolder.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "FolderResult"));
        oper.setReturnClass(com.alcatel.xmlapi.phone.FolderResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "result"));
        oper.setStyle(org.apache.axis.enum.Style.RPC);
        oper.setUse(org.apache.axis.enum.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "fault"),
                      "com.alcatel.xmlapi.common.AlcServiceException",
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcServiceException"), 
                      true
                     ));
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createFolder");
        oper.addParameter(new javax.xml.namespace.QName("", "invoke"), new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "CreateFolder"), com.alcatel.xmlapi.phone.CreateFolder.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "AlcStatus"));
        oper.setReturnClass(com.alcatel.xmlapi.phone.AlcStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "status"));
        oper.setStyle(org.apache.axis.enum.Style.RPC);
        oper.setUse(org.apache.axis.enum.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "fault"),
                      "com.alcatel.xmlapi.common.AlcServiceException",
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcServiceException"), 
                      true
                     ));
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("modifyFolder");
        oper.addParameter(new javax.xml.namespace.QName("", "invoke"), new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "ModifyFolder"), com.alcatel.xmlapi.phone.ModifyFolder.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "AlcStatus"));
        oper.setReturnClass(com.alcatel.xmlapi.phone.AlcStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "status"));
        oper.setStyle(org.apache.axis.enum.Style.RPC);
        oper.setUse(org.apache.axis.enum.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "fault"),
                      "com.alcatel.xmlapi.common.AlcServiceException",
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcServiceException"), 
                      true
                     ));
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteFolder");
        oper.addParameter(new javax.xml.namespace.QName("", "invoke"), new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "DeleteRepertoryOrFolder"), com.alcatel.xmlapi.phone.DeleteRepertoryOrFolder.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "AlcStatus"));
        oper.setReturnClass(com.alcatel.xmlapi.phone.AlcStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "status"));
        oper.setStyle(org.apache.axis.enum.Style.RPC);
        oper.setUse(org.apache.axis.enum.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "fault"),
                      "com.alcatel.xmlapi.common.AlcServiceException",
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcServiceException"), 
                      true
                     ));
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("moveFolder");
        oper.addParameter(new javax.xml.namespace.QName("", "invoke"), new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "MoveRepertoryOrFolder"), com.alcatel.xmlapi.phone.MoveRepertoryOrFolder.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "AlcStatus"));
        oper.setReturnClass(com.alcatel.xmlapi.phone.AlcStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "status"));
        oper.setStyle(org.apache.axis.enum.Style.RPC);
        oper.setUse(org.apache.axis.enum.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "fault"),
                      "com.alcatel.xmlapi.common.AlcServiceException",
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcServiceException"), 
                      true
                     ));
        _operations[49] = oper;

    }

    public XmlPhoneSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public XmlPhoneSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public XmlPhoneSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "AlcLogonResult");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.phone.AlcLogonResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "CreateOrModifyRepertory");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.phone.CreateOrModifyRepertory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "GetRepertory");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.phone.GetRepertory.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "NomadLogin");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.phone.NomadLogin.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "TransferCallInvoke");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.phone.TransferCallInvoke.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "ConferenceCallInvoke");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.phone.ConferenceCallInvoke.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "AlcCallRecordCapabilities");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.phone.AlcCallRecordCapabilities.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "CreateRepertoryResult");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.phone.CreateRepertoryResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "NomadicStateResult");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.phone.NomadicStateResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "SendDTMF");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.phone.SendDTMF.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "RecordStateResult");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.phone.RecordStateResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "FolderNode");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.phone.FolderNode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcServiceException");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.common.AlcServiceException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "NumberType");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.phone.NumberType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "RepertoryElt");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.phone.RepertoryElt.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "TypedNumber");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.phone.TypedNumber.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "ClearCallInvoke");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.phone.ClearCallInvoke.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "AlcCallState");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.phone.AlcCallState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "Folder");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.phone.Folder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "NomadicRightResult");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.phone.NomadicRightResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "MoveRepertoryOrFolder");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.phone.MoveRepertoryOrFolder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "Call");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.phone.Call.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "NomadMode");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.phone.NomadMode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "FolderElt");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.phone.FolderElt.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "CallMode");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.phone.CallMode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "ArrayOfItemMod");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.phone.ItemMod[].class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(arraysf);
            cachedDeserFactories.add(arraydf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "RepertoryNode");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.phone.RepertoryNode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "CallLogElt");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.phone.CallLogElt.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "ArrayOfRepertoryElt");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.phone.RepertoryElt[].class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(arraysf);
            cachedDeserFactories.add(arraydf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "ModifyFolder");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.phone.ModifyFolder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "CallLogSelector");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.phone.CallLogSelector.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "ItemMod");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.phone.ItemMod.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "AllRepertoryResult");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.phone.AllRepertoryResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "CallLogResult");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.phone.CallLogResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "AlcPhoneCapabilities");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.phone.AlcPhoneCapabilities.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "ArrayOfCallLogElt");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.phone.CallLogElt[].class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(arraysf);
            cachedDeserFactories.add(arraydf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "GetCallLogInvoke");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.phone.GetCallLogInvoke.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcServiceError");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.common.AlcServiceError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "ArrayOfFolderNode");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.phone.FolderNode[].class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(arraysf);
            cachedDeserFactories.add(arraydf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "NbUCallResult");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.phone.NbUCallResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "ModifyCallLog");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.phone.ModifyCallLog.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "RepertoryResult");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.phone.RepertoryResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "ItemId");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.phone.ItemId.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "AlcCallLogCapabilities");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.phone.AlcCallLogCapabilities.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "RecordState");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.phone.RecordState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "CallCause");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.phone.CallCause.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "FolderResult");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.phone.FolderResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "DeleteCallLog");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.phone.DeleteCallLog.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "ArrayOfRepertoryNode");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.phone.RepertoryNode[].class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(arraysf);
            cachedDeserFactories.add(arraydf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "CallInfoResult");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.phone.CallInfoResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "ArrayOfCall");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.phone.Call[].class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(arraysf);
            cachedDeserFactories.add(arraydf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "AlcTelephonyCapabilities");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.phone.AlcTelephonyCapabilities.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "CallType");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.phone.CallType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "HoldCallInvoke");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.phone.HoldCallInvoke.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcUserIdType");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.common.AlcUserIdType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "CreateFolder");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.phone.CreateFolder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "GetFolder");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.phone.GetFolder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "ArrayOfItemId");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.phone.ItemId[].class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(arraysf);
            cachedDeserFactories.add(arraydf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "TakeCallInvoke");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.phone.TakeCallInvoke.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "AlcStatus");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.phone.AlcStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "SendAssociateDataInvoke");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.phone.SendAssociateDataInvoke.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "CallState");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.phone.CallState.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "DeleteRepertoryOrFolder");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.phone.DeleteRepertoryOrFolder.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "AlcRepertoryCapabilities");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.phone.AlcRepertoryCapabilities.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "MakeCallInvoke");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.phone.MakeCallInvoke.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    private org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call =
                    (org.apache.axis.client.Call) super.service.createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
                    _call.setEncodingStyle(org.apache.axis.Constants.URI_SOAP11_ENC);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                        java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                        _call.registerTypeMapping(cls, qName, sf, df, false);
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", t);
        }
    }

    public com.alcatel.xmlapi.phone.AlcLogonResult login() throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("login");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "login"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel.xmlapi.phone.AlcLogonResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel.xmlapi.phone.AlcLogonResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel.xmlapi.phone.AlcLogonResult.class);
            }
        }
    }

    public com.alcatel.xmlapi.phone.AlcLogonResult loginSupervisor(java.lang.String supervisedAccountId, com.alcatel.xmlapi.common.AlcUserIdType supervisedAccountIdType) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("loginSupervisor");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "loginSupervisor"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {supervisedAccountId, supervisedAccountIdType});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel.xmlapi.phone.AlcLogonResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel.xmlapi.phone.AlcLogonResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel.xmlapi.phone.AlcLogonResult.class);
            }
        }
    }

    public com.alcatel.xmlapi.phone.AlcStatus logout(java.lang.String sessionId) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("logout");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "logout"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel.xmlapi.phone.AlcStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel.xmlapi.phone.AlcStatus) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel.xmlapi.phone.AlcStatus.class);
            }
        }
    }

    public com.alcatel.xmlapi.phone.AlcPhoneCapabilities getPhoneCapabilities(java.lang.String sessionId) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getPhoneCapabilities");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "getPhoneCapabilities"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel.xmlapi.phone.AlcPhoneCapabilities) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel.xmlapi.phone.AlcPhoneCapabilities) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel.xmlapi.phone.AlcPhoneCapabilities.class);
            }
        }
    }

    public com.alcatel.xmlapi.phone.AlcStatus subscribe(java.lang.String sessionId, java.lang.String notificationUrl) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("subscribe");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "subscribe"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, notificationUrl});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel.xmlapi.phone.AlcStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel.xmlapi.phone.AlcStatus) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel.xmlapi.phone.AlcStatus.class);
            }
        }
    }

    public com.alcatel.xmlapi.phone.AlcStatus unsubscribe(java.lang.String sessionId) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("unsubscribe");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "unsubscribe"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel.xmlapi.phone.AlcStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel.xmlapi.phone.AlcStatus) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel.xmlapi.phone.AlcStatus.class);
            }
        }
    }

    public com.alcatel.xmlapi.phone.NomadicStateResult getNomadicState(java.lang.String sessionId) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getNomadicState");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "getNomadicState"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel.xmlapi.phone.NomadicStateResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel.xmlapi.phone.NomadicStateResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel.xmlapi.phone.NomadicStateResult.class);
            }
        }
    }

    public com.alcatel.xmlapi.phone.NomadicRightResult getNomadicRight(java.lang.String sessionId) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getNomadicRight");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "getNomadicRight"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel.xmlapi.phone.NomadicRightResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel.xmlapi.phone.NomadicRightResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel.xmlapi.phone.NomadicRightResult.class);
            }
        }
    }

    public com.alcatel.xmlapi.phone.AlcStatus nomadLogin(com.alcatel.xmlapi.phone.NomadLogin invoke) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("nomadLogin");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "nomadLogin"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {invoke});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel.xmlapi.phone.AlcStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel.xmlapi.phone.AlcStatus) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel.xmlapi.phone.AlcStatus.class);
            }
        }
    }

    public com.alcatel.xmlapi.phone.AlcStatus nomadLogout(java.lang.String sessionId) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("nomadLogout");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "nomadLogout"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel.xmlapi.phone.AlcStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel.xmlapi.phone.AlcStatus) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel.xmlapi.phone.AlcStatus.class);
            }
        }
    }

    public com.alcatel.xmlapi.phone.AlcTelephonyCapabilities getTelephonyCapabilities(java.lang.String sessionId) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getTelephonyCapabilities");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "getTelephonyCapabilities"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel.xmlapi.phone.AlcTelephonyCapabilities) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel.xmlapi.phone.AlcTelephonyCapabilities) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel.xmlapi.phone.AlcTelephonyCapabilities.class);
            }
        }
    }

    public com.alcatel.xmlapi.phone.AlcStatus makeCall(com.alcatel.xmlapi.phone.MakeCallInvoke invoke) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("makeCall");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "makeCall"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {invoke});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel.xmlapi.phone.AlcStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel.xmlapi.phone.AlcStatus) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel.xmlapi.phone.AlcStatus.class);
            }
        }
    }

    public com.alcatel.xmlapi.phone.AlcStatus sendAssociateData(com.alcatel.xmlapi.phone.SendAssociateDataInvoke invoke) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("sendAssociateData");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "sendAssociateData"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {invoke});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel.xmlapi.phone.AlcStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel.xmlapi.phone.AlcStatus) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel.xmlapi.phone.AlcStatus.class);
            }
        }
    }

    public com.alcatel.xmlapi.phone.AlcStatus takeCall(com.alcatel.xmlapi.phone.TakeCallInvoke invoke) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("takeCall");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "takeCall"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {invoke});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel.xmlapi.phone.AlcStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel.xmlapi.phone.AlcStatus) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel.xmlapi.phone.AlcStatus.class);
            }
        }
    }

    public com.alcatel.xmlapi.phone.AlcStatus takeCurrentCall(java.lang.String sessionId) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("takeCurrentCall");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "takeCurrentCall"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel.xmlapi.phone.AlcStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel.xmlapi.phone.AlcStatus) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel.xmlapi.phone.AlcStatus.class);
            }
        }
    }

    public com.alcatel.xmlapi.phone.AlcStatus holdCall(com.alcatel.xmlapi.phone.HoldCallInvoke invoke) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("holdCall");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "holdCall"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {invoke});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel.xmlapi.phone.AlcStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel.xmlapi.phone.AlcStatus) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel.xmlapi.phone.AlcStatus.class);
            }
        }
    }

    public com.alcatel.xmlapi.phone.AlcStatus holdCurrentCall(java.lang.String sessionId) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("holdCurrentCall");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "holdCurrentCall"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel.xmlapi.phone.AlcStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel.xmlapi.phone.AlcStatus) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel.xmlapi.phone.AlcStatus.class);
            }
        }
    }

    public com.alcatel.xmlapi.phone.AlcStatus clearCall(com.alcatel.xmlapi.phone.ClearCallInvoke invoke) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("clearCall");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "clearCall"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {invoke});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel.xmlapi.phone.AlcStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel.xmlapi.phone.AlcStatus) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel.xmlapi.phone.AlcStatus.class);
            }
        }
    }

    public com.alcatel.xmlapi.phone.AlcStatus clearCurrentCall(java.lang.String sessionId) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("clearCurrentCall");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "clearCurrentCall"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel.xmlapi.phone.AlcStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel.xmlapi.phone.AlcStatus) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel.xmlapi.phone.AlcStatus.class);
            }
        }
    }

    public com.alcatel.xmlapi.phone.AlcStatus conferenceCall(com.alcatel.xmlapi.phone.ConferenceCallInvoke invoke) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("conferenceCall");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "conferenceCall"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {invoke});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel.xmlapi.phone.AlcStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel.xmlapi.phone.AlcStatus) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel.xmlapi.phone.AlcStatus.class);
            }
        }
    }

    public com.alcatel.xmlapi.phone.AlcStatus conferenceCurrentCall(java.lang.String sessionId) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("conferenceCurrentCall");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "conferenceCurrentCall"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel.xmlapi.phone.AlcStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel.xmlapi.phone.AlcStatus) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel.xmlapi.phone.AlcStatus.class);
            }
        }
    }

    public com.alcatel.xmlapi.phone.AlcStatus transferCall(com.alcatel.xmlapi.phone.TransferCallInvoke invoke) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("transferCall");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "transferCall"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {invoke});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel.xmlapi.phone.AlcStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel.xmlapi.phone.AlcStatus) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel.xmlapi.phone.AlcStatus.class);
            }
        }
    }

    public com.alcatel.xmlapi.phone.AlcStatus transferCurrentCall(java.lang.String sessionId) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("transferCurrentCall");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "transferCurrentCall"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel.xmlapi.phone.AlcStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel.xmlapi.phone.AlcStatus) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel.xmlapi.phone.AlcStatus.class);
            }
        }
    }

    public com.alcatel.xmlapi.phone.AlcStatus sendDTMF(com.alcatel.xmlapi.phone.SendDTMF invoke) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("sendDTMF");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "sendDTMF"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {invoke});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel.xmlapi.phone.AlcStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel.xmlapi.phone.AlcStatus) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel.xmlapi.phone.AlcStatus.class);
            }
        }
    }

    public com.alcatel.xmlapi.phone.CallInfoResult getCurrentCallInfo(java.lang.String sessionId) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getCurrentCallInfo");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "getCurrentCallInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel.xmlapi.phone.CallInfoResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel.xmlapi.phone.CallInfoResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel.xmlapi.phone.CallInfoResult.class);
            }
        }
    }

    public com.alcatel.xmlapi.phone.AlcCallState getCallState(java.lang.String sessionId) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getCallState");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "getCallState"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel.xmlapi.phone.AlcCallState) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel.xmlapi.phone.AlcCallState) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel.xmlapi.phone.AlcCallState.class);
            }
        }
    }

    public com.alcatel.xmlapi.phone.AlcCallRecordCapabilities getCallRecordCapabilities(java.lang.String sessionId) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getCallRecordCapabilities");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "getCallRecordCapabilities"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel.xmlapi.phone.AlcCallRecordCapabilities) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel.xmlapi.phone.AlcCallRecordCapabilities) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel.xmlapi.phone.AlcCallRecordCapabilities.class);
            }
        }
    }

    public com.alcatel.xmlapi.phone.AlcStatus startRecord(java.lang.String sessionId) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("startRecord");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "startRecord"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel.xmlapi.phone.AlcStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel.xmlapi.phone.AlcStatus) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel.xmlapi.phone.AlcStatus.class);
            }
        }
    }

    public com.alcatel.xmlapi.phone.AlcStatus stopRecord(java.lang.String sessionId) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("stopRecord");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "stopRecord"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel.xmlapi.phone.AlcStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel.xmlapi.phone.AlcStatus) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel.xmlapi.phone.AlcStatus.class);
            }
        }
    }

    public com.alcatel.xmlapi.phone.AlcStatus pauseRecord(java.lang.String sessionId) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("pauseRecord");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "pauseRecord"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel.xmlapi.phone.AlcStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel.xmlapi.phone.AlcStatus) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel.xmlapi.phone.AlcStatus.class);
            }
        }
    }

    public com.alcatel.xmlapi.phone.AlcStatus continueRecord(java.lang.String sessionId) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("continueRecord");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "continueRecord"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel.xmlapi.phone.AlcStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel.xmlapi.phone.AlcStatus) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel.xmlapi.phone.AlcStatus.class);
            }
        }
    }

    public com.alcatel.xmlapi.phone.RecordStateResult getRecordState(java.lang.String sessionId) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getRecordState");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "getRecordState"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel.xmlapi.phone.RecordStateResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel.xmlapi.phone.RecordStateResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel.xmlapi.phone.RecordStateResult.class);
            }
        }
    }

    public com.alcatel.xmlapi.phone.AlcCallLogCapabilities getCallLogCapabilities(java.lang.String sessionId) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getCallLogCapabilities");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "getCallLogCapabilities"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel.xmlapi.phone.AlcCallLogCapabilities) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel.xmlapi.phone.AlcCallLogCapabilities) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel.xmlapi.phone.AlcCallLogCapabilities.class);
            }
        }
    }

    public com.alcatel.xmlapi.phone.CallLogResult getCallLog(com.alcatel.xmlapi.phone.GetCallLogInvoke invoke) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getCallLog");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "getCallLog"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {invoke});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel.xmlapi.phone.CallLogResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel.xmlapi.phone.CallLogResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel.xmlapi.phone.CallLogResult.class);
            }
        }
    }

    public com.alcatel.xmlapi.phone.NbUCallResult getNbUnansweredCall(java.lang.String sessionId) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getNbUnansweredCall");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "getNbUnansweredCall"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel.xmlapi.phone.NbUCallResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel.xmlapi.phone.NbUCallResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel.xmlapi.phone.NbUCallResult.class);
            }
        }
    }

    public com.alcatel.xmlapi.phone.AlcStatus modifyCallLog(com.alcatel.xmlapi.phone.ModifyCallLog invoke) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("modifyCallLog");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "modifyCallLog"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {invoke});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel.xmlapi.phone.AlcStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel.xmlapi.phone.AlcStatus) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel.xmlapi.phone.AlcStatus.class);
            }
        }
    }

    public com.alcatel.xmlapi.phone.AlcStatus deleteCallLog(com.alcatel.xmlapi.phone.DeleteCallLog invoke) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("deleteAllCallLog");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "deleteCallLog"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {invoke});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel.xmlapi.phone.AlcStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel.xmlapi.phone.AlcStatus) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel.xmlapi.phone.AlcStatus.class);
            }
        }
    }

    public com.alcatel.xmlapi.phone.AlcStatus deleteAllCallLog(java.lang.String sessionId) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("deleteAllCallLog");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "deleteAllCallLog"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel.xmlapi.phone.AlcStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel.xmlapi.phone.AlcStatus) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel.xmlapi.phone.AlcStatus.class);
            }
        }
    }

    public com.alcatel.xmlapi.phone.AlcRepertoryCapabilities getRepertoryCapabilities(java.lang.String sessionId) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getRepertoryCapabilities");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "getRepertoryCapabilities"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel.xmlapi.phone.AlcRepertoryCapabilities) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel.xmlapi.phone.AlcRepertoryCapabilities) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel.xmlapi.phone.AlcRepertoryCapabilities.class);
            }
        }
    }

    public com.alcatel.xmlapi.phone.RepertoryResult getRepertory(com.alcatel.xmlapi.phone.GetRepertory invoke) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getRepertory");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "getRepertory"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {invoke});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel.xmlapi.phone.RepertoryResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel.xmlapi.phone.RepertoryResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel.xmlapi.phone.RepertoryResult.class);
            }
        }
    }

    public com.alcatel.xmlapi.phone.AllRepertoryResult getAllRepertory(java.lang.String sessionId) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getAllRepertory");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "getAllRepertory"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel.xmlapi.phone.AllRepertoryResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel.xmlapi.phone.AllRepertoryResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel.xmlapi.phone.AllRepertoryResult.class);
            }
        }
    }

    public com.alcatel.xmlapi.phone.CreateRepertoryResult createRepertory(com.alcatel.xmlapi.phone.CreateOrModifyRepertory invoke) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("createRepertory");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "createRepertory"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {invoke});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel.xmlapi.phone.CreateRepertoryResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel.xmlapi.phone.CreateRepertoryResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel.xmlapi.phone.CreateRepertoryResult.class);
            }
        }
    }

    public com.alcatel.xmlapi.phone.AlcStatus modifyRepertory(com.alcatel.xmlapi.phone.CreateOrModifyRepertory invoke) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("modifyRepertory");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "modifyRepertory"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {invoke});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel.xmlapi.phone.AlcStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel.xmlapi.phone.AlcStatus) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel.xmlapi.phone.AlcStatus.class);
            }
        }
    }

    public com.alcatel.xmlapi.phone.AlcStatus deleteRepertory(com.alcatel.xmlapi.phone.DeleteRepertoryOrFolder invoke) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("deleteRepertory");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "deleteRepertory"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {invoke});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel.xmlapi.phone.AlcStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel.xmlapi.phone.AlcStatus) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel.xmlapi.phone.AlcStatus.class);
            }
        }
    }

    public com.alcatel.xmlapi.phone.AlcStatus moveRepertory(com.alcatel.xmlapi.phone.MoveRepertoryOrFolder invoke) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("moveRepertory");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "moveRepertory"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {invoke});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel.xmlapi.phone.AlcStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel.xmlapi.phone.AlcStatus) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel.xmlapi.phone.AlcStatus.class);
            }
        }
    }

    public com.alcatel.xmlapi.phone.FolderResult getFolder(com.alcatel.xmlapi.phone.GetFolder invoke) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getFolder");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "getFolder"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {invoke});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel.xmlapi.phone.FolderResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel.xmlapi.phone.FolderResult) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel.xmlapi.phone.FolderResult.class);
            }
        }
    }

    public com.alcatel.xmlapi.phone.AlcStatus createFolder(com.alcatel.xmlapi.phone.CreateFolder invoke) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("createFolder");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "createFolder"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {invoke});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel.xmlapi.phone.AlcStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel.xmlapi.phone.AlcStatus) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel.xmlapi.phone.AlcStatus.class);
            }
        }
    }

    public com.alcatel.xmlapi.phone.AlcStatus modifyFolder(com.alcatel.xmlapi.phone.ModifyFolder invoke) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("modifyFolder");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "modifyFolder"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {invoke});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel.xmlapi.phone.AlcStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel.xmlapi.phone.AlcStatus) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel.xmlapi.phone.AlcStatus.class);
            }
        }
    }

    public com.alcatel.xmlapi.phone.AlcStatus deleteFolder(com.alcatel.xmlapi.phone.DeleteRepertoryOrFolder invoke) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("deleteFolder");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "deleteFolder"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {invoke});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel.xmlapi.phone.AlcStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel.xmlapi.phone.AlcStatus) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel.xmlapi.phone.AlcStatus.class);
            }
        }
    }

    public com.alcatel.xmlapi.phone.AlcStatus moveFolder(com.alcatel.xmlapi.phone.MoveRepertoryOrFolder invoke) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("moveFolder");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "moveFolder"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {invoke});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel.xmlapi.phone.AlcStatus) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel.xmlapi.phone.AlcStatus) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel.xmlapi.phone.AlcStatus.class);
            }
        }
    }

}
