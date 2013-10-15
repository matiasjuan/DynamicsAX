
package com.microsoft.dynamics.ax;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AxdEntity_InventItemLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AxdEntity_InventItemLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CountGroupId" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_CountGroupId" minOccurs="0"/>
 *         &lt;element name="CountingJournalId" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_InventJournalId_Counting" minOccurs="0"/>
 *         &lt;element name="CountingStarted" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_InventCountingStarted" minOccurs="0"/>
 *         &lt;element name="inventDimId" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_InventDimId" minOccurs="0"/>
 *         &lt;element name="ItemId" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_ItemId"/>
 *         &lt;element name="RecId" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_recId" minOccurs="0"/>
 *         &lt;element name="RecVersion" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_recVersion" minOccurs="0"/>
 *         &lt;element name="WMSLocationIdDefaultIssue" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_WMSLocationIdDefaultIssue" minOccurs="0"/>
 *         &lt;element name="WMSLocationIdDefaultReceipt" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_WMSLocationIdDefaultReceipt" minOccurs="0"/>
 *         &lt;element name="wMSPickingLocation" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_WMSPickingLocation" minOccurs="0"/>
 *         &lt;element name="InventDim" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdEntity_InventDim" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="class" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" fixed="entity" />
 *       &lt;attribute name="action" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdEnum_AxdEntityAction" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AxdEntity_InventItemLocation", propOrder = {
    "countGroupId",
    "countingJournalId",
    "countingStarted",
    "inventDimId",
    "itemId",
    "recId",
    "recVersion",
    "wmsLocationIdDefaultIssue",
    "wmsLocationIdDefaultReceipt",
    "wmsPickingLocation",
    "inventDim"
})
public class AxdEntityInventItemLocation {

    @XmlElementRef(name = "CountGroupId", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<String> countGroupId;
    @XmlElementRef(name = "CountingJournalId", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<String> countingJournalId;
    @XmlElementRef(name = "CountingStarted", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<AxdExtTypeInventCountingStarted> countingStarted;
    @XmlElementRef(name = "inventDimId", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<String> inventDimId;
    @XmlElement(name = "ItemId", required = true)
    protected String itemId;
    @XmlElementRef(name = "RecId", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<Long> recId;
    @XmlElementRef(name = "RecVersion", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<Integer> recVersion;
    @XmlElementRef(name = "WMSLocationIdDefaultIssue", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<String> wmsLocationIdDefaultIssue;
    @XmlElementRef(name = "WMSLocationIdDefaultReceipt", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<String> wmsLocationIdDefaultReceipt;
    @XmlElementRef(name = "wMSPickingLocation", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<String> wmsPickingLocation;
    @XmlElement(name = "InventDim")
    protected List<AxdEntityInventDim> inventDim;
    @XmlAttribute(name = "class", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String clazz;
    @XmlAttribute(name = "action")
    protected AxdEnumAxdEntityAction action;

    /**
     * Gets the value of the countGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCountGroupId() {
        return countGroupId;
    }

    /**
     * Sets the value of the countGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCountGroupId(JAXBElement<String> value) {
        this.countGroupId = value;
    }

    /**
     * Gets the value of the countingJournalId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCountingJournalId() {
        return countingJournalId;
    }

    /**
     * Sets the value of the countingJournalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCountingJournalId(JAXBElement<String> value) {
        this.countingJournalId = value;
    }

    /**
     * Gets the value of the countingStarted property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AxdExtTypeInventCountingStarted }{@code >}
     *     
     */
    public JAXBElement<AxdExtTypeInventCountingStarted> getCountingStarted() {
        return countingStarted;
    }

    /**
     * Sets the value of the countingStarted property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AxdExtTypeInventCountingStarted }{@code >}
     *     
     */
    public void setCountingStarted(JAXBElement<AxdExtTypeInventCountingStarted> value) {
        this.countingStarted = value;
    }

    /**
     * Gets the value of the inventDimId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInventDimId() {
        return inventDimId;
    }

    /**
     * Sets the value of the inventDimId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInventDimId(JAXBElement<String> value) {
        this.inventDimId = value;
    }

    /**
     * Gets the value of the itemId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * Sets the value of the itemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemId(String value) {
        this.itemId = value;
    }

    /**
     * Gets the value of the recId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRecId() {
        return recId;
    }

    /**
     * Sets the value of the recId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRecId(JAXBElement<Long> value) {
        this.recId = value;
    }

    /**
     * Gets the value of the recVersion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRecVersion() {
        return recVersion;
    }

    /**
     * Sets the value of the recVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRecVersion(JAXBElement<Integer> value) {
        this.recVersion = value;
    }

    /**
     * Gets the value of the wmsLocationIdDefaultIssue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWMSLocationIdDefaultIssue() {
        return wmsLocationIdDefaultIssue;
    }

    /**
     * Sets the value of the wmsLocationIdDefaultIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWMSLocationIdDefaultIssue(JAXBElement<String> value) {
        this.wmsLocationIdDefaultIssue = value;
    }

    /**
     * Gets the value of the wmsLocationIdDefaultReceipt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWMSLocationIdDefaultReceipt() {
        return wmsLocationIdDefaultReceipt;
    }

    /**
     * Sets the value of the wmsLocationIdDefaultReceipt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWMSLocationIdDefaultReceipt(JAXBElement<String> value) {
        this.wmsLocationIdDefaultReceipt = value;
    }

    /**
     * Gets the value of the wmsPickingLocation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWMSPickingLocation() {
        return wmsPickingLocation;
    }

    /**
     * Sets the value of the wmsPickingLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWMSPickingLocation(JAXBElement<String> value) {
        this.wmsPickingLocation = value;
    }

    /**
     * Gets the value of the inventDim property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inventDim property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInventDim().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AxdEntityInventDim }
     * 
     * 
     */
    public List<AxdEntityInventDim> getInventDim() {
        if (inventDim == null) {
            inventDim = new ArrayList<AxdEntityInventDim>();
        }
        return this.inventDim;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        if (clazz == null) {
            return "entity";
        } else {
            return clazz;
        }
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link AxdEnumAxdEntityAction }
     *     
     */
    public AxdEnumAxdEntityAction getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link AxdEnumAxdEntityAction }
     *     
     */
    public void setAction(AxdEnumAxdEntityAction value) {
        this.action = value;
    }

}
