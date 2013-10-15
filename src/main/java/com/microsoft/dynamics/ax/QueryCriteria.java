
package com.microsoft.dynamics.ax;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QueryCriteria complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QueryCriteria">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded">
 *         &lt;element name="CriteriaElement" type="{http://schemas.microsoft.com/dynamics/2006/02/documents/QueryCriteria}CriteriaElement"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryCriteria", namespace = "http://schemas.microsoft.com/dynamics/2006/02/documents/QueryCriteria", propOrder = {
    "criteriaElement"
})
public class QueryCriteria {

    @XmlElement(name = "CriteriaElement", required = true)
    protected List<CriteriaElement> criteriaElement;

    /**
     * Gets the value of the criteriaElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the criteriaElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCriteriaElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CriteriaElement }
     * 
     * 
     */
    public List<CriteriaElement> getCriteriaElement() {
        if (criteriaElement == null) {
            criteriaElement = new ArrayList<CriteriaElement>();
        }
        return this.criteriaElement;
    }

}
