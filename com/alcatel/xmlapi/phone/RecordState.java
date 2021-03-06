/**
 * RecordState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package com.alcatel.xmlapi.phone;

public class RecordState implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected RecordState(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _enable = "enable";
    public static final java.lang.String _disable = "disable";
    public static final java.lang.String _inProgress = "inProgress";
    public static final RecordState enable = new RecordState(_enable);
    public static final RecordState disable = new RecordState(_disable);
    public static final RecordState inProgress = new RecordState(_inProgress);
    public java.lang.String getValue() { return _value_;}
    public static RecordState fromValue(java.lang.String value)
          throws java.lang.IllegalStateException {
        RecordState enum = (RecordState)
            _table_.get(value);
        if (enum==null) throw new java.lang.IllegalStateException();
        return enum;
    }
    public static RecordState fromString(java.lang.String value)
          throws java.lang.IllegalStateException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
}
