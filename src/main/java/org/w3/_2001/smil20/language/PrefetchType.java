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
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import nl.vpro.smil.FillDefaultType;
import nl.vpro.smil.FillTimingAttrsType;
import nl.vpro.smil.OnOrOffType;
import nl.vpro.smil.OverdubOrSubtitleType;
import nl.vpro.smil.PrefetchPrototype;
import nl.vpro.smil.RestartDefaultType;
import nl.vpro.smil.RestartTimingType;
import nl.vpro.smil.SyncBehaviorDefaultType;
import nl.vpro.smil.SyncBehaviorType;
import org.w3c.dom.Element;


/**
 * <p>Java class for prefetchType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="prefetchType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.w3.org/2001/SMIL20/}prefetchPrototype">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;any processContents='lax' namespace='##other'/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://www.w3.org/2001/SMIL20/}systemTestAttrs"/>
 *       &lt;attGroup ref="{http://www.w3.org/2001/SMIL20/}deprecatedMediaClippingAttrs"/>
 *       &lt;attGroup ref="{http://www.w3.org/2001/SMIL20/Language}TimingAttrs"/>
 *       &lt;attGroup ref="{http://www.w3.org/2001/SMIL20/}skipContentAttrs"/>
 *       &lt;attGroup ref="{http://www.w3.org/2001/SMIL20/Language}CoreAttrs"/>
 *       &lt;attGroup ref="{http://www.w3.org/2001/SMIL20/}deprecatedSystemTestAttrs"/>
 *       &lt;attGroup ref="{http://www.w3.org/2001/SMIL20/}customTestAttrs"/>
 *       &lt;attGroup ref="{http://www.w3.org/2001/SMIL20/}mediaClippingAttrs"/>
 *       &lt;anyAttribute/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "prefetchType", propOrder = {
    "any"
})
public class PrefetchType
    extends PrefetchPrototype
{

    @XmlAnyElement(lax = true)
    protected List<Object> any;
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
    @XmlAttribute(name = "skip-content")
    protected Boolean skipContent;
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
    @XmlAttribute(name = "customTest")
    protected String customTest;
    @XmlAttribute(name = "clipBegin")
    protected String clipBegin;
    @XmlAttribute(name = "clipEnd")
    protected String clipEnd;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Element }
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
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
     * Gets the value of the skipContent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSkipContent() {
        if (skipContent == null) {
            return true;
        } else {
            return skipContent;
        }
    }

    /**
     * Sets the value of the skipContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSkipContent(Boolean value) {
        this.skipContent = value;
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
     * Gets the value of the clipBegin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClipBegin() {
        return clipBegin;
    }

    /**
     * Sets the value of the clipBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClipBegin(String value) {
        this.clipBegin = value;
    }

    /**
     * Gets the value of the clipEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClipEnd() {
        return clipEnd;
    }

    /**
     * Sets the value of the clipEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClipEnd(String value) {
        this.clipEnd = value;
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
