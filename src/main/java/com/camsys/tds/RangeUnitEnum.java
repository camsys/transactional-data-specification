
package com.camsys.tds;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rangeUnitEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="rangeUnitEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="meter"/&gt;
 *     &lt;enumeration value="seconds"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "rangeUnitEnum")
@XmlEnum
public enum RangeUnitEnum {

    @XmlEnumValue("meter")
    METER("meter"),
    @XmlEnumValue("seconds")
    SECONDS("seconds");
    private final String value;

    RangeUnitEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RangeUnitEnum fromValue(String v) {
        for (RangeUnitEnum c: RangeUnitEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}