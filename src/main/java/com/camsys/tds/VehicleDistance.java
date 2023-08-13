
package com.camsys.tds;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vehicleDistance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vehicleDistance"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="startTime" type="{}time"/&gt;
 *         &lt;element name="stopTime" type="{}time"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="range" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="rangeUnit" type="{}rangeUnitEnum" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vehicleDistance", propOrder = {
    "startTime",
    "stopTime"
})
public class VehicleDistance {

    @XmlElement(required = true)
    protected Time startTime;
    @XmlElement(required = true)
    protected Time stopTime;
    @XmlAttribute(name = "range")
    protected Integer range;
    @XmlAttribute(name = "rangeUnit")
    protected RangeUnitEnum rangeUnit;

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link Time }
     *     
     */
    public Time getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Time }
     *     
     */
    public void setStartTime(Time value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the stopTime property.
     * 
     * @return
     *     possible object is
     *     {@link Time }
     *     
     */
    public Time getStopTime() {
        return stopTime;
    }

    /**
     * Sets the value of the stopTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Time }
     *     
     */
    public void setStopTime(Time value) {
        this.stopTime = value;
    }

    /**
     * Gets the value of the range property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRange() {
        return range;
    }

    /**
     * Sets the value of the range property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRange(Integer value) {
        this.range = value;
    }

    /**
     * Gets the value of the rangeUnit property.
     * 
     * @return
     *     possible object is
     *     {@link RangeUnitEnum }
     *     
     */
    public RangeUnitEnum getRangeUnit() {
        return rangeUnit;
    }

    /**
     * Sets the value of the rangeUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link RangeUnitEnum }
     *     
     */
    public void setRangeUnit(RangeUnitEnum value) {
        this.rangeUnit = value;
    }

}