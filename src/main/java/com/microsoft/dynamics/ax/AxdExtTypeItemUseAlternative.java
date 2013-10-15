
package com.microsoft.dynamics.ax;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AxdExtType_ItemUseAlternative.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AxdExtType_ItemUseAlternative">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Never"/>
 *     &lt;enumeration value="InventWhen0"/>
 *     &lt;enumeration value="Always"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AxdExtType_ItemUseAlternative")
@XmlEnum
public enum AxdExtTypeItemUseAlternative {

    @XmlEnumValue("Never")
    NEVER("Never"),
    @XmlEnumValue("InventWhen0")
    INVENT_WHEN_0("InventWhen0"),
    @XmlEnumValue("Always")
    ALWAYS("Always");
    private final String value;

    AxdExtTypeItemUseAlternative(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AxdExtTypeItemUseAlternative fromValue(String v) {
        for (AxdExtTypeItemUseAlternative c: AxdExtTypeItemUseAlternative.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
