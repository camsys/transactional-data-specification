
package com.camsys.tds;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Information about customer preferred provider
 * 
 * <p>Java class for providerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="providerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="providerId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="providerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="providerContact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "providerType", propOrder = {
    "providerId",
    "providerName",
    "providerContact"
})
public class ProviderType {

    @XmlElement(required = true)
    protected String providerId;
    protected String providerName;
    protected String providerContact;

    /**
     * Gets the value of the providerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderId() {
        return providerId;
    }

    /**
     * Sets the value of the providerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderId(String value) {
        this.providerId = value;
    }

    /**
     * Gets the value of the providerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderName() {
        return providerName;
    }

    /**
     * Sets the value of the providerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderName(String value) {
        this.providerName = value;
    }

    /**
     * Gets the value of the providerContact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderContact() {
        return providerContact;
    }

    /**
     * Sets the value of the providerContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderContact(String value) {
        this.providerContact = value;
    }

}
