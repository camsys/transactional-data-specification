
package com.camsys.tds;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for providerTripCancellationReasonEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="providerTripCancellationReasonEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NO_CLIENT"/&gt;
 *     &lt;enumeration value="CANCEL_AT_DOOR"/&gt;
 *     &lt;enumeration value="NOT_READY"/&gt;
 *     &lt;enumeration value="PROVIDER_ADMIN_CANCEL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "providerTripCancellationReasonEnum")
@XmlEnum
public enum ProviderTripCancellationReasonEnum {


    /**
     * Client accidentally booked a trip that they no longer want.
     * 
     */
    NO_CLIENT,

    /**
     * Client accidentally booked a trip that they no longer want.
     * 
     */
    CANCEL_AT_DOOR,

    /**
     * Client accidentally booked a trip that they no longer want.
     * 
     */
    NOT_READY,

    /**
     * Client accidentally booked a trip that they no longer want.
     * 
     */
    PROVIDER_ADMIN_CANCEL;

    public String value() {
        return name();
    }

    public static ProviderTripCancellationReasonEnum fromValue(String v) {
        return valueOf(v);
    }

}
