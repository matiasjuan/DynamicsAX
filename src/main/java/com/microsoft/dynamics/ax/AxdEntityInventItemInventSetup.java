
package com.microsoft.dynamics.ax;

import java.math.BigDecimal;
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
 * <p>Java class for AxdEntity_InventItemInventSetup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AxdEntity_InventItemInventSetup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ATPInclPlannedOrders" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_SalesATPInclPlannedOrders" minOccurs="0"/>
 *         &lt;element name="ATPTimeFence" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_SalesATPTimeFence" minOccurs="0"/>
 *         &lt;element name="CalendarDays" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_CalendarDays" minOccurs="0"/>
 *         &lt;element name="DeliveryDateControlType" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdEnum_SalesDeliveryDateControlType" minOccurs="0"/>
 *         &lt;element name="HighestQty" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_QtyHighest" minOccurs="0"/>
 *         &lt;element name="InventDimId" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_InventDimId" minOccurs="0"/>
 *         &lt;element name="InventDimIdDefault" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_InventDimId" minOccurs="0"/>
 *         &lt;element name="ItemId" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdUnion_AxdExtType_ItemId_AxdType_ExtCodeValue"/>
 *         &lt;element name="LeadTime" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_LeadTimeInventDefault" minOccurs="0"/>
 *         &lt;element name="LowestQty" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_QtyLowest" minOccurs="0"/>
 *         &lt;element name="MandatoryInventLocation" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_NoYesId" minOccurs="0"/>
 *         &lt;element name="MandatoryInventSite" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_NoYesId" minOccurs="0"/>
 *         &lt;element name="MultipleQty" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_QtyMultiples" minOccurs="0"/>
 *         &lt;element name="Override" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_NoYesId" minOccurs="0"/>
 *         &lt;element name="RecId" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_recId" minOccurs="0"/>
 *         &lt;element name="RecVersion" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_recVersion" minOccurs="0"/>
 *         &lt;element name="StandardQty" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_QtyStandard" minOccurs="0"/>
 *         &lt;element name="Stopped" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_ItemStopped" minOccurs="0"/>
 *         &lt;element name="InventDimInventSetup" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdEntity_InventDimInventSetup" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="DefaultInventDimInventSetup" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdEntity_DefaultInventDimInventSetup" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "AxdEntity_InventItemInventSetup", propOrder = {
    "atpInclPlannedOrders",
    "atpTimeFence",
    "calendarDays",
    "deliveryDateControlType",
    "highestQty",
    "inventDimId",
    "inventDimIdDefault",
    "itemId",
    "leadTime",
    "lowestQty",
    "mandatoryInventLocation",
    "mandatoryInventSite",
    "multipleQty",
    "override",
    "recId",
    "recVersion",
    "standardQty",
    "stopped",
    "inventDimInventSetup",
    "defaultInventDimInventSetup"
})
public class AxdEntityInventItemInventSetup {

    @XmlElementRef(name = "ATPInclPlannedOrders", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<AxdExtTypeSalesATPInclPlannedOrders> atpInclPlannedOrders;
    @XmlElementRef(name = "ATPTimeFence", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<Integer> atpTimeFence;
    @XmlElementRef(name = "CalendarDays", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<AxdExtTypeCalendarDays> calendarDays;
    @XmlElementRef(name = "DeliveryDateControlType", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<AxdEnumSalesDeliveryDateControlType> deliveryDateControlType;
    @XmlElementRef(name = "HighestQty", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> highestQty;
    @XmlElementRef(name = "InventDimId", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<String> inventDimId;
    @XmlElementRef(name = "InventDimIdDefault", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<String> inventDimIdDefault;
    @XmlElement(name = "ItemId", required = true)
    protected String itemId;
    @XmlElementRef(name = "LeadTime", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<Integer> leadTime;
    @XmlElementRef(name = "LowestQty", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> lowestQty;
    @XmlElementRef(name = "MandatoryInventLocation", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<AxdExtTypeNoYesId> mandatoryInventLocation;
    @XmlElementRef(name = "MandatoryInventSite", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<AxdExtTypeNoYesId> mandatoryInventSite;
    @XmlElementRef(name = "MultipleQty", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> multipleQty;
    @XmlElementRef(name = "Override", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<AxdExtTypeNoYesId> override;
    @XmlElementRef(name = "RecId", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<Long> recId;
    @XmlElementRef(name = "RecVersion", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<Integer> recVersion;
    @XmlElementRef(name = "StandardQty", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> standardQty;
    @XmlElementRef(name = "Stopped", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<AxdExtTypeItemStopped> stopped;
    @XmlElement(name = "InventDimInventSetup")
    protected List<AxdEntityInventDimInventSetup> inventDimInventSetup;
    @XmlElement(name = "DefaultInventDimInventSetup")
    protected List<AxdEntityDefaultInventDimInventSetup> defaultInventDimInventSetup;
    @XmlAttribute(name = "class", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String clazz;
    @XmlAttribute(name = "action")
    protected AxdEnumAxdEntityAction action;

    /**
     * Gets the value of the atpInclPlannedOrders property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AxdExtTypeSalesATPInclPlannedOrders }{@code >}
     *     
     */
    public JAXBElement<AxdExtTypeSalesATPInclPlannedOrders> getATPInclPlannedOrders() {
        return atpInclPlannedOrders;
    }

    /**
     * Sets the value of the atpInclPlannedOrders property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AxdExtTypeSalesATPInclPlannedOrders }{@code >}
     *     
     */
    public void setATPInclPlannedOrders(JAXBElement<AxdExtTypeSalesATPInclPlannedOrders> value) {
        this.atpInclPlannedOrders = value;
    }

    /**
     * Gets the value of the atpTimeFence property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getATPTimeFence() {
        return atpTimeFence;
    }

    /**
     * Sets the value of the atpTimeFence property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setATPTimeFence(JAXBElement<Integer> value) {
        this.atpTimeFence = value;
    }

    /**
     * Gets the value of the calendarDays property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AxdExtTypeCalendarDays }{@code >}
     *     
     */
    public JAXBElement<AxdExtTypeCalendarDays> getCalendarDays() {
        return calendarDays;
    }

    /**
     * Sets the value of the calendarDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AxdExtTypeCalendarDays }{@code >}
     *     
     */
    public void setCalendarDays(JAXBElement<AxdExtTypeCalendarDays> value) {
        this.calendarDays = value;
    }

    /**
     * Gets the value of the deliveryDateControlType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AxdEnumSalesDeliveryDateControlType }{@code >}
     *     
     */
    public JAXBElement<AxdEnumSalesDeliveryDateControlType> getDeliveryDateControlType() {
        return deliveryDateControlType;
    }

    /**
     * Sets the value of the deliveryDateControlType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AxdEnumSalesDeliveryDateControlType }{@code >}
     *     
     */
    public void setDeliveryDateControlType(JAXBElement<AxdEnumSalesDeliveryDateControlType> value) {
        this.deliveryDateControlType = value;
    }

    /**
     * Gets the value of the highestQty property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getHighestQty() {
        return highestQty;
    }

    /**
     * Sets the value of the highestQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setHighestQty(JAXBElement<BigDecimal> value) {
        this.highestQty = value;
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
     * Gets the value of the inventDimIdDefault property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInventDimIdDefault() {
        return inventDimIdDefault;
    }

    /**
     * Sets the value of the inventDimIdDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInventDimIdDefault(JAXBElement<String> value) {
        this.inventDimIdDefault = value;
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
     * Gets the value of the leadTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getLeadTime() {
        return leadTime;
    }

    /**
     * Sets the value of the leadTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setLeadTime(JAXBElement<Integer> value) {
        this.leadTime = value;
    }

    /**
     * Gets the value of the lowestQty property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getLowestQty() {
        return lowestQty;
    }

    /**
     * Sets the value of the lowestQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setLowestQty(JAXBElement<BigDecimal> value) {
        this.lowestQty = value;
    }

    /**
     * Gets the value of the mandatoryInventLocation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AxdExtTypeNoYesId }{@code >}
     *     
     */
    public JAXBElement<AxdExtTypeNoYesId> getMandatoryInventLocation() {
        return mandatoryInventLocation;
    }

    /**
     * Sets the value of the mandatoryInventLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AxdExtTypeNoYesId }{@code >}
     *     
     */
    public void setMandatoryInventLocation(JAXBElement<AxdExtTypeNoYesId> value) {
        this.mandatoryInventLocation = value;
    }

    /**
     * Gets the value of the mandatoryInventSite property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AxdExtTypeNoYesId }{@code >}
     *     
     */
    public JAXBElement<AxdExtTypeNoYesId> getMandatoryInventSite() {
        return mandatoryInventSite;
    }

    /**
     * Sets the value of the mandatoryInventSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AxdExtTypeNoYesId }{@code >}
     *     
     */
    public void setMandatoryInventSite(JAXBElement<AxdExtTypeNoYesId> value) {
        this.mandatoryInventSite = value;
    }

    /**
     * Gets the value of the multipleQty property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getMultipleQty() {
        return multipleQty;
    }

    /**
     * Sets the value of the multipleQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setMultipleQty(JAXBElement<BigDecimal> value) {
        this.multipleQty = value;
    }

    /**
     * Gets the value of the override property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AxdExtTypeNoYesId }{@code >}
     *     
     */
    public JAXBElement<AxdExtTypeNoYesId> getOverride() {
        return override;
    }

    /**
     * Sets the value of the override property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AxdExtTypeNoYesId }{@code >}
     *     
     */
    public void setOverride(JAXBElement<AxdExtTypeNoYesId> value) {
        this.override = value;
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
     * Gets the value of the standardQty property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getStandardQty() {
        return standardQty;
    }

    /**
     * Sets the value of the standardQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setStandardQty(JAXBElement<BigDecimal> value) {
        this.standardQty = value;
    }

    /**
     * Gets the value of the stopped property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AxdExtTypeItemStopped }{@code >}
     *     
     */
    public JAXBElement<AxdExtTypeItemStopped> getStopped() {
        return stopped;
    }

    /**
     * Sets the value of the stopped property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AxdExtTypeItemStopped }{@code >}
     *     
     */
    public void setStopped(JAXBElement<AxdExtTypeItemStopped> value) {
        this.stopped = value;
    }

    /**
     * Gets the value of the inventDimInventSetup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inventDimInventSetup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInventDimInventSetup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AxdEntityInventDimInventSetup }
     * 
     * 
     */
    public List<AxdEntityInventDimInventSetup> getInventDimInventSetup() {
        if (inventDimInventSetup == null) {
            inventDimInventSetup = new ArrayList<AxdEntityInventDimInventSetup>();
        }
        return this.inventDimInventSetup;
    }

    /**
     * Gets the value of the defaultInventDimInventSetup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the defaultInventDimInventSetup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefaultInventDimInventSetup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AxdEntityDefaultInventDimInventSetup }
     * 
     * 
     */
    public List<AxdEntityDefaultInventDimInventSetup> getDefaultInventDimInventSetup() {
        if (defaultInventDimInventSetup == null) {
            defaultInventDimInventSetup = new ArrayList<AxdEntityDefaultInventDimInventSetup>();
        }
        return this.defaultInventDimInventSetup;
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
