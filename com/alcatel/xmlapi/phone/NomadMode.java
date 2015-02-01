/**
 * NomadMode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package com.alcatel.xmlapi.phone;

public class NomadMode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected NomadMode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _privatePhone = "privatePhone";
    public static final java.lang.String _local = "local";
    public static final NomadMode privatePhone = new NomadMode(_privatePhone);
    public static final NomadMode local = new NomadMode(_local);
    public java.lang.String getValue() { return _value_;}
    public static NomadMode fromValue(java.lang.String value)
          throws java.lang.IllegalStateException {
        NomadMode enum = (NomadMode)
            _table_.get(value);
        if (enum==null) throw new java.lang.IllegalStateException();
        return enum;
    }
    public static NomadMode fromString(java.lang.String value)
          throws java.lang.IllegalStateException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
}
