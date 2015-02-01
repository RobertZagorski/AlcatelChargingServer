/**
 * AlcPhoneCapabilities.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package com.alcatel.xmlapi.phone;

public class AlcPhoneCapabilities  implements java.io.Serializable {
    private com.alcatel.xmlapi.phone.AlcStatus status;
    private boolean events;
    private boolean nomadic;
    private boolean telephony;
    private boolean callRecord;
    private boolean callLog;
    private boolean repertory;

    public AlcPhoneCapabilities() {
    }

    public com.alcatel.xmlapi.phone.AlcStatus getStatus() {
        return status;
    }

    public void setStatus(com.alcatel.xmlapi.phone.AlcStatus status) {
        this.status = status;
    }

    public boolean isEvents() {
        return events;
    }

    public void setEvents(boolean events) {
        this.events = events;
    }

    public boolean isNomadic() {
        return nomadic;
    }

    public void setNomadic(boolean nomadic) {
        this.nomadic = nomadic;
    }

    public boolean isTelephony() {
        return telephony;
    }

    public void setTelephony(boolean telephony) {
        this.telephony = telephony;
    }

    public boolean isCallRecord() {
        return callRecord;
    }

    public void setCallRecord(boolean callRecord) {
        this.callRecord = callRecord;
    }

    public boolean isCallLog() {
        return callLog;
    }

    public void setCallLog(boolean callLog) {
        this.callLog = callLog;
    }

    public boolean isRepertory() {
        return repertory;
    }

    public void setRepertory(boolean repertory) {
        this.repertory = repertory;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AlcPhoneCapabilities)) return false;
        AlcPhoneCapabilities other = (AlcPhoneCapabilities) obj;
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
            this.events == other.isEvents() &&
            this.nomadic == other.isNomadic() &&
            this.telephony == other.isTelephony() &&
            this.callRecord == other.isCallRecord() &&
            this.callLog == other.isCallLog() &&
            this.repertory == other.isRepertory();
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
        _hashCode += new Boolean(isEvents()).hashCode();
        _hashCode += new Boolean(isNomadic()).hashCode();
        _hashCode += new Boolean(isTelephony()).hashCode();
        _hashCode += new Boolean(isCallRecord()).hashCode();
        _hashCode += new Boolean(isCallLog()).hashCode();
        _hashCode += new Boolean(isRepertory()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AlcPhoneCapabilities.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "AlcPhoneCapabilities"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "AlcStatus"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("events");
        elemField.setXmlName(new javax.xml.namespace.QName("", "events"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomadic");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nomadic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telephony");
        elemField.setXmlName(new javax.xml.namespace.QName("", "telephony"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callRecord");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callRecord"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callLog");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callLog"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repertory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "repertory"));
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
