/**
 * NumberType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package com.alcatel.xmlapi.phone;

public class NumberType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected NumberType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _none = "none";
    public static final java.lang.String _boss = "boss";
    public static final java.lang.String _secretary = "secretary";
    public static final java.lang.String _group = "group";
    public static final java.lang.String _associate = "associate";
    public static final java.lang.String _voiceMail = "voiceMail";
    public static final java.lang.String _voiceMailConsult = "voiceMailConsult";
    public static final NumberType none = new NumberType(_none);
    public static final NumberType boss = new NumberType(_boss);
    public static final NumberType secretary = new NumberType(_secretary);
    public static final NumberType group = new NumberType(_group);
    public static final NumberType associate = new NumberType(_associate);
    public static final NumberType voiceMail = new NumberType(_voiceMail);
    public static final NumberType voiceMailConsult = new NumberType(_voiceMailConsult);
    public java.lang.String getValue() { return _value_;}
    public static NumberType fromValue(java.lang.String value)
          throws java.lang.IllegalStateException {
        NumberType enum = (NumberType)
            _table_.get(value);
        if (enum==null) throw new java.lang.IllegalStateException();
        return enum;
    }
    public static NumberType fromString(java.lang.String value)
          throws java.lang.IllegalStateException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
}
