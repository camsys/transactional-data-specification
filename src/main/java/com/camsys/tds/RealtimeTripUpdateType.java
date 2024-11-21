
package com.camsys.tds;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Telegram #: 8B; From: trip provider; To: customer/client; Purpose: Realtime Trip Update
 * 
 * <p>Java class for realtimeTripUpdateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="realtimeTripUpdateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}telegramMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="driverInfo" type="{}driverDescription"/&gt;
 *         &lt;element name="vehicleInfo" type="{}vehicleDescription"/&gt;
 *         &lt;element name="GPS" type="{}geographicLocation" minOccurs="0"/&gt;
 *         &lt;element name="estimatedArrivalTime" type="{}time" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "realtimeTripUpdateType", propOrder = {
    "driverInfo",
    "vehicleInfo",
    "gps",
    "estimatedArrivalTime"
})
public class RealtimeTripUpdateType
    extends TelegramMessageType
{

    @XmlElement(required = true)
    protected DriverDescription driverInfo;
    @XmlElement(required = true)
    protected VehicleDescription vehicleInfo;
    @XmlElement(name = "GPS")
    protected GeographicLocation gps;
    protected Time estimatedArrivalTime;

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
     * Gets the value of the estimatedArrivalTime property.
     * 
     * @return
     *     possible object is
     *     {@link Time }
     *     
     */
    public Time getEstimatedArrivalTime() {
        return estimatedArrivalTime;
    }

    /**
     * Sets the value of the estimatedArrivalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Time }
     *     
     */
    public void setEstimatedArrivalTime(Time value) {
        this.estimatedArrivalTime = value;
    }

}
