//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.21 at 12:15:07 PM CEST 
//


package org.w3._2001.smil20.language;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import nl.vpro.smil.OnOrOffType;
import nl.vpro.smil.OverdubOrSubtitleType;
import nl.vpro.smil.ParPrototype;


/**
 * <p>Java class for parType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="parType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.w3.org/2001/SMIL20/}parPrototype">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;group ref="{http://www.w3.org/2001/SMIL20/Language}scheduleGroup"/>
 *         &lt;group ref="{http://www.w3.org/2001/SMIL20/Language}mediaContentGroup"/>
 *         &lt;group ref="{http://www.w3.org/2001/SMIL20/Language}contentControlGroup"/>
 *         &lt;group ref="{http://www.w3.org/2001/SMIL20/Language}aElementGroup"/>
 *         &lt;group ref="{http://www.w3.org/2001/SMIL20/Language}animationGroup"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://www.w3.org/2001/SMIL20/}deprecatedSystemTestAttrs"/>
 *       &lt;attGroup ref="{http://www.w3.org/2001/SMIL20/}mediaAnnotateAttrs"/>
 *       &lt;attGroup ref="{http://www.w3.org/2001/SMIL20/}customTestAttrs"/>
 *       &lt;attGroup ref="{http://www.w3.org/2001/SMIL20/}regionAttrs"/>
 *       &lt;attGroup ref="{http://www.w3.org/2001/SMIL20/}systemTestAttrs"/>
 *       &lt;attGroup ref="{http://www.w3.org/2001/SMIL20/Language}CoreAttrs"/>
 *       &lt;attGroup ref="{http://www.w3.org/2001/SMIL20/}minMaxTimingAttrs"/>
 *       &lt;attGroup ref="{http://www.w3.org/2001/SMIL20/}deprecatedRepeatTiming"/>
 *       &lt;anyAttribute/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parType", propOrder = {
    "parOrSeqOrExcl"
})
public class ParType
    extends ParPrototype
{

    @XmlElementRefs({
        @XmlElementRef(name = "video", namespace = "http://www.w3.org/2001/SMIL20/Language", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "text", namespace = "http://www.w3.org/2001/SMIL20/Language", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "seq", namespace = "http://www.w3.org/2001/SMIL20/Language", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "textstream", namespace = "http://www.w3.org/2001/SMIL20/Language", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "animate", namespace = "http://www.w3.org/2001/SMIL20/Language", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "animation", namespace = "http://www.w3.org/2001/SMIL20/Language", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "prefetch", namespace = "http://www.w3.org/2001/SMIL20/Language", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "audio", namespace = "http://www.w3.org/2001/SMIL20/Language", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ref", namespace = "http://www.w3.org/2001/SMIL20/Language", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "animateColor", namespace = "http://www.w3.org/2001/SMIL20/Language", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "switch", namespace = "http://www.w3.org/2001/SMIL20/Language", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "a", namespace = "http://www.w3.org/2001/SMIL20/Language", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "animateMotion", namespace = "http://www.w3.org/2001/SMIL20/Language", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "brush", namespace = "http://www.w3.org/2001/SMIL20/Language", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "set", namespace = "http://www.w3.org/2001/SMIL20/Language", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "par", namespace = "http://www.w3.org/2001/SMIL20/Language", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "excl", namespace = "http://www.w3.org/2001/SMIL20/Language", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "img", namespace = "http://www.w3.org/2001/SMIL20/Language", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> parOrSeqOrExcl;
    @XmlAttribute(name = "abstract")
    protected String _abstract;
    @XmlAttribute(name = "author")
    protected String author;
    @XmlAttribute(name = "copyright")
    protected String copyright;
    @XmlAttribute(name = "title")
    protected String title;
    @XmlAttribute(name = "customTest")
    protected String customTest;
    @XmlAttribute(name = "region")
    protected String region;
    @XmlAttribute(name = "systemAudioDesc")
    protected OnOrOffType systemAudioDesc;
    @XmlAttribute(name = "systemBitrate")
    protected String systemBitrate;
    @XmlAttribute(name = "systemCaptions")
    protected OnOrOffType systemCaptions;
    @XmlAttribute(name = "systemComponent")
    protected String systemComponent;
    @XmlAttribute(name = "systemCPU")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String systemCPU;
    @XmlAttribute(name = "systemLanguage")
    protected String systemLanguage;
    @XmlAttribute(name = "systemOperatingSystem")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String systemOperatingSystem;
    @XmlAttribute(name = "systemOverdubOrSubtitle")
    protected OverdubOrSubtitleType systemOverdubOrSubtitle;
    @XmlAttribute(name = "systemRequired")
    protected String systemRequired;
    @XmlAttribute(name = "systemScreenDepth")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger systemScreenDepth;
    @XmlAttribute(name = "systemScreenSize")
    protected String systemScreenSize;
    @XmlAttribute(name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "class")
    protected String clazz;
    @XmlAttribute(name = "lang", namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String lang;
    @XmlAttribute(name = "alt")
    protected String alt;
    @XmlAttribute(name = "longdesc")
    @XmlSchemaType(name = "anyURI")
    protected String longdesc;
    @XmlAttribute(name = "min")
    protected String min;
    @XmlAttribute(name = "max")
    protected String max;
    @XmlAttribute(name = "repeat")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger repeat;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the parOrSeqOrExcl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parOrSeqOrExcl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParOrSeqOrExcl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link MediaType }{@code >}
     * {@link JAXBElement }{@code <}{@link MediaType }{@code >}
     * {@link JAXBElement }{@code <}{@link MediaType }{@code >}
     * {@link JAXBElement }{@code <}{@link MediaType }{@code >}
     * {@link JAXBElement }{@code <}{@link MediaType }{@code >}
     * {@link JAXBElement }{@code <}{@link PrefetchType }{@code >}
     * {@link JAXBElement }{@code <}{@link PrefetchType }{@code >}
     * {@link JAXBElement }{@code <}{@link MediaType }{@code >}
     * {@link JAXBElement }{@code <}{@link AnimateColorType }{@code >}
     * {@link JAXBElement }{@code <}{@link MediaType }{@code >}
     * {@link JAXBElement }{@code <}{@link MediaType }{@code >}
     * {@link JAXBElement }{@code <}{@link MediaType }{@code >}
     * {@link JAXBElement }{@code <}{@link AType }{@code >}
     * {@link JAXBElement }{@code <}{@link BrushType }{@code >}
     * {@link JAXBElement }{@code <}{@link SeqType }{@code >}
     * {@link JAXBElement }{@code <}{@link AnimateMotionType }{@code >}
     * {@link JAXBElement }{@code <}{@link ParType }{@code >}
     * {@link JAXBElement }{@code <}{@link MediaType }{@code >}
     * {@link JAXBElement }{@code <}{@link PrefetchType }{@code >}
     * {@link JAXBElement }{@code <}{@link ExclType }{@code >}
     * {@link JAXBElement }{@code <}{@link MediaType }{@code >}
     * {@link JAXBElement }{@code <}{@link MediaType }{@code >}
     * {@link JAXBElement }{@code <}{@link ParType }{@code >}
     * {@link JAXBElement }{@code <}{@link MediaType }{@code >}
     * {@link JAXBElement }{@code <}{@link MediaType }{@code >}
     * {@link JAXBElement }{@code <}{@link ExclType }{@code >}
     * {@link JAXBElement }{@code <}{@link MediaType }{@code >}
     * {@link JAXBElement }{@code <}{@link AnimateType }{@code >}
     * {@link JAXBElement }{@code <}{@link AnimateType }{@code >}
     * {@link JAXBElement }{@code <}{@link SwitchType }{@code >}
     * {@link JAXBElement }{@code <}{@link AType }{@code >}
     * {@link JAXBElement }{@code <}{@link ParType }{@code >}
     * {@link JAXBElement }{@code <}{@link MediaType }{@code >}
     * {@link JAXBElement }{@code <}{@link MediaType }{@code >}
     * {@link JAXBElement }{@code <}{@link MediaType }{@code >}
     * {@link JAXBElement }{@code <}{@link SetType }{@code >}
     * {@link JAXBElement }{@code <}{@link MediaType }{@code >}
     * {@link JAXBElement }{@code <}{@link SwitchType }{@code >}
     * {@link JAXBElement }{@code <}{@link SwitchType }{@code >}
     * {@link JAXBElement }{@code <}{@link BrushType }{@code >}
     * {@link JAXBElement }{@code <}{@link MediaType }{@code >}
     * {@link JAXBElement }{@code <}{@link MediaType }{@code >}
     * {@link JAXBElement }{@code <}{@link MediaType }{@code >}
     * {@link JAXBElement }{@code <}{@link SeqType }{@code >}
     * {@link JAXBElement }{@code <}{@link AnimateType }{@code >}
     * {@link JAXBElement }{@code <}{@link MediaType }{@code >}
     * {@link JAXBElement }{@code <}{@link MediaType }{@code >}
     * {@link JAXBElement }{@code <}{@link AnimateColorType }{@code >}
     * {@link JAXBElement }{@code <}{@link AnimateColorType }{@code >}
     * {@link JAXBElement }{@code <}{@link AnimateColorType }{@code >}
     * {@link JAXBElement }{@code <}{@link SetType }{@code >}
     * {@link JAXBElement }{@code <}{@link ParType }{@code >}
     * {@link JAXBElement }{@code <}{@link SwitchType }{@code >}
     * {@link JAXBElement }{@code <}{@link AnimateMotionType }{@code >}
     * {@link JAXBElement }{@code <}{@link AnimateMotionType }{@code >}
     * {@link JAXBElement }{@code <}{@link MediaType }{@code >}
     * {@link JAXBElement }{@code <}{@link MediaType }{@code >}
     * {@link JAXBElement }{@code <}{@link SeqType }{@code >}
     * {@link JAXBElement }{@code <}{@link AnimateMotionType }{@code >}
     * {@link JAXBElement }{@code <}{@link MediaType }{@code >}
     * {@link JAXBElement }{@code <}{@link BrushType }{@code >}
     * {@link JAXBElement }{@code <}{@link MediaType }{@code >}
     * {@link JAXBElement }{@code <}{@link MediaType }{@code >}
     * {@link JAXBElement }{@code <}{@link MediaType }{@code >}
     * {@link JAXBElement }{@code <}{@link MediaType }{@code >}
     * {@link JAXBElement }{@code <}{@link SeqType }{@code >}
     * {@link JAXBElement }{@code <}{@link MediaType }{@code >}
     * {@link JAXBElement }{@code <}{@link AType }{@code >}
     * {@link JAXBElement }{@code <}{@link SeqType }{@code >}
     * {@link JAXBElement }{@code <}{@link AnimateType }{@code >}
     * {@link JAXBElement }{@code <}{@link SwitchType }{@code >}
     * {@link JAXBElement }{@code <}{@link MediaType }{@code >}
     * {@link JAXBElement }{@code <}{@link MediaType }{@code >}
     * {@link JAXBElement }{@code <}{@link AType }{@code >}
     * {@link JAXBElement }{@code <}{@link MediaType }{@code >}
     * {@link JAXBElement }{@code <}{@link SetType }{@code >}
     * {@link JAXBElement }{@code <}{@link ParType }{@code >}
     * {@link JAXBElement }{@code <}{@link ExclType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getParOrSeqOrExcl() {
        if (parOrSeqOrExcl == null) {
            parOrSeqOrExcl = new ArrayList<JAXBElement<?>>();
        }
        return this.parOrSeqOrExcl;
    }

    /**
     * Gets the value of the abstract property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbstract() {
        return _abstract;
    }

    /**
     * Sets the value of the abstract property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbstract(String value) {
        this._abstract = value;
    }

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthor(String value) {
        this.author = value;
    }

    /**
     * Gets the value of the copyright property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyright() {
        return copyright;
    }

    /**
     * Sets the value of the copyright property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyright(String value) {
        this.copyright = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the customTest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomTest() {
        return customTest;
    }

    /**
     * Sets the value of the customTest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomTest(String value) {
        this.customTest = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegion(String value) {
        this.region = value;
    }

    /**
     * Gets the value of the systemAudioDesc property.
     * 
     * @return
     *     possible object is
     *     {@link OnOrOffType }
     *     
     */
    public OnOrOffType getSystemAudioDesc() {
        return systemAudioDesc;
    }

    /**
     * Sets the value of the systemAudioDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnOrOffType }
     *     
     */
    public void setSystemAudioDesc(OnOrOffType value) {
        this.systemAudioDesc = value;
    }

    /**
     * Gets the value of the systemBitrate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemBitrate() {
        return systemBitrate;
    }

    /**
     * Sets the value of the systemBitrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemBitrate(String value) {
        this.systemBitrate = value;
    }

    /**
     * Gets the value of the systemCaptions property.
     * 
     * @return
     *     possible object is
     *     {@link OnOrOffType }
     *     
     */
    public OnOrOffType getSystemCaptions() {
        return systemCaptions;
    }

    /**
     * Sets the value of the systemCaptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnOrOffType }
     *     
     */
    public void setSystemCaptions(OnOrOffType value) {
        this.systemCaptions = value;
    }

    /**
     * Gets the value of the systemComponent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemComponent() {
        return systemComponent;
    }

    /**
     * Sets the value of the systemComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemComponent(String value) {
        this.systemComponent = value;
    }

    /**
     * Gets the value of the systemCPU property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemCPU() {
        return systemCPU;
    }

    /**
     * Sets the value of the systemCPU property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemCPU(String value) {
        this.systemCPU = value;
    }

    /**
     * Gets the value of the systemLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemLanguage() {
        return systemLanguage;
    }

    /**
     * Sets the value of the systemLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemLanguage(String value) {
        this.systemLanguage = value;
    }

    /**
     * Gets the value of the systemOperatingSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemOperatingSystem() {
        return systemOperatingSystem;
    }

    /**
     * Sets the value of the systemOperatingSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemOperatingSystem(String value) {
        this.systemOperatingSystem = value;
    }

    /**
     * Gets the value of the systemOverdubOrSubtitle property.
     * 
     * @return
     *     possible object is
     *     {@link OverdubOrSubtitleType }
     *     
     */
    public OverdubOrSubtitleType getSystemOverdubOrSubtitle() {
        return systemOverdubOrSubtitle;
    }

    /**
     * Sets the value of the systemOverdubOrSubtitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link OverdubOrSubtitleType }
     *     
     */
    public void setSystemOverdubOrSubtitle(OverdubOrSubtitleType value) {
        this.systemOverdubOrSubtitle = value;
    }

    /**
     * Gets the value of the systemRequired property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemRequired() {
        return systemRequired;
    }

    /**
     * Sets the value of the systemRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemRequired(String value) {
        this.systemRequired = value;
    }

    /**
     * Gets the value of the systemScreenDepth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSystemScreenDepth() {
        return systemScreenDepth;
    }

    /**
     * Sets the value of the systemScreenDepth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSystemScreenDepth(BigInteger value) {
        this.systemScreenDepth = value;
    }

    /**
     * Gets the value of the systemScreenSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemScreenSize() {
        return systemScreenSize;
    }

    /**
     * Sets the value of the systemScreenSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemScreenSize(String value) {
        this.systemScreenSize = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the alt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlt() {
        return alt;
    }

    /**
     * Sets the value of the alt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlt(String value) {
        this.alt = value;
    }

    /**
     * Gets the value of the longdesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongdesc() {
        return longdesc;
    }

    /**
     * Sets the value of the longdesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongdesc(String value) {
        this.longdesc = value;
    }

    /**
     * Gets the value of the min property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMin() {
        return min;
    }

    /**
     * Sets the value of the min property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMin(String value) {
        this.min = value;
    }

    /**
     * Gets the value of the max property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMax() {
        return max;
    }

    /**
     * Sets the value of the max property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMax(String value) {
        this.max = value;
    }

    /**
     * Gets the value of the repeat property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRepeat() {
        return repeat;
    }

    /**
     * Sets the value of the repeat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRepeat(BigInteger value) {
        this.repeat = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
