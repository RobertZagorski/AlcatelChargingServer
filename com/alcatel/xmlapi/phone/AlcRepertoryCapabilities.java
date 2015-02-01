/**
 * AlcRepertoryCapabilities.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package com.alcatel.xmlapi.phone;

public class AlcRepertoryCapabilities  implements java.io.Serializable {
    private com.alcatel.xmlapi.phone.AlcStatus status;
    private boolean getRepertory;
    private boolean getAllRepertory;
    private boolean createRepertory;
    private boolean modifyRepertory;
    private boolean deleteRepertory;
    private boolean moveRepertory;
    private boolean getFolder;
    private boolean createFolder;
    private boolean modifyFolder;
    private boolean deleteFolder;
    private boolean moveFolder;

    public AlcRepertoryCapabilities() {
    }

    public com.alcatel.xmlapi.phone.AlcStatus getStatus() {
        return status;
    }

    public void setStatus(com.alcatel.xmlapi.phone.AlcStatus status) {
        this.status = status;
    }

    public boolean isGetRepertory() {
        return getRepertory;
    }

    public void setGetRepertory(boolean getRepertory) {
        this.getRepertory = getRepertory;
    }

    public boolean isGetAllRepertory() {
        return getAllRepertory;
    }

    public void setGetAllRepertory(boolean getAllRepertory) {
        this.getAllRepertory = getAllRepertory;
    }

    public boolean isCreateRepertory() {
        return createRepertory;
    }

    public void setCreateRepertory(boolean createRepertory) {
        this.createRepertory = createRepertory;
    }

    public boolean isModifyRepertory() {
        return modifyRepertory;
    }

    public void setModifyRepertory(boolean modifyRepertory) {
        this.modifyRepertory = modifyRepertory;
    }

    public boolean isDeleteRepertory() {
        return deleteRepertory;
    }

    public void setDeleteRepertory(boolean deleteRepertory) {
        this.deleteRepertory = deleteRepertory;
    }

    public boolean isMoveRepertory() {
        return moveRepertory;
    }

    public void setMoveRepertory(boolean moveRepertory) {
        this.moveRepertory = moveRepertory;
    }

    public boolean isGetFolder() {
        return getFolder;
    }

    public void setGetFolder(boolean getFolder) {
        this.getFolder = getFolder;
    }

    public boolean isCreateFolder() {
        return createFolder;
    }

    public void setCreateFolder(boolean createFolder) {
        this.createFolder = createFolder;
    }

    public boolean isModifyFolder() {
        return modifyFolder;
    }

    public void setModifyFolder(boolean modifyFolder) {
        this.modifyFolder = modifyFolder;
    }

    public boolean isDeleteFolder() {
        return deleteFolder;
    }

    public void setDeleteFolder(boolean deleteFolder) {
        this.deleteFolder = deleteFolder;
    }

    public boolean isMoveFolder() {
        return moveFolder;
    }

    public void setMoveFolder(boolean moveFolder) {
        this.moveFolder = moveFolder;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AlcRepertoryCapabilities)) return false;
        AlcRepertoryCapabilities other = (AlcRepertoryCapabilities) obj;
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
            this.getRepertory == other.isGetRepertory() &&
            this.getAllRepertory == other.isGetAllRepertory() &&
            this.createRepertory == other.isCreateRepertory() &&
            this.modifyRepertory == other.isModifyRepertory() &&
            this.deleteRepertory == other.isDeleteRepertory() &&
            this.moveRepertory == other.isMoveRepertory() &&
            this.getFolder == other.isGetFolder() &&
            this.createFolder == other.isCreateFolder() &&
            this.modifyFolder == other.isModifyFolder() &&
            this.deleteFolder == other.isDeleteFolder() &&
            this.moveFolder == other.isMoveFolder();
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
        _hashCode += new Boolean(isGetRepertory()).hashCode();
        _hashCode += new Boolean(isGetAllRepertory()).hashCode();
        _hashCode += new Boolean(isCreateRepertory()).hashCode();
        _hashCode += new Boolean(isModifyRepertory()).hashCode();
        _hashCode += new Boolean(isDeleteRepertory()).hashCode();
        _hashCode += new Boolean(isMoveRepertory()).hashCode();
        _hashCode += new Boolean(isGetFolder()).hashCode();
        _hashCode += new Boolean(isCreateFolder()).hashCode();
        _hashCode += new Boolean(isModifyFolder()).hashCode();
        _hashCode += new Boolean(isDeleteFolder()).hashCode();
        _hashCode += new Boolean(isMoveFolder()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AlcRepertoryCapabilities.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "AlcRepertoryCapabilities"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "AlcStatus"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getRepertory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "getRepertory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAllRepertory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "getAllRepertory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createRepertory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createRepertory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifyRepertory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modifyRepertory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleteRepertory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deleteRepertory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moveRepertory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "moveRepertory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getFolder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "getFolder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createFolder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createFolder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifyFolder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modifyFolder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleteFolder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deleteFolder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moveFolder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "moveFolder"));
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
