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
 * <p>Java class for telegramTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="telegramTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TripRequest"/&gt;
 *     &lt;enumeration value="ExpeditedTripRequest"/&gt;
 *     &lt;enumeration value="TripRequestResponse"/&gt;
 *     &lt;enumeration value="ClientOrderConfirmation"/&gt;
 *     &lt;enumeration value="CustomerInfo"/&gt;
 *     &lt;enumeration value="ProviderOrderConfirmation"/&gt;
 *     &lt;enumeration value="VehicleConfirmation"/&gt;
 *     &lt;enumeration value="TripTask"/&gt;
 *     &lt;enumeration value="TripTaskConfirmation"/&gt;
 *     &lt;enumeration value="TripTaskCompletion"/&gt;
 *     &lt;enumeration value="TripScheduledConfirmation"/&gt;
 *     &lt;enumeration value="TripTaskStatus"/&gt;
 *     &lt;enumeration value="TripCancelRequest"/&gt;
 *     &lt;enumeration value="TripCancelResponse"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "telegramTypeEnum")
@XmlEnum
public enum TelegramTypeEnum {

    @XmlEnumValue("TripRequest")
    TRIP_REQUEST("TripRequest"),
    @XmlEnumValue("ExpeditedTripRequest")
    EXPEDITED_TRIP_REQUEST("ExpeditedTripRequest"),
    @XmlEnumValue("TripRequestResponse")
    TRIP_REQUEST_RESPONSE("TripRequestResponse"),
    @XmlEnumValue("ClientOrderConfirmation")
    CLIENT_ORDER_CONFIRMATION("ClientOrderConfirmation"),
    @XmlEnumValue("CustomerInfo")
    CUSTOMER_INFO("CustomerInfo"),
    @XmlEnumValue("ProviderOrderConfirmation")
    PROVIDER_ORDER_CONFIRMATION("ProviderOrderConfirmation"),
    @XmlEnumValue("VehicleConfirmation")
    VEHICLE_CONFIRMATION("VehicleConfirmation"),
    @XmlEnumValue("TripTask")
    TRIP_TASK("TripTask"),
    @XmlEnumValue("TripTaskConfirmation")
    TRIP_TASK_CONFIRMATION("TripTaskConfirmation"),
    @XmlEnumValue("TripTaskCompletion")
    TRIP_TASK_COMPLETION("TripTaskCompletion"),
    @XmlEnumValue("TripScheduledConfirmation")
    TRIP_SCHEDULED_CONFIRMATION("TripScheduledConfirmation"),
    @XmlEnumValue("TripTaskStatus")
    TRIP_TASK_STATUS("TripTaskStatus"),
    @XmlEnumValue("TripCancelRequest")
    TRIP_CANCEL_REQUEST("TripCancelRequest"),
    @XmlEnumValue("TripCancelResponse")
    TRIP_CANCEL_RESPONSE("TripCancelResponse");
    private final String value;

    TelegramTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TelegramTypeEnum fromValue(String v) {
        for (TelegramTypeEnum c: TelegramTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
