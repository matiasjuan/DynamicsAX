
package com.microsoft.dynamics.ax;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AxdItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AxdItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DocPurpose" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdEnum_XMLDocPurpose" minOccurs="0"/>
 *         &lt;element name="SenderId" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_dataAreaId" minOccurs="0"/>
 *         &lt;element name="InventTable" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdEntity_InventTable" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AxdItem", propOrder = {
    "docPurpose",
    "senderId",
    "inventTable"
})
public class AxdItem {

    @XmlElementRef(name = "DocPurpose", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<AxdEnumXMLDocPurpose> docPurpose;
    @XmlElementRef(name = "SenderId", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<String> senderId;
    @XmlElement(name = "InventTable")
    protected List<AxdEntityInventTable> inventTable;

    /**
     * Gets the value of the docPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AxdEnumXMLDocPurpose }{@code >}
     *     
     */
    public JAXBElement<AxdEnumXMLDocPurpose> getDocPurpose() {
        return docPurpose;
    }

    /**
     * Sets the value of the docPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AxdEnumXMLDocPurpose }{@code >}
     *     
     */
    public void setDocPurpose(JAXBElement<AxdEnumXMLDocPurpose> value) {
        this.docPurpose = value;
    }

    /**
     * Gets the value of the senderId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderId() {
        return senderId;
    }

    /**
     * Sets the value of the senderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderId(JAXBElement<String> value) {
        this.senderId = value;
    }

    /**
     * Gets the value of the inventTable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inventTable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInventTable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AxdEntityInventTable }
     * 
     * 
     */
    public List<AxdEntityInventTable> getInventTable() {
        if (inventTable == null) {
            inventTable = new ArrayList<AxdEntityInventTable>();
        }
        return this.inventTable;
    }

}
