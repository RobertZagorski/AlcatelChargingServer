/**
 * MakeCallInvoke.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package com.alcatel.xmlapi.phone;

public class MakeCallInvoke  implements java.io.Serializable {
    private java.lang.String sessionId;
    private java.lang.String callee;
    private com.alcatel.xmlapi.phone.CallMode mode;
    private java.lang.String businessCodeOrPIN;
    private java.lang.String secretCode;
    private byte[] associateData;

    public MakeCallInvoke() {
    }

    public java.lang.String getSessionId() {
        return sessionId;
    }

    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }

    public java.lang.String getCallee() {
        return callee;
    }

    public void setCallee(java.lang.String callee) {
        this.callee = callee;
    }

    public com.alcatel.xmlapi.phone.CallMode getMode() {
        return mode;
    }

    public void setMode(com.alcatel.xmlapi.phone.CallMode mode) {
        this.mode = mode;
    }

    public java.lang.String getBusinessCodeOrPIN() {
        return businessCodeOrPIN;
    }

    public void setBusinessCodeOrPIN(java.lang.String businessCodeOrPIN) {
        this.businessCodeOrPIN = businessCodeOrPIN;
    }

    public java.lang.String getSecretCode() {
        return secretCode;
    }

    public void setSecretCode(java.lang.String secretCode) {
        this.secretCode = secretCode;
    }

    public byte[] getAssociateData() {
        return associateData;
    }

    public void setAssociateData(byte[] associateData) {
        this.associateData = associateData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MakeCallInvoke)) return false;
        MakeCallInvoke other = (MakeCallInvoke) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sessionId==null && other.getSessionId()==null) || 
             (this.sessionId!=null &&
              this.sessionId.equals(other.getSessionId()))) &&
            ((this.callee==null && other.getCallee()==null) || 
             (this.callee!=null &&
              this.callee.equals(other.getCallee()))) &&
            ((this.mode==null && other.getMode()==null) || 
             (this.mode!=null &&
              this.mode.equals(other.getMode()))) &&
            ((this.businessCodeOrPIN==null && other.getBusinessCodeOrPIN()==null) || 
             (this.businessCodeOrPIN!=null &&
              this.businessCodeOrPIN.equals(other.getBusinessCodeOrPIN()))) &&
            ((this.secretCode==null && other.getSecretCode()==null) || 
             (this.secretCode!=null &&
              this.secretCode.equals(other.getSecretCode()))) &&
            ((this.associateData==null && other.getAssociateData()==null) || 
             (this.associateData!=null &&
              java.util.Arrays.equals(this.associateData, other.getAssociateData())));
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
        if (getSessionId() != null) {
            _hashCode += getSessionId().hashCode();
        }
        if (getCallee() != null) {
            _hashCode += getCallee().hashCode();
        }
        if (getMode() != null) {
            _hashCode += getMode().hashCode();
        }
        if (getBusinessCodeOrPIN() != null) {
            _hashCode += getBusinessCodeOrPIN().hashCode();
        }
        if (getSecretCode() != null) {
            _hashCode += getSecretCode().hashCode();
        }
        if (getAssociateData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssociateData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssociateData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MakeCallInvoke.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "MakeCallInvoke"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callee");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "CallMode"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessCodeOrPIN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "businessCodeOrPIN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secretCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "secretCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("associateData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "associateData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "hexBinary"));
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
