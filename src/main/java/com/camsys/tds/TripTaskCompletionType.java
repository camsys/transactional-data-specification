
package com.camsys.tds;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Telegram #: 4A; From: trip provider(s); To: ordering client; Purpose: performed trip data
 * 
 * <p>Java class for tripTaskCompletionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tripTaskCompletionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}telegramMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cost" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="pickupAddress" type="{}addressType" minOccurs="0"/&gt;
 *         &lt;element name="pickupTime" type="{}time"/&gt;
 *         &lt;element name="dropoffAddress" type="{}addressType" minOccurs="0"/&gt;
 *         &lt;element name="dropoffTime" type="{}time"/&gt;
 *         &lt;element name="scheduledPickupPoint" type="{}addressType" minOccurs="0"/&gt;
 *         &lt;element name="scheduledPickupTime" type="{}time" minOccurs="0"/&gt;
 *         &lt;element name="scheduledDropoffPoint" type="{}addressType" minOccurs="0"/&gt;
 *         &lt;element name="scheduledDropoffTime" type="{}time" minOccurs="0"/&gt;
 *         &lt;element name="performedPickupPoint" type="{}addressType" minOccurs="0"/&gt;
 *         &lt;element name="performedPickupTime" type="{}time" minOccurs="0"/&gt;
 *         &lt;element name="performedDropoffPoint" type="{}addressType" minOccurs="0"/&gt;
 *         &lt;element name="performedDropoffTime" type="{}time" minOccurs="0"/&gt;
 *         &lt;element name="detoursPermissible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="transferPoint" type="{}addressType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="paymentType" type="{}paymentTypeList" /&gt;
 *       &lt;attribute name="fareAmount" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="specialAttributes" type="{}specialAttributesList" /&gt;
 *       &lt;attribute name="transportServices" type="{}valueList" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tripTaskCompletionType", propOrder = {
    "cost",
    "pickupAddress",
    "pickupTime",
    "dropoffAddress",
    "dropoffTime",
    "scheduledPickupPoint",
    "scheduledPickupTime",
    "scheduledDropoffPoint",
    "scheduledDropoffTime",
    "performedPickupPoint",
    "performedPickupTime",
    "performedDropoffPoint",
    "performedDropoffTime",
    "detoursPermissible",
    "transferPoint"
})
public class TripTaskCompletionType
    extends TelegramMessageType
{

    protected float cost;
    protected AddressType pickupAddress;
    @XmlElement(required = true)
    protected Time pickupTime;
    protected AddressType dropoffAddress;
    @XmlElement(required = true)
    protected Time dropoffTime;
    protected AddressType scheduledPickupPoint;
    protected Time scheduledPickupTime;
    protected AddressType scheduledDropoffPoint;
    protected Time scheduledDropoffTime;
    protected AddressType performedPickupPoint;
    protected Time performedPickupTime;
    protected AddressType performedDropoffPoint;
    protected Time performedDropoffTime;
    protected Boolean detoursPermissible;
    protected AddressType transferPoint;
    @XmlAttribute(name = "paymentType")
    protected List<PaymentTypeEnum> paymentType;
    @XmlAttribute(name = "fareAmount")
    protected Float fareAmount;
    @XmlAttribute(name = "specialAttributes")
    protected List<SpecialAttributesEnum> specialAttributes;
    @XmlAttribute(name = "transportServices")
    protected List<String> transportServices;

    /**
     * Gets the value of the cost property.
     * 
     */
    public float getCost() {
        return cost;
    }

    /**
     * Sets the value of the cost property.
     * 
     */
    public void setCost(float value) {
        this.cost = value;
    }

    /**
     * Gets the value of the pickupAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getPickupAddress() {
        return pickupAddress;
    }

    /**
     * Sets the value of the pickupAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setPickupAddress(AddressType value) {
        this.pickupAddress = value;
    }

    /**
     * Gets the value of the pickupTime property.
     * 
     * @return
     *     possible object is
     *     {@link Time }
     *     
     */
    public Time getPickupTime() {
        return pickupTime;
    }

    /**
     * Sets the value of the pickupTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Time }
     *     
     */
    public void setPickupTime(Time value) {
        this.pickupTime = value;
    }

    /**
     * Gets the value of the dropoffAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getDropoffAddress() {
        return dropoffAddress;
    }

    /**
     * Sets the value of the dropoffAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setDropoffAddress(AddressType value) {
        this.dropoffAddress = value;
    }

    /**
     * Gets the value of the dropoffTime property.
     * 
     * @return
     *     possible object is
     *     {@link Time }
     *     
     */
    public Time getDropoffTime() {
        return dropoffTime;
    }

    /**
     * Sets the value of the dropoffTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Time }
     *     
     */
    public void setDropoffTime(Time value) {
        this.dropoffTime = value;
    }

    /**
     * Gets the value of the scheduledPickupPoint property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getScheduledPickupPoint() {
        return scheduledPickupPoint;
    }

    /**
     * Sets the value of the scheduledPickupPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setScheduledPickupPoint(AddressType value) {
        this.scheduledPickupPoint = value;
    }

    /**
     * Gets the value of the scheduledPickupTime property.
     * 
     * @return
     *     possible object is
     *     {@link Time }
     *     
     */
    public Time getScheduledPickupTime() {
        return scheduledPickupTime;
    }

    /**
     * Sets the value of the scheduledPickupTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Time }
     *     
     */
    public void setScheduledPickupTime(Time value) {
        this.scheduledPickupTime = value;
    }

    /**
     * Gets the value of the scheduledDropoffPoint property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getScheduledDropoffPoint() {
        return scheduledDropoffPoint;
    }

    /**
     * Sets the value of the scheduledDropoffPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setScheduledDropoffPoint(AddressType value) {
        this.scheduledDropoffPoint = value;
    }

    /**
     * Gets the value of the scheduledDropoffTime property.
     * 
     * @return
     *     possible object is
     *     {@link Time }
     *     
     */
    public Time getScheduledDropoffTime() {
        return scheduledDropoffTime;
    }

    /**
     * Sets the value of the scheduledDropoffTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Time }
     *     
     */
    public void setScheduledDropoffTime(Time value) {
        this.scheduledDropoffTime = value;
    }

    /**
     * Gets the value of the performedPickupPoint property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getPerformedPickupPoint() {
        return performedPickupPoint;
    }

    /**
     * Sets the value of the performedPickupPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setPerformedPickupPoint(AddressType value) {
        this.performedPickupPoint = value;
    }

    /**
     * Gets the value of the performedPickupTime property.
     * 
     * @return
     *     possible object is
     *     {@link Time }
     *     
     */
    public Time getPerformedPickupTime() {
        return performedPickupTime;
    }

    /**
     * Sets the value of the performedPickupTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Time }
     *     
     */
    public void setPerformedPickupTime(Time value) {
        this.performedPickupTime = value;
    }

    /**
     * Gets the value of the performedDropoffPoint property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getPerformedDropoffPoint() {
        return performedDropoffPoint;
    }

    /**
     * Sets the value of the performedDropoffPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setPerformedDropoffPoint(AddressType value) {
        this.performedDropoffPoint = value;
    }

    /**
     * Gets the value of the performedDropoffTime property.
     * 
     * @return
     *     possible object is
     *     {@link Time }
     *     
     */
    public Time getPerformedDropoffTime() {
        return performedDropoffTime;
    }

    /**
     * Sets the value of the performedDropoffTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Time }
     *     
     */
    public void setPerformedDropoffTime(Time value) {
        this.performedDropoffTime = value;
    }

    /**
     * Gets the value of the detoursPermissible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDetoursPermissible() {
        return detoursPermissible;
    }

    /**
     * Sets the value of the detoursPermissible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDetoursPermissible(Boolean value) {
        this.detoursPermissible = value;
    }

    /**
     * Gets the value of the transferPoint property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getTransferPoint() {
        return transferPoint;
    }

    /**
     * Sets the value of the transferPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setTransferPoint(AddressType value) {
        this.transferPoint = value;
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
     * Gets the value of the transportServices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the transportServices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportServices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTransportServices() {
        if (transportServices == null) {
            transportServices = new ArrayList<String>();
        }
        return this.transportServices;
    }

}