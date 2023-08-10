
package com.camsys.tds;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Any text aimed for operators, drivers etc
 * 
 * <p>Java class for manualDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="manualDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idActionText" type="{}idType" minOccurs="0"/&gt;
 *         &lt;element name="textTimestamp" type="{}time" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="sendtoInvoice" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="sendtoVehicle" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="sendtoOperator" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="manualText" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="vehicleConfirmation" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="sendingOperator" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "manualDescriptionType", propOrder = {
    "idActionText",
    "textTimestamp"
})
public class ManualDescriptionType {

    protected IdType idActionText;
    protected Time textTimestamp;
    @XmlAttribute(name = "sendtoInvoice", required = true)
    protected boolean sendtoInvoice;
    @XmlAttribute(name = "sendtoVehicle", required = true)
    protected boolean sendtoVehicle;
    @XmlAttribute(name = "sendtoOperator", required = true)
    protected boolean sendtoOperator;
    @XmlAttribute(name = "manualText", required = true)
    protected String manualText;
    @XmlAttribute(name = "vehicleConfirmation", required = true)
    protected boolean vehicleConfirmation;
    @XmlAttribute(name = "sendingOperator")
    @XmlSchemaType(name = "anySimpleType")
    protected String sendingOperator;

    /**
     * Gets the value of the idActionText property.
     * 
     * @return
     *     possible object is
     *     {@link IdType }
     *     
     */
    public IdType getIdActionText() {
        return idActionText;
    }

    /**
     * Sets the value of the idActionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdType }
     *     
     */
    public void setIdActionText(IdType value) {
        this.idActionText = value;
    }

    /**
     * Gets the value of the textTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link Time }
     *     
     */
    public Time getTextTimestamp() {
        return textTimestamp;
    }

    /**
     * Sets the value of the textTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Time }
     *     
     */
    public void setTextTimestamp(Time value) {
        this.textTimestamp = value;
    }

    /**
     * Gets the value of the sendtoInvoice property.
     * 
     */
    public boolean isSendtoInvoice() {
        return sendtoInvoice;
    }

    /**
     * Sets the value of the sendtoInvoice property.
     * 
     */
    public void setSendtoInvoice(boolean value) {
        this.sendtoInvoice = value;
    }

    /**
     * Gets the value of the sendtoVehicle property.
     * 
     */
    public boolean isSendtoVehicle() {
        return sendtoVehicle;
    }

    /**
     * Sets the value of the sendtoVehicle property.
     * 
     */
    public void setSendtoVehicle(boolean value) {
        this.sendtoVehicle = value;
    }

    /**
     * Gets the value of the sendtoOperator property.
     * 
     */
    public boolean isSendtoOperator() {
        return sendtoOperator;
    }

    /**
     * Sets the value of the sendtoOperator property.
     * 
     */
    public void setSendtoOperator(boolean value) {
        this.sendtoOperator = value;
    }

    /**
     * Gets the value of the manualText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManualText() {
        return manualText;
    }

    /**
     * Sets the value of the manualText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManualText(String value) {
        this.manualText = value;
    }

    /**
     * Gets the value of the vehicleConfirmation property.
     * 
     */
    public boolean isVehicleConfirmation() {
        return vehicleConfirmation;
    }

    /**
     * Sets the value of the vehicleConfirmation property.
     * 
     */
    public void setVehicleConfirmation(boolean value) {
        this.vehicleConfirmation = value;
    }

    /**
     * Gets the value of the sendingOperator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendingOperator() {
        return sendingOperator;
    }

    /**
     * Sets the value of the sendingOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendingOperator(String value) {
        this.sendingOperator = value;
    }

}
