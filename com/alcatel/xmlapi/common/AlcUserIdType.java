/**
 * AlcUserIdType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package com.alcatel.xmlapi.common;

public class AlcUserIdType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AlcUserIdType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _LOGIN_NAME = "LOGIN_NAME";
    public static final java.lang.String _PHONE_NUMBER = "PHONE_NUMBER";
    public static final java.lang.String _EMAIL = "EMAIL";
    public static final AlcUserIdType LOGIN_NAME = new AlcUserIdType(_LOGIN_NAME);
    public static final AlcUserIdType PHONE_NUMBER = new AlcUserIdType(_PHONE_NUMBER);
    public static final AlcUserIdType EMAIL = new AlcUserIdType(_EMAIL);
    public java.lang.String getValue() { return _value_;}
    public static AlcUserIdType fromValue(java.lang.String value)
          throws java.lang.IllegalStateException {
        AlcUserIdType enum = (AlcUserIdType)
            _table_.get(value);
        if (enum==null) throw new java.lang.IllegalStateException();
        return enum;
    }
    public static AlcUserIdType fromString(java.lang.String value)
          throws java.lang.IllegalStateException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
}
