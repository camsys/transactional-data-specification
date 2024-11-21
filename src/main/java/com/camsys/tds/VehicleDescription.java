
package com.camsys.tds;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for vehicleDescription complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vehicleDescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="vin" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="licensePlate" type="{}rangeUnitEnum" /&gt;
 *       &lt;attribute name="fuelRange" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="ambulatorySpacePoints" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="largeWheelchairSpacePoints" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="hasRamp" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="hasLift" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="standardWheelchairSpacePoints" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="cargoSpacePoints" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="vehicleModel" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="conversionFactorForAmbulatoryPointsToStandardWheelchairPoints" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="conversionFactorForAmbulatoryPointsToLargeWheelchairPoints" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="flatFloor" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="owner" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="rideVibrationQuality" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vehicleDescription", propOrder = {
    "id",
    "number"
})
public class VehicleDescription {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String number;
    @XmlAttribute(name = "vin")
    protected String vin;
    @XmlAttribute(name = "licensePlate")
    protected RangeUnitEnum licensePlate;
    @XmlAttribute(name = "fuelRange")
    protected Float fuelRange;
    @XmlAttribute(name = "ambulatorySpacePoints")
    protected BigInteger ambulatorySpacePoints;
    @XmlAttribute(name = "largeWheelchairSpacePoints")
    protected BigInteger largeWheelchairSpacePoints;
    @XmlAttribute(name = "hasRamp")
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "boolean")
    protected Boolean hasRamp;
    @XmlAttribute(name = "hasLift")
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "boolean")
    protected Boolean hasLift;
    @XmlAttribute(name = "standardWheelchairSpacePoints")
    protected BigInteger standardWheelchairSpacePoints;
    @XmlAttribute(name = "cargoSpacePoints")
    protected BigInteger cargoSpacePoints;
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
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the vin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVin() {
        return vin;
    }

    /**
     * Sets the value of the vin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVin(String value) {
        this.vin = value;
    }

    /**
     * Gets the value of the licensePlate property.
     * 
     * @return
     *     possible object is
     *     {@link RangeUnitEnum }
     *     
     */
    public RangeUnitEnum getLicensePlate() {
        return licensePlate;
    }

    /**
     * Sets the value of the licensePlate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RangeUnitEnum }
     *     
     */
    public void setLicensePlate(RangeUnitEnum value) {
        this.licensePlate = value;
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
     *     {@link String }
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
     *     {@link String }
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
     *     {@link String }
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
     *     {@link String }
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
