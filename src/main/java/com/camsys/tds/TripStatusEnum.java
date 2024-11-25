//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.11.19 at 09:08:46 PM EST 
//


package com.camsys.tds;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tripStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="tripStatusEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="performed"/&gt;
 *     &lt;enumeration value="no show"/&gt;
 *     &lt;enumeration value="no pickup"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tripStatusEnum")
@XmlEnum
public enum TripStatusEnum {

    @XmlEnumValue("performed")
    PERFORMED("performed"),
    @XmlEnumValue("no show")
    NO_SHOW("no show"),
    @XmlEnumValue("no pickup")
    NO_PICKUP("no pickup");
    private final String value;

    TripStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TripStatusEnum fromValue(String v) {
        for (TripStatusEnum c: TripStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
