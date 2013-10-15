
package com.microsoft.dynamics.ax;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AxdExtType_SalesATPInclPlannedOrders.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AxdExtType_SalesATPInclPlannedOrders">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="false"/>
 *     &lt;enumeration value="true"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AxdExtType_SalesATPInclPlannedOrders")
@XmlEnum
public enum AxdExtTypeSalesATPInclPlannedOrders {

    @XmlEnumValue("false")
    FALSE("false"),
    @XmlEnumValue("true")
    TRUE("true");
    private final String value;

    AxdExtTypeSalesATPInclPlannedOrders(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AxdExtTypeSalesATPInclPlannedOrders fromValue(String v) {
        for (AxdExtTypeSalesATPInclPlannedOrders c: AxdExtTypeSalesATPInclPlannedOrders.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
