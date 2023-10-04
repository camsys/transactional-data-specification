
package com.camsys.tds;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "boolean")
    protected Boolean dataReceived;
    @XmlAttribute(name = "paymentRejected")
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "boolean")
    protected Boolean paymentRejected;

    /**
     * Gets the value of the dataReceived property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Boolean isDataReceived() {
        return dataReceived;
    }

    /**
     * Sets the value of the dataReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataReceived(Boolean value) {
        this.dataReceived = value;
    }

    /**
     * Gets the value of the paymentRejected property.
     * 
     * @return
     *     possible object is
     *     {@link String }
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
     *     {@link String }
     *     
     */
    public void setPaymentRejected(Boolean value) {
        this.paymentRejected = value;
    }

}
