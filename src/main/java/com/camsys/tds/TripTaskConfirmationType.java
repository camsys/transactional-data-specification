
package com.camsys.tds;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Telegram #: 3B; From: vehicle; To: trip provider; Purpose: confirm vehicle performed task
 * 
 * <p>Java class for tripTaskConfirmationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tripTaskConfirmationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}telegramMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tripTaskId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerLocInDropoffSequence" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="nodePerformedTime" type="{}time"/&gt;
 *         &lt;element name="vehicleNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="tripStatus" use="required" type="{}tripStatusEnum" /&gt;
 *       &lt;attribute name="driverId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tripTaskConfirmationType", propOrder = {
    "tripTaskId",
    "customerLocInDropoffSequence",
    "nodePerformedTime",
    "vehicleNumber"
})
public class TripTaskConfirmationType
    extends TelegramMessageType
{

    @XmlElement(required = true)
    protected String tripTaskId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger customerLocInDropoffSequence;
    @XmlElement(required = true)
    protected Time nodePerformedTime;
    @XmlElement(required = true)
    protected String vehicleNumber;
    @XmlAttribute(name = "tripStatus", required = true)
    protected TripStatusEnum tripStatus;
    @XmlAttribute(name = "driverId")
    protected String driverId;

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
     * Gets the value of the customerLocInDropoffSequence property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCustomerLocInDropoffSequence() {
        return customerLocInDropoffSequence;
    }

    /**
     * Sets the value of the customerLocInDropoffSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCustomerLocInDropoffSequence(BigInteger value) {
        this.customerLocInDropoffSequence = value;
    }

    /**
     * Gets the value of the nodePerformedTime property.
     * 
     * @return
     *     possible object is
     *     {@link Time }
     *     
     */
    public Time getNodePerformedTime() {
        return nodePerformedTime;
    }

    /**
     * Sets the value of the nodePerformedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Time }
     *     
     */
    public void setNodePerformedTime(Time value) {
        this.nodePerformedTime = value;
    }

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
     * Gets the value of the tripStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TripStatusEnum }
     *     
     */
    public TripStatusEnum getTripStatus() {
        return tripStatus;
    }

    /**
     * Sets the value of the tripStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TripStatusEnum }
     *     
     */
    public void setTripStatus(TripStatusEnum value) {
        this.tripStatus = value;
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

}
