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
 * <p>Java class for regPointAlignValueType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="regPointAlignValueType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="topLeft"/>
 *     &lt;enumeration value="topMid"/>
 *     &lt;enumeration value="topRight"/>
 *     &lt;enumeration value="midLeft"/>
 *     &lt;enumeration value="center"/>
 *     &lt;enumeration value="midRight"/>
 *     &lt;enumeration value="bottomLeft"/>
 *     &lt;enumeration value="bottomMid"/>
 *     &lt;enumeration value="bottomRight"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "regPointAlignValueType")
@XmlEnum
public enum RegPointAlignValueType {

    @XmlEnumValue("topLeft")
    TOP_LEFT("topLeft"),
    @XmlEnumValue("topMid")
    TOP_MID("topMid"),
    @XmlEnumValue("topRight")
    TOP_RIGHT("topRight"),
    @XmlEnumValue("midLeft")
    MID_LEFT("midLeft"),
    @XmlEnumValue("center")
    CENTER("center"),
    @XmlEnumValue("midRight")
    MID_RIGHT("midRight"),
    @XmlEnumValue("bottomLeft")
    BOTTOM_LEFT("bottomLeft"),
    @XmlEnumValue("bottomMid")
    BOTTOM_MID("bottomMid"),
    @XmlEnumValue("bottomRight")
    BOTTOM_RIGHT("bottomRight");
    private final String value;

    RegPointAlignValueType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RegPointAlignValueType fromValue(String v) {
        for (RegPointAlignValueType c: RegPointAlignValueType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}