/**
 * XmlPhoneEventsServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package com.alcatel.xmlapi.phone;

public class XmlPhoneEventsServiceLocator extends org.apache.axis.client.Service implements com.alcatel.xmlapi.phone.XmlPhoneEventsService {

    // Use to get a proxy class for XmlPhoneEvents
    private final java.lang.String XmlPhoneEvents_address = "http://localhost:8080/XMLPhoneEvents";

    public java.lang.String getXmlPhoneEventsAddress() {
        return XmlPhoneEvents_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String XmlPhoneEventsWSDDServiceName = "XmlPhoneEvents";

    public java.lang.String getXmlPhoneEventsWSDDServiceName() {
        return XmlPhoneEventsWSDDServiceName;
    }

    public void setXmlPhoneEventsWSDDServiceName(java.lang.String name) {
        XmlPhoneEventsWSDDServiceName = name;
    }

    public com.alcatel.xmlapi.phone.XmlPhoneEvents getXmlPhoneEvents() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(XmlPhoneEvents_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getXmlPhoneEvents(endpoint);
    }

    public com.alcatel.xmlapi.phone.XmlPhoneEvents getXmlPhoneEvents(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.alcatel.xmlapi.phone.XmlPhoneEventsSoapBindingStub _stub = new com.alcatel.xmlapi.phone.XmlPhoneEventsSoapBindingStub(portAddress, this);
            _stub.setPortName(getXmlPhoneEventsWSDDServiceName());
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
            if (com.alcatel.xmlapi.phone.XmlPhoneEvents.class.isAssignableFrom(serviceEndpointInterface)) {
                com.alcatel.xmlapi.phone.XmlPhoneEventsSoapBindingStub _stub = new com.alcatel.xmlapi.phone.XmlPhoneEventsSoapBindingStub(new java.net.URL(XmlPhoneEvents_address), this);
                _stub.setPortName(getXmlPhoneEventsWSDDServiceName());
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
        if ("XmlPhoneEvents".equals(inputPortName)) {
            return getXmlPhoneEvents();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "XmlPhoneEventsService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("XmlPhoneEvents"));
        }
        return ports.iterator();
    }

}
