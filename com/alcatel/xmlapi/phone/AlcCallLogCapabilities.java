/**
 * AlcCallLogCapabilities.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package com.alcatel.xmlapi.phone;

public class AlcCallLogCapabilities  implements java.io.Serializable {
    private com.alcatel.xmlapi.phone.AlcStatus status;
    private boolean getCallLog;
    private boolean getNbUnansweredCall;
    private boolean modifyCallLog;
    private boolean deleteCallLog;
    private boolean deleteAllCallLog;

    public AlcCallLogCapabilities() {
    }

    public com.alcatel.xmlapi.phone.AlcStatus getStatus() {
        return status;
    }

    public void setStatus(com.alcatel.xmlapi.phone.AlcStatus status) {
        this.status = status;
    }

    public boolean isGetCallLog() {
        return getCallLog;
    }

    public void setGetCallLog(boolean getCallLog) {
        this.getCallLog = getCallLog;
    }

    public boolean isGetNbUnansweredCall() {
        return getNbUnansweredCall;
    }

    public void setGetNbUnansweredCall(boolean getNbUnansweredCall) {
        this.getNbUnansweredCall = getNbUnansweredCall;
    }

    public boolean isModifyCallLog() {
        return modifyCallLog;
    }

    public void setModifyCallLog(boolean modifyCallLog) {
        this.modifyCallLog = modifyCallLog;
    }

    public boolean isDeleteCallLog() {
        return deleteCallLog;
    }

    public void setDeleteCallLog(boolean deleteCallLog) {
        this.deleteCallLog = deleteCallLog;
    }

    public boolean isDeleteAllCallLog() {
        return deleteAllCallLog;
    }

    public void setDeleteAllCallLog(boolean deleteAllCallLog) {
        this.deleteAllCallLog = deleteAllCallLog;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AlcCallLogCapabilities)) return false;
        AlcCallLogCapabilities other = (AlcCallLogCapabilities) obj;
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
            this.getCallLog == other.isGetCallLog() &&
            this.getNbUnansweredCall == other.isGetNbUnansweredCall() &&
            this.modifyCallLog == other.isModifyCallLog() &&
            this.deleteCallLog == other.isDeleteCallLog() &&
            this.deleteAllCallLog == other.isDeleteAllCallLog();
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
        _hashCode += new Boolean(isGetCallLog()).hashCode();
        _hashCode += new Boolean(isGetNbUnansweredCall()).hashCode();
        _hashCode += new Boolean(isModifyCallLog()).hashCode();
        _hashCode += new Boolean(isDeleteCallLog()).hashCode();
        _hashCode += new Boolean(isDeleteAllCallLog()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AlcCallLogCapabilities.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "AlcCallLogCapabilities"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "AlcStatus"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getCallLog");
        elemField.setXmlName(new javax.xml.namespace.QName("", "getCallLog"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getNbUnansweredCall");
        elemField.setXmlName(new javax.xml.namespace.QName("", "getNbUnansweredCall"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifyCallLog");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modifyCallLog"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleteCallLog");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deleteCallLog"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleteAllCallLog");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deleteAllCallLog"));
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
