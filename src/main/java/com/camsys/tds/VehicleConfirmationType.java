//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.11.19 at 09:08:46 PM EST 
//


package com.camsys.tds;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Telegram #: 2BB; From: trip provider; To: ordering client; Purpose: confirm vehicle
 * 
 * <p>Java class for vehicleConfirmationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vehicleConfirmationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}telegramMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vehicleNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="driverId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vehicleInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="availabilityForService" type="{}time" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="fuelRange" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="ambulatorySpacePoints" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="largeWheelchairSpacePoints" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="hasRamp" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="hasLift" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="standardWheelchairSpacePoints" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="cargoSpacePoints" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="vehicleId" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="vehicleModel" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="conversionFactorForAmbulatoryPointsToStandardWheelchairPoints" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="conversionFactorForAmbulatoryPointsToLargeWheelchairPoints" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="flatFloor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="owner" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="rideVibrationQuality" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vehicleConfirmationType", propOrder = {
    "vehicleNumber",
    "driverId",
    "vehicleInformation",
    "availabilityForService"
})
public class VehicleConfirmationType
    extends TelegramMessageType
{

    protected String vehicleNumber;
    protected String driverId;
    protected String vehicleInformation;
    protected Time availabilityForService;
    @XmlAttribute(name = "fuelRange")
    protected Float fuelRange;
    @XmlAttribute(name = "ambulatorySpacePoints")
    protected BigInteger ambulatorySpacePoints;
    @XmlAttribute(name = "largeWheelchairSpacePoints")
    protected BigInteger largeWheelchairSpacePoints;
    @XmlAttribute(name = "hasRamp")
    protected Boolean hasRamp;
    @XmlAttribute(name = "hasLift")
    protected Boolean hasLift;
    @XmlAttribute(name = "standardWheelchairSpacePoints")
    protected BigInteger standardWheelchairSpacePoints;
    @XmlAttribute(name = "cargoSpacePoints")
    protected BigInteger cargoSpacePoints;
    @XmlAttribute(name = "vehicleId")
    protected BigInteger vehicleId;
    @XmlAttribute(name = "vehicleModel")
    protected String vehicleModel;
    @XmlAttribute(name = "conversionFactorForAmbulatoryPointsToStandardWheelchairPoints")
    protected Float conversionFactorForAmbulatoryPointsToStandardWheelchairPoints;
    @XmlAttribute(name = "conversionFactorForAmbulatoryPointsToLargeWheelchairPoints")
    protected Float conversionFactorForAmbulatoryPointsToLargeWheelchairPoints;
    @XmlAttribute(name = "flatFloor")
    protected String flatFloor;
    @XmlAttribute(name = "owner")
    protected String owner;
    @XmlAttribute(name = "rideVibrationQuality")
    protected String rideVibrationQuality;

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
     * Gets the value of the vehicleInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleInformation() {
        return vehicleInformation;
    }

    /**
     * Sets the value of the vehicleInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleInformation(String value) {
        this.vehicleInformation = value;
    }

    /**
     * Gets the value of the availabilityForService property.
     * 
     * @return
     *     possible object is
     *     {@link Time }
     *     
     */
    public Time getAvailabilityForService() {
        return availabilityForService;
    }

    /**
     * Sets the value of the availabilityForService property.
     * 
     * @param value
     *     allowed object is
     *     {@link Time }
     *     
     */
    public void setAvailabilityForService(Time value) {
        this.availabilityForService = value;
    }

    /**
     * Gets the value of the fuelRange property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFuelRange() {
        return fuelRange;
    }

    /**
     * Sets the value of the fuelRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFuelRange(Float value) {
        this.fuelRange = value;
    }

    /**
     * Gets the value of the ambulatorySpacePoints property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAmbulatorySpacePoints() {
        return ambulatorySpacePoints;
    }

    /**
     * Sets the value of the ambulatorySpacePoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAmbulatorySpacePoints(BigInteger value) {
        this.ambulatorySpacePoints = value;
    }

    /**
     * Gets the value of the largeWheelchairSpacePoints property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLargeWheelchairSpacePoints() {
        return largeWheelchairSpacePoints;
    }

    /**
     * Sets the value of the largeWheelchairSpacePoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLargeWheelchairSpacePoints(BigInteger value) {
        this.largeWheelchairSpacePoints = value;
    }

    /**
     * Gets the value of the hasRamp property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasRamp() {
        return hasRamp;
    }

    /**
     * Sets the value of the hasRamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasRamp(Boolean value) {
        this.hasRamp = value;
    }

    /**
     * Gets the value of the hasLift property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasLift() {
        return hasLift;
    }

    /**
     * Sets the value of the hasLift property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasLift(Boolean value) {
        this.hasLift = value;
    }

    /**
     * Gets the value of the standardWheelchairSpacePoints property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStandardWheelchairSpacePoints() {
        return standardWheelchairSpacePoints;
    }

    /**
     * Sets the value of the standardWheelchairSpacePoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStandardWheelchairSpacePoints(BigInteger value) {
        this.standardWheelchairSpacePoints = value;
    }

    /**
     * Gets the value of the cargoSpacePoints property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCargoSpacePoints() {
        return cargoSpacePoints;
    }

    /**
     * Sets the value of the cargoSpacePoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCargoSpacePoints(BigInteger value) {
        this.cargoSpacePoints = value;
    }

    /**
     * Gets the value of the vehicleId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVehicleId() {
        return vehicleId;
    }

    /**
     * Sets the value of the vehicleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVehicleId(BigInteger value) {
        this.vehicleId = value;
    }

    /**
     * Gets the value of the vehicleModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVehicleModel() {
        return vehicleModel;
    }

    /**
     * Sets the value of the vehicleModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVehicleModel(String value) {
        this.vehicleModel = value;
    }

    /**
     * Gets the value of the conversionFactorForAmbulatoryPointsToStandardWheelchairPoints property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getConversionFactorForAmbulatoryPointsToStandardWheelchairPoints() {
        return conversionFactorForAmbulatoryPointsToStandardWheelchairPoints;
    }

    /**
     * Sets the value of the conversionFactorForAmbulatoryPointsToStandardWheelchairPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setConversionFactorForAmbulatoryPointsToStandardWheelchairPoints(Float value) {
        this.conversionFactorForAmbulatoryPointsToStandardWheelchairPoints = value;
    }

    /**
     * Gets the value of the conversionFactorForAmbulatoryPointsToLargeWheelchairPoints property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getConversionFactorForAmbulatoryPointsToLargeWheelchairPoints() {
        return conversionFactorForAmbulatoryPointsToLargeWheelchairPoints;
    }

    /**
     * Sets the value of the conversionFactorForAmbulatoryPointsToLargeWheelchairPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setConversionFactorForAmbulatoryPointsToLargeWheelchairPoints(Float value) {
        this.conversionFactorForAmbulatoryPointsToLargeWheelchairPoints = value;
    }

    /**
     * Gets the value of the flatFloor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlatFloor() {
        return flatFloor;
    }

    /**
     * Sets the value of the flatFloor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlatFloor(String value) {
        this.flatFloor = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
    }

    /**
     * Gets the value of the rideVibrationQuality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRideVibrationQuality() {
        return rideVibrationQuality;
    }

    /**
     * Sets the value of the rideVibrationQuality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRideVibrationQuality(String value) {
        this.rideVibrationQuality = value;
    }

}
