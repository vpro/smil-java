//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.21 at 12:15:07 PM CEST 
//


package nl.vpro.smil;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.w3._2001.smil20.language.AnchorType;
import org.w3._2001.smil20.language.AreaType;


/**
 * <p>Java class for areaPrototype complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="areaPrototype">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{http://www.w3.org/2001/SMIL20/}linkingAttrs"/>
 *       &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="nohref">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="nohref"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="shape" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="coords" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "areaPrototype")
@XmlSeeAlso({
    AreaType.class,
    AnchorType.class
})
public class AreaPrototype {

    @XmlAttribute(name = "href")
    @XmlSchemaType(name = "anyURI")
    protected String href;
    @XmlAttribute(name = "nohref")
    protected String nohref;
    @XmlAttribute(name = "shape")
    protected String shape;
    @XmlAttribute(name = "coords")
    protected String coords;
    @XmlAttribute(name = "sourceLevel")
    protected String sourceLevel;
    @XmlAttribute(name = "destinationLevel")
    protected String destinationLevel;
    @XmlAttribute(name = "sourcePlaystate")
    protected SourcePlaystateType sourcePlaystate;
    @XmlAttribute(name = "destinationPlaystate")
    protected DestinationPlaystateType destinationPlaystate;
    @XmlAttribute(name = "show")
    protected ShowType show;
    @XmlAttribute(name = "external")
    protected Boolean external;
    @XmlAttribute(name = "actuate")
    protected ActuateType actuate;
    @XmlAttribute(name = "accesskey")
    protected String accesskey;
    @XmlAttribute(name = "target")
    protected String target;
    @XmlAttribute(name = "tabindex")
    protected BigInteger tabindex;

    /**
     * Gets the value of the href property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHref() {
        return href;
    }

    /**
     * Sets the value of the href property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHref(String value) {
        this.href = value;
    }

    /**
     * Gets the value of the nohref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNohref() {
        return nohref;
    }

    /**
     * Sets the value of the nohref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNohref(String value) {
        this.nohref = value;
    }

    /**
     * Gets the value of the shape property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShape() {
        return shape;
    }

    /**
     * Sets the value of the shape property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShape(String value) {
        this.shape = value;
    }

    /**
     * Gets the value of the coords property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoords() {
        return coords;
    }

    /**
     * Sets the value of the coords property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoords(String value) {
        this.coords = value;
    }

    /**
     * Gets the value of the sourceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceLevel() {
        return sourceLevel;
    }

    /**
     * Sets the value of the sourceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceLevel(String value) {
        this.sourceLevel = value;
    }

    /**
     * Gets the value of the destinationLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationLevel() {
        return destinationLevel;
    }

    /**
     * Sets the value of the destinationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationLevel(String value) {
        this.destinationLevel = value;
    }

    /**
     * Gets the value of the sourcePlaystate property.
     * 
     * @return
     *     possible object is
     *     {@link SourcePlaystateType }
     *     
     */
    public SourcePlaystateType getSourcePlaystate() {
        return sourcePlaystate;
    }

    /**
     * Sets the value of the sourcePlaystate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourcePlaystateType }
     *     
     */
    public void setSourcePlaystate(SourcePlaystateType value) {
        this.sourcePlaystate = value;
    }

    /**
     * Gets the value of the destinationPlaystate property.
     * 
     * @return
     *     possible object is
     *     {@link DestinationPlaystateType }
     *     
     */
    public DestinationPlaystateType getDestinationPlaystate() {
        return destinationPlaystate;
    }

    /**
     * Sets the value of the destinationPlaystate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationPlaystateType }
     *     
     */
    public void setDestinationPlaystate(DestinationPlaystateType value) {
        this.destinationPlaystate = value;
    }

    /**
     * Gets the value of the show property.
     * 
     * @return
     *     possible object is
     *     {@link ShowType }
     *     
     */
    public ShowType getShow() {
        if (show == null) {
            return ShowType.REPLACE;
        } else {
            return show;
        }
    }

    /**
     * Sets the value of the show property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShowType }
     *     
     */
    public void setShow(ShowType value) {
        this.show = value;
    }

    /**
     * Gets the value of the external property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isExternal() {
        if (external == null) {
            return false;
        } else {
            return external;
        }
    }

    /**
     * Sets the value of the external property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExternal(Boolean value) {
        this.external = value;
    }

    /**
     * Gets the value of the actuate property.
     * 
     * @return
     *     possible object is
     *     {@link ActuateType }
     *     
     */
    public ActuateType getActuate() {
        if (actuate == null) {
            return ActuateType.ON_REQUEST;
        } else {
            return actuate;
        }
    }

    /**
     * Sets the value of the actuate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActuateType }
     *     
     */
    public void setActuate(ActuateType value) {
        this.actuate = value;
    }

    /**
     * Gets the value of the accesskey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccesskey() {
        return accesskey;
    }

    /**
     * Sets the value of the accesskey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccesskey(String value) {
        this.accesskey = value;
    }

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTarget(String value) {
        this.target = value;
    }

    /**
     * Gets the value of the tabindex property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTabindex() {
        return tabindex;
    }

    /**
     * Sets the value of the tabindex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTabindex(BigInteger value) {
        this.tabindex = value;
    }

}
