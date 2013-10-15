
package com.microsoft.dynamics.ax;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AxdEnum_AxdEntityAction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AxdEnum_AxdEntityAction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="create"/>
 *     &lt;enumeration value="update"/>
 *     &lt;enumeration value="replace"/>
 *     &lt;enumeration value="delete"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AxdEnum_AxdEntityAction")
@XmlEnum
public enum AxdEnumAxdEntityAction {

    @XmlEnumValue("create")
    CREATE("create"),
    @XmlEnumValue("update")
    UPDATE("update"),
    @XmlEnumValue("replace")
    REPLACE("replace"),
    @XmlEnumValue("delete")
    DELETE("delete");
    private final String value;

    AxdEnumAxdEntityAction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AxdEnumAxdEntityAction fromValue(String v) {
        for (AxdEnumAxdEntityAction c: AxdEnumAxdEntityAction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
