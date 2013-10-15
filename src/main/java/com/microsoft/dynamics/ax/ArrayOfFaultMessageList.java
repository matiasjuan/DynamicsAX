
package com.microsoft.dynamics.ax;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFaultMessageList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFaultMessageList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FaultMessageList" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Fault}FaultMessageList" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFaultMessageList", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Fault", propOrder = {
    "faultMessageList"
})
public class ArrayOfFaultMessageList {

    @XmlElement(name = "FaultMessageList", nillable = true)
    protected List<FaultMessageList> faultMessageList;

    /**
     * Gets the value of the faultMessageList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the faultMessageList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFaultMessageList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FaultMessageList }
     * 
     * 
     */
    public List<FaultMessageList> getFaultMessageList() {
        if (faultMessageList == null) {
            faultMessageList = new ArrayList<FaultMessageList>();
        }
        return this.faultMessageList;
    }

}
