
package com.microsoft.dynamics.ax;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AxdExtType_ItemStopExplode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AxdExtType_ItemStopExplode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="No"/>
 *     &lt;enumeration value="Yes"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AxdExtType_ItemStopExplode")
@XmlEnum
public enum AxdExtTypeItemStopExplode {

    @XmlEnumValue("No")
    NO("No"),
    @XmlEnumValue("Yes")
    YES("Yes");
    private final String value;

    AxdExtTypeItemStopExplode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AxdExtTypeItemStopExplode fromValue(String v) {
        for (AxdExtTypeItemStopExplode c: AxdExtTypeItemStopExplode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
