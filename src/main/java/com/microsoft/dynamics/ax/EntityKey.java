
package com.microsoft.dynamics.ax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityKey">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KeyData" type="{http://schemas.microsoft.com/dynamics/2006/02/documents/EntityKey}KeyData"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityKey", namespace = "http://schemas.microsoft.com/dynamics/2006/02/documents/EntityKey", propOrder = {
    "keyData"
})
public class EntityKey {

    @XmlElement(name = "KeyData", required = true)
    protected KeyData keyData;

    /**
     * Gets the value of the keyData property.
     * 
     * @return
     *     possible object is
     *     {@link KeyData }
     *     
     */
    public KeyData getKeyData() {
        return keyData;
    }

    /**
     * Sets the value of the keyData property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyData }
     *     
     */
    public void setKeyData(KeyData value) {
        this.keyData = value;
    }

}
