
package com.microsoft.dynamics.ax;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FaultMessageList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FaultMessageList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Document" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentOperation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FaultMessageArray" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Fault}ArrayOfFaultMessage" minOccurs="0"/>
 *         &lt;element name="Field" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Service" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceOperation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceOperationParameter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XPath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XmlLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XmlPosition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FaultMessageList", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Fault", propOrder = {
    "document",
    "documentOperation",
    "faultMessageArray",
    "field",
    "service",
    "serviceOperation",
    "serviceOperationParameter",
    "xPath",
    "xmlLine",
    "xmlPosition"
})
public class FaultMessageList {

    @XmlElementRef(name = "Document", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Fault", type = JAXBElement.class)
    protected JAXBElement<String> document;
    @XmlElementRef(name = "DocumentOperation", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Fault", type = JAXBElement.class)
    protected JAXBElement<String> documentOperation;
    @XmlElementRef(name = "FaultMessageArray", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Fault", type = JAXBElement.class)
    protected JAXBElement<ArrayOfFaultMessage> faultMessageArray;
    @XmlElementRef(name = "Field", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Fault", type = JAXBElement.class)
    protected JAXBElement<String> field;
    @XmlElementRef(name = "Service", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Fault", type = JAXBElement.class)
    protected JAXBElement<String> service;
    @XmlElementRef(name = "ServiceOperation", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Fault", type = JAXBElement.class)
    protected JAXBElement<String> serviceOperation;
    @XmlElementRef(name = "ServiceOperationParameter", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Fault", type = JAXBElement.class)
    protected JAXBElement<String> serviceOperationParameter;
    @XmlElementRef(name = "XPath", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Fault", type = JAXBElement.class)
    protected JAXBElement<String> xPath;
    @XmlElementRef(name = "XmlLine", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Fault", type = JAXBElement.class)
    protected JAXBElement<String> xmlLine;
    @XmlElementRef(name = "XmlPosition", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Fault", type = JAXBElement.class)
    protected JAXBElement<String> xmlPosition;

    /**
     * Gets the value of the document property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocument(JAXBElement<String> value) {
        this.document = value;
    }

    /**
     * Gets the value of the documentOperation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocumentOperation() {
        return documentOperation;
    }

    /**
     * Sets the value of the documentOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocumentOperation(JAXBElement<String> value) {
        this.documentOperation = value;
    }

    /**
     * Gets the value of the faultMessageArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFaultMessage }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFaultMessage> getFaultMessageArray() {
        return faultMessageArray;
    }

    /**
     * Sets the value of the faultMessageArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFaultMessage }{@code >}
     *     
     */
    public void setFaultMessageArray(JAXBElement<ArrayOfFaultMessage> value) {
        this.faultMessageArray = value;
    }

    /**
     * Gets the value of the field property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getField() {
        return field;
    }

    /**
     * Sets the value of the field property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setField(JAXBElement<String> value) {
        this.field = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setService(JAXBElement<String> value) {
        this.service = value;
    }

    /**
     * Gets the value of the serviceOperation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceOperation() {
        return serviceOperation;
    }

    /**
     * Sets the value of the serviceOperation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceOperation(JAXBElement<String> value) {
        this.serviceOperation = value;
    }

    /**
     * Gets the value of the serviceOperationParameter property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceOperationParameter() {
        return serviceOperationParameter;
    }

    /**
     * Sets the value of the serviceOperationParameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceOperationParameter(JAXBElement<String> value) {
        this.serviceOperationParameter = value;
    }

    /**
     * Gets the value of the xPath property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getXPath() {
        return xPath;
    }

    /**
     * Sets the value of the xPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setXPath(JAXBElement<String> value) {
        this.xPath = value;
    }

    /**
     * Gets the value of the xmlLine property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getXmlLine() {
        return xmlLine;
    }

    /**
     * Sets the value of the xmlLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setXmlLine(JAXBElement<String> value) {
        this.xmlLine = value;
    }

    /**
     * Gets the value of the xmlPosition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getXmlPosition() {
        return xmlPosition;
    }

    /**
     * Sets the value of the xmlPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setXmlPosition(JAXBElement<String> value) {
        this.xmlPosition = value;
    }

}
