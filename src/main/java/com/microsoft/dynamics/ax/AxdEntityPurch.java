
package com.microsoft.dynamics.ax;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AxdEntity_Purch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AxdEntity_Purch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AllocateMarkup" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_PriceAllocateMarkup" minOccurs="0"/>
 *         &lt;element name="EndDisc" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdEnum_NoYes" minOccurs="0"/>
 *         &lt;element name="InterCompanyBlocked" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_InterCompanyBlocked" minOccurs="0"/>
 *         &lt;element name="ItemId" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_ItemId"/>
 *         &lt;element name="LineDisc" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_InventLineDiscCode" minOccurs="0"/>
 *         &lt;element name="Markup" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_InventPriceMarkup" minOccurs="0"/>
 *         &lt;element name="MarkupGroupId" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_InventMarkupGroupId" minOccurs="0"/>
 *         &lt;element name="ModuleType" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdEnum_ModuleInventPurchSales" minOccurs="0"/>
 *         &lt;element name="MultiLineDisc" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_InventMultiLineDiscCode" minOccurs="0"/>
 *         &lt;element name="OverDeliveryPct" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_OverDeliveryPct" minOccurs="0"/>
 *         &lt;element name="PcsPrice" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_Price" minOccurs="0"/>
 *         &lt;element name="Price" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_Price" minOccurs="0"/>
 *         &lt;element name="PriceDate" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_PriceDate" minOccurs="0"/>
 *         &lt;element name="PriceQty" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_PriceQty" minOccurs="0"/>
 *         &lt;element name="PriceUnit" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_PriceUnit" minOccurs="0"/>
 *         &lt;element name="RecId" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_recId" minOccurs="0"/>
 *         &lt;element name="RecVersion" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_recVersion" minOccurs="0"/>
 *         &lt;element name="SuppItemGroupId" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_InventSuppItemGroupId" minOccurs="0"/>
 *         &lt;element name="TaxItemGroupId" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_TaxItemGroup" minOccurs="0"/>
 *         &lt;element name="UnderDeliveryPct" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_UnderDeliveryPct" minOccurs="0"/>
 *         &lt;element name="UnitId" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_UnitID" minOccurs="0"/>
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
@XmlType(name = "AxdEntity_Purch", propOrder = {
    "allocateMarkup",
    "endDisc",
    "interCompanyBlocked",
    "itemId",
    "lineDisc",
    "markup",
    "markupGroupId",
    "moduleType",
    "multiLineDisc",
    "overDeliveryPct",
    "pcsPrice",
    "price",
    "priceDate",
    "priceQty",
    "priceUnit",
    "recId",
    "recVersion",
    "suppItemGroupId",
    "taxItemGroupId",
    "underDeliveryPct",
    "unitId"
})
public class AxdEntityPurch {

    @XmlElementRef(name = "AllocateMarkup", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<AxdExtTypePriceAllocateMarkup> allocateMarkup;
    @XmlElementRef(name = "EndDisc", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<AxdEnumNoYes> endDisc;
    @XmlElementRef(name = "InterCompanyBlocked", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<AxdExtTypeInterCompanyBlocked> interCompanyBlocked;
    @XmlElement(name = "ItemId", required = true)
    protected String itemId;
    @XmlElementRef(name = "LineDisc", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<String> lineDisc;
    @XmlElementRef(name = "Markup", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> markup;
    @XmlElementRef(name = "MarkupGroupId", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<String> markupGroupId;
    @XmlElementRef(name = "ModuleType", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<AxdEnumModuleInventPurchSales> moduleType;
    @XmlElementRef(name = "MultiLineDisc", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<String> multiLineDisc;
    @XmlElementRef(name = "OverDeliveryPct", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> overDeliveryPct;
    @XmlElementRef(name = "PcsPrice", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> pcsPrice;
    @XmlElementRef(name = "Price", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> price;
    @XmlElementRef(name = "PriceDate", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<XMLGregorianCalendar> priceDate;
    @XmlElementRef(name = "PriceQty", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> priceQty;
    @XmlElementRef(name = "PriceUnit", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> priceUnit;
    @XmlElementRef(name = "RecId", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<Long> recId;
    @XmlElementRef(name = "RecVersion", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<Integer> recVersion;
    @XmlElementRef(name = "SuppItemGroupId", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<String> suppItemGroupId;
    @XmlElementRef(name = "TaxItemGroupId", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<String> taxItemGroupId;
    @XmlElementRef(name = "UnderDeliveryPct", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<BigDecimal> underDeliveryPct;
    @XmlElementRef(name = "UnitId", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<String> unitId;
    @XmlAttribute(name = "class", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String clazz;
    @XmlAttribute(name = "action")
    protected AxdEnumAxdEntityAction action;

    /**
     * Gets the value of the allocateMarkup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AxdExtTypePriceAllocateMarkup }{@code >}
     *     
     */
    public JAXBElement<AxdExtTypePriceAllocateMarkup> getAllocateMarkup() {
        return allocateMarkup;
    }

    /**
     * Sets the value of the allocateMarkup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AxdExtTypePriceAllocateMarkup }{@code >}
     *     
     */
    public void setAllocateMarkup(JAXBElement<AxdExtTypePriceAllocateMarkup> value) {
        this.allocateMarkup = value;
    }

    /**
     * Gets the value of the endDisc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AxdEnumNoYes }{@code >}
     *     
     */
    public JAXBElement<AxdEnumNoYes> getEndDisc() {
        return endDisc;
    }

    /**
     * Sets the value of the endDisc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AxdEnumNoYes }{@code >}
     *     
     */
    public void setEndDisc(JAXBElement<AxdEnumNoYes> value) {
        this.endDisc = value;
    }

    /**
     * Gets the value of the interCompanyBlocked property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AxdExtTypeInterCompanyBlocked }{@code >}
     *     
     */
    public JAXBElement<AxdExtTypeInterCompanyBlocked> getInterCompanyBlocked() {
        return interCompanyBlocked;
    }

    /**
     * Sets the value of the interCompanyBlocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AxdExtTypeInterCompanyBlocked }{@code >}
     *     
     */
    public void setInterCompanyBlocked(JAXBElement<AxdExtTypeInterCompanyBlocked> value) {
        this.interCompanyBlocked = value;
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
     * Gets the value of the lineDisc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLineDisc() {
        return lineDisc;
    }

    /**
     * Sets the value of the lineDisc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLineDisc(JAXBElement<String> value) {
        this.lineDisc = value;
    }

    /**
     * Gets the value of the markup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getMarkup() {
        return markup;
    }

    /**
     * Sets the value of the markup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setMarkup(JAXBElement<BigDecimal> value) {
        this.markup = value;
    }

    /**
     * Gets the value of the markupGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarkupGroupId() {
        return markupGroupId;
    }

    /**
     * Sets the value of the markupGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarkupGroupId(JAXBElement<String> value) {
        this.markupGroupId = value;
    }

    /**
     * Gets the value of the moduleType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AxdEnumModuleInventPurchSales }{@code >}
     *     
     */
    public JAXBElement<AxdEnumModuleInventPurchSales> getModuleType() {
        return moduleType;
    }

    /**
     * Sets the value of the moduleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AxdEnumModuleInventPurchSales }{@code >}
     *     
     */
    public void setModuleType(JAXBElement<AxdEnumModuleInventPurchSales> value) {
        this.moduleType = value;
    }

    /**
     * Gets the value of the multiLineDisc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMultiLineDisc() {
        return multiLineDisc;
    }

    /**
     * Sets the value of the multiLineDisc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMultiLineDisc(JAXBElement<String> value) {
        this.multiLineDisc = value;
    }

    /**
     * Gets the value of the overDeliveryPct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getOverDeliveryPct() {
        return overDeliveryPct;
    }

    /**
     * Sets the value of the overDeliveryPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setOverDeliveryPct(JAXBElement<BigDecimal> value) {
        this.overDeliveryPct = value;
    }

    /**
     * Gets the value of the pcsPrice property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPcsPrice() {
        return pcsPrice;
    }

    /**
     * Sets the value of the pcsPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPcsPrice(JAXBElement<BigDecimal> value) {
        this.pcsPrice = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPrice(JAXBElement<BigDecimal> value) {
        this.price = value;
    }

    /**
     * Gets the value of the priceDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPriceDate() {
        return priceDate;
    }

    /**
     * Sets the value of the priceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPriceDate(JAXBElement<XMLGregorianCalendar> value) {
        this.priceDate = value;
    }

    /**
     * Gets the value of the priceQty property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPriceQty() {
        return priceQty;
    }

    /**
     * Sets the value of the priceQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPriceQty(JAXBElement<BigDecimal> value) {
        this.priceQty = value;
    }

    /**
     * Gets the value of the priceUnit property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPriceUnit() {
        return priceUnit;
    }

    /**
     * Sets the value of the priceUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPriceUnit(JAXBElement<BigDecimal> value) {
        this.priceUnit = value;
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
     * Gets the value of the suppItemGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSuppItemGroupId() {
        return suppItemGroupId;
    }

    /**
     * Sets the value of the suppItemGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSuppItemGroupId(JAXBElement<String> value) {
        this.suppItemGroupId = value;
    }

    /**
     * Gets the value of the taxItemGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTaxItemGroupId() {
        return taxItemGroupId;
    }

    /**
     * Sets the value of the taxItemGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTaxItemGroupId(JAXBElement<String> value) {
        this.taxItemGroupId = value;
    }

    /**
     * Gets the value of the underDeliveryPct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getUnderDeliveryPct() {
        return underDeliveryPct;
    }

    /**
     * Sets the value of the underDeliveryPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setUnderDeliveryPct(JAXBElement<BigDecimal> value) {
        this.underDeliveryPct = value;
    }

    /**
     * Gets the value of the unitId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUnitId() {
        return unitId;
    }

    /**
     * Sets the value of the unitId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUnitId(JAXBElement<String> value) {
        this.unitId = value;
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
