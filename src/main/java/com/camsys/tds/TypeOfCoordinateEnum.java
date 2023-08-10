
package com.camsys.tds;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for typeOfCoordinateEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="typeOfCoordinateEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="WGS84"/&gt;
 *     &lt;enumeration value="RT90"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "typeOfCoordinateEnum")
@XmlEnum
public enum TypeOfCoordinateEnum {

    @XmlEnumValue("WGS84")
    WGS_84("WGS84"),
    @XmlEnumValue("RT90")
    RT_90("RT90");
    private final String value;

    TypeOfCoordinateEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TypeOfCoordinateEnum fromValue(String v) {
        for (TypeOfCoordinateEnum c: TypeOfCoordinateEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
