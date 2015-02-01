/**
 * CallCause.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package com.alcatel.xmlapi.phone;

public class CallCause implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CallCause(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _none = "none";
    public static final java.lang.String _busy = "busy";
    public static final java.lang.String _destNotObtainable = "destNotObtainable";
    public static final java.lang.String _dnd = "dnd";
    public static final java.lang.String _maintenance = "maintenance";
    public static final java.lang.String _notAnswered = "notAnswered";
    public static final java.lang.String _overflow = "overflow";
    public static final java.lang.String _pickupIncoming = "pickupIncoming";
    public static final java.lang.String _pickupOutgoing = "pickupOutgoing";
    public static final java.lang.String _pickupVictim = "pickupVictim";
    public static final java.lang.String _redirectedIncoming = "redirectedIncoming";
    public static final java.lang.String _redirectedOutgoing = "redirectedOutgoing";
    public static final java.lang.String _redirectedTo = "redirectedTo";
    public static final java.lang.String _transfer = "transfer";
    public static final java.lang.String _trunksBusy = "trunksBusy";
    public static final java.lang.String _blocked = "blocked";
    public static final CallCause none = new CallCause(_none);
    public static final CallCause busy = new CallCause(_busy);
    public static final CallCause destNotObtainable = new CallCause(_destNotObtainable);
    public static final CallCause dnd = new CallCause(_dnd);
    public static final CallCause maintenance = new CallCause(_maintenance);
    public static final CallCause notAnswered = new CallCause(_notAnswered);
    public static final CallCause overflow = new CallCause(_overflow);
    public static final CallCause pickupIncoming = new CallCause(_pickupIncoming);
    public static final CallCause pickupOutgoing = new CallCause(_pickupOutgoing);
    public static final CallCause pickupVictim = new CallCause(_pickupVictim);
    public static final CallCause redirectedIncoming = new CallCause(_redirectedIncoming);
    public static final CallCause redirectedOutgoing = new CallCause(_redirectedOutgoing);
    public static final CallCause redirectedTo = new CallCause(_redirectedTo);
    public static final CallCause transfer = new CallCause(_transfer);
    public static final CallCause trunksBusy = new CallCause(_trunksBusy);
    public static final CallCause blocked = new CallCause(_blocked);
    public java.lang.String getValue() { return _value_;}
    public static CallCause fromValue(java.lang.String value)
          throws java.lang.IllegalStateException {
        CallCause enum = (CallCause)
            _table_.get(value);
        if (enum==null) throw new java.lang.IllegalStateException();
        return enum;
    }
    public static CallCause fromString(java.lang.String value)
          throws java.lang.IllegalStateException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
}
