
package com.camsys.tds;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Telegram #: 5; From: vehicle; To: trip provider; Purpose: GPS and trip status
 * 
 * <p>Java class for tripTaskStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tripTaskStatusType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}telegramMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vehicleNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="GPS" type="{}geographicLocation"/&gt;
 *         &lt;element name="timecode" type="{}time"/&gt;
 *         &lt;element name="driverId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tripTaskId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="driverHours" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="odometerReading" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="passengerMiles" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="vehicleHours" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="vehicleMiles" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="boardingsAndAlightingsAtTripEnd" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="otherFleetVariables" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tripTaskStatusType", propOrder = {
    "vehicleNumber",
    "gps",
    "timecode",
    "driverId",
    "tripTaskId"
})
public class TripTaskStatusType
    extends TelegramMessageType
{

    @XmlElement(required = true)
    protected String vehicleNumber;
    @XmlElement(name = "GPS", required = true)
    protected GeographicLocation gps;
    @XmlElement(required = true)
    protected Time timecode;
    protected String driverId;
    protected String tripTaskId;
    @XmlAttribute(name = "driverHours")
    protected Float driverHours;
    @XmlAttribute(name = "odometerReading")
    protected Float odometerReading;
    @XmlAttribute(name = "passengerMiles")
    protected Float passengerMiles;
    @XmlAttribute(name = "vehicleHours")
    protected Float vehicleHours;
    @XmlAttribute(name = "vehicleMiles")
    protected Float vehicleMiles;
    @XmlAttribute(name = "boardingsAndAlightingsAtTripEnd")
    protected String boardingsAndAlightingsAtTripEnd;
    @XmlAttribute(name = "otherFleetVariables")
    protected String otherFleetVariables;

    /**
     * Gets the value of the vehicleNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    /**
     * Sets the value of the vehicleNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleNumber(String value) {
        this.vehicleNumber = value;
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
     * Gets the value of the timecode property.
     * 
     * @return
     *     possible object is
     *     {@link Time }
     *     
     */
    public Time getTimecode() {
        return timecode;
    }

    /**
     * Sets the value of the timecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Time }
     *     
     */
    public void setTimecode(Time value) {
        this.timecode = value;
    }

    /**
     * Gets the value of the driverId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriverId() {
        return driverId;
    }

    /**
     * Sets the value of the driverId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriverId(String value) {
        this.driverId = value;
    }

    /**
     * Gets the value of the tripTaskId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTripTaskId() {
        return tripTaskId;
    }

    /**
     * Sets the value of the tripTaskId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTripTaskId(String value) {
        this.tripTaskId = value;
    }

    /**
     * Gets the value of the driverHours property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDriverHours() {
        return driverHours;
    }

    /**
     * Sets the value of the driverHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDriverHours(Float value) {
        this.driverHours = value;
    }

    /**
     * Gets the value of the odometerReading property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getOdometerReading() {
        return odometerReading;
    }

    /**
     * Sets the value of the odometerReading property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setOdometerReading(Float value) {
        this.odometerReading = value;
    }

    /**
     * Gets the value of the passengerMiles property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPassengerMiles() {
        return passengerMiles;
    }

    /**
     * Sets the value of the passengerMiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPassengerMiles(Float value) {
        this.passengerMiles = value;
    }

    /**
     * Gets the value of the vehicleHours property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getVehicleHours() {
        return vehicleHours;
    }

    /**
     * Sets the value of the vehicleHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setVehicleHours(Float value) {
        this.vehicleHours = value;
    }

    /**
     * Gets the value of the vehicleMiles property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getVehicleMiles() {
        return vehicleMiles;
    }

    /**
     * Sets the value of the vehicleMiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setVehicleMiles(Float value) {
        this.vehicleMiles = value;
    }

    /**
     * Gets the value of the boardingsAndAlightingsAtTripEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoardingsAndAlightingsAtTripEnd() {
        return boardingsAndAlightingsAtTripEnd;
    }

    /**
     * Sets the value of the boardingsAndAlightingsAtTripEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoardingsAndAlightingsAtTripEnd(String value) {
        this.boardingsAndAlightingsAtTripEnd = value;
    }

    /**
     * Gets the value of the otherFleetVariables property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherFleetVariables() {
        return otherFleetVariables;
    }

    /**
     * Sets the value of the otherFleetVariables property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherFleetVariables(String value) {
        this.otherFleetVariables = value;
    }

}
