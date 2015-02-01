/**
 * RepertoryNode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package com.alcatel.xmlapi.phone;

public class RepertoryNode  implements java.io.Serializable {
    private com.alcatel.xmlapi.phone.RepertoryElt[] repertory;
    private com.alcatel.xmlapi.phone.RepertoryNode[] subRepertories;

    public RepertoryNode() {
    }

    public com.alcatel.xmlapi.phone.RepertoryElt[] getRepertory() {
        return repertory;
    }

    public void setRepertory(com.alcatel.xmlapi.phone.RepertoryElt[] repertory) {
        this.repertory = repertory;
    }

    public com.alcatel.xmlapi.phone.RepertoryNode[] getSubRepertories() {
        return subRepertories;
    }

    public void setSubRepertories(com.alcatel.xmlapi.phone.RepertoryNode[] subRepertories) {
        this.subRepertories = subRepertories;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RepertoryNode)) return false;
        RepertoryNode other = (RepertoryNode) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.repertory==null && other.getRepertory()==null) || 
             (this.repertory!=null &&
              java.util.Arrays.equals(this.repertory, other.getRepertory()))) &&
            ((this.subRepertories==null && other.getSubRepertories()==null) || 
             (this.subRepertories!=null &&
              java.util.Arrays.equals(this.subRepertories, other.getSubRepertories())));
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
        if (getSubRepertories() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubRepertories());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubRepertories(), i);
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
        new org.apache.axis.description.TypeDesc(RepertoryNode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "RepertoryNode"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repertory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "repertory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "RepertoryElt"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subRepertories");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subRepertories"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "RepertoryNode"));
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
