/**
 * AlcTelephonyCapabilities.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package com.alcatel.xmlapi.phone;

public class AlcTelephonyCapabilities  implements java.io.Serializable {
    private com.alcatel.xmlapi.phone.AlcStatus status;
    private boolean makeCall;
    private boolean makePrivateCall;
    private boolean makeBusinessCall;
    private boolean makeCorrelatorCall;
    private boolean sendAssociateData;
    private boolean takeCall;
    private boolean takeCurrentCall;
    private boolean holdCall;
    private boolean holdCurrentCall;
    private boolean clearCall;
    private boolean clearCurrentCall;
    private boolean conferenceCall;
    private boolean conferenceCurrentCall;
    private boolean transferCall;
    private boolean transferCurrentCall;
    private boolean sendDTMF;
    private boolean getCurrentCallInfo;
    private boolean getCallState;

    public AlcTelephonyCapabilities() {
    }

    public com.alcatel.xmlapi.phone.AlcStatus getStatus() {
        return status;
    }

    public void setStatus(com.alcatel.xmlapi.phone.AlcStatus status) {
        this.status = status;
    }

    public boolean isMakeCall() {
        return makeCall;
    }

    public void setMakeCall(boolean makeCall) {
        this.makeCall = makeCall;
    }

    public boolean isMakePrivateCall() {
        return makePrivateCall;
    }

    public void setMakePrivateCall(boolean makePrivateCall) {
        this.makePrivateCall = makePrivateCall;
    }

    public boolean isMakeBusinessCall() {
        return makeBusinessCall;
    }

    public void setMakeBusinessCall(boolean makeBusinessCall) {
        this.makeBusinessCall = makeBusinessCall;
    }

    public boolean isMakeCorrelatorCall() {
        return makeCorrelatorCall;
    }

    public void setMakeCorrelatorCall(boolean makeCorrelatorCall) {
        this.makeCorrelatorCall = makeCorrelatorCall;
    }

    public boolean isSendAssociateData() {
        return sendAssociateData;
    }

    public void setSendAssociateData(boolean sendAssociateData) {
        this.sendAssociateData = sendAssociateData;
    }

    public boolean isTakeCall() {
        return takeCall;
    }

    public void setTakeCall(boolean takeCall) {
        this.takeCall = takeCall;
    }

    public boolean isTakeCurrentCall() {
        return takeCurrentCall;
    }

    public void setTakeCurrentCall(boolean takeCurrentCall) {
        this.takeCurrentCall = takeCurrentCall;
    }

    public boolean isHoldCall() {
        return holdCall;
    }

    public void setHoldCall(boolean holdCall) {
        this.holdCall = holdCall;
    }

    public boolean isHoldCurrentCall() {
        return holdCurrentCall;
    }

    public void setHoldCurrentCall(boolean holdCurrentCall) {
        this.holdCurrentCall = holdCurrentCall;
    }

    public boolean isClearCall() {
        return clearCall;
    }

    public void setClearCall(boolean clearCall) {
        this.clearCall = clearCall;
    }

    public boolean isClearCurrentCall() {
        return clearCurrentCall;
    }

    public void setClearCurrentCall(boolean clearCurrentCall) {
        this.clearCurrentCall = clearCurrentCall;
    }

    public boolean isConferenceCall() {
        return conferenceCall;
    }

    public void setConferenceCall(boolean conferenceCall) {
        this.conferenceCall = conferenceCall;
    }

    public boolean isConferenceCurrentCall() {
        return conferenceCurrentCall;
    }

    public void setConferenceCurrentCall(boolean conferenceCurrentCall) {
        this.conferenceCurrentCall = conferenceCurrentCall;
    }

    public boolean isTransferCall() {
        return transferCall;
    }

    public void setTransferCall(boolean transferCall) {
        this.transferCall = transferCall;
    }

    public boolean isTransferCurrentCall() {
        return transferCurrentCall;
    }

    public void setTransferCurrentCall(boolean transferCurrentCall) {
        this.transferCurrentCall = transferCurrentCall;
    }

    public boolean isSendDTMF() {
        return sendDTMF;
    }

    public void setSendDTMF(boolean sendDTMF) {
        this.sendDTMF = sendDTMF;
    }

    public boolean isGetCurrentCallInfo() {
        return getCurrentCallInfo;
    }

    public void setGetCurrentCallInfo(boolean getCurrentCallInfo) {
        this.getCurrentCallInfo = getCurrentCallInfo;
    }

    public boolean isGetCallState() {
        return getCallState;
    }

    public void setGetCallState(boolean getCallState) {
        this.getCallState = getCallState;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AlcTelephonyCapabilities)) return false;
        AlcTelephonyCapabilities other = (AlcTelephonyCapabilities) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            this.makeCall == other.isMakeCall() &&
            this.makePrivateCall == other.isMakePrivateCall() &&
            this.makeBusinessCall == other.isMakeBusinessCall() &&
            this.makeCorrelatorCall == other.isMakeCorrelatorCall() &&
            this.sendAssociateData == other.isSendAssociateData() &&
            this.takeCall == other.isTakeCall() &&
            this.takeCurrentCall == other.isTakeCurrentCall() &&
            this.holdCall == other.isHoldCall() &&
            this.holdCurrentCall == other.isHoldCurrentCall() &&
            this.clearCall == other.isClearCall() &&
            this.clearCurrentCall == other.isClearCurrentCall() &&
            this.conferenceCall == other.isConferenceCall() &&
            this.conferenceCurrentCall == other.isConferenceCurrentCall() &&
            this.transferCall == other.isTransferCall() &&
            this.transferCurrentCall == other.isTransferCurrentCall() &&
            this.sendDTMF == other.isSendDTMF() &&
            this.getCurrentCallInfo == other.isGetCurrentCallInfo() &&
            this.getCallState == other.isGetCallState();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        _hashCode += new Boolean(isMakeCall()).hashCode();
        _hashCode += new Boolean(isMakePrivateCall()).hashCode();
        _hashCode += new Boolean(isMakeBusinessCall()).hashCode();
        _hashCode += new Boolean(isMakeCorrelatorCall()).hashCode();
        _hashCode += new Boolean(isSendAssociateData()).hashCode();
        _hashCode += new Boolean(isTakeCall()).hashCode();
        _hashCode += new Boolean(isTakeCurrentCall()).hashCode();
        _hashCode += new Boolean(isHoldCall()).hashCode();
        _hashCode += new Boolean(isHoldCurrentCall()).hashCode();
        _hashCode += new Boolean(isClearCall()).hashCode();
        _hashCode += new Boolean(isClearCurrentCall()).hashCode();
        _hashCode += new Boolean(isConferenceCall()).hashCode();
        _hashCode += new Boolean(isConferenceCurrentCall()).hashCode();
        _hashCode += new Boolean(isTransferCall()).hashCode();
        _hashCode += new Boolean(isTransferCurrentCall()).hashCode();
        _hashCode += new Boolean(isSendDTMF()).hashCode();
        _hashCode += new Boolean(isGetCurrentCallInfo()).hashCode();
        _hashCode += new Boolean(isGetCallState()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AlcTelephonyCapabilities.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "AlcTelephonyCapabilities"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "AlcStatus"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("makeCall");
        elemField.setXmlName(new javax.xml.namespace.QName("", "makeCall"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("makePrivateCall");
        elemField.setXmlName(new javax.xml.namespace.QName("", "makePrivateCall"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("makeBusinessCall");
        elemField.setXmlName(new javax.xml.namespace.QName("", "makeBusinessCall"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("makeCorrelatorCall");
        elemField.setXmlName(new javax.xml.namespace.QName("", "makeCorrelatorCall"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendAssociateData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sendAssociateData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("takeCall");
        elemField.setXmlName(new javax.xml.namespace.QName("", "takeCall"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("takeCurrentCall");
        elemField.setXmlName(new javax.xml.namespace.QName("", "takeCurrentCall"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("holdCall");
        elemField.setXmlName(new javax.xml.namespace.QName("", "holdCall"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("holdCurrentCall");
        elemField.setXmlName(new javax.xml.namespace.QName("", "holdCurrentCall"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clearCall");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clearCall"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clearCurrentCall");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clearCurrentCall"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conferenceCall");
        elemField.setXmlName(new javax.xml.namespace.QName("", "conferenceCall"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conferenceCurrentCall");
        elemField.setXmlName(new javax.xml.namespace.QName("", "conferenceCurrentCall"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferCall");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferCall"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferCurrentCall");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transferCurrentCall"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendDTMF");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sendDTMF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getCurrentCallInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "getCurrentCallInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getCallState");
        elemField.setXmlName(new javax.xml.namespace.QName("", "getCallState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
