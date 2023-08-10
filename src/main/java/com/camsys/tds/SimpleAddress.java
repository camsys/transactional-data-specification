
package com.camsys.tds;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Simplified version of Customer Address
 * 
 * <p>Java class for simpleAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="simpleAddress"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="simpleStreetAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="simpleExtendedAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="simpleCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="simplePostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="simpleCounty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="simpleCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "simpleAddress", propOrder = {
    "simpleStreetAddress",
    "simpleExtendedAddress",
    "simpleCity",
    "simplePostalCode",
    "simpleCounty",
    "simpleCountry"
})
public class SimpleAddress {

    protected String simpleStreetAddress;
    protected String simpleExtendedAddress;
    protected String simpleCity;
    protected String simplePostalCode;
    protected String simpleCounty;
    protected String simpleCountry;

    /**
     * Gets the value of the simpleStreetAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSimpleStreetAddress() {
        return simpleStreetAddress;
    }

    /**
     * Sets the value of the simpleStreetAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSimpleStreetAddress(String value) {
        this.simpleStreetAddress = value;
    }

    /**
     * Gets the value of the simpleExtendedAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSimpleExtendedAddress() {
        return simpleExtendedAddress;
    }

    /**
     * Sets the value of the simpleExtendedAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSimpleExtendedAddress(String value) {
        this.simpleExtendedAddress = value;
    }

    /**
     * Gets the value of the simpleCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSimpleCity() {
        return simpleCity;
    }

    /**
     * Sets the value of the simpleCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSimpleCity(String value) {
        this.simpleCity = value;
    }

    /**
     * Gets the value of the simplePostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSimplePostalCode() {
        return simplePostalCode;
    }

    /**
     * Sets the value of the simplePostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSimplePostalCode(String value) {
        this.simplePostalCode = value;
    }

    /**
     * Gets the value of the simpleCounty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSimpleCounty() {
        return simpleCounty;
    }

    /**
     * Sets the value of the simpleCounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSimpleCounty(String value) {
        this.simpleCounty = value;
    }

    /**
     * Gets the value of the simpleCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSimpleCountry() {
        return simpleCountry;
    }

    /**
     * Sets the value of the simpleCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSimpleCountry(String value) {
        this.simpleCountry = value;
    }

}
