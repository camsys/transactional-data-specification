
package com.camsys.tds;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Telegram #: 9B; From: trip provider; To: customer/client; Purpose: Realtime Vehicle Position
 * 
 * <p>Java class for realtimeVehiclePositionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="realtimeVehiclePositionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}telegramMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vehicleInfo" type="{}vehicleDescription"/&gt;
 *         &lt;element name="GPS" type="{}geographicLocation"/&gt;
 *         &lt;element name="driverInfo" type="{}driverDescription" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "realtimeVehiclePositionType", propOrder = {
    "vehicleInfo",
    "gps",
    "driverInfo"
})
public class RealtimeVehiclePositionType
    extends TelegramMessageType
{

    @XmlElement(required = true)
    protected VehicleDescription vehicleInfo;
    @XmlElement(name = "GPS", required = true)
    protected GeographicLocation gps;
    protected DriverDescription driverInfo;

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

}
