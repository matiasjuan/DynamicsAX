
package com.microsoft.dynamics.ax;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Channel:Channel number.
 * Department:Department number.
 * Product:Product number.
 * Partner activity code:Partner activity code number.
 * Region code:Region code number.
 * Project ID:Project ID number.
 * Affiliate:Affiliate number.
 * 
 * <p>Java class for AxdArray_AxdExtType_Dimension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AxdArray_AxdExtType_Dimension">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="element" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Item}AxdExtType_Dimension" maxOccurs="7" minOccurs="7"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AxdArray_AxdExtType_Dimension", propOrder = {
    "element"
})
public class AxdArrayAxdExtTypeDimension {

    @XmlElement(required = true)
    protected List<String> element;

    /**
     * Gets the value of the element property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the element property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getElement() {
        if (element == null) {
            element = new ArrayList<String>();
        }
        return this.element;
    }

}
