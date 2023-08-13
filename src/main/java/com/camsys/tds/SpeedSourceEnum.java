
package com.camsys.tds;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for speedSourceEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="speedSourceEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="gpsunit"/&gt;
 *     &lt;enumeration value="taximeter"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "speedSourceEnum")
@XmlEnum
public enum SpeedSourceEnum {

    @XmlEnumValue("gpsunit")
    GPSUNIT("gpsunit"),
    @XmlEnumValue("taximeter")
    TAXIMETER("taximeter");
    private final String value;

    SpeedSourceEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SpeedSourceEnum fromValue(String v) {
        for (SpeedSourceEnum c: SpeedSourceEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}