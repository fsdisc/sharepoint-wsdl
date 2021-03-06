/**
 * GetSafeAssemblyInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.microsoft.sharepoint.webpartpages;

public class GetSafeAssemblyInfoResponse  implements java.io.Serializable {
    private com.microsoft.sharepoint.webpartpages.GetSafeAssemblyInfoResponseGetSafeAssemblyInfoResult getSafeAssemblyInfoResult;

    public GetSafeAssemblyInfoResponse() {
    }

    public GetSafeAssemblyInfoResponse(
           com.microsoft.sharepoint.webpartpages.GetSafeAssemblyInfoResponseGetSafeAssemblyInfoResult getSafeAssemblyInfoResult) {
           this.getSafeAssemblyInfoResult = getSafeAssemblyInfoResult;
    }


    /**
     * Gets the getSafeAssemblyInfoResult value for this GetSafeAssemblyInfoResponse.
     * 
     * @return getSafeAssemblyInfoResult
     */
    public com.microsoft.sharepoint.webpartpages.GetSafeAssemblyInfoResponseGetSafeAssemblyInfoResult getGetSafeAssemblyInfoResult() {
        return getSafeAssemblyInfoResult;
    }


    /**
     * Sets the getSafeAssemblyInfoResult value for this GetSafeAssemblyInfoResponse.
     * 
     * @param getSafeAssemblyInfoResult
     */
    public void setGetSafeAssemblyInfoResult(com.microsoft.sharepoint.webpartpages.GetSafeAssemblyInfoResponseGetSafeAssemblyInfoResult getSafeAssemblyInfoResult) {
        this.getSafeAssemblyInfoResult = getSafeAssemblyInfoResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetSafeAssemblyInfoResponse)) return false;
        GetSafeAssemblyInfoResponse other = (GetSafeAssemblyInfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getSafeAssemblyInfoResult==null && other.getGetSafeAssemblyInfoResult()==null) || 
             (this.getSafeAssemblyInfoResult!=null &&
              this.getSafeAssemblyInfoResult.equals(other.getGetSafeAssemblyInfoResult())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getGetSafeAssemblyInfoResult() != null) {
            _hashCode += getGetSafeAssemblyInfoResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSafeAssemblyInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://microsoft.com/sharepoint/webpartpages", ">GetSafeAssemblyInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getSafeAssemblyInfoResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://microsoft.com/sharepoint/webpartpages", "GetSafeAssemblyInfoResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://microsoft.com/sharepoint/webpartpages", ">>GetSafeAssemblyInfoResponse>GetSafeAssemblyInfoResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
