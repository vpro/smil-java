//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.21 at 12:15:07 PM CEST 
//


package nl.vpro.smil;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.w3._2001.smil20.language.RegionType;


/**
 * <p>Java class for regionPrototype complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="regionPrototype">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="backgroundColor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bottom" type="{http://www.w3.org/2001/XMLSchema}string" default="auto" />
 *       &lt;attribute name="fit" type="{http://www.w3.org/2001/SMIL20/}fitAttributeType" default="hidden" />
 *       &lt;attribute name="height" type="{http://www.w3.org/2001/XMLSchema}string" default="auto" />
 *       &lt;attribute name="left" type="{http://www.w3.org/2001/XMLSchema}string" default="auto" />
 *       &lt;attribute name="regionName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="right" type="{http://www.w3.org/2001/XMLSchema}string" default="auto" />
 *       &lt;attribute name="showBackground" default="always">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="always"/>
 *             &lt;enumeration value="whenActive"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="top" type="{http://www.w3.org/2001/XMLSchema}string" default="auto" />
 *       &lt;attribute name="width" type="{http://www.w3.org/2001/XMLSchema}string" default="auto" />
 *       &lt;attribute name="z-index" type="{http://www.w3.org/2001/SMIL20/}zIndexValueType" default="auto" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "regionPrototype")
@XmlSeeAlso({
    RegionType.class
})
public class RegionPrototype {

    @XmlAttribute(name = "backgroundColor")
    protected String backgroundColor;
    @XmlAttribute(name = "bottom")
    protected String bottom;
    @XmlAttribute(name = "fit")
    protected FitAttributeType fit;
    @XmlAttribute(name = "height")
    protected String height;
    @XmlAttribute(name = "left")
    protected String left;
    @XmlAttribute(name = "regionName")
    protected String regionName;
    @XmlAttribute(name = "right")
    protected String right;
    @XmlAttribute(name = "showBackground")
    protected String showBackground;
    @XmlAttribute(name = "top")
    protected String top;
    @XmlAttribute(name = "width")
    protected String width;
    @XmlAttribute(name = "z-index")
    protected String zIndex;

    /**
     * Gets the value of the backgroundColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * Sets the value of the backgroundColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackgroundColor(String value) {
        this.backgroundColor = value;
    }

    /**
     * Gets the value of the bottom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBottom() {
        if (bottom == null) {
            return "auto";
        } else {
            return bottom;
        }
    }

    /**
     * Sets the value of the bottom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBottom(String value) {
        this.bottom = value;
    }

    /**
     * Gets the value of the fit property.
     * 
     * @return
     *     possible object is
     *     {@link FitAttributeType }
     *     
     */
    public FitAttributeType getFit() {
        if (fit == null) {
            return FitAttributeType.HIDDEN;
        } else {
            return fit;
        }
    }

    /**
     * Sets the value of the fit property.
     * 
     * @param value
     *     allowed object is
     *     {@link FitAttributeType }
     *     
     */
    public void setFit(FitAttributeType value) {
        this.fit = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeight() {
        if (height == null) {
            return "auto";
        } else {
            return height;
        }
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeight(String value) {
        this.height = value;
    }

    /**
     * Gets the value of the left property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeft() {
        if (left == null) {
            return "auto";
        } else {
            return left;
        }
    }

    /**
     * Sets the value of the left property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeft(String value) {
        this.left = value;
    }

    /**
     * Gets the value of the regionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionName() {
        return regionName;
    }

    /**
     * Sets the value of the regionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionName(String value) {
        this.regionName = value;
    }

    /**
     * Gets the value of the right property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRight() {
        if (right == null) {
            return "auto";
        } else {
            return right;
        }
    }

    /**
     * Sets the value of the right property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRight(String value) {
        this.right = value;
    }

    /**
     * Gets the value of the showBackground property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShowBackground() {
        if (showBackground == null) {
            return "always";
        } else {
            return showBackground;
        }
    }

    /**
     * Sets the value of the showBackground property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShowBackground(String value) {
        this.showBackground = value;
    }

    /**
     * Gets the value of the top property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTop() {
        if (top == null) {
            return "auto";
        } else {
            return top;
        }
    }

    /**
     * Sets the value of the top property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTop(String value) {
        this.top = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWidth() {
        if (width == null) {
            return "auto";
        } else {
            return width;
        }
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWidth(String value) {
        this.width = value;
    }

    /**
     * Gets the value of the zIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZIndex() {
        if (zIndex == null) {
            return "auto";
        } else {
            return zIndex;
        }
    }

    /**
     * Sets the value of the zIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZIndex(String value) {
        this.zIndex = value;
    }

}
