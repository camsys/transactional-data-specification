
package com.camsys.tds;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Telegram #: 6A; From: customer/client; To: trip provider; Purpose: Cancel trip request
 * 
 * <p>Java class for tripCancelRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tripCancelRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}telegramMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cancellationTime" type="{}time"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="reason" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tripCancelRequestType", propOrder = {
    "cancellationTime"
})
public class TripCancelRequestType
    extends TelegramMessageType
{

    @XmlElement(required = true)
    protected Time cancellationTime;
    @XmlAttribute(name = "reason")
    protected String reason;

    /**
     * Gets the value of the cancellationTime property.
     * 
     * @return
     *     possible object is
     *     {@link Time }
     *     
     */
    public Time getCancellationTime() {
        return cancellationTime;
    }

    /**
     * Sets the value of the cancellationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Time }
     *     
     */
    public void setCancellationTime(Time value) {
        this.cancellationTime = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

}
