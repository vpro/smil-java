//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.21 at 12:15:07 PM CEST 
//


package org.w3._2001.smil20.language;

import java.math.BigDecimal;
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
import nl.vpro.smil.BodyPrototype;
import nl.vpro.smil.FillDefaultType;
import nl.vpro.smil.FillTimingAttrsType;
import nl.vpro.smil.RestartDefaultType;
import nl.vpro.smil.RestartTimingType;
import nl.vpro.smil.SyncBehaviorDefaultType;
import nl.vpro.smil.SyncBehaviorType;


/**
 * <p>Java class for bodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bodyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.w3.org/2001/SMIL20/}bodyPrototype">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;group ref="{http://www.w3.org/2001/SMIL20/Language}scheduleGroup"/>
 *         &lt;group ref="{http://www.w3.org/2001/SMIL20/Language}mediaContentGroup"/>
 *         &lt;group ref="{http://www.w3.org/2001/SMIL20/Language}contentControlGroup"/>
 *         &lt;group ref="{http://www.w3.org/2001/SMIL20/Language}aElementGroup"/>
 *         &lt;group ref="{http://www.w3.org/2001/SMIL20/Language}animationGroup"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://www.w3.org/2001/SMIL20/Language}CoreAttrs"/>
 *       &lt;attGroup ref="{http://www.w3.org/2001/SMIL20/}regionAttrs"/>
 *       &lt;attGroup ref="{http://www.w3.org/2001/SMIL20/}endsyncTimingAttrs"/>
 *       &lt;attGroup ref="{http://www.w3.org/2001/SMIL20/Language}TimingAttrs"/>
 *       &lt;attGroup ref="{http://www.w3.org/2001/SMIL20/}mediaAnnotateAttrs"/>
 *       &lt;anyAttribute/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bodyType", propOrder = {
    "parOrSeqOrExcl"
})
public class BodyType
    extends BodyPrototype
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
    @XmlAttribute(name = "region")
    protected String region;
    @XmlAttribute(name = "endsync")
    protected String endsync;
    @XmlAttribute(name = "syncBehavior")
    protected SyncBehaviorType syncBehavior;
    @XmlAttribute(name = "syncTolerance")
    protected String syncTolerance;
    @XmlAttribute(name = "fillDefault")
    protected FillDefaultType fillDefault;
    @XmlAttribute(name = "restartDefault")
    protected RestartDefaultType restartDefault;
    @XmlAttribute(name = "syncBehaviorDefault")
    protected SyncBehaviorDefaultType syncBehaviorDefault;
    @XmlAttribute(name = "syncToleranceDefault")
    protected String syncToleranceDefault;
    @XmlAttribute(name = "fill")
    protected FillTimingAttrsType fill;
    @XmlAttribute(name = "repeat")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger repeat;
    @XmlAttribute(name = "repeatDur")
    protected String repeatDur;
    @XmlAttribute(name = "repeatCount")
    protected BigDecimal repeatCount;
    @XmlAttribute(name = "min")
    protected String min;
    @XmlAttribute(name = "max")
    protected String max;
    @XmlAttribute(name = "begin")
    protected String begin;
    @XmlAttribute(name = "end")
    protected String end;
    @XmlAttribute(name = "dur")
    protected String dur;
    @XmlAttribute(name = "restart")
    protected RestartTimingType restart;
    @XmlAttribute(name = "abstract")
    protected String _abstract;
    @XmlAttribute(name = "author")
    protected String author;
    @XmlAttribute(name = "copyright")
    protected String copyright;
    @XmlAttribute(name = "title")
    protected String title;
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
     * Gets the value of the endsync property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndsync() {
        return endsync;
    }

    /**
     * Sets the value of the endsync property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndsync(String value) {
        this.endsync = value;
    }

    /**
     * Gets the value of the syncBehavior property.
     * 
     * @return
     *     possible object is
     *     {@link SyncBehaviorType }
     *     
     */
    public SyncBehaviorType getSyncBehavior() {
        if (syncBehavior == null) {
            return SyncBehaviorType.DEFAULT;
        } else {
            return syncBehavior;
        }
    }

    /**
     * Sets the value of the syncBehavior property.
     * 
     * @param value
     *     allowed object is
     *     {@link SyncBehaviorType }
     *     
     */
    public void setSyncBehavior(SyncBehaviorType value) {
        this.syncBehavior = value;
    }

    /**
     * Gets the value of the syncTolerance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSyncTolerance() {
        return syncTolerance;
    }

    /**
     * Sets the value of the syncTolerance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSyncTolerance(String value) {
        this.syncTolerance = value;
    }

    /**
     * Gets the value of the fillDefault property.
     * 
     * @return
     *     possible object is
     *     {@link FillDefaultType }
     *     
     */
    public FillDefaultType getFillDefault() {
        if (fillDefault == null) {
            return FillDefaultType.INHERIT;
        } else {
            return fillDefault;
        }
    }

    /**
     * Sets the value of the fillDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link FillDefaultType }
     *     
     */
    public void setFillDefault(FillDefaultType value) {
        this.fillDefault = value;
    }

    /**
     * Gets the value of the restartDefault property.
     * 
     * @return
     *     possible object is
     *     {@link RestartDefaultType }
     *     
     */
    public RestartDefaultType getRestartDefault() {
        if (restartDefault == null) {
            return RestartDefaultType.INHERIT;
        } else {
            return restartDefault;
        }
    }

    /**
     * Sets the value of the restartDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestartDefaultType }
     *     
     */
    public void setRestartDefault(RestartDefaultType value) {
        this.restartDefault = value;
    }

    /**
     * Gets the value of the syncBehaviorDefault property.
     * 
     * @return
     *     possible object is
     *     {@link SyncBehaviorDefaultType }
     *     
     */
    public SyncBehaviorDefaultType getSyncBehaviorDefault() {
        if (syncBehaviorDefault == null) {
            return SyncBehaviorDefaultType.INHERIT;
        } else {
            return syncBehaviorDefault;
        }
    }

    /**
     * Sets the value of the syncBehaviorDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link SyncBehaviorDefaultType }
     *     
     */
    public void setSyncBehaviorDefault(SyncBehaviorDefaultType value) {
        this.syncBehaviorDefault = value;
    }

    /**
     * Gets the value of the syncToleranceDefault property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSyncToleranceDefault() {
        if (syncToleranceDefault == null) {
            return "inherit";
        } else {
            return syncToleranceDefault;
        }
    }

    /**
     * Sets the value of the syncToleranceDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSyncToleranceDefault(String value) {
        this.syncToleranceDefault = value;
    }

    /**
     * Gets the value of the fill property.
     * 
     * @return
     *     possible object is
     *     {@link FillTimingAttrsType }
     *     
     */
    public FillTimingAttrsType getFill() {
        if (fill == null) {
            return FillTimingAttrsType.DEFAULT;
        } else {
            return fill;
        }
    }

    /**
     * Sets the value of the fill property.
     * 
     * @param value
     *     allowed object is
     *     {@link FillTimingAttrsType }
     *     
     */
    public void setFill(FillTimingAttrsType value) {
        this.fill = value;
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
     * Gets the value of the repeatDur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepeatDur() {
        return repeatDur;
    }

    /**
     * Sets the value of the repeatDur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepeatDur(String value) {
        this.repeatDur = value;
    }

    /**
     * Gets the value of the repeatCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRepeatCount() {
        return repeatCount;
    }

    /**
     * Sets the value of the repeatCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRepeatCount(BigDecimal value) {
        this.repeatCount = value;
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
     * Gets the value of the begin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBegin() {
        return begin;
    }

    /**
     * Sets the value of the begin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBegin(String value) {
        this.begin = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnd(String value) {
        this.end = value;
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
     * Gets the value of the restart property.
     * 
     * @return
     *     possible object is
     *     {@link RestartTimingType }
     *     
     */
    public RestartTimingType getRestart() {
        if (restart == null) {
            return RestartTimingType.DEFAULT;
        } else {
            return restart;
        }
    }

    /**
     * Sets the value of the restart property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestartTimingType }
     *     
     */
    public void setRestart(RestartTimingType value) {
        this.restart = value;
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
