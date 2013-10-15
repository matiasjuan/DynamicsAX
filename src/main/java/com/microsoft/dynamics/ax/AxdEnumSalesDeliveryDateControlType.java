
package com.microsoft.dynamics.ax;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AxdEnum_SalesDeliveryDateControlType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AxdEnum_SalesDeliveryDateControlType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="SalesLeadTime"/>
 *     &lt;enumeration value="ATP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AxdEnum_SalesDeliveryDateControlType")
@XmlEnum
public enum AxdEnumSalesDeliveryDateControlType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("SalesLeadTime")
    SALES_LEAD_TIME("SalesLeadTime"),
    ATP("ATP");
    private final String value;

    AxdEnumSalesDeliveryDateControlType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AxdEnumSalesDeliveryDateControlType fromValue(String v) {
        for (AxdEnumSalesDeliveryDateControlType c: AxdEnumSalesDeliveryDateControlType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
