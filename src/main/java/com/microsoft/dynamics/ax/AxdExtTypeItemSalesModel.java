
package com.microsoft.dynamics.ax;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AxdExtType_ItemSalesModel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AxdExtType_ItemSalesModel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Contributionratio"/>
 *     &lt;enumeration value="PercentMarkup"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AxdExtType_ItemSalesModel")
@XmlEnum
public enum AxdExtTypeItemSalesModel {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Contributionratio")
    CONTRIBUTIONRATIO("Contributionratio"),
    @XmlEnumValue("PercentMarkup")
    PERCENT_MARKUP("PercentMarkup");
    private final String value;

    AxdExtTypeItemSalesModel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AxdExtTypeItemSalesModel fromValue(String v) {
        for (AxdExtTypeItemSalesModel c: AxdExtTypeItemSalesModel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
