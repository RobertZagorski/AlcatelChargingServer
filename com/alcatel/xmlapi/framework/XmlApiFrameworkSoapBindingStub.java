/**
 * XmlApiFrameworkSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */

package com.alcatel.xmlapi.framework;

public class XmlApiFrameworkSoapBindingStub extends org.apache.axis.client.Stub implements com.alcatel.xmlapi.framework.XmlApiFramework {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[6];
        org.apache.axis.description.OperationDesc oper;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("login");
        oper.addParameter(new javax.xml.namespace.QName("", "pFwId"), new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.addParameter(new javax.xml.namespace.QName("", "pFwUser"), new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.addParameter(new javax.xml.namespace.QName("", "pFwPass"), new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "loginReturn"));
        oper.setStyle(org.apache.axis.enum.Style.RPC);
        oper.setUse(org.apache.axis.enum.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/framework", "fwFault"),
                      "com.alcatel.xmlapi.framework.types.AlcFwException",
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/framework/types", "AlcFwException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/framework", "fault"),
                      "com.alcatel.xmlapi.common.AlcServiceException",
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcServiceException"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("loginSupervisor");
        oper.addParameter(new javax.xml.namespace.QName("", "pSupervisorLoginName"), new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.addParameter(new javax.xml.namespace.QName("", "pSupervisorPassword"), new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.addParameter(new javax.xml.namespace.QName("", "pSupervisedAccountId"), new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.addParameter(new javax.xml.namespace.QName("", "pSupervisedAccountIdType"), new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcUserIdType"), com.alcatel.xmlapi.common.AlcUserIdType.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "loginSupervisorReturn"));
        oper.setStyle(org.apache.axis.enum.Style.RPC);
        oper.setUse(org.apache.axis.enum.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/framework", "fwFault"),
                      "com.alcatel.xmlapi.framework.types.AlcFwException",
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/framework/types", "AlcFwException"), 
                      true
                     ));
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/framework", "fault"),
                      "com.alcatel.xmlapi.common.AlcServiceException",
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcServiceException"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("logout");
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.enum.Style.RPC);
        oper.setUse(org.apache.axis.enum.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/framework", "fault"),
                      "com.alcatel.xmlapi.common.AlcServiceException",
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcServiceException"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUserInfo");
        oper.setReturnType(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/framework/types", "AlcUserInfo"));
        oper.setReturnClass(com.alcatel.xmlapi.framework.types.AlcUserInfo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getUserInfoReturn"));
        oper.setStyle(org.apache.axis.enum.Style.RPC);
        oper.setUse(org.apache.axis.enum.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/framework", "fault"),
                      "com.alcatel.xmlapi.common.AlcServiceException",
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcServiceException"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("restartSessionTimer");
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.enum.Style.RPC);
        oper.setUse(org.apache.axis.enum.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/framework", "fault"),
                      "com.alcatel.xmlapi.common.AlcServiceException",
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcServiceException"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setSessionTimerValue");
        oper.addParameter(new javax.xml.namespace.QName("", "pValue"), new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, org.apache.axis.description.ParameterDesc.IN, false, false);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.enum.Style.RPC);
        oper.setUse(org.apache.axis.enum.Use.ENCODED);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/framework", "fault"),
                      "com.alcatel.xmlapi.common.AlcServiceException",
                      new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcServiceException"), 
                      true
                     ));
        _operations[5] = oper;

    }

    public XmlApiFrameworkSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public XmlApiFrameworkSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public XmlApiFrameworkSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/framework/types", "AlcFwException");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.framework.types.AlcFwException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcUserIdType");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.common.AlcUserIdType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/framework/types", "AlcFwError");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.framework.types.AlcFwError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcServiceException");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.common.AlcServiceException.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/framework/types", "AlcUserInfo");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.framework.types.AlcUserInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://xmlapi.alcatel.com/common", "AlcServiceError");
            cachedSerQNames.add(qName);
            cls = com.alcatel.xmlapi.common.AlcServiceError.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }

    private org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call =
                    (org.apache.axis.client.Call) super.service.createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
                    _call.setEncodingStyle(org.apache.axis.Constants.URI_SOAP11_ENC);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                        java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                        _call.registerTypeMapping(cls, qName, sf, df, false);
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", t);
        }
    }

    public java.lang.String login(java.lang.String pFwId, java.lang.String pFwUser, java.lang.String pFwPass) throws java.rmi.RemoteException, com.alcatel.xmlapi.framework.types.AlcFwException, com.alcatel.xmlapi.common.AlcServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("login");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/framework", "login"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {pFwId, pFwUser, pFwPass});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
    }

    public java.lang.String loginSupervisor(java.lang.String pSupervisorLoginName, java.lang.String pSupervisorPassword, java.lang.String pSupervisedAccountId, com.alcatel.xmlapi.common.AlcUserIdType pSupervisedAccountIdType) throws java.rmi.RemoteException, com.alcatel.xmlapi.framework.types.AlcFwException, com.alcatel.xmlapi.common.AlcServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("loginSupervisor");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/framework", "loginSupervisor"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {pSupervisorLoginName, pSupervisorPassword, pSupervisedAccountId, pSupervisedAccountIdType});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
    }

    public void logout() throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("logout");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/framework", "logout"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
    }

    public com.alcatel.xmlapi.framework.types.AlcUserInfo getUserInfo() throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("getUserInfo");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/framework", "getUserInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.alcatel.xmlapi.framework.types.AlcUserInfo) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.alcatel.xmlapi.framework.types.AlcUserInfo) org.apache.axis.utils.JavaUtils.convert(_resp, com.alcatel.xmlapi.framework.types.AlcUserInfo.class);
            }
        }
    }

    public void restartSessionTimer() throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("restartSessionTimer");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/framework", "restartSessionTimer"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
    }

    public void setSessionTimerValue(int pValue) throws java.rmi.RemoteException, com.alcatel.xmlapi.common.AlcServiceException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("setSessionTimerValue");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://xmlapi.alcatel.com/framework", "setSessionTimerValue"));

        setRequestHeaders(_call);
        setAttachments(_call);
        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(pValue)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
    }

}
