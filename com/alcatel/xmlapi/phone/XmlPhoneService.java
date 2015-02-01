/**
 * XmlPhoneService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package com.alcatel.xmlapi.phone;

public interface XmlPhoneService extends javax.xml.rpc.Service {

    // Xml Telephony service, allows to use basic telephonic features.
    public java.lang.String getXmlPhoneAddress();

    public com.alcatel.xmlapi.phone.XmlPhone getXmlPhone() throws javax.xml.rpc.ServiceException;

    public com.alcatel.xmlapi.phone.XmlPhone getXmlPhone(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
