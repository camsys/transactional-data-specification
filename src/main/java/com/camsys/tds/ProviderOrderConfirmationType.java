
package com.camsys.tds;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Telegram #: 2B; From: trip provider; To: ordering client; Purpose: confirm trip is scheduled
 * 
 * <p>Java class for providerOrderConfirmationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="providerOrderConfirmationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}telegramMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="scheduledPickupTime" type="{}time" minOccurs="0"/&gt;
 *         &lt;element name="scheduledPickupPoint" type="{}addressType" minOccurs="0"/&gt;
 *         &lt;element name="scheduledDropoffPoint" type="{}addressType" minOccurs="0"/&gt;
 *         &lt;element name="scheduledDropoffTime" type="{}time" minOccurs="0"/&gt;
 *         &lt;element name="transferPoint" type="{}addressType" minOccurs="0"/&gt;
 *         &lt;element name="provider" type="{}providerType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="paymentType" type="{}paymentTypeList" /&gt;
 *       &lt;attribute name="fareAmount" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="transportServices" type="{}valueList" /&gt;
 *       &lt;attribute name="vehicleNumber" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="driverId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="vehicleInformation" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="customerId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "providerOrderConfirmationType", propOrder = {
    "scheduledPickupTime",
    "scheduledPickupPoint",
    "scheduledDropoffPoint",
    "scheduledDropoffTime",
    "transferPoint",
    "provider"
})
public class ProviderOrderConfirmationType
    extends TelegramMessageType
{

    protected Time scheduledPickupTime;
    protected AddressType scheduledPickupPoint;
    protected AddressType scheduledDropoffPoint;
    protected Time scheduledDropoffTime;
    protected AddressType transferPoint;
    protected ProviderType provider;
    @XmlAttribute(name = "paymentType")
    protected List<PaymentTypeEnum> paymentType;
    @XmlAttribute(name = "fareAmount")
    protected Float fareAmount;
    @XmlAttribute(name = "transportServices")
    protected List<String> transportServices;
    @XmlAttribute(name = "vehicleNumber")
    protected String vehicleNumber;
    @XmlAttribute(name = "driverId")
    protected String driverId;
    @XmlAttribute(name = "vehicleInformation")
    protected String vehicleInformation;
    @XmlAttribute(name = "customerId")
    protected String customerId;

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
     * Gets the value of the provider property.
     * 
     * @return
     *     possible object is
     *     {@link ProviderType }
     *     
     */
    public ProviderType getProvider() {
        return provider;
    }

    /**
     * Sets the value of the provider property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProviderType }
     *     
     */
    public void setProvider(ProviderType value) {
        this.provider = value;
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
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerId(String value) {
        this.customerId = value;
    }

}
