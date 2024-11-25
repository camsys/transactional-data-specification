//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.11.19 at 09:08:46 PM EST 
//


package com.camsys.tds;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Telegram #: 1B; From: trip provider; To: ordering client; Purpose: reply to telegram 1A
 * 
 * <p>Java class for tripRequestResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tripRequestResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}telegramMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tripAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="scheduledPickupTime" type="{}time" minOccurs="0"/&gt;
 *         &lt;element name="scheduledPickupPoint" type="{}addressType" minOccurs="0"/&gt;
 *         &lt;element name="scheduledDropoffPoint" type="{}addressType" minOccurs="0"/&gt;
 *         &lt;element name="transferPoint" type="{}addressType" minOccurs="0"/&gt;
 *         &lt;element name="tripRejectionReason" type="{}tripRejectionReasonEnum" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="paymentTypeList" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="fareAmount" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="transportServices" type="{}valueList" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tripRequestResponseType", propOrder = {
    "tripAvailable",
    "scheduledPickupTime",
    "scheduledPickupPoint",
    "scheduledDropoffPoint",
    "transferPoint",
    "tripRejectionReason"
})
public class TripRequestResponseType
    extends TelegramMessageType
{

    protected Boolean tripAvailable;
    protected Time scheduledPickupTime;
    protected AddressType scheduledPickupPoint;
    protected AddressType scheduledDropoffPoint;
    protected AddressType transferPoint;
    @XmlSchemaType(name = "string")
    protected TripRejectionReasonEnum tripRejectionReason;
    @XmlAttribute(name = "paymentTypeList")
    @XmlSchemaType(name = "anySimpleType")
    protected String paymentTypeList;
    @XmlAttribute(name = "fareAmount")
    protected Float fareAmount;
    @XmlAttribute(name = "transportServices")
    protected List<String> transportServices;

    /**
     * Gets the value of the tripAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTripAvailable() {
        return tripAvailable;
    }

    /**
     * Sets the value of the tripAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTripAvailable(Boolean value) {
        this.tripAvailable = value;
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
     * Gets the value of the tripRejectionReason property.
     * 
     * @return
     *     possible object is
     *     {@link TripRejectionReasonEnum }
     *     
     */
    public TripRejectionReasonEnum getTripRejectionReason() {
        return tripRejectionReason;
    }

    /**
     * Sets the value of the tripRejectionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link TripRejectionReasonEnum }
     *     
     */
    public void setTripRejectionReason(TripRejectionReasonEnum value) {
        this.tripRejectionReason = value;
    }

    /**
     * Gets the value of the paymentTypeList property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentTypeList() {
        return paymentTypeList;
    }

    /**
     * Sets the value of the paymentTypeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentTypeList(String value) {
        this.paymentTypeList = value;
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
