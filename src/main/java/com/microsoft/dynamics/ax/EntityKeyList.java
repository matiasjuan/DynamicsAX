
package com.microsoft.dynamics.ax;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityKeyList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityKeyList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://schemas.microsoft.com/dynamics/2006/02/documents/EntityKey}EntityKey" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityKeyList", namespace = "http://schemas.microsoft.com/dynamics/2006/02/documents/EntityKeyList", propOrder = {
    "entityKey"
})
public class EntityKeyList {

    @XmlElement(name = "EntityKey", namespace = "http://schemas.microsoft.com/dynamics/2006/02/documents/EntityKey")
    protected List<EntityKey> entityKey;

    /**
     * Gets the value of the entityKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entityKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntityKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EntityKey }
     * 
     * 
     */
    public List<EntityKey> getEntityKey() {
        if (entityKey == null) {
            entityKey = new ArrayList<EntityKey>();
        }
        return this.entityKey;
    }

}
