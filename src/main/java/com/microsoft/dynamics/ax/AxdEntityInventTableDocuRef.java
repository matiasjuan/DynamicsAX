
package com.microsoft.dynamics.ax;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AxdEntity_InventTableDocuRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AxdEntity_InventTableDocuRef">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActualCompanyId" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_selectableDataArea" minOccurs="0"/>
 *         &lt;element name="AuthorId" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_smmDocuAuthorId" minOccurs="0"/>
 *         &lt;element name="ContactPersonId" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_ContactPersonId" minOccurs="0"/>
 *         &lt;element name="EncyclopediaItemId" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_smmEncyclopediaItemId" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_Description" minOccurs="0"/>
 *         &lt;element name="Notes" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_Notes" minOccurs="0"/>
 *         &lt;element name="PartyId" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_DirPartyId" minOccurs="0"/>
 *         &lt;element name="RecId" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_recId" minOccurs="0"/>
 *         &lt;element name="RecVersion" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_recVersion" minOccurs="0"/>
 *         &lt;element name="RefCompanyId" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_selectableDataArea" minOccurs="0"/>
 *         &lt;element name="RefRecId" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_recId" minOccurs="0"/>
 *         &lt;element name="RefTableId" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_tableId" minOccurs="0"/>
 *         &lt;element name="Restriction" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdEnum_DocuRestriction" minOccurs="0"/>
 *         &lt;element name="smmTable" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdEnum_boolean" minOccurs="0"/>
 *         &lt;element name="TypeId" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_DocuTypeId" minOccurs="0"/>
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
@XmlType(name = "AxdEntity_InventTableDocuRef", propOrder = {
    "actualCompanyId",
    "authorId",
    "contactPersonId",
    "encyclopediaItemId",
    "name",
    "notes",
    "partyId",
    "recId",
    "recVersion",
    "refCompanyId",
    "refRecId",
    "refTableId",
    "restriction",
    "smmTable",
    "typeId"
})
public class AxdEntityInventTableDocuRef {

    @XmlElementRef(name = "ActualCompanyId", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<String> actualCompanyId;
    @XmlElementRef(name = "AuthorId", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<String> authorId;
    @XmlElementRef(name = "ContactPersonId", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<String> contactPersonId;
    @XmlElementRef(name = "EncyclopediaItemId", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<String> encyclopediaItemId;
    @XmlElementRef(name = "Name", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "Notes", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<String> notes;
    @XmlElementRef(name = "PartyId", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<String> partyId;
    @XmlElementRef(name = "RecId", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<Long> recId;
    @XmlElementRef(name = "RecVersion", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<Integer> recVersion;
    @XmlElementRef(name = "RefCompanyId", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<String> refCompanyId;
    @XmlElementRef(name = "RefRecId", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<Long> refRecId;
    @XmlElementRef(name = "RefTableId", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<Integer> refTableId;
    @XmlElementRef(name = "Restriction", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<AxdEnumDocuRestriction> restriction;
    @XmlElementRef(name = "smmTable", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<AxdEnumBoolean> smmTable;
    @XmlElementRef(name = "TypeId", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Item", type = JAXBElement.class)
    protected JAXBElement<String> typeId;
    @XmlAttribute(name = "class", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String clazz;
    @XmlAttribute(name = "action")
    protected AxdEnumAxdEntityAction action;

    /**
     * Gets the value of the actualCompanyId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActualCompanyId() {
        return actualCompanyId;
    }

    /**
     * Sets the value of the actualCompanyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActualCompanyId(JAXBElement<String> value) {
        this.actualCompanyId = value;
    }

    /**
     * Gets the value of the authorId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAuthorId() {
        return authorId;
    }

    /**
     * Sets the value of the authorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAuthorId(JAXBElement<String> value) {
        this.authorId = value;
    }

    /**
     * Gets the value of the contactPersonId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContactPersonId() {
        return contactPersonId;
    }

    /**
     * Sets the value of the contactPersonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContactPersonId(JAXBElement<String> value) {
        this.contactPersonId = value;
    }

    /**
     * Gets the value of the encyclopediaItemId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEncyclopediaItemId() {
        return encyclopediaItemId;
    }

    /**
     * Sets the value of the encyclopediaItemId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEncyclopediaItemId(JAXBElement<String> value) {
        this.encyclopediaItemId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNotes(JAXBElement<String> value) {
        this.notes = value;
    }

    /**
     * Gets the value of the partyId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartyId() {
        return partyId;
    }

    /**
     * Sets the value of the partyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartyId(JAXBElement<String> value) {
        this.partyId = value;
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
     * Gets the value of the refCompanyId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRefCompanyId() {
        return refCompanyId;
    }

    /**
     * Sets the value of the refCompanyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRefCompanyId(JAXBElement<String> value) {
        this.refCompanyId = value;
    }

    /**
     * Gets the value of the refRecId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRefRecId() {
        return refRecId;
    }

    /**
     * Sets the value of the refRecId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRefRecId(JAXBElement<Long> value) {
        this.refRecId = value;
    }

    /**
     * Gets the value of the refTableId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getRefTableId() {
        return refTableId;
    }

    /**
     * Sets the value of the refTableId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setRefTableId(JAXBElement<Integer> value) {
        this.refTableId = value;
    }

    /**
     * Gets the value of the restriction property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AxdEnumDocuRestriction }{@code >}
     *     
     */
    public JAXBElement<AxdEnumDocuRestriction> getRestriction() {
        return restriction;
    }

    /**
     * Sets the value of the restriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AxdEnumDocuRestriction }{@code >}
     *     
     */
    public void setRestriction(JAXBElement<AxdEnumDocuRestriction> value) {
        this.restriction = value;
    }

    /**
     * Gets the value of the smmTable property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AxdEnumBoolean }{@code >}
     *     
     */
    public JAXBElement<AxdEnumBoolean> getSmmTable() {
        return smmTable;
    }

    /**
     * Sets the value of the smmTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AxdEnumBoolean }{@code >}
     *     
     */
    public void setSmmTable(JAXBElement<AxdEnumBoolean> value) {
        this.smmTable = value;
    }

    /**
     * Gets the value of the typeId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTypeId() {
        return typeId;
    }

    /**
     * Sets the value of the typeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTypeId(JAXBElement<String> value) {
        this.typeId = value;
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
