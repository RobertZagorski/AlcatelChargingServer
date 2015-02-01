/**
 * AlcFwError.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package com.alcatel.xmlapi.framework.types;

public class AlcFwError implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AlcFwError(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _BAD_FRAMEWORK_LOGIN_PASSWORD = "BAD_FRAMEWORK_LOGIN_PASSWORD";
    public static final java.lang.String _BAD_API_NAME = "BAD_API_NAME";
    public static final java.lang.String _LICENSE_UNAVAILABLE = "LICENSE_UNAVAILABLE";
    public static final java.lang.String _NO_MORE_LICENSE_AVAILABLE = "NO_MORE_LICENSE_AVAILABLE";
    public static final AlcFwError BAD_FRAMEWORK_LOGIN_PASSWORD = new AlcFwError(_BAD_FRAMEWORK_LOGIN_PASSWORD);
    public static final AlcFwError BAD_API_NAME = new AlcFwError(_BAD_API_NAME);
    public static final AlcFwError LICENSE_UNAVAILABLE = new AlcFwError(_LICENSE_UNAVAILABLE);
    public static final AlcFwError NO_MORE_LICENSE_AVAILABLE = new AlcFwError(_NO_MORE_LICENSE_AVAILABLE);
    public java.lang.String getValue() { return _value_;}
    public static AlcFwError fromValue(java.lang.String value)
          throws java.lang.IllegalStateException {
        AlcFwError enum = (AlcFwError)
            _table_.get(value);
        if (enum==null) throw new java.lang.IllegalStateException();
        return enum;
    }
    public static AlcFwError fromString(java.lang.String value)
          throws java.lang.IllegalStateException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
}
