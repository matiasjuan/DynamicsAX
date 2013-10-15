
package com.microsoft.dynamics.ax;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AxdExtType_ItemDimCombinationAutoCreate.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AxdExtType_ItemDimCombinationAutoCreate">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="No"/>
 *     &lt;enumeration value="Yes"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AxdExtType_ItemDimCombinationAutoCreate")
@XmlEnum
public enum AxdExtTypeItemDimCombinationAutoCreate {

    @XmlEnumValue("No")
    NO("No"),
    @XmlEnumValue("Yes")
    YES("Yes");
    private final String value;

    AxdExtTypeItemDimCombinationAutoCreate(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AxdExtTypeItemDimCombinationAutoCreate fromValue(String v) {
        for (AxdExtTypeItemDimCombinationAutoCreate c: AxdExtTypeItemDimCombinationAutoCreate.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
