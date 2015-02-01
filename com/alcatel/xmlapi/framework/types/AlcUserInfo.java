/**
 * AlcUserInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package com.alcatel.xmlapi.framework.types;

public class AlcUserInfo  implements java.io.Serializable {
    private java.lang.String loginName;
    private java.lang.String name;
    private java.lang.String firstName;
    private java.lang.String language;
    private java.lang.String companyPhone;
    private java.lang.String companyDect;
    private java.lang.String email;
    private boolean myPhoneAllowed;
    private boolean myManagementAllowed;
    private boolean myMessagingAllowed;
    private boolean myAssistantAllowed;

    public AlcUserInfo() {
    }

    public java.lang.String getLoginName() {
        return loginName;
    }

    public void setLoginName(java.lang.String loginName) {
        this.loginName = loginName;
    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public java.lang.String getFirstName() {
        return firstName;
    }

    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }

    public java.lang.String getLanguage() {
        return language;
    }

    public void setLanguage(java.lang.String language) {
        this.language = language;
    }

    public java.lang.String getCompanyPhone() {
        return companyPhone;
    }

    public void setCompanyPhone(java.lang.String companyPhone) {
        this.companyPhone = companyPhone;
    }

    public java.lang.String getCompanyDect() {
        return companyDect;
    }

    public void setCompanyDect(java.lang.String companyDect) {
        this.companyDect = companyDect;
    }

    public java.lang.String getEmail() {
        return email;
    }

    public void setEmail(java.lang.String email) {
        this.email = email;
    }

    public boolean isMyPhoneAllowed() {
        return myPhoneAllowed;
    }

    public void setMyPhoneAllowed(boolean myPhoneAllowed) {
        this.myPhoneAllowed = myPhoneAllowed;
    }

    public boolean isMyManagementAllowed() {
        return myManagementAllowed;
    }

    public void setMyManagementAllowed(boolean myManagementAllowed) {
        this.myManagementAllowed = myManagementAllowed;
    }

    public boolean isMyMessagingAllowed() {
        return myMessagingAllowed;
    }

    public void setMyMessagingAllowed(boolean myMessagingAllowed) {
        this.myMessagingAllowed = myMessagingAllowed;
    }

    public boolean isMyAssistantAllowed() {
        return myAssistantAllowed;
    }

    public void setMyAssistantAllowed(boolean myAssistantAllowed) {
        this.myAssistantAllowed = myAssistantAllowed;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AlcUserInfo)) return false;
        AlcUserInfo other = (AlcUserInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.loginName==null && other.getLoginName()==null) || 
             (this.loginName!=null &&
              this.loginName.equals(other.getLoginName()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage()))) &&
            ((this.companyPhone==null && other.getCompanyPhone()==null) || 
             (this.companyPhone!=null &&
              this.companyPhone.equals(other.getCompanyPhone()))) &&
            ((this.companyDect==null && other.getCompanyDect()==null) || 
             (this.companyDect!=null &&
              this.companyDect.equals(other.getCompanyDect()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            this.myPhoneAllowed == other.isMyPhoneAllowed() &&
            this.myManagementAllowed == other.isMyManagementAllowed() &&
            this.myMessagingAllowed == other.isMyMessagingAllowed() &&
            this.myAssistantAllowed == other.isMyAssistantAllowed();
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
        if (getLoginName() != null) {
            _hashCode += getLoginName().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        if (getCompanyPhone() != null) {
            _hashCode += getCompanyPhone().hashCode();
        }
        if (getCompanyDect() != null) {
            _hashCode += getCompanyDect().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        _hashCode += new Boolean(isMyPhoneAllowed()).hashCode();
        _hashCode += new Boolean(isMyManagementAllowed()).hashCode();
        _hashCode += new Boolean(isMyMessagingAllowed()).hashCode();
        _hashCode += new Boolean(isMyAssistantAllowed()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AlcUserInfo.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/framework/types", "AlcUserInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loginName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "firstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("", "language"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "companyPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyDect");
        elemField.setXmlName(new javax.xml.namespace.QName("", "companyDect"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("myPhoneAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "myPhoneAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("myManagementAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "myManagementAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("myMessagingAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "myMessagingAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("myAssistantAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "myAssistantAllowed"));
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
