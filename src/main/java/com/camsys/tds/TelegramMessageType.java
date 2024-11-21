
package com.camsys.tds;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Telegram Message Type
 * 
 * <p>Java class for telegramMessageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="telegramMessageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tripRequestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="telegramType" type="{}telegramTypeEnum"/&gt;
 *         &lt;element name="timestamp" type="{}time"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "telegramMessageType", propOrder = {
    "tripRequestId",
    "telegramType",
    "timestamp"
})
@XmlSeeAlso({
    TripRequestType.class,
    TripRequestResponseType.class,
    ClientOrderConfirmationType.class,
    CustomerInfoType.class,
    ProviderOrderConfirmationType.class,
    VehicleConfirmationType.class,
    TripTaskType.class,
    TripTaskConfirmationType.class,
    TripTaskCompletionType.class,
    TripScheduledConfirmationType.class,
    TripTaskStatusType.class,
    TripCancelRequestType.class,
    TripCancelResponseType.class,
    RealtimeTripUpdateType.class,
    RealtimeVehiclePositionType.class,
    TripPickupArrivalConfirmationType.class
})
public class TelegramMessageType {

    protected String tripRequestId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TelegramTypeEnum telegramType;
    @XmlElement(required = true)
    protected Time timestamp;

    /**
     * Gets the value of the tripRequestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTripRequestId() {
        return tripRequestId;
    }

    /**
     * Sets the value of the tripRequestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTripRequestId(String value) {
        this.tripRequestId = value;
    }

    /**
     * Gets the value of the telegramType property.
     * 
     * @return
     *     possible object is
     *     {@link TelegramTypeEnum }
     *     
     */
    public TelegramTypeEnum getTelegramType() {
        return telegramType;
    }

    /**
     * Sets the value of the telegramType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelegramTypeEnum }
     *     
     */
    public void setTelegramType(TelegramTypeEnum value) {
        this.telegramType = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link Time }
     *     
     */
    public Time getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Time }
     *     
     */
    public void setTimestamp(Time value) {
        this.timestamp = value;
    }

}
