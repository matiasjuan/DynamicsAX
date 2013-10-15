
package com.microsoft.dynamics.ax;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AxdEnum_XMLDocPurpose.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AxdEnum_XMLDocPurpose">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Original"/>
 *     &lt;enumeration value="Duplicate"/>
 *     &lt;enumeration value="Proforma"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AxdEnum_XMLDocPurpose")
@XmlEnum
public enum AxdEnumXMLDocPurpose {

    @XmlEnumValue("Original")
    ORIGINAL("Original"),
    @XmlEnumValue("Duplicate")
    DUPLICATE("Duplicate"),
    @XmlEnumValue("Proforma")
    PROFORMA("Proforma");
    private final String value;

    AxdEnumXMLDocPurpose(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AxdEnumXMLDocPurpose fromValue(String v) {
        for (AxdEnumXMLDocPurpose c: AxdEnumXMLDocPurpose.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
