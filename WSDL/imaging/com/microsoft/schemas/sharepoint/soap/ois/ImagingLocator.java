/**
 * ImagingLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.schemas.sharepoint.soap.ois;

public class ImagingLocator extends org.apache.axis.client.Service implements com.microsoft.schemas.sharepoint.soap.ois.Imaging {

    public ImagingLocator() {
    }


    public ImagingLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ImagingLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ImagingSoap
    private java.lang.String ImagingSoap_address = "http://freesharepointhosting.net/_vti_bin/imaging.asmx";

    public java.lang.String getImagingSoapAddress() {
        return ImagingSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ImagingSoapWSDDServiceName = "ImagingSoap";

    public java.lang.String getImagingSoapWSDDServiceName() {
        return ImagingSoapWSDDServiceName;
    }

    public void setImagingSoapWSDDServiceName(java.lang.String name) {
        ImagingSoapWSDDServiceName = name;
    }

    public com.microsoft.schemas.sharepoint.soap.ois.ImagingSoap getImagingSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ImagingSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getImagingSoap(endpoint);
    }

    public com.microsoft.schemas.sharepoint.soap.ois.ImagingSoap getImagingSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.microsoft.schemas.sharepoint.soap.ois.ImagingSoapStub _stub = new com.microsoft.schemas.sharepoint.soap.ois.ImagingSoapStub(portAddress, this);
            _stub.setPortName(getImagingSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setImagingSoapEndpointAddress(java.lang.String address) {
        ImagingSoap_address = address;
    }


    // Use to get a proxy class for ImagingSoap12
    private java.lang.String ImagingSoap12_address = "http://freesharepointhosting.net/_vti_bin/imaging.asmx";

    public java.lang.String getImagingSoap12Address() {
        return ImagingSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ImagingSoap12WSDDServiceName = "ImagingSoap12";

    public java.lang.String getImagingSoap12WSDDServiceName() {
        return ImagingSoap12WSDDServiceName;
    }

    public void setImagingSoap12WSDDServiceName(java.lang.String name) {
        ImagingSoap12WSDDServiceName = name;
    }

    public com.microsoft.schemas.sharepoint.soap.ois.ImagingSoap getImagingSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ImagingSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getImagingSoap12(endpoint);
    }

    public com.microsoft.schemas.sharepoint.soap.ois.ImagingSoap getImagingSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.microsoft.schemas.sharepoint.soap.ois.ImagingSoap12Stub _stub = new com.microsoft.schemas.sharepoint.soap.ois.ImagingSoap12Stub(portAddress, this);
            _stub.setPortName(getImagingSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setImagingSoap12EndpointAddress(java.lang.String address) {
        ImagingSoap12_address = address;
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
            if (com.microsoft.schemas.sharepoint.soap.ois.ImagingSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.microsoft.schemas.sharepoint.soap.ois.ImagingSoapStub _stub = new com.microsoft.schemas.sharepoint.soap.ois.ImagingSoapStub(new java.net.URL(ImagingSoap_address), this);
                _stub.setPortName(getImagingSoapWSDDServiceName());
                return _stub;
            }
            if (com.microsoft.schemas.sharepoint.soap.ois.ImagingSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.microsoft.schemas.sharepoint.soap.ois.ImagingSoap12Stub _stub = new com.microsoft.schemas.sharepoint.soap.ois.ImagingSoap12Stub(new java.net.URL(ImagingSoap12_address), this);
                _stub.setPortName(getImagingSoap12WSDDServiceName());
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
        if ("ImagingSoap".equals(inputPortName)) {
            return getImagingSoap();
        }
        else if ("ImagingSoap12".equals(inputPortName)) {
            return getImagingSoap12();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/ois/", "Imaging");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/ois/", "ImagingSoap"));
            ports.add(new javax.xml.namespace.QName("http://schemas.microsoft.com/sharepoint/soap/ois/", "ImagingSoap12"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ImagingSoap".equals(portName)) {
            setImagingSoapEndpointAddress(address);
        }
        else 
if ("ImagingSoap12".equals(portName)) {
            setImagingSoap12EndpointAddress(address);
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
