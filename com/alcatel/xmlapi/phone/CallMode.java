/**
 * CallMode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package com.alcatel.xmlapi.phone;

public class CallMode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CallMode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _value1 = "normal";
    public static final java.lang.String _value2 = "private";
    public static final java.lang.String _value3 = "business";
    public static final java.lang.String _value4 = "correlator";
    public static final CallMode value1 = new CallMode(_value1);
    public static final CallMode value2 = new CallMode(_value2);
    public static final CallMode value3 = new CallMode(_value3);
    public static final CallMode value4 = new CallMode(_value4);
    public java.lang.String getValue() { return _value_;}
    public static CallMode fromValue(java.lang.String value)
          throws java.lang.IllegalStateException {
        CallMode enum = (CallMode)
            _table_.get(value);
        if (enum==null) throw new java.lang.IllegalStateException();
        return enum;
    }
    public static CallMode fromString(java.lang.String value)
          throws java.lang.IllegalStateException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
}
