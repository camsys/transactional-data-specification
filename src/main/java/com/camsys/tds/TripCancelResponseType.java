
package com.camsys.tds;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Telegram #: 6B; From: trip provider; To: customer/client; Purpose: Cancel trip request
 * 
 * <p>Java class for tripCancelResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tripCancelResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{}telegramMessageType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cancellationTime" type="{}time"/&gt;
 *         &lt;element name="cancellationApproved" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="cancellationRequestOrigin" type="{}requestOriginEnum"/&gt;
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
@XmlType(name = "tripCancelResponseType", propOrder = {
    "cancellationTime",
    "cancellationApproved",
    "cancellationRequestOrigin"
})
public class TripCancelResponseType
    extends TelegramMessageType
{

    @XmlElement(required = true)
    protected Time cancellationTime;
    protected boolean cancellationApproved;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected RequestOriginEnum cancellationRequestOrigin;
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
     * Gets the value of the cancellationApproved property.
     * 
     */
    public boolean isCancellationApproved() {
        return cancellationApproved;
    }

    /**
     * Sets the value of the cancellationApproved property.
     * 
     */
    public void setCancellationApproved(boolean value) {
        this.cancellationApproved = value;
    }

    /**
     * Gets the value of the cancellationRequestOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link RequestOriginEnum }
     *     
     */
    public RequestOriginEnum getCancellationRequestOrigin() {
        return cancellationRequestOrigin;
    }

    /**
     * Sets the value of the cancellationRequestOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestOriginEnum }
     *     
     */
    public void setCancellationRequestOrigin(RequestOriginEnum value) {
        this.cancellationRequestOrigin = value;
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
