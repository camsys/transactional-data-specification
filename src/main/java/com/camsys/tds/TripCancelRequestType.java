
package com.camsys.tds;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="reason" type="{}clientTripCancellationReasonEnum" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tripCancelRequestType")
public class TripCancelRequestType
    extends TelegramMessageType
{

    @XmlAttribute(name = "reason")
    protected ClientTripCancellationReasonEnum reason;

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link ClientTripCancellationReasonEnum }
     *     
     */
    public ClientTripCancellationReasonEnum getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClientTripCancellationReasonEnum }
     *     
     */
    public void setReason(ClientTripCancellationReasonEnum value) {
        this.reason = value;
    }

}
