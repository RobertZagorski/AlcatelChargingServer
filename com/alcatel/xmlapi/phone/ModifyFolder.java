/**
 * ModifyFolder.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package com.alcatel.xmlapi.phone;

public class ModifyFolder  implements java.io.Serializable {
    private java.lang.String sessionId;
    private com.alcatel.xmlapi.phone.ItemId fatherId;
    private com.alcatel.xmlapi.phone.FolderElt elt;

    public ModifyFolder() {
    }

    public java.lang.String getSessionId() {
        return sessionId;
    }

    public void setSessionId(java.lang.String sessionId) {
        this.sessionId = sessionId;
    }

    public com.alcatel.xmlapi.phone.ItemId getFatherId() {
        return fatherId;
    }

    public void setFatherId(com.alcatel.xmlapi.phone.ItemId fatherId) {
        this.fatherId = fatherId;
    }

    public com.alcatel.xmlapi.phone.FolderElt getElt() {
        return elt;
    }

    public void setElt(com.alcatel.xmlapi.phone.FolderElt elt) {
        this.elt = elt;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ModifyFolder)) return false;
        ModifyFolder other = (ModifyFolder) obj;
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
            ((this.fatherId==null && other.getFatherId()==null) || 
             (this.fatherId!=null &&
              this.fatherId.equals(other.getFatherId()))) &&
            ((this.elt==null && other.getElt()==null) || 
             (this.elt!=null &&
              this.elt.equals(other.getElt())));
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
        if (getFatherId() != null) {
            _hashCode += getFatherId().hashCode();
        }
        if (getElt() != null) {
            _hashCode += getElt().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ModifyFolder.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "ModifyFolder"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fatherId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fatherId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "ItemId"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("elt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "elt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "FolderElt"));
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
