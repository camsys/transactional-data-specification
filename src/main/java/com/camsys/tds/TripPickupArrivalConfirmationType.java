
package com.camsys.tds;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Telegram #: 10B; From: trip provider; To: customer/client; Purpose: Trip Pickup Arrival Confirmation
 * 
 * <p>Java class for tripPickupArrivalConfirmationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tripPickupArrivalConfirmationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}telegramMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="driverInfo" type="{}driverDescription"/&gt;
 *         &lt;element name="vehicleInfo" type="{}vehicleDescription"/&gt;
 *         &lt;element name="GPS" type="{}geographicLocation"/&gt;
 *         &lt;element name="passengerBoarded" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tripPickupArrivalConfirmationType", propOrder = {
    "driverInfo",
    "vehicleInfo",
    "gps",
    "passengerBoarded"
})
public class TripPickupArrivalConfirmationType
    extends TelegramMessageType
{

    @XmlElement(required = true)
    protected DriverDescription driverInfo;
    @XmlElement(required = true)
    protected VehicleDescription vehicleInfo;
    @XmlElement(name = "GPS", required = true)
    protected GeographicLocation gps;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "boolean")
    protected Boolean passengerBoarded;

    /**
     * Gets the value of the driverInfo property.
     * 
     * @return
     *     possible object is
     *     {@link DriverDescription }
     *     
     */
    public DriverDescription getDriverInfo() {
        return driverInfo;
    }

    /**
     * Sets the value of the driverInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DriverDescription }
     *     
     */
    public void setDriverInfo(DriverDescription value) {
        this.driverInfo = value;
    }

    /**
     * Gets the value of the vehicleInfo property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleDescription }
     *     
     */
    public VehicleDescription getVehicleInfo() {
        return vehicleInfo;
    }

    /**
     * Sets the value of the vehicleInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleDescription }
     *     
     */
    public void setVehicleInfo(VehicleDescription value) {
        this.vehicleInfo = value;
    }

    /**
     * Gets the value of the gps property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicLocation }
     *     
     */
    public GeographicLocation getGPS() {
        return gps;
    }

    /**
     * Sets the value of the gps property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicLocation }
     *     
     */
    public void setGPS(GeographicLocation value) {
        this.gps = value;
    }

    /**
     * Gets the value of the passengerBoarded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Boolean isPassengerBoarded() {
        return passengerBoarded;
    }

    /**
     * Sets the value of the passengerBoarded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerBoarded(Boolean value) {
        this.passengerBoarded = value;
    }

}
