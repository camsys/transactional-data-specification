
package com.camsys.tds;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Telegram #: 2A; From: ordering client; To: trip provider(s); Purpose: order confirmation
 * 
 * <p>Java class for clientOrderConfirmationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="clientOrderConfirmationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}telegramMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tripRequestId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
 *         &lt;element name="detailedDropoffLocationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="detailedPickupLocationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerMobilePhone" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="customerLocInDropoffSequence" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="numOtherReservedPassengers" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="fundingEntityId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="customerId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="paymentType" type="{}paymentTypeList" /&gt;
 *       &lt;attribute name="fareAmount" type="{http://www.w3.org/2001/XMLSchema}float" /&gt;
 *       &lt;attribute name="tripPurpose" type="{}tripPurposeList" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clientOrderConfirmationType", propOrder = {
    "rest"
})
public class ClientOrderConfirmationType
    extends TelegramMessageType
{

    @XmlElementRefs({
        @XmlElementRef(name = "tripRequestId", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "pickupAddress", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "dropoffAddress", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "pickupTime", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "appointmentTime", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "dropoffTime", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "pickupWindowStartTime", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "pickupWindowEndTime", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "detoursPermissible", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "negotiatedPickupTime", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "hardConstraintOnPickupTime", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "hardConstraintOnDropoffTime", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "detailedDropoffLocationDescription", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "detailedPickupLocationDescription", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "customerName", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "customerMobilePhone", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "customerLocInDropoffSequence", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "numOtherReservedPassengers", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fundingEntityId", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> rest;
    @XmlAttribute(name = "customerId")
    protected String customerId;
    @XmlAttribute(name = "paymentType")
    protected List<PaymentTypeEnum> paymentType;
    @XmlAttribute(name = "fareAmount")
    protected Float fareAmount;
    @XmlAttribute(name = "tripPurpose")
    protected List<TripPurposeEnum> tripPurpose;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "TripRequestId" is used by two different parts of a schema. See: 
     * line 108 of file:/Users/lenny/projects/transactional-data-specification/src/main/resources/schemas/xsd/tcrp.demandtrans.com_TCRPSchema.xsd
     * line 27 of file:/Users/lenny/projects/transactional-data-specification/src/main/resources/schemas/xsd/tcrp.demandtrans.com_TCRPSchema.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link AddressType }{@code >}
     * {@link JAXBElement }{@code <}{@link AddressType }{@code >}
     * {@link JAXBElement }{@code <}{@link Time }{@code >}
     * {@link JAXBElement }{@code <}{@link Time }{@code >}
     * {@link JAXBElement }{@code <}{@link Time }{@code >}
     * {@link JAXBElement }{@code <}{@link Time }{@code >}
     * {@link JAXBElement }{@code <}{@link Time }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link Time }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<?>>();
        }
        return this.rest;
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
     * Gets the value of the tripPurpose property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the tripPurpose property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTripPurpose().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TripPurposeEnum }
     * 
     * 
     */
    public List<TripPurposeEnum> getTripPurpose() {
        if (tripPurpose == null) {
            tripPurpose = new ArrayList<TripPurposeEnum>();
        }
        return this.tripPurpose;
    }

}
