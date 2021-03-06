/**
 * XmlPhoneServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package com.alcatel.xmlapi.phone;

public class XmlPhoneServiceLocator extends org.apache.axis.client.Service implements com.alcatel.xmlapi.phone.XmlPhoneService {

    // Xml Telephony service, allows to use basic telephonic features.

    // Use to get a proxy class for XmlPhone
    private final java.lang.String XmlPhone_address = "http://localhost:8080/api/services/2.2/XMLPhone";

    public java.lang.String getXmlPhoneAddress() {
        return XmlPhone_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String XmlPhoneWSDDServiceName = "XmlPhone";

    public java.lang.String getXmlPhoneWSDDServiceName() {
        return XmlPhoneWSDDServiceName;
    }

    public void setXmlPhoneWSDDServiceName(java.lang.String name) {
        XmlPhoneWSDDServiceName = name;
    }

    public com.alcatel.xmlapi.phone.XmlPhone getXmlPhone() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(XmlPhone_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getXmlPhone(endpoint);
    }

    public com.alcatel.xmlapi.phone.XmlPhone getXmlPhone(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.alcatel.xmlapi.phone.XmlPhoneSoapBindingStub _stub = new com.alcatel.xmlapi.phone.XmlPhoneSoapBindingStub(portAddress, this);
            _stub.setPortName(getXmlPhoneWSDDServiceName());
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
            if (com.alcatel.xmlapi.phone.XmlPhone.class.isAssignableFrom(serviceEndpointInterface)) {
                com.alcatel.xmlapi.phone.XmlPhoneSoapBindingStub _stub = new com.alcatel.xmlapi.phone.XmlPhoneSoapBindingStub(new java.net.URL(XmlPhone_address), this);
                _stub.setPortName(getXmlPhoneWSDDServiceName());
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
        if ("XmlPhone".equals(inputPortName)) {
            return getXmlPhone();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://xmlapi.alcatel.com/phone", "XmlPhoneService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("XmlPhone"));
        }
        return ports.iterator();
    }

}
