/**
 * AllRepertoryResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package com.alcatel.xmlapi.phone;

public class AllRepertoryResult  implements java.io.Serializable {
    private com.alcatel.xmlapi.phone.AlcStatus status;
    private com.alcatel.xmlapi.phone.RepertoryNode repertoryNode;

    public AllRepertoryResult() {
    }

    public com.alcatel.xmlapi.phone.AlcStatus getStatus() {
        return status;
    }

    public void setStatus(com.alcatel.xmlapi.phone.AlcStatus status) {
        this.status = status;
    }

    public com.alcatel.xmlapi.phone.RepertoryNode getRepertoryNode() {
        return repertoryNode;
    }

    public void setRepertoryNode(com.alcatel.xmlapi.phone.RepertoryNode repertoryNode) {
        this.repertoryNode = repertoryNode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AllRepertoryResult)) return false;
        AllRepertoryResult other = (AllRepertoryResult) obj;
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
            ((this.repertoryNode==null && other.getRepertoryNode()==null) || 
             (this.repertoryNode!=null &&
              this.repertoryNode.equals(other.getRepertoryNode())));
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
        if (getRepertoryNode() != null) {
            _hashCode += getRepertoryNode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AllRepertoryResult.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "AllRepertoryResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "AlcStatus"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repertoryNode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "repertoryNode"));
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
