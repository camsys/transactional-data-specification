
package com.camsys.tds;

import java.math.BigInteger;
import java.time.LocalDateTime;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Should normally be the local time.
 * 
 * <p>Java class for time complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="time"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="timeAccuracy" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="timeZoneOffset" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *       &lt;attribute name="timeZoneIdentifer" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="time" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="dwellTime" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="timeType" type="{}timeTypeEnum" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "time")
public class Time {

    @XmlAttribute(name = "timeAccuracy")
    protected String timeAccuracy;
    @XmlAttribute(name = "timeZoneOffset")
    protected BigInteger timeZoneOffset;
    @XmlAttribute(name = "timeZoneIdentifer")
    protected String timeZoneIdentifer;
    @XmlAttribute(name = "time", required = true)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime time;
    @XmlAttribute(name = "dwellTime")
    protected Integer dwellTime;
    @XmlAttribute(name = "timeType")
    protected String timeType;

    /**
     * Gets the value of the timeAccuracy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeAccuracy() {
        return timeAccuracy;
    }

    /**
     * Sets the value of the timeAccuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeAccuracy(String value) {
        this.timeAccuracy = value;
    }

    /**
     * Gets the value of the timeZoneOffset property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTimeZoneOffset() {
        return timeZoneOffset;
    }

    /**
     * Sets the value of the timeZoneOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTimeZoneOffset(BigInteger value) {
        this.timeZoneOffset = value;
    }

    /**
     * Gets the value of the timeZoneIdentifer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZoneIdentifer() {
        return timeZoneIdentifer;
    }

    /**
     * Sets the value of the timeZoneIdentifer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZoneIdentifer(String value) {
        this.timeZoneIdentifer = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime(LocalDateTime value) {
        this.time = value;
    }

    /**
     * Gets the value of the dwellTime property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDwellTime() {
        return dwellTime;
    }

    /**
     * Sets the value of the dwellTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDwellTime(Integer value) {
        this.dwellTime = value;
    }

    /**
     * Gets the value of the timeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeType() {
        return timeType;
    }

    /**
     * Sets the value of the timeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeType(String value) {
        this.timeType = value;
    }

}
