/**
 * CallLogElt.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package com.alcatel.xmlapi.phone;

public class CallLogElt  implements java.io.Serializable {
    private com.alcatel.xmlapi.phone.ItemId itemId;
    private java.lang.String dirNumber;
    private com.alcatel.xmlapi.phone.TypedNumber corrNumber;
    private java.lang.String corrName;
    private java.lang.String corrFirstName;
    private com.alcatel.xmlapi.phone.TypedNumber initialNumber;
    private java.lang.String newDestNumber;
    private com.alcatel.xmlapi.phone.CallType calltype;
    private java.util.Calendar dateOfBegin;
    private java.util.Calendar dateOfConvers;
    private java.util.Calendar dateOfEnd;
    private com.alcatel.xmlapi.phone.CallCause cause;
    private boolean acknowledged;

    public CallLogElt() {
    }

    public com.alcatel.xmlapi.phone.ItemId getItemId() {
        return itemId;
    }

    public void setItemId(com.alcatel.xmlapi.phone.ItemId itemId) {
        this.itemId = itemId;
    }

    public java.lang.String getDirNumber() {
        return dirNumber;
    }

    public void setDirNumber(java.lang.String dirNumber) {
        this.dirNumber = dirNumber;
    }

    public com.alcatel.xmlapi.phone.TypedNumber getCorrNumber() {
        return corrNumber;
    }

    public void setCorrNumber(com.alcatel.xmlapi.phone.TypedNumber corrNumber) {
        this.corrNumber = corrNumber;
    }

    public java.lang.String getCorrName() {
        return corrName;
    }

    public void setCorrName(java.lang.String corrName) {
        this.corrName = corrName;
    }

    public java.lang.String getCorrFirstName() {
        return corrFirstName;
    }

    public void setCorrFirstName(java.lang.String corrFirstName) {
        this.corrFirstName = corrFirstName;
    }

    public com.alcatel.xmlapi.phone.TypedNumber getInitialNumber() {
        return initialNumber;
    }

    public void setInitialNumber(com.alcatel.xmlapi.phone.TypedNumber initialNumber) {
        this.initialNumber = initialNumber;
    }

    public java.lang.String getNewDestNumber() {
        return newDestNumber;
    }

    public void setNewDestNumber(java.lang.String newDestNumber) {
        this.newDestNumber = newDestNumber;
    }

    public com.alcatel.xmlapi.phone.CallType getCalltype() {
        return calltype;
    }

    public void setCalltype(com.alcatel.xmlapi.phone.CallType calltype) {
        this.calltype = calltype;
    }

    public java.util.Calendar getDateOfBegin() {
        return dateOfBegin;
    }

    public void setDateOfBegin(java.util.Calendar dateOfBegin) {
        this.dateOfBegin = dateOfBegin;
    }

    public java.util.Calendar getDateOfConvers() {
        return dateOfConvers;
    }

    public void setDateOfConvers(java.util.Calendar dateOfConvers) {
        this.dateOfConvers = dateOfConvers;
    }

    public java.util.Calendar getDateOfEnd() {
        return dateOfEnd;
    }

    public void setDateOfEnd(java.util.Calendar dateOfEnd) {
        this.dateOfEnd = dateOfEnd;
    }

    public com.alcatel.xmlapi.phone.CallCause getCause() {
        return cause;
    }

    public void setCause(com.alcatel.xmlapi.phone.CallCause cause) {
        this.cause = cause;
    }

    public boolean isAcknowledged() {
        return acknowledged;
    }

    public void setAcknowledged(boolean acknowledged) {
        this.acknowledged = acknowledged;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CallLogElt)) return false;
        CallLogElt other = (CallLogElt) obj;
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
            ((this.dirNumber==null && other.getDirNumber()==null) || 
             (this.dirNumber!=null &&
              this.dirNumber.equals(other.getDirNumber()))) &&
            ((this.corrNumber==null && other.getCorrNumber()==null) || 
             (this.corrNumber!=null &&
              this.corrNumber.equals(other.getCorrNumber()))) &&
            ((this.corrName==null && other.getCorrName()==null) || 
             (this.corrName!=null &&
              this.corrName.equals(other.getCorrName()))) &&
            ((this.corrFirstName==null && other.getCorrFirstName()==null) || 
             (this.corrFirstName!=null &&
              this.corrFirstName.equals(other.getCorrFirstName()))) &&
            ((this.initialNumber==null && other.getInitialNumber()==null) || 
             (this.initialNumber!=null &&
              this.initialNumber.equals(other.getInitialNumber()))) &&
            ((this.newDestNumber==null && other.getNewDestNumber()==null) || 
             (this.newDestNumber!=null &&
              this.newDestNumber.equals(other.getNewDestNumber()))) &&
            ((this.calltype==null && other.getCalltype()==null) || 
             (this.calltype!=null &&
              this.calltype.equals(other.getCalltype()))) &&
            ((this.dateOfBegin==null && other.getDateOfBegin()==null) || 
             (this.dateOfBegin!=null &&
              this.dateOfBegin.equals(other.getDateOfBegin()))) &&
            ((this.dateOfConvers==null && other.getDateOfConvers()==null) || 
             (this.dateOfConvers!=null &&
              this.dateOfConvers.equals(other.getDateOfConvers()))) &&
            ((this.dateOfEnd==null && other.getDateOfEnd()==null) || 
             (this.dateOfEnd!=null &&
              this.dateOfEnd.equals(other.getDateOfEnd()))) &&
            ((this.cause==null && other.getCause()==null) || 
             (this.cause!=null &&
              this.cause.equals(other.getCause()))) &&
            this.acknowledged == other.isAcknowledged();
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
        if (getDirNumber() != null) {
            _hashCode += getDirNumber().hashCode();
        }
        if (getCorrNumber() != null) {
            _hashCode += getCorrNumber().hashCode();
        }
        if (getCorrName() != null) {
            _hashCode += getCorrName().hashCode();
        }
        if (getCorrFirstName() != null) {
            _hashCode += getCorrFirstName().hashCode();
        }
        if (getInitialNumber() != null) {
            _hashCode += getInitialNumber().hashCode();
        }
        if (getNewDestNumber() != null) {
            _hashCode += getNewDestNumber().hashCode();
        }
        if (getCalltype() != null) {
            _hashCode += getCalltype().hashCode();
        }
        if (getDateOfBegin() != null) {
            _hashCode += getDateOfBegin().hashCode();
        }
        if (getDateOfConvers() != null) {
            _hashCode += getDateOfConvers().hashCode();
        }
        if (getDateOfEnd() != null) {
            _hashCode += getDateOfEnd().hashCode();
        }
        if (getCause() != null) {
            _hashCode += getCause().hashCode();
        }
        _hashCode += new Boolean(isAcknowledged()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CallLogElt.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "CallLogElt"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "itemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "ItemId"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dirNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dirNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corrNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "corrNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "TypedNumber"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corrName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "corrName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corrFirstName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "corrFirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "initialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "TypedNumber"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newDestNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "newDestNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calltype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "calltype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "CallType"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOfBegin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateOfBegin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOfConvers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateOfConvers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOfEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateOfEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cause");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cause"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "CallCause"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acknowledged");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acknowledged"));
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
