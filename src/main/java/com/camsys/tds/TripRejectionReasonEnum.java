
package com.camsys.tds;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tripRejectionReasonEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="tripRejectionReasonEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NOT_IN_SERVICE_AREA"/&gt;
 *     &lt;enumeration value="INVALID_SERVICE_HOURS"/&gt;
 *     &lt;enumeration value="INVALID_USER"/&gt;
 *     &lt;enumeration value="INVALID_PICKUP_ADDRESS"/&gt;
 *     &lt;enumeration value="INVALID_DROPOFF_ADDRESS"/&gt;
 *     &lt;enumeration value="NO_VEHICLES_AVAILABLE"/&gt;
 *     &lt;enumeration value="UNABLE_TO_SERVICE_TRIP"/&gt;
 *     &lt;enumeration value="BAD_WEATHER"/&gt;
 *     &lt;enumeration value="WRONG_SERVICE_LEVEL"/&gt;
 *     &lt;enumeration value="OTHER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tripRejectionReasonEnum")
@XmlEnum
public enum TripRejectionReasonEnum {


    /**
     * The requested trip is not in a valid service area.
     * 
     */
    NOT_IN_SERVICE_AREA,

    /**
     * The requested trip is outside the expected operating hours.
     * 
     */
    INVALID_SERVICE_HOURS,

    /**
     * Invalid user
     * 
     */
    INVALID_USER,
    INVALID_PICKUP_ADDRESS,
    INVALID_DROPOFF_ADDRESS,
    NO_VEHICLES_AVAILABLE,

    /**
     * Provider is unable to provide service for the requested trip.
     * 
     */
    UNABLE_TO_SERVICE_TRIP,

    /**
     * Unable to provide service due to bad weather.
     * 
     */
    BAD_WEATHER,

    /**
     * Unable to meet specific client needs.
     * 
     */
    WRONG_SERVICE_LEVEL,
    OTHER;

    public String value() {
        return name();
    }

    public static TripRejectionReasonEnum fromValue(String v) {
        return valueOf(v);
    }

}
