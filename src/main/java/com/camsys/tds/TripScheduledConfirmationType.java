//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.11.19 at 09:08:46 PM EST 
//


package com.camsys.tds;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Telegram #: 4B; From: trip provider; To: ordering client; Purpose: confirm trip is scheduled for vehicle
 * 
 * <p>Java class for tripScheduledConfirmationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tripScheduledConfirmationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}telegramMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dataReceived" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="paymentRejected" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tripScheduledConfirmationType", propOrder = {
    "dataReceived"
})
public class TripScheduledConfirmationType
    extends TelegramMessageType
{

    protected boolean dataReceived;
    @XmlAttribute(name = "paymentRejected")
    protected Boolean paymentRejected;

    /**
     * Gets the value of the dataReceived property.
     * 
     */
    public boolean isDataReceived() {
        return dataReceived;
    }

    /**
     * Sets the value of the dataReceived property.
     * 
     */
    public void setDataReceived(boolean value) {
        this.dataReceived = value;
    }

    /**
     * Gets the value of the paymentRejected property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPaymentRejected() {
        return paymentRejected;
    }

    /**
     * Sets the value of the paymentRejected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPaymentRejected(Boolean value) {
        this.paymentRejected = value;
    }

}
