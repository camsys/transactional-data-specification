
package com.camsys.tds;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for paymentTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="paymentTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="cash"/&gt;
 *     &lt;enumeration value="card"/&gt;
 *     &lt;enumeration value="account"/&gt;
 *     &lt;enumeration value="ticket"/&gt;
 *     &lt;enumeration value="noShow"/&gt;
 *     &lt;enumeration value="providerCompensation"/&gt;
 *     &lt;enumeration value="other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "paymentTypeEnum")
@XmlEnum
public enum PaymentTypeEnum {

    @XmlEnumValue("cash")
    CASH("cash"),
    @XmlEnumValue("card")
    CARD("card"),
    @XmlEnumValue("account")
    ACCOUNT("account"),
    @XmlEnumValue("ticket")
    TICKET("ticket"),
    @XmlEnumValue("noShow")
    NO_SHOW("noShow"),
    @XmlEnumValue("providerCompensation")
    PROVIDER_COMPENSATION("providerCompensation"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    PaymentTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentTypeEnum fromValue(String v) {
        for (PaymentTypeEnum c: PaymentTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}