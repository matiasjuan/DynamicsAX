
package com.microsoft.dynamics.ax;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AxdEnum_DocuRestriction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AxdEnum_DocuRestriction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Internal"/>
 *     &lt;enumeration value="External"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AxdEnum_DocuRestriction")
@XmlEnum
public enum AxdEnumDocuRestriction {

    @XmlEnumValue("Internal")
    INTERNAL("Internal"),
    @XmlEnumValue("External")
    EXTERNAL("External");
    private final String value;

    AxdEnumDocuRestriction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AxdEnumDocuRestriction fromValue(String v) {
        for (AxdEnumDocuRestriction c: AxdEnumDocuRestriction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
