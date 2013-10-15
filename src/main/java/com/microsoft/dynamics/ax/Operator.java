
package com.microsoft.dynamics.ax;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Operator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Operator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Equal"/>
 *     &lt;enumeration value="NotEqual"/>
 *     &lt;enumeration value="Greater"/>
 *     &lt;enumeration value="GreaterOrEqual"/>
 *     &lt;enumeration value="Less"/>
 *     &lt;enumeration value="LessOrEqual"/>
 *     &lt;enumeration value="Range"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Operator", namespace = "http://schemas.microsoft.com/dynamics/2006/02/documents/QueryCriteria")
@XmlEnum
public enum Operator {

    @XmlEnumValue("Equal")
    EQUAL("Equal"),
    @XmlEnumValue("NotEqual")
    NOT_EQUAL("NotEqual"),
    @XmlEnumValue("Greater")
    GREATER("Greater"),
    @XmlEnumValue("GreaterOrEqual")
    GREATER_OR_EQUAL("GreaterOrEqual"),
    @XmlEnumValue("Less")
    LESS("Less"),
    @XmlEnumValue("LessOrEqual")
    LESS_OR_EQUAL("LessOrEqual"),
    @XmlEnumValue("Range")
    RANGE("Range");
    private final String value;

    Operator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Operator fromValue(String v) {
        for (Operator c: Operator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
