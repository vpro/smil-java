//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.21 at 12:15:07 PM CEST 
//


package nl.vpro.smil;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fillTimingAttrsType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="fillTimingAttrsType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="remove"/>
 *     &lt;enumeration value="freeze"/>
 *     &lt;enumeration value="hold"/>
 *     &lt;enumeration value="auto"/>
 *     &lt;enumeration value="default"/>
 *     &lt;enumeration value="transition"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "fillTimingAttrsType")
@XmlEnum
public enum FillTimingAttrsType {

    @XmlEnumValue("remove")
    REMOVE("remove"),
    @XmlEnumValue("freeze")
    FREEZE("freeze"),
    @XmlEnumValue("hold")
    HOLD("hold"),
    @XmlEnumValue("auto")
    AUTO("auto"),
    @XmlEnumValue("default")
    DEFAULT("default"),
    @XmlEnumValue("transition")
    TRANSITION("transition");
    private final String value;

    FillTimingAttrsType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FillTimingAttrsType fromValue(String v) {
        for (FillTimingAttrsType c: FillTimingAttrsType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
