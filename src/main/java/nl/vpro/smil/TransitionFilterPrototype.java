//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.21 at 12:15:07 PM CEST 
//


package nl.vpro.smil;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transitionFilterPrototype complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transitionFilterPrototype">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="targetElement" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *       &lt;attribute name="href" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="subtype" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="dur" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="startProgress" type="{http://www.w3.org/2001/SMIL20/}zeroToOneDecimalType" default="0.0" />
 *       &lt;attribute name="endProgress" type="{http://www.w3.org/2001/SMIL20/}zeroToOneDecimalType" default="1.0" />
 *       &lt;attribute name="direction">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="forward"/>
 *             &lt;enumeration value="reverse"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="fadeColor" type="{http://www.w3.org/2001/XMLSchema}string" default="black" />
 *       &lt;attribute name="from" type="{http://www.w3.org/2001/SMIL20/}zeroToOneDecimalType" default="0.0" />
 *       &lt;attribute name="to" type="{http://www.w3.org/2001/SMIL20/}zeroToOneDecimalType" default="1.0" />
 *       &lt;attribute name="by" type="{http://www.w3.org/2001/SMIL20/}zeroToOneDecimalType" />
 *       &lt;attribute name="values" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="calcMode" default="linear">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="discrete"/>
 *             &lt;enumeration value="linear"/>
 *             &lt;enumeration value="paced"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transitionFilterPrototype")
@XmlSeeAlso({
    TransitionFilterType.class
})
public class TransitionFilterPrototype {

    @XmlAttribute(name = "targetElement")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object targetElement;
    @XmlAttribute(name = "href")
    @XmlSchemaType(name = "anyURI")
    protected String href;
    @XmlAttribute(name = "type", required = true)
    protected String type;
    @XmlAttribute(name = "subtype")
    protected String subtype;
    @XmlAttribute(name = "dur")
    protected String dur;
    @XmlAttribute(name = "startProgress")
    protected BigDecimal startProgress;
    @XmlAttribute(name = "endProgress")
    protected BigDecimal endProgress;
    @XmlAttribute(name = "direction")
    protected String direction;
    @XmlAttribute(name = "fadeColor")
    protected String fadeColor;
    @XmlAttribute(name = "from")
    protected BigDecimal from;
    @XmlAttribute(name = "to")
    protected BigDecimal to;
    @XmlAttribute(name = "by")
    protected BigDecimal by;
    @XmlAttribute(name = "values")
    protected String values;
    @XmlAttribute(name = "calcMode")
    protected String calcMode;

    /**
     * Gets the value of the targetElement property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTargetElement() {
        return targetElement;
    }

    /**
     * Sets the value of the targetElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTargetElement(Object value) {
        this.targetElement = value;
    }

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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the subtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubtype() {
        return subtype;
    }

    /**
     * Sets the value of the subtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubtype(String value) {
        this.subtype = value;
    }

    /**
     * Gets the value of the dur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDur() {
        return dur;
    }

    /**
     * Sets the value of the dur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDur(String value) {
        this.dur = value;
    }

    /**
     * Gets the value of the startProgress property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStartProgress() {
        if (startProgress == null) {
            return new BigDecimal("0.0");
        } else {
            return startProgress;
        }
    }

    /**
     * Sets the value of the startProgress property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStartProgress(BigDecimal value) {
        this.startProgress = value;
    }

    /**
     * Gets the value of the endProgress property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEndProgress() {
        if (endProgress == null) {
            return new BigDecimal("1.0");
        } else {
            return endProgress;
        }
    }

    /**
     * Sets the value of the endProgress property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEndProgress(BigDecimal value) {
        this.endProgress = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirection(String value) {
        this.direction = value;
    }

    /**
     * Gets the value of the fadeColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFadeColor() {
        if (fadeColor == null) {
            return "black";
        } else {
            return fadeColor;
        }
    }

    /**
     * Sets the value of the fadeColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFadeColor(String value) {
        this.fadeColor = value;
    }

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFrom() {
        if (from == null) {
            return new BigDecimal("0.0");
        } else {
            return from;
        }
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFrom(BigDecimal value) {
        this.from = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTo() {
        if (to == null) {
            return new BigDecimal("1.0");
        } else {
            return to;
        }
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTo(BigDecimal value) {
        this.to = value;
    }

    /**
     * Gets the value of the by property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBy() {
        return by;
    }

    /**
     * Sets the value of the by property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBy(BigDecimal value) {
        this.by = value;
    }

    /**
     * Gets the value of the values property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValues() {
        return values;
    }

    /**
     * Sets the value of the values property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValues(String value) {
        this.values = value;
    }

    /**
     * Gets the value of the calcMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalcMode() {
        if (calcMode == null) {
            return "linear";
        } else {
            return calcMode;
        }
    }

    /**
     * Sets the value of the calcMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalcMode(String value) {
        this.calcMode = value;
    }

}
