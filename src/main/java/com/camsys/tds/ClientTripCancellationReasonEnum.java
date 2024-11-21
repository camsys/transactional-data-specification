
package com.camsys.tds;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clientTripCancellationReasonEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="clientTripCancellationReasonEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="BOOKED_BY_MISTAKE"/&gt;
 *     &lt;enumeration value="BOOKING_TIME"/&gt;
 *     &lt;enumeration value="CHANGED_MY_MIND"/&gt;
 *     &lt;enumeration value="UNABLE_TO_MAKE_TRIP"/&gt;
 *     &lt;enumeration value="OTHER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "clientTripCancellationReasonEnum")
@XmlEnum
public enum ClientTripCancellationReasonEnum {


    /**
     * Client accidentally booked a trip that they no longer want.
     * 
     */
    BOOKED_BY_MISTAKE,

    /**
     * Undesired scheduled pickup or drop off time
     * 
     */
    BOOKING_TIME,
    CHANGED_MY_MIND,
    UNABLE_TO_MAKE_TRIP,
    OTHER;

    public String value() {
        return name();
    }

    public static ClientTripCancellationReasonEnum fromValue(String v) {
        return valueOf(v);
    }

}
