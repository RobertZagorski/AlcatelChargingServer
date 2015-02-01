/**
 * XmlApiFrameworkService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package com.alcatel.xmlapi.framework;

public interface XmlApiFrameworkService extends javax.xml.rpc.Service {

    // XML API Framework service : framework session management
    public java.lang.String getXmlApiFrameworkAddress();

    public com.alcatel.xmlapi.framework.XmlApiFramework getXmlApiFramework() throws javax.xml.rpc.ServiceException;

    public com.alcatel.xmlapi.framework.XmlApiFramework getXmlApiFramework(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
