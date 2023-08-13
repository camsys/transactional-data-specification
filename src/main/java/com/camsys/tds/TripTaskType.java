
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
 * Telegram #: 3A; From: trip provider; To: vehicle; Purpose: control vehicle
 * 
 * <p>Java class for tripTaskType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tripTaskType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}telegramMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tripTaskId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerPickupLocInVehPerformanceSequence" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="pickupNodeAddress" type="{}addressType"/&gt;
 *         &lt;element name="pickupNodeScheduledTime" type="{}time"/&gt;
 *         &lt;element name="detailedPickupLocationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerDropoffLocInVehPerformanceSequence" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="dropoffNodeAddress" type="{}addressType"/&gt;
 *         &lt;element name="dropoffNodeScheduledTime" type="{}time"/&gt;
 *         &lt;element name="detailedDropoffLocationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerMobilePhone" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="customerName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="numOtherReservedPassengers" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="notesForDriver" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="specialAttributes" type="{}specialAttributesList" /&gt;
 *       &lt;attribute name="paymentType" type="{}paymentTypeList" /&gt;
 *       &lt;attribute name="fareAmount" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tripTaskType", propOrder = {
    "tripTaskId",
    "customerPickupLocInVehPerformanceSequence",
    "pickupNodeAddress",
    "pickupNodeScheduledTime",
    "detailedPickupLocationDescription",
    "customerDropoffLocInVehPerformanceSequence",
    "dropoffNodeAddress",
    "dropoffNodeScheduledTime",
    "detailedDropoffLocationDescription",
    "customerMobilePhone",
    "customerName",
    "numOtherReservedPassengers"
})
public class TripTaskType
    extends TelegramMessageType
{

    @XmlElement(required = true)
    protected String tripTaskId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger customerPickupLocInVehPerformanceSequence;
    @XmlElement(required = true)
    protected AddressType pickupNodeAddress;
    @XmlElement(required = true)
    protected Time pickupNodeScheduledTime;
    protected String detailedPickupLocationDescription;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger customerDropoffLocInVehPerformanceSequence;
    @XmlElement(required = true)
    protected AddressType dropoffNodeAddress;
    @XmlElement(required = true)
    protected Time dropoffNodeScheduledTime;
    protected String detailedDropoffLocationDescription;
    protected BigInteger customerMobilePhone;
    @XmlElement(required = true)
    protected String customerName;
    protected BigInteger numOtherReservedPassengers;
    @XmlAttribute(name = "notesForDriver")
    protected String notesForDriver;
    @XmlAttribute(name = "specialAttributes")
    protected List<SpecialAttributesEnum> specialAttributes;
    @XmlAttribute(name = "paymentType")
    protected List<PaymentTypeEnum> paymentType;
    @XmlAttribute(name = "fareAmount")
    protected Float fareAmount;

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
     * Gets the value of the customerPickupLocInVehPerformanceSequence property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCustomerPickupLocInVehPerformanceSequence() {
        return customerPickupLocInVehPerformanceSequence;
    }

    /**
     * Sets the value of the customerPickupLocInVehPerformanceSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCustomerPickupLocInVehPerformanceSequence(BigInteger value) {
        this.customerPickupLocInVehPerformanceSequence = value;
    }

    /**
     * Gets the value of the pickupNodeAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getPickupNodeAddress() {
        return pickupNodeAddress;
    }

    /**
     * Sets the value of the pickupNodeAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setPickupNodeAddress(AddressType value) {
        this.pickupNodeAddress = value;
    }

    /**
     * Gets the value of the pickupNodeScheduledTime property.
     * 
     * @return
     *     possible object is
     *     {@link Time }
     *     
     */
    public Time getPickupNodeScheduledTime() {
        return pickupNodeScheduledTime;
    }

    /**
     * Sets the value of the pickupNodeScheduledTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Time }
     *     
     */
    public void setPickupNodeScheduledTime(Time value) {
        this.pickupNodeScheduledTime = value;
    }

    /**
     * Gets the value of the detailedPickupLocationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailedPickupLocationDescription() {
        return detailedPickupLocationDescription;
    }

    /**
     * Sets the value of the detailedPickupLocationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailedPickupLocationDescription(String value) {
        this.detailedPickupLocationDescription = value;
    }

    /**
     * Gets the value of the customerDropoffLocInVehPerformanceSequence property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCustomerDropoffLocInVehPerformanceSequence() {
        return customerDropoffLocInVehPerformanceSequence;
    }

    /**
     * Sets the value of the customerDropoffLocInVehPerformanceSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCustomerDropoffLocInVehPerformanceSequence(BigInteger value) {
        this.customerDropoffLocInVehPerformanceSequence = value;
    }

    /**
     * Gets the value of the dropoffNodeAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getDropoffNodeAddress() {
        return dropoffNodeAddress;
    }

    /**
     * Sets the value of the dropoffNodeAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setDropoffNodeAddress(AddressType value) {
        this.dropoffNodeAddress = value;
    }

    /**
     * Gets the value of the dropoffNodeScheduledTime property.
     * 
     * @return
     *     possible object is
     *     {@link Time }
     *     
     */
    public Time getDropoffNodeScheduledTime() {
        return dropoffNodeScheduledTime;
    }

    /**
     * Sets the value of the dropoffNodeScheduledTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Time }
     *     
     */
    public void setDropoffNodeScheduledTime(Time value) {
        this.dropoffNodeScheduledTime = value;
    }

    /**
     * Gets the value of the detailedDropoffLocationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetailedDropoffLocationDescription() {
        return detailedDropoffLocationDescription;
    }

    /**
     * Sets the value of the detailedDropoffLocationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetailedDropoffLocationDescription(String value) {
        this.detailedDropoffLocationDescription = value;
    }

    /**
     * Gets the value of the customerMobilePhone property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCustomerMobilePhone() {
        return customerMobilePhone;
    }

    /**
     * Sets the value of the customerMobilePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCustomerMobilePhone(BigInteger value) {
        this.customerMobilePhone = value;
    }

    /**
     * Gets the value of the customerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Gets the value of the numOtherReservedPassengers property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumOtherReservedPassengers() {
        return numOtherReservedPassengers;
    }

    /**
     * Sets the value of the numOtherReservedPassengers property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumOtherReservedPassengers(BigInteger value) {
        this.numOtherReservedPassengers = value;
    }

    /**
     * Gets the value of the notesForDriver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotesForDriver() {
        return notesForDriver;
    }

    /**
     * Sets the value of the notesForDriver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotesForDriver(String value) {
        this.notesForDriver = value;
    }

    /**
     * Gets the value of the specialAttributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the specialAttributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialAttributesEnum }
     * 
     * 
     */
    public List<SpecialAttributesEnum> getSpecialAttributes() {
        if (specialAttributes == null) {
            specialAttributes = new ArrayList<SpecialAttributesEnum>();
        }
        return this.specialAttributes;
    }

    /**
     * Gets the value of the paymentType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the paymentType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentTypeEnum }
     * 
     * 
     */
    public List<PaymentTypeEnum> getPaymentType() {
        if (paymentType == null) {
            paymentType = new ArrayList<PaymentTypeEnum>();
        }
        return this.paymentType;
    }

    /**
     * Gets the value of the fareAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getFareAmount() {
        return fareAmount;
    }

    /**
     * Sets the value of the fareAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setFareAmount(Float value) {
        this.fareAmount = value;
    }

}