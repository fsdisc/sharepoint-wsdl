/**
 * VersionsLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sharepoint.soap;

public class VersionsLocator extends org.apache.axis.client.Service implements com.microsoft.schemas.sharepoint.soap.Versions {

    public VersionsLocator() {
    }


    public VersionsLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public VersionsLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for VersionsSoap
    private java.lang.String VersionsSoap_address = "http://freesharepointhosting.net/_vti_bin/Versions.asmx";

    public java.lang.String getVersionsSoapAddress() {
        return VersionsSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String VersionsSoapWSDDServiceName = "VersionsSoap";

    public java.lang.String getVersionsSoapWSDDServiceName() {
        return VersionsSoapWSDDServiceName;
    }

    public void setVersionsSoapWSDDServiceName(java.lang.String name) {
        VersionsSoapWSDDServiceName = name;
    }

    public com.microsoft.schemas.sharepoint.soap.VersionsSoap getVersionsSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(VersionsSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getVersionsSoap(endpoint);
    }

    public com.microsoft.schemas.sharepoint.soap.VersionsSoap getVersionsSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.microsoft.schemas.sharepoint.soap.VersionsSoapStub _stub = new com.microsoft.schemas.sharepoint.soap.VersionsSoapStub(portAddress, this);
            _stub.setPortName(getVersionsSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setVersionsSoapEndpointAddress(java.lang.String address) {
        VersionsSoap_address = address;
    }


    // Use to get a proxy class for VersionsSoap12
    private java.lang.String VersionsSoap12_address = "http://freesharepointhosting.net/_vti_bin/Versions.asmx";

    public java.lang.String getVersionsSoap12Address() {
        return VersionsSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String VersionsSoap12WSDDServiceName = "VersionsSoap12";

    public java.lang.String getVersionsSoap12WSDDServiceName() {
        return VersionsSoap12WSDDServiceName;
    }

    public void setVersionsSoap12WSDDServiceName(java.lang.String name) {
        VersionsSoap12WSDDServiceName = name;
    }

    public com.microsoft.schemas.sharepoint.soap.VersionsSoap getVersionsSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(VersionsSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getVersionsSoap12(endpoint);
    }

    public com.microsoft.schemas.sharepoint.soap.VersionsSoap getVersionsSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.microsoft.schemas.sharepoint.soap.VersionsSoap12Stub _stub = new com.microsoft.schemas.sharepoint.soap.VersionsSoap12Stub(portAddress, this);
            _stub.setPortName(getVersionsSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setVersionsSoap12EndpointAddress(java.lang.String address) {
        VersionsSoap12_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.microsoft.schemas.sharepoint.soap.VersionsSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.microsoft.schemas.sharepoint.soap.VersionsSoapStub _stub = new com.microsoft.schemas.sharepoint.soap.VersionsSoapStub(new java.net.URL(VersionsSoap_address), this);
                _stub.setPortName(getVersionsSoapWSDDServiceName());
                return _stub;
            }
            if (com.microsoft.schemas.sharepoint.soap.VersionsSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.microsoft.schemas.sharepoint.soap.VersionsSoap12Stub _stub = new com.microsoft.schemas.sharepoint.soap.VersionsSoap12Stub(new java.net.URL(VersionsSoap12_address), this);
                _stub.setPortName(getVersionsSoap12WSDDServiceName());
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
        if ("VersionsSoap".equals(inputPortName)) {
            return getVersionsSoap();
        }
        else if ("VersionsSoap12".equals(inputPortName)) {
            return getVersionsSoap12();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "Versions");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "VersionsSoap"));
            ports.add(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/", "VersionsSoap12"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("VersionsSoap".equals(portName)) {
            setVersionsSoapEndpointAddress(address);
        }
        else 
if ("VersionsSoap12".equals(portName)) {
            setVersionsSoap12EndpointAddress(address);
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
