
package com.camsys.tds;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The address known to receiving system
 * 
 * <p>Java class for addressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addressType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="manualDescriptionAddress" type="{}manualDescriptionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="geographicLocation" type="{}geographicLocation" minOccurs="0"/&gt;
 *         &lt;element name="idAddressName" type="{}idType" minOccurs="0"/&gt;
 *         &lt;element name="idStreet" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{}idType"&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="idPostalCode" type="{}idType" minOccurs="0"/&gt;
 *         &lt;element name="idCommunity" type="{}idType" minOccurs="0"/&gt;
 *         &lt;element name="idCountry" type="{}idType" minOccurs="0"/&gt;
 *         &lt;element name="idZone" type="{}idType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="idMap" type="{}idType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="addressName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="street" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="streetNo" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *       &lt;attribute name="streetNoLetter" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="location" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="community" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="postalNo" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="country" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="mapPage" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="addressDescription" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addressType", propOrder = {
    "manualDescriptionAddress",
    "geographicLocation",
    "idAddressName",
    "idStreet",
    "idPostalCode",
    "idCommunity",
    "idCountry",
    "idZone",
    "idMap"
})
public class AddressType {

    protected List<ManualDescriptionType> manualDescriptionAddress;
    protected GeographicLocation geographicLocation;
    protected IdType idAddressName;
    protected AddressType.IdStreet idStreet;
    protected IdType idPostalCode;
    protected IdType idCommunity;
    protected IdType idCountry;
    protected List<IdType> idZone;
    protected List<IdType> idMap;
    @XmlAttribute(name = "addressName")
    protected String addressName;
    @XmlAttribute(name = "street")
    protected String street;
    @XmlAttribute(name = "streetNo")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger streetNo;
    @XmlAttribute(name = "streetNoLetter")
    protected String streetNoLetter;
    @XmlAttribute(name = "location")
    protected String location;
    @XmlAttribute(name = "community")
    protected String community;
    @XmlAttribute(name = "postalNo")
    protected String postalNo;
    @XmlAttribute(name = "country")
    protected String country;
    @XmlAttribute(name = "mapPage")
    protected String mapPage;
    @XmlAttribute(name = "addressDescription")
    protected String addressDescription;

    /**
     * Gets the value of the manualDescriptionAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the manualDescriptionAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManualDescriptionAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManualDescriptionType }
     * 
     * 
     */
    public List<ManualDescriptionType> getManualDescriptionAddress() {
        if (manualDescriptionAddress == null) {
            manualDescriptionAddress = new ArrayList<ManualDescriptionType>();
        }
        return this.manualDescriptionAddress;
    }

    /**
     * Gets the value of the geographicLocation property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicLocation }
     *     
     */
    public GeographicLocation getGeographicLocation() {
        return geographicLocation;
    }

    /**
     * Sets the value of the geographicLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicLocation }
     *     
     */
    public void setGeographicLocation(GeographicLocation value) {
        this.geographicLocation = value;
    }

    /**
     * Gets the value of the idAddressName property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getIdAddressName() {
        return idAddressName;
    }

    /**
     * Sets the value of the idAddressName property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setIdAddressName(IdType value) {
        this.idAddressName = value;
    }

    /**
     * Gets the value of the idStreet property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType.IdStreet }
     *     
     */
    public AddressType.IdStreet getIdStreet() {
        return idStreet;
    }

    /**
     * Sets the value of the idStreet property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType.IdStreet }
     *     
     */
    public void setIdStreet(AddressType.IdStreet value) {
        this.idStreet = value;
    }

    /**
     * Gets the value of the idPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getIdPostalCode() {
        return idPostalCode;
    }

    /**
     * Sets the value of the idPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setIdPostalCode(IdType value) {
        this.idPostalCode = value;
    }

    /**
     * Gets the value of the idCommunity property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getIdCommunity() {
        return idCommunity;
    }

    /**
     * Sets the value of the idCommunity property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setIdCommunity(IdType value) {
        this.idCommunity = value;
    }

    /**
     * Gets the value of the idCountry property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getIdCountry() {
        return idCountry;
    }

    /**
     * Sets the value of the idCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setIdCountry(IdType value) {
        this.idCountry = value;
    }

    /**
     * Gets the value of the idZone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the idZone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdZone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdType }
     * 
     * 
     */
    public List<IdType> getIdZone() {
        if (idZone == null) {
            idZone = new ArrayList<IdType>();
        }
        return this.idZone;
    }

    /**
     * Gets the value of the idMap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the idMap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdMap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdType }
     * 
     * 
     */
    public List<IdType> getIdMap() {
        if (idMap == null) {
            idMap = new ArrayList<IdType>();
        }
        return this.idMap;
    }

    /**
     * Gets the value of the addressName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressName() {
        return addressName;
    }

    /**
     * Sets the value of the addressName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressName(String value) {
        this.addressName = value;
    }

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Gets the value of the streetNo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStreetNo() {
        return streetNo;
    }

    /**
     * Sets the value of the streetNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStreetNo(BigInteger value) {
        this.streetNo = value;
    }

    /**
     * Gets the value of the streetNoLetter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetNoLetter() {
        return streetNoLetter;
    }

    /**
     * Sets the value of the streetNoLetter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetNoLetter(String value) {
        this.streetNoLetter = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the community property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommunity() {
        return community;
    }

    /**
     * Sets the value of the community property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommunity(String value) {
        this.community = value;
    }

    /**
     * Gets the value of the postalNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalNo() {
        return postalNo;
    }

    /**
     * Sets the value of the postalNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalNo(String value) {
        this.postalNo = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the mapPage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMapPage() {
        return mapPage;
    }

    /**
     * Sets the value of the mapPage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMapPage(String value) {
        this.mapPage = value;
    }

    /**
     * Gets the value of the addressDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressDescription() {
        return addressDescription;
    }

    /**
     * Sets the value of the addressDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressDescription(String value) {
        this.addressDescription = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{}idType"&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class IdStreet
        extends IdType
    {


    }

}
