
package com.camsys.tds;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlList;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Telegram #: 2A1; From: ordering client; To: trip provider(s); Purpose: customer info for trip
 * 
 * <p>Java class for customerInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="customerInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}telegramMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerAddress" type="{}addressType" minOccurs="0"/&gt;
 *         &lt;element name="customerPhone" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="customerMobilePhone" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="customerBillingAddress" type="{}addressType" minOccurs="0"/&gt;
 *         &lt;element name="fundingEntityBillingInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fundingType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="caregiverContactInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerEmergencyPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="customerEmergencyContactName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="requiredCareComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="customerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentType" type="{}paymentTypeList" minOccurs="0"/&gt;
 *         &lt;element name="notesForDriver" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="emailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerSimpleAddress" type="{}simpleAddress" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerInfoType", propOrder = {
    "customerFirstName",
    "customerMiddleName",
    "customerLastName",
    "customerAddress",
    "customerPhone",
    "customerMobilePhone",
    "customerBillingAddress",
    "fundingEntityBillingInformation",
    "fundingType",
    "gender",
    "caregiverContactInformation",
    "customerEmergencyPhoneNumber",
    "customerEmergencyContactName",
    "requiredCareComments",
    "dateOfBirth",
    "customerId",
    "paymentType",
    "notesForDriver",
    "emailAddress",
    "customerSimpleAddress"
})
public class CustomerInfoType
    extends TelegramMessageType
{

    protected String customerFirstName;
    protected String customerMiddleName;
    protected String customerLastName;
    protected AddressType customerAddress;
    protected BigInteger customerPhone;
    protected BigInteger customerMobilePhone;
    protected AddressType customerBillingAddress;
    protected String fundingEntityBillingInformation;
    protected Boolean fundingType;
    protected String gender;
    protected String caregiverContactInformation;
    protected BigInteger customerEmergencyPhoneNumber;
    protected String customerEmergencyContactName;
    protected String requiredCareComments;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "date")
    protected LocalDate dateOfBirth;
    protected String customerId;
    @XmlList
    protected List<PaymentTypeEnum> paymentType;
    protected String notesForDriver;
    protected String emailAddress;
    protected SimpleAddress customerSimpleAddress;

    /**
     * Gets the value of the customerFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerFirstName() {
        return customerFirstName;
    }

    /**
     * Sets the value of the customerFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerFirstName(String value) {
        this.customerFirstName = value;
    }

    /**
     * Gets the value of the customerMiddleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerMiddleName() {
        return customerMiddleName;
    }

    /**
     * Sets the value of the customerMiddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerMiddleName(String value) {
        this.customerMiddleName = value;
    }

    /**
     * Gets the value of the customerLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerLastName() {
        return customerLastName;
    }

    /**
     * Sets the value of the customerLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerLastName(String value) {
        this.customerLastName = value;
    }

    /**
     * Gets the value of the customerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getCustomerAddress() {
        return customerAddress;
    }

    /**
     * Sets the value of the customerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setCustomerAddress(AddressType value) {
        this.customerAddress = value;
    }

    /**
     * Gets the value of the customerPhone property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCustomerPhone() {
        return customerPhone;
    }

    /**
     * Sets the value of the customerPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCustomerPhone(BigInteger value) {
        this.customerPhone = value;
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
     * Gets the value of the customerBillingAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getCustomerBillingAddress() {
        return customerBillingAddress;
    }

    /**
     * Sets the value of the customerBillingAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setCustomerBillingAddress(AddressType value) {
        this.customerBillingAddress = value;
    }

    /**
     * Gets the value of the fundingEntityBillingInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundingEntityBillingInformation() {
        return fundingEntityBillingInformation;
    }

    /**
     * Sets the value of the fundingEntityBillingInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundingEntityBillingInformation(String value) {
        this.fundingEntityBillingInformation = value;
    }

    /**
     * Gets the value of the fundingType property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFundingType() {
        return fundingType;
    }

    /**
     * Sets the value of the fundingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFundingType(Boolean value) {
        this.fundingType = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * Gets the value of the caregiverContactInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaregiverContactInformation() {
        return caregiverContactInformation;
    }

    /**
     * Sets the value of the caregiverContactInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaregiverContactInformation(String value) {
        this.caregiverContactInformation = value;
    }

    /**
     * Gets the value of the customerEmergencyPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCustomerEmergencyPhoneNumber() {
        return customerEmergencyPhoneNumber;
    }

    /**
     * Sets the value of the customerEmergencyPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCustomerEmergencyPhoneNumber(BigInteger value) {
        this.customerEmergencyPhoneNumber = value;
    }

    /**
     * Gets the value of the customerEmergencyContactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerEmergencyContactName() {
        return customerEmergencyContactName;
    }

    /**
     * Sets the value of the customerEmergencyContactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerEmergencyContactName(String value) {
        this.customerEmergencyContactName = value;
    }

    /**
     * Gets the value of the requiredCareComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequiredCareComments() {
        return requiredCareComments;
    }

    /**
     * Sets the value of the requiredCareComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequiredCareComments(String value) {
        this.requiredCareComments = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateOfBirth(LocalDate value) {
        this.dateOfBirth = value;
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
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the customerSimpleAddress property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleAddress }
     *     
     */
    public SimpleAddress getCustomerSimpleAddress() {
        return customerSimpleAddress;
    }

    /**
     * Sets the value of the customerSimpleAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleAddress }
     *     
     */
    public void setCustomerSimpleAddress(SimpleAddress value) {
        this.customerSimpleAddress = value;
    }

}
