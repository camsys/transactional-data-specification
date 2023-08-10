
package com.camsys.tds;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The coordinates for the address and potentially a known zone
 * 
 * <p>Java class for geographicLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="geographicLocation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="typeOfCoordinate" type="{}typeOfCoordinateEnum"/&gt;
 *         &lt;element name="lat" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="long" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="vehicleDistance" type="{}vehicleDistance" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="zone" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="precision" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="speed" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="speedSource" type="{}speedSourceEnum" /&gt;
 *       &lt;attribute name="direction" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="deviationSpeed" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "geographicLocation", propOrder = {
    "typeOfCoordinate",
    "lat",
    "_long",
    "vehicleDistance"
})
public class GeographicLocation {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TypeOfCoordinateEnum typeOfCoordinate;
    protected double lat;
    @XmlElement(name = "long")
    protected double _long;
    protected List<VehicleDistance> vehicleDistance;
    @XmlAttribute(name = "zone")
    protected String zone;
    @XmlAttribute(name = "precision", required = true)
    protected BigInteger precision;
    @XmlAttribute(name = "speed")
    protected Float speed;
    @XmlAttribute(name = "speedSource")
    protected SpeedSourceEnum speedSource;
    @XmlAttribute(name = "direction")
    protected BigInteger direction;
    @XmlAttribute(name = "height")
    protected Float height;
    @XmlAttribute(name = "deviationSpeed")
    protected Float deviationSpeed;

    /**
     * Gets the value of the typeOfCoordinate property.
     * 
     * @return
     *     possible object is
     *     {@link TypeOfCoordinateEnum }
     *     
     */
    public TypeOfCoordinateEnum getTypeOfCoordinate() {
        return typeOfCoordinate;
    }

    /**
     * Sets the value of the typeOfCoordinate property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeOfCoordinateEnum }
     *     
     */
    public void setTypeOfCoordinate(TypeOfCoordinateEnum value) {
        this.typeOfCoordinate = value;
    }

    /**
     * Gets the value of the lat property.
     * 
     */
    public double getLat() {
        return lat;
    }

    /**
     * Sets the value of the lat property.
     * 
     */
    public void setLat(double value) {
        this.lat = value;
    }

    /**
     * Gets the value of the long property.
     * 
     */
    public double getLong() {
        return _long;
    }

    /**
     * Sets the value of the long property.
     * 
     */
    public void setLong(double value) {
        this._long = value;
    }

    /**
     * Gets the value of the vehicleDistance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the vehicleDistance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicleDistance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleDistance }
     * 
     * 
     */
    public List<VehicleDistance> getVehicleDistance() {
        if (vehicleDistance == null) {
            vehicleDistance = new ArrayList<VehicleDistance>();
        }
        return this.vehicleDistance;
    }

    /**
     * Gets the value of the zone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZone() {
        return zone;
    }

    /**
     * Sets the value of the zone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZone(String value) {
        this.zone = value;
    }

    /**
     * Gets the value of the precision property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPrecision() {
        return precision;
    }

    /**
     * Sets the value of the precision property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPrecision(BigInteger value) {
        this.precision = value;
    }

    /**
     * Gets the value of the speed property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSpeed(Float value) {
        this.speed = value;
    }

    /**
     * Gets the value of the speedSource property.
     * 
     * @return
     *     possible object is
     *     {@link SpeedSourceEnum }
     *     
     */
    public SpeedSourceEnum getSpeedSource() {
        return speedSource;
    }

    /**
     * Sets the value of the speedSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedSourceEnum }
     *     
     */
    public void setSpeedSource(SpeedSourceEnum value) {
        this.speedSource = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDirection(BigInteger value) {
        this.direction = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHeight(Float value) {
        this.height = value;
    }

    /**
     * Gets the value of the deviationSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getDeviationSpeed() {
        return deviationSpeed;
    }

    /**
     * Sets the value of the deviationSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDeviationSpeed(Float value) {
        this.deviationSpeed = value;
    }

}
