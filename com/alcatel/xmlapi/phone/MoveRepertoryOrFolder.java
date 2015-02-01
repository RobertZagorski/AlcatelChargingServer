/**
 * MoveRepertoryOrFolder.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package com.alcatel.xmlapi.phone;

public class MoveRepertoryOrFolder  implements java.io.Serializable {
    private java.lang.String sessionId;
    private com.alcatel.xmlapi.phone.ItemId sonId;
    private com.alcatel.xmlapi.phone.ItemId fatherId;

    public MoveRepertoryOrFolder() {
    }

    public java.lang.String getSessionId() {
        return sessionId;
    }

    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }

    public com.alcatel.xmlapi.phone.ItemId getSonId() {
        return sonId;
    }

    public void setSonId(com.alcatel.xmlapi.phone.ItemId sonId) {
        this.sonId = sonId;
    }

    public com.alcatel.xmlapi.phone.ItemId getFatherId() {
        return fatherId;
    }

    public void setFatherId(com.alcatel.xmlapi.phone.ItemId fatherId) {
        this.fatherId = fatherId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MoveRepertoryOrFolder)) return false;
        MoveRepertoryOrFolder other = (MoveRepertoryOrFolder) obj;
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
            ((this.sonId==null && other.getSonId()==null) || 
             (this.sonId!=null &&
              this.sonId.equals(other.getSonId()))) &&
            ((this.fatherId==null && other.getFatherId()==null) || 
             (this.fatherId!=null &&
              this.fatherId.equals(other.getFatherId())));
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
        if (getSonId() != null) {
            _hashCode += getSonId().hashCode();
        }
        if (getFatherId() != null) {
            _hashCode += getFatherId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MoveRepertoryOrFolder.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "MoveRepertoryOrFolder"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sonId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sonId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "ItemId"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fatherId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fatherId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "ItemId"));
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
