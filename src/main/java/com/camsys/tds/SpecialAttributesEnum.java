
package com.camsys.tds;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for specialAttributesEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="specialAttributesEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="A"/&gt;
 *     &lt;enumeration value="AL"/&gt;
 *     &lt;enumeration value="C"/&gt;
 *     &lt;enumeration value="CU"/&gt;
 *     &lt;enumeration value="D2D"/&gt;
 *     &lt;enumeration value="DA"/&gt;
 *     &lt;enumeration value="DTD"/&gt;
 *     &lt;enumeration value="E"/&gt;
 *     &lt;enumeration value="HIP"/&gt;
 *     &lt;enumeration value="IDD"/&gt;
 *     &lt;enumeration value="KD"/&gt;
 *     &lt;enumeration value="MH"/&gt;
 *     &lt;enumeration value="MIP"/&gt;
 *     &lt;enumeration value="NDD"/&gt;
 *     &lt;enumeration value="NLA"/&gt;
 *     &lt;enumeration value="O"/&gt;
 *     &lt;enumeration value="S"/&gt;
 *     &lt;enumeration value="SA"/&gt;
 *     &lt;enumeration value="SD"/&gt;
 *     &lt;enumeration value="SI"/&gt;
 *     &lt;enumeration value="TD"/&gt;
 *     &lt;enumeration value="U"/&gt;
 *     &lt;enumeration value="VIP"/&gt;
 *     &lt;enumeration value="W"/&gt;
 *     &lt;enumeration value="WA"/&gt;
 *     &lt;enumeration value="WAK"/&gt;
 *     &lt;enumeration value="WE"/&gt;
 *     &lt;enumeration value="WT"/&gt;
 *     &lt;enumeration value="WW"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "specialAttributesEnum")
@XmlEnum
public enum SpecialAttributesEnum {


    /**
     * Mobility Aid: Ambulatory
     * 
     */
    A("A"),

    /**
     * Mobility Aid: Ambulatory lift
     * 
     */
    AL("AL"),

    /**
     * Mobility Aid: Cane
     * 
     */
    C("C"),

    /**
     * Mobility Aid: Crutches
     * 
     */
    CU("CU"),

    /**
     * Service Needs: Door to door
     * 
     */
    @XmlEnumValue("D2D")
    D_2_D("D2D"),

    /**
     * Service Needs: Driver Alert
     * 
     */
    DA("DA"),

    /**
     * Service Needs: Door THROUGH door
     * 
     */
    DTD("DTD"),

    /**
     * Mobility Aid: Electric wheelchair
     * 
     */
    E("E"),

    /**
     * Service Needs: hearing impaired
     * 
     */
    HIP("HIP"),

    /**
     * Medical: intellectually or developmentally disabled
     * 
     */
    IDD("IDD"),

    /**
     * Medical: Kidney disease
     * 
     */
    KD("KD"),

    /**
     * Medical: Mental health
     * 
     */
    MH("MH"),

    /**
     * Medical: Dementia (memory impaired)
     * 
     */
    MIP("MIP"),

    /**
     * Medical: Neurologic and degenerative diseases
     * 
     */
    NDD("NDD"),

    /**
     * Service Needs: Never leave alone/ no leave alone
     * 
     */
    NLA("NLA"),

    /**
     * Service Needs: Oxygen
     * 
     */
    O("O"),

    /**
     * Mobility Aid: Scooter
     * 
     */
    S("S"),

    /**
     * Service Needs: Service Animal
     * 
     */
    SA("SA"),

    /**
     * Service Needs: Seizure disorder
     * 
     */
    SD("SD"),

    /**
     * Medical: Speech impaired
     * 
     */
    SI("SI"),

    /**
     * Medical: Temporary Disability
     * 
     */
    TD("TD"),

    /**
     * Service Needs: Unstable needs assistance
     * 
     */
    U("U"),

    /**
     * Medical: Vision impaired
     * 
     */
    VIP("VIP"),

    /**
     * Mobility Aid: Wheelchair
     * 
     */
    W("W"),

    /**
     * Mobility Aid: Walker
     * 
     */
    WA("WA"),

    /**
     * Mobility Aid: Knee walker
     * 
     */
    WAK("WAK"),

    /**
     * Mobility Aid: Extended leg w/c = Extended Leg Wheelchair
     * 
     */
    WE("WE"),

    /**
     * Mobility Aid: Wheelchair, can transfer
     * 
     */
    WT("WT"),

    /**
     * Mobility Aid: Wide wheelchair
     * 
     */
    WW("WW");
    private final String value;

    SpecialAttributesEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SpecialAttributesEnum fromValue(String v) {
        for (SpecialAttributesEnum c: SpecialAttributesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
