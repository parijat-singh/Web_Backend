/**
 * CalculateServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.simplilearn.workshop;

public class CalculateServiceLocator extends org.apache.axis.client.Service implements com.simplilearn.workshop.CalculateService {

    public CalculateServiceLocator() {
    }


    public CalculateServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CalculateServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Calculate
    private java.lang.String Calculate_address = "http://localhost:8080/soapDemo/services/Calculate";

    public java.lang.String getCalculateAddress() {
        return Calculate_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CalculateWSDDServiceName = "Calculate";

    public java.lang.String getCalculateWSDDServiceName() {
        return CalculateWSDDServiceName;
    }

    public void setCalculateWSDDServiceName(java.lang.String name) {
        CalculateWSDDServiceName = name;
    }

    public com.simplilearn.workshop.Calculate getCalculate() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Calculate_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCalculate(endpoint);
    }

    public com.simplilearn.workshop.Calculate getCalculate(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.simplilearn.workshop.CalculateSoapBindingStub _stub = new com.simplilearn.workshop.CalculateSoapBindingStub(portAddress, this);
            _stub.setPortName(getCalculateWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCalculateEndpointAddress(java.lang.String address) {
        Calculate_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.simplilearn.workshop.Calculate.class.isAssignableFrom(serviceEndpointInterface)) {
                com.simplilearn.workshop.CalculateSoapBindingStub _stub = new com.simplilearn.workshop.CalculateSoapBindingStub(new java.net.URL(Calculate_address), this);
                _stub.setPortName(getCalculateWSDDServiceName());
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
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Calculate".equals(inputPortName)) {
            return getCalculate();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://workshop.simplilearn.com", "CalculateService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://workshop.simplilearn.com", "Calculate"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Calculate".equals(portName)) {
            setCalculateEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
