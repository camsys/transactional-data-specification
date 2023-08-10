
package com.camsys.tds;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tripPurposeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="tripPurposeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="A"/&gt;
 *     &lt;enumeration value="D"/&gt;
 *     &lt;enumeration value="E"/&gt;
 *     &lt;enumeration value="G"/&gt;
 *     &lt;enumeration value="HR"/&gt;
 *     &lt;enumeration value="M"/&gt;
 *     &lt;enumeration value="P"/&gt;
 *     &lt;enumeration value="R"/&gt;
 *     &lt;enumeration value="T"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "tripPurposeEnum")
@XmlEnum
public enum TripPurposeEnum {


    /**
     * Adult Day Program
     * 
     */
    A,

    /**
     * Dialysis
     * 
     */
    D,

    /**
     * Employment
     * 
     */
    E,

    /**
     * Grocery
     * 
     */
    G,

    /**
     * Health-Related (includes dentist, pharmacy, etc.)
     * 
     */
    HR,

    /**
     * Medical
     * 
     */
    M,

    /**
     * Personal
     * 
     */
    P,

    /**
     * Recreation
     * 
     */
    R,

    /**
     * Public transit
     * 
     */
    T;

    public String value() {
        return name();
    }

    public static TripPurposeEnum fromValue(String v) {
        return valueOf(v);
    }

}
