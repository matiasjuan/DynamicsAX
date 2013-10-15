
package com.microsoft.dynamics.ax;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AifFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AifFault">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomDetailXml" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FaultMessageListArray" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Fault}ArrayOfFaultMessageList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AifFault", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Fault", propOrder = {
    "customDetailXml",
    "faultMessageListArray"
})
public class AifFault {

    @XmlElementRef(name = "CustomDetailXml", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Fault", type = JAXBElement.class)
    protected JAXBElement<String> customDetailXml;
    @XmlElementRef(name = "FaultMessageListArray", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Fault", type = JAXBElement.class)
    protected JAXBElement<ArrayOfFaultMessageList> faultMessageListArray;

    /**
     * Gets the value of the customDetailXml property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomDetailXml() {
        return customDetailXml;
    }

    /**
     * Sets the value of the customDetailXml property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomDetailXml(JAXBElement<String> value) {
        this.customDetailXml = value;
    }

    /**
     * Gets the value of the faultMessageListArray property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFaultMessageList }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFaultMessageList> getFaultMessageListArray() {
        return faultMessageListArray;
    }

    /**
     * Sets the value of the faultMessageListArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFaultMessageList }{@code >}
     *     
     */
    public void setFaultMessageListArray(JAXBElement<ArrayOfFaultMessageList> value) {
        this.faultMessageListArray = value;
    }

}
