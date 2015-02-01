/**
 * Folder.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package com.alcatel.xmlapi.phone;

public class Folder  implements java.io.Serializable {
    private com.alcatel.xmlapi.phone.ItemId itemId;
    private java.lang.String folderName;
    private com.alcatel.xmlapi.phone.RepertoryElt[] repertory;

    public Folder() {
    }

    public com.alcatel.xmlapi.phone.ItemId getItemId() {
        return itemId;
    }

    public void setItemId(com.alcatel.xmlapi.phone.ItemId itemId) {
        this.itemId = itemId;
    }

    public java.lang.String getFolderName() {
        return folderName;
    }

    public void setFolderName(java.lang.String folderName) {
        this.folderName = folderName;
    }

    public com.alcatel.xmlapi.phone.RepertoryElt[] getRepertory() {
        return repertory;
    }

    public void setRepertory(com.alcatel.xmlapi.phone.RepertoryElt[] repertory) {
        this.repertory = repertory;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Folder)) return false;
        Folder other = (Folder) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itemId==null && other.getItemId()==null) || 
             (this.itemId!=null &&
              this.itemId.equals(other.getItemId()))) &&
            ((this.folderName==null && other.getFolderName()==null) || 
             (this.folderName!=null &&
              this.folderName.equals(other.getFolderName()))) &&
            ((this.repertory==null && other.getRepertory()==null) || 
             (this.repertory!=null &&
              java.util.Arrays.equals(this.repertory, other.getRepertory())));
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
        if (getItemId() != null) {
            _hashCode += getItemId().hashCode();
        }
        if (getFolderName() != null) {
            _hashCode += getFolderName().hashCode();
        }
        if (getRepertory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRepertory());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRepertory(), i);
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
        new org.apache.axis.description.TypeDesc(Folder.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "Folder"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "ItemId"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("folderName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "folderName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repertory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "repertory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "RepertoryElt"));
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
