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
 * <p>Java class for overdubOrSubtitleType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="overdubOrSubtitleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="overdub"/>
 *     &lt;enumeration value="subtitle"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "overdubOrSubtitleType")
@XmlEnum
public enum OverdubOrSubtitleType {

    @XmlEnumValue("overdub")
    OVERDUB("overdub"),
    @XmlEnumValue("subtitle")
    SUBTITLE("subtitle");
    private final String value;

    OverdubOrSubtitleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OverdubOrSubtitleType fromValue(String v) {
        for (OverdubOrSubtitleType c: OverdubOrSubtitleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
