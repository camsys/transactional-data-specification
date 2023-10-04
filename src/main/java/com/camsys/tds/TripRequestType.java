
package com.camsys.tds;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Telegram #: 1A; From: ordering client; To: trip provider(s); Purpose: query for trip availability
 * 
 * <p>Java class for tripRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tripRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}telegramMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pickupAddress" type="{}addressType"/&gt;
 *         &lt;element name="dropoffAddress" type="{}addressType"/&gt;
 *         &lt;element name="pickupTime" type="{}time"/&gt;
 *         &lt;element name="appointmentTime" type="{}time" minOccurs="0"/&gt;
 *         &lt;element name="dropoffTime" type="{}time" minOccurs="0"/&gt;
 *         &lt;element name="pickupWindowStartTime" type="{}time" minOccurs="0"/&gt;
 *         &lt;element name="pickupWindowEndTime" type="{}time" minOccurs="0"/&gt;
 *         &lt;element name="detoursPermissible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="negotiatedPickupTime" type="{}time" minOccurs="0"/&gt;
 *         &lt;element name="hardConstraintOnPickupTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="hardConstraintOnDropoffTime" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="specialAttributes" type="{}specialAttributesList" /&gt;
 *       &lt;attribute name="transportServices" type="{}valueList" /&gt;
 *       &lt;attribute name="openAttribute" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tripRequestType", propOrder = {
    "pickupAddress",
    "dropoffAddress",
    "pickupTime",
    "appointmentTime",
    "dropoffTime",
    "pickupWindowStartTime",
    "pickupWindowEndTime",
    "detoursPermissible",
    "negotiatedPickupTime",
    "hardConstraintOnPickupTime",
    "hardConstraintOnDropoffTime"
})
@XmlSeeAlso({
    ExpeditedTripRequestType.class
})
public class TripRequestType
    extends TelegramMessageType
{

    @XmlElement(required = true)
    protected AddressType pickupAddress;
    @XmlElement(required = true)
    protected AddressType dropoffAddress;
    @XmlElement(required = true)
    protected Time pickupTime;
    protected Time appointmentTime;
    protected Time dropoffTime;
    protected Time pickupWindowStartTime;
    protected Time pickupWindowEndTime;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "boolean")
    protected Boolean detoursPermissible;
    protected Time negotiatedPickupTime;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "boolean")
    protected Boolean hardConstraintOnPickupTime;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "boolean")
    protected Boolean hardConstraintOnDropoffTime;
    @XmlAttribute(name = "specialAttributes")
    protected List<SpecialAttributesEnum> specialAttributes;
    @XmlAttribute(name = "transportServices")
    protected List<String> transportServices;
    @XmlAttribute(name = "openAttribute")
    protected String openAttribute;

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
     * Gets the value of the appointmentTime property.
     * 
     * @return
     *     possible object is
     *     {@link Time }
     *     
     */
    public Time getAppointmentTime() {
        return appointmentTime;
    }

    /**
     * Sets the value of the appointmentTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Time }
     *     
     */
    public void setAppointmentTime(Time value) {
        this.appointmentTime = value;
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
     * Gets the value of the pickupWindowStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link Time }
     *     
     */
    public Time getPickupWindowStartTime() {
        return pickupWindowStartTime;
    }

    /**
     * Sets the value of the pickupWindowStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Time }
     *     
     */
    public void setPickupWindowStartTime(Time value) {
        this.pickupWindowStartTime = value;
    }

    /**
     * Gets the value of the pickupWindowEndTime property.
     * 
     * @return
     *     possible object is
     *     {@link Time }
     *     
     */
    public Time getPickupWindowEndTime() {
        return pickupWindowEndTime;
    }

    /**
     * Sets the value of the pickupWindowEndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Time }
     *     
     */
    public void setPickupWindowEndTime(Time value) {
        this.pickupWindowEndTime = value;
    }

    /**
     * Gets the value of the detoursPermissible property.
     * 
     * @return
     *     possible object is
     *     {@link String }
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
     *     {@link String }
     *     
     */
    public void setDetoursPermissible(Boolean value) {
        this.detoursPermissible = value;
    }

    /**
     * Gets the value of the negotiatedPickupTime property.
     * 
     * @return
     *     possible object is
     *     {@link Time }
     *     
     */
    public Time getNegotiatedPickupTime() {
        return negotiatedPickupTime;
    }

    /**
     * Sets the value of the negotiatedPickupTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Time }
     *     
     */
    public void setNegotiatedPickupTime(Time value) {
        this.negotiatedPickupTime = value;
    }

    /**
     * Gets the value of the hardConstraintOnPickupTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Boolean isHardConstraintOnPickupTime() {
        return hardConstraintOnPickupTime;
    }

    /**
     * Sets the value of the hardConstraintOnPickupTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHardConstraintOnPickupTime(Boolean value) {
        this.hardConstraintOnPickupTime = value;
    }

    /**
     * Gets the value of the hardConstraintOnDropoffTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Boolean isHardConstraintOnDropoffTime() {
        return hardConstraintOnDropoffTime;
    }

    /**
     * Sets the value of the hardConstraintOnDropoffTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHardConstraintOnDropoffTime(Boolean value) {
        this.hardConstraintOnDropoffTime = value;
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

    /**
     * Gets the value of the openAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenAttribute() {
        return openAttribute;
    }

    /**
     * Sets the value of the openAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenAttribute(String value) {
        this.openAttribute = value;
    }

}
