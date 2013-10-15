
package com.microsoft.dynamics.ax;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AxdEnum_ModuleInventPurchSales.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AxdEnum_ModuleInventPurchSales">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Invent"/>
 *     &lt;enumeration value="Purch"/>
 *     &lt;enumeration value="Sales"/>
 *     &lt;enumeration value="DEL_SmmQuotation"/>
 *     &lt;enumeration value="DEL_Invent2"/>
 *     &lt;enumeration value="DEL_Invent3"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AxdEnum_ModuleInventPurchSales")
@XmlEnum
public enum AxdEnumModuleInventPurchSales {

    @XmlEnumValue("Invent")
    INVENT("Invent"),
    @XmlEnumValue("Purch")
    PURCH("Purch"),
    @XmlEnumValue("Sales")
    SALES("Sales"),
    @XmlEnumValue("DEL_SmmQuotation")
    DEL_SMM_QUOTATION("DEL_SmmQuotation"),
    @XmlEnumValue("DEL_Invent2")
    DEL_INVENT_2("DEL_Invent2"),
    @XmlEnumValue("DEL_Invent3")
    DEL_INVENT_3("DEL_Invent3");
    private final String value;

    AxdEnumModuleInventPurchSales(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AxdEnumModuleInventPurchSales fromValue(String v) {
        for (AxdEnumModuleInventPurchSales c: AxdEnumModuleInventPurchSales.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
