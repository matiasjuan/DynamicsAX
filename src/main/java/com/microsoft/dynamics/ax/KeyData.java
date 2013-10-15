
package com.microsoft.dynamics.ax;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KeyData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KeyData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KeyField" type="{http://schemas.microsoft.com/dynamics/2006/02/documents/EntityKey}KeyField" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyData", namespace = "http://schemas.microsoft.com/dynamics/2006/02/documents/EntityKey", propOrder = {
    "keyField"
})
public class KeyData {

    @XmlElement(name = "KeyField", required = true)
    protected List<KeyField> keyField;

    /**
     * Gets the value of the keyField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyField }
     * 
     * 
     */
    public List<KeyField> getKeyField() {
        if (keyField == null) {
            keyField = new ArrayList<KeyField>();
        }
        return this.keyField;
    }

}
