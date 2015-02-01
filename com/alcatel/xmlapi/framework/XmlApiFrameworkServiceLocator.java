/**
 * XmlApiFrameworkServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package com.alcatel.xmlapi.framework;

public class XmlApiFrameworkServiceLocator extends org.apache.axis.client.Service implements com.alcatel.xmlapi.framework.XmlApiFrameworkService {

    // XML API Framework service : framework session management

    // Use to get a proxy class for XmlApiFramework
    private final java.lang.String XmlApiFramework_address = "http://localhost:8080/api/services/2.2/XMLApiFramework";

    public java.lang.String getXmlApiFrameworkAddress() {
        return XmlApiFramework_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String XmlApiFrameworkWSDDServiceName = "XmlApiFramework";

    public java.lang.String getXmlApiFrameworkWSDDServiceName() {
        return XmlApiFrameworkWSDDServiceName;
    }

    public void setXmlApiFrameworkWSDDServiceName(java.lang.String name) {
        XmlApiFrameworkWSDDServiceName = name;
    }

    public com.alcatel.xmlapi.framework.XmlApiFramework getXmlApiFramework() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(XmlApiFramework_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getXmlApiFramework(endpoint);
    }

    public com.alcatel.xmlapi.framework.XmlApiFramework getXmlApiFramework(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.alcatel.xmlapi.framework.XmlApiFrameworkSoapBindingStub _stub = new com.alcatel.xmlapi.framework.XmlApiFrameworkSoapBindingStub(portAddress, this);
            _stub.setPortName(getXmlApiFrameworkWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.alcatel.xmlapi.framework.XmlApiFramework.class.isAssignableFrom(serviceEndpointInterface)) {
                com.alcatel.xmlapi.framework.XmlApiFrameworkSoapBindingStub _stub = new com.alcatel.xmlapi.framework.XmlApiFrameworkSoapBindingStub(new java.net.URL(XmlApiFramework_address), this);
                _stub.setPortName(getXmlApiFrameworkWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        String inputPortName = portName.getLocalPart();
        if ("XmlApiFramework".equals(inputPortName)) {
            return getXmlApiFramework();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://xmlapi.alcatel.com/framework", "XmlApiFrameworkService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("XmlApiFramework"));
        }
        return ports.iterator();
    }

}
