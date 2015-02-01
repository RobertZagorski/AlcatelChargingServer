/**
 * CallState.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package com.alcatel.xmlapi.phone;

public class CallState implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CallState(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _init = "init";
    public static final java.lang.String _ringingIncoming = "ringingIncoming";
    public static final java.lang.String _ringingOutgoing = "ringingOutgoing";
    public static final java.lang.String _active = "active";
    public static final java.lang.String _held = "held";
    public static final java.lang.String _conferenced = "conferenced";
    public static final java.lang.String _recording = "recording";
    public static final java.lang.String _waiting = "waiting";
    public static final java.lang.String _dialing = "dialing";
    public static final java.lang.String _releasing = "releasing";
    public static final java.lang.String _unknown = "unknown";
    public static final CallState init = new CallState(_init);
    public static final CallState ringingIncoming = new CallState(_ringingIncoming);
    public static final CallState ringingOutgoing = new CallState(_ringingOutgoing);
    public static final CallState active = new CallState(_active);
    public static final CallState held = new CallState(_held);
    public static final CallState conferenced = new CallState(_conferenced);
    public static final CallState recording = new CallState(_recording);
    public static final CallState waiting = new CallState(_waiting);
    public static final CallState dialing = new CallState(_dialing);
    public static final CallState releasing = new CallState(_releasing);
    public static final CallState unknown = new CallState(_unknown);
    public java.lang.String getValue() { return _value_;}
    public static CallState fromValue(java.lang.String value)
          throws java.lang.IllegalStateException {
        CallState enum = (CallState)
            _table_.get(value);
        if (enum==null) throw new java.lang.IllegalStateException();
        return enum;
    }
    public static CallState fromString(java.lang.String value)
          throws java.lang.IllegalStateException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
}
