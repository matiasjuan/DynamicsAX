
package com.microsoft.dynamics.ax;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFaultMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFaultMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FaultMessage" type="{http://schemas.microsoft.com/dynamics/2008/01/documents/Fault}FaultMessage" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFaultMessage", namespace = "http://schemas.microsoft.com/dynamics/2008/01/documents/Fault", propOrder = {
    "faultMessage"
})
public class ArrayOfFaultMessage {

    @XmlElement(name = "FaultMessage", nillable = true)
    protected List<FaultMessage> faultMessage;

    /**
     * Gets the value of the faultMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the faultMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFaultMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FaultMessage }
     * 
     * 
     */
    public List<FaultMessage> getFaultMessage() {
        if (faultMessage == null) {
            faultMessage = new ArrayList<FaultMessage>();
        }
        return this.faultMessage;
    }

}
