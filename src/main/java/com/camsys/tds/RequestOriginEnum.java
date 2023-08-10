
package com.camsys.tds;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requestOriginEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="requestOriginEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="client"/&gt;
 *     &lt;enumeration value="provider"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "requestOriginEnum")
@XmlEnum
public enum RequestOriginEnum {

    @XmlEnumValue("client")
    CLIENT("client"),
    @XmlEnumValue("provider")
    PROVIDER("provider");
    private final String value;

    RequestOriginEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RequestOriginEnum fromValue(String v) {
        for (RequestOriginEnum c: RequestOriginEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
