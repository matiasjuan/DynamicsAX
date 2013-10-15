
package com.microsoft.dynamics.ax;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AxdEnum_ProdFlushingPrincipItem.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AxdEnum_ProdFlushingPrincipItem">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Start"/>
 *     &lt;enumeration value="Finish"/>
 *     &lt;enumeration value="Manual"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AxdEnum_ProdFlushingPrincipItem")
@XmlEnum
public enum AxdEnumProdFlushingPrincipItem {

    @XmlEnumValue("Start")
    START("Start"),
    @XmlEnumValue("Finish")
    FINISH("Finish"),
    @XmlEnumValue("Manual")
    MANUAL("Manual");
    private final String value;

    AxdEnumProdFlushingPrincipItem(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AxdEnumProdFlushingPrincipItem fromValue(String v) {
        for (AxdEnumProdFlushingPrincipItem c: AxdEnumProdFlushingPrincipItem.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
