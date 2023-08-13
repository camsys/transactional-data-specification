
package com.camsys.tds;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Telegram #: 1AA; From: ordering client; To: trip provider(s); Purpose: Quickly request trip and auto accept first option. Expects response of telegram 2B
 * 
 * <p>Java class for expeditedTripRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="expeditedTripRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}tripRequestType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="preferredProvider" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="preferredProviderContact" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="customerInfo" type="{}customerInfoType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "expeditedTripRequestType", propOrder = {
    "preferredProvider",
    "preferredProviderContact",
    "customerInfo"
})
public class ExpeditedTripRequestType
    extends TripRequestType
{

    @XmlElement(required = true)
    protected String preferredProvider;
    @XmlElement(required = true)
    protected String preferredProviderContact;
    @XmlElement(required = true)
    protected CustomerInfoType customerInfo;

    /**
     * Gets the value of the preferredProvider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredProvider() {
        return preferredProvider;
    }

    /**
     * Sets the value of the preferredProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredProvider(String value) {
        this.preferredProvider = value;
    }

    /**
     * Gets the value of the preferredProviderContact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferredProviderContact() {
        return preferredProviderContact;
    }

    /**
     * Sets the value of the preferredProviderContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferredProviderContact(String value) {
        this.preferredProviderContact = value;
    }

    /**
     * Gets the value of the customerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerInfoType }
     *     
     */
    public CustomerInfoType getCustomerInfo() {
        return customerInfo;
    }

    /**
     * Sets the value of the customerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerInfoType }
     *     
     */
    public void setCustomerInfo(CustomerInfoType value) {
        this.customerInfo = value;
    }

}
