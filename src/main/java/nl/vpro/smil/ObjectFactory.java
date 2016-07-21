//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.21 at 12:15:07 PM CEST 
//


package nl.vpro.smil;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.w3._2001.smil20.language.AType;
import org.w3._2001.smil20.language.AnchorType;
import org.w3._2001.smil20.language.AreaType;
import org.w3._2001.smil20.language.BodyType;
import org.w3._2001.smil20.language.BrushType;
import org.w3._2001.smil20.language.CustomAttributesType;
import org.w3._2001.smil20.language.CustomTestType;
import org.w3._2001.smil20.language.ExclType;
import org.w3._2001.smil20.language.HeadType;
import org.w3._2001.smil20.language.LayoutType;
import org.w3._2001.smil20.language.MediaType;
import org.w3._2001.smil20.language.MetaType;
import org.w3._2001.smil20.language.MetadataType;
import org.w3._2001.smil20.language.ParType;
import org.w3._2001.smil20.language.ParamType;
import org.w3._2001.smil20.language.PrefetchType;
import org.w3._2001.smil20.language.PriorityClassType;
import org.w3._2001.smil20.language.RegPointType;
import org.w3._2001.smil20.language.RegionType;
import org.w3._2001.smil20.language.RootLayoutType;
import org.w3._2001.smil20.language.SeqType;
import org.w3._2001.smil20.language.SetType;
import org.w3._2001.smil20.language.SmilType;
import org.w3._2001.smil20.language.SwitchType;
import org.w3._2001.smil20.language.TopLayoutType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the nl.vpro.smil package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Animation_QNAME = new QName("http://www.w3.org/2001/SMIL20/", "animation");
    private final static QName _RegPoint_QNAME = new QName("http://www.w3.org/2001/SMIL20/", "regPoint");
    private final static QName _TransitionFilter_QNAME = new QName("http://www.w3.org/2001/SMIL20/", "transitionFilter");
    private final static QName _Meta_QNAME = new QName("http://www.w3.org/2001/SMIL20/", "meta");
    private final static QName _Animate_QNAME = new QName("http://www.w3.org/2001/SMIL20/", "animate");
    private final static QName _Metadata_QNAME = new QName("http://www.w3.org/2001/SMIL20/", "metadata");
    private final static QName _CustomTest_QNAME = new QName("http://www.w3.org/2001/SMIL20/", "customTest");
    private final static QName _Text_QNAME = new QName("http://www.w3.org/2001/SMIL20/", "text");
    private final static QName _Textstream_QNAME = new QName("http://www.w3.org/2001/SMIL20/", "textstream");
    private final static QName _Transition_QNAME = new QName("http://www.w3.org/2001/SMIL20/", "transition");
    private final static QName _AnimateMotion_QNAME = new QName("http://www.w3.org/2001/SMIL20/", "animateMotion");
    private final static QName _Set_QNAME = new QName("http://www.w3.org/2001/SMIL20/", "set");
    private final static QName _A_QNAME = new QName("http://www.w3.org/2001/SMIL20/", "a");
    private final static QName _Anchor_QNAME = new QName("http://www.w3.org/2001/SMIL20/", "anchor");
    private final static QName _Excl_QNAME = new QName("http://www.w3.org/2001/SMIL20/", "excl");
    private final static QName _TopLayout_QNAME = new QName("http://www.w3.org/2001/SMIL20/", "topLayout");
    private final static QName _Seq_QNAME = new QName("http://www.w3.org/2001/SMIL20/", "seq");
    private final static QName _Audio_QNAME = new QName("http://www.w3.org/2001/SMIL20/", "audio");
    private final static QName _PriorityClass_QNAME = new QName("http://www.w3.org/2001/SMIL20/", "priorityClass");
    private final static QName _Brush_QNAME = new QName("http://www.w3.org/2001/SMIL20/", "brush");
    private final static QName _Area_QNAME = new QName("http://www.w3.org/2001/SMIL20/", "area");
    private final static QName _Par_QNAME = new QName("http://www.w3.org/2001/SMIL20/", "par");
    private final static QName _CustomAttributes_QNAME = new QName("http://www.w3.org/2001/SMIL20/", "customAttributes");
    private final static QName _Region_QNAME = new QName("http://www.w3.org/2001/SMIL20/", "region");
    private final static QName _AnimateColor_QNAME = new QName("http://www.w3.org/2001/SMIL20/", "animateColor");
    private final static QName _Body_QNAME = new QName("http://www.w3.org/2001/SMIL20/", "body");
    private final static QName _Ref_QNAME = new QName("http://www.w3.org/2001/SMIL20/", "ref");
    private final static QName _Layout_QNAME = new QName("http://www.w3.org/2001/SMIL20/", "layout");
    private final static QName _Switch_QNAME = new QName("http://www.w3.org/2001/SMIL20/", "switch");
    private final static QName _Video_QNAME = new QName("http://www.w3.org/2001/SMIL20/", "video");
    private final static QName _Smil_QNAME = new QName("http://www.w3.org/2001/SMIL20/", "smil");
    private final static QName _Prefetch_QNAME = new QName("http://www.w3.org/2001/SMIL20/", "prefetch");
    private final static QName _RootLayout_QNAME = new QName("http://www.w3.org/2001/SMIL20/", "root-layout");
    private final static QName _Img_QNAME = new QName("http://www.w3.org/2001/SMIL20/", "img");
    private final static QName _Param_QNAME = new QName("http://www.w3.org/2001/SMIL20/", "param");
    private final static QName _Head_QNAME = new QName("http://www.w3.org/2001/SMIL20/", "head");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: nl.vpro.smil
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TransitionType }
     * 
     */
    public TransitionType createTransitionType() {
        return new TransitionType();
    }

    /**
     * Create an instance of {@link TransitionFilterType }
     * 
     */
    public TransitionFilterType createTransitionFilterType() {
        return new TransitionFilterType();
    }

    /**
     * Create an instance of {@link ExclPrototype }
     * 
     */
    public ExclPrototype createExclPrototype() {
        return new ExclPrototype();
    }

    /**
     * Create an instance of {@link LayoutPrototype }
     * 
     */
    public LayoutPrototype createLayoutPrototype() {
        return new LayoutPrototype();
    }

    /**
     * Create an instance of {@link PrefetchPrototype }
     * 
     */
    public PrefetchPrototype createPrefetchPrototype() {
        return new PrefetchPrototype();
    }

    /**
     * Create an instance of {@link AreaPrototype }
     * 
     */
    public AreaPrototype createAreaPrototype() {
        return new AreaPrototype();
    }

    /**
     * Create an instance of {@link MetaPrototype }
     * 
     */
    public MetaPrototype createMetaPrototype() {
        return new MetaPrototype();
    }

    /**
     * Create an instance of {@link AnimateMotionPrototype }
     * 
     */
    public AnimateMotionPrototype createAnimateMotionPrototype() {
        return new AnimateMotionPrototype();
    }

    /**
     * Create an instance of {@link SwitchPrototype }
     * 
     */
    public SwitchPrototype createSwitchPrototype() {
        return new SwitchPrototype();
    }

    /**
     * Create an instance of {@link PriorityClassPrototype }
     * 
     */
    public PriorityClassPrototype createPriorityClassPrototype() {
        return new PriorityClassPrototype();
    }

    /**
     * Create an instance of {@link SmilPrototype }
     * 
     */
    public SmilPrototype createSmilPrototype() {
        return new SmilPrototype();
    }

    /**
     * Create an instance of {@link AnimateColorPrototype }
     * 
     */
    public AnimateColorPrototype createAnimateColorPrototype() {
        return new AnimateColorPrototype();
    }

    /**
     * Create an instance of {@link nl.vpro.smil.AnimateType }
     * 
     */
    public nl.vpro.smil.AnimateType createAnimateType() {
        return new nl.vpro.smil.AnimateType();
    }

    /**
     * Create an instance of {@link SeqPrototype }
     * 
     */
    public SeqPrototype createSeqPrototype() {
        return new SeqPrototype();
    }

    /**
     * Create an instance of {@link AnimatePrototype }
     * 
     */
    public AnimatePrototype createAnimatePrototype() {
        return new AnimatePrototype();
    }

    /**
     * Create an instance of {@link MetadataPrototype }
     * 
     */
    public MetadataPrototype createMetadataPrototype() {
        return new MetadataPrototype();
    }

    /**
     * Create an instance of {@link TransitionPrototype }
     * 
     */
    public TransitionPrototype createTransitionPrototype() {
        return new TransitionPrototype();
    }

    /**
     * Create an instance of {@link RootLayoutPrototype }
     * 
     */
    public RootLayoutPrototype createRootLayoutPrototype() {
        return new RootLayoutPrototype();
    }

    /**
     * Create an instance of {@link TopLayoutPrototype }
     * 
     */
    public TopLayoutPrototype createTopLayoutPrototype() {
        return new TopLayoutPrototype();
    }

    /**
     * Create an instance of {@link HeadPrototype }
     * 
     */
    public HeadPrototype createHeadPrototype() {
        return new HeadPrototype();
    }

    /**
     * Create an instance of {@link BrushPrototype }
     * 
     */
    public BrushPrototype createBrushPrototype() {
        return new BrushPrototype();
    }

    /**
     * Create an instance of {@link RegionPrototype }
     * 
     */
    public RegionPrototype createRegionPrototype() {
        return new RegionPrototype();
    }

    /**
     * Create an instance of {@link TransitionFilterPrototype }
     * 
     */
    public TransitionFilterPrototype createTransitionFilterPrototype() {
        return new TransitionFilterPrototype();
    }

    /**
     * Create an instance of {@link CustomAttributesPrototype }
     * 
     */
    public CustomAttributesPrototype createCustomAttributesPrototype() {
        return new CustomAttributesPrototype();
    }

    /**
     * Create an instance of {@link APrototype }
     * 
     */
    public APrototype createAPrototype() {
        return new APrototype();
    }

    /**
     * Create an instance of {@link ParPrototype }
     * 
     */
    public ParPrototype createParPrototype() {
        return new ParPrototype();
    }

    /**
     * Create an instance of {@link BodyPrototype }
     * 
     */
    public BodyPrototype createBodyPrototype() {
        return new BodyPrototype();
    }

    /**
     * Create an instance of {@link CustomTestPrototype }
     * 
     */
    public CustomTestPrototype createCustomTestPrototype() {
        return new CustomTestPrototype();
    }

    /**
     * Create an instance of {@link nl.vpro.smil.AnimateMotionType }
     * 
     */
    public nl.vpro.smil.AnimateMotionType createAnimateMotionType() {
        return new nl.vpro.smil.AnimateMotionType();
    }

    /**
     * Create an instance of {@link nl.vpro.smil.AnimateColorType }
     * 
     */
    public nl.vpro.smil.AnimateColorType createAnimateColorType() {
        return new nl.vpro.smil.AnimateColorType();
    }

    /**
     * Create an instance of {@link ParamPrototype }
     * 
     */
    public ParamPrototype createParamPrototype() {
        return new ParamPrototype();
    }

    /**
     * Create an instance of {@link RegPointPrototype }
     * 
     */
    public RegPointPrototype createRegPointPrototype() {
        return new RegPointPrototype();
    }

    /**
     * Create an instance of {@link SetPrototype }
     * 
     */
    public SetPrototype createSetPrototype() {
        return new SetPrototype();
    }

    /**
     * Create an instance of {@link MediaPrototype }
     * 
     */
    public MediaPrototype createMediaPrototype() {
        return new MediaPrototype();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/SMIL20/", name = "animation", substitutionHeadNamespace = "http://www.w3.org/2001/SMIL20/Language", substitutionHeadName = "animation")
    public JAXBElement<MediaType> createAnimation(MediaType value) {
        return new JAXBElement<MediaType>(_Animation_QNAME, MediaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegPointType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/SMIL20/", name = "regPoint", substitutionHeadNamespace = "http://www.w3.org/2001/SMIL20/Language", substitutionHeadName = "regPoint")
    public JAXBElement<RegPointType> createRegPoint(RegPointType value) {
        return new JAXBElement<RegPointType>(_RegPoint_QNAME, RegPointType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransitionFilterType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/SMIL20/", name = "transitionFilter")
    public JAXBElement<TransitionFilterType> createTransitionFilter(TransitionFilterType value) {
        return new JAXBElement<TransitionFilterType>(_TransitionFilter_QNAME, TransitionFilterType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/SMIL20/", name = "meta", substitutionHeadNamespace = "http://www.w3.org/2001/SMIL20/Language", substitutionHeadName = "meta")
    public JAXBElement<MetaType> createMeta(MetaType value) {
        return new JAXBElement<MetaType>(_Meta_QNAME, MetaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.w3._2001.smil20.language.AnimateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/SMIL20/", name = "animate", substitutionHeadNamespace = "http://www.w3.org/2001/SMIL20/Language", substitutionHeadName = "animate")
    public JAXBElement<org.w3._2001.smil20.language.AnimateType> createAnimate(org.w3._2001.smil20.language.AnimateType value) {
        return new JAXBElement<org.w3._2001.smil20.language.AnimateType>(_Animate_QNAME, org.w3._2001.smil20.language.AnimateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MetadataType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/SMIL20/", name = "metadata", substitutionHeadNamespace = "http://www.w3.org/2001/SMIL20/Language", substitutionHeadName = "metadata")
    public JAXBElement<MetadataType> createMetadata(MetadataType value) {
        return new JAXBElement<MetadataType>(_Metadata_QNAME, MetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomTestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/SMIL20/", name = "customTest", substitutionHeadNamespace = "http://www.w3.org/2001/SMIL20/Language", substitutionHeadName = "customTest")
    public JAXBElement<CustomTestType> createCustomTest(CustomTestType value) {
        return new JAXBElement<CustomTestType>(_CustomTest_QNAME, CustomTestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/SMIL20/", name = "text", substitutionHeadNamespace = "http://www.w3.org/2001/SMIL20/Language", substitutionHeadName = "text")
    public JAXBElement<MediaType> createText(MediaType value) {
        return new JAXBElement<MediaType>(_Text_QNAME, MediaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/SMIL20/", name = "textstream", substitutionHeadNamespace = "http://www.w3.org/2001/SMIL20/Language", substitutionHeadName = "textstream")
    public JAXBElement<MediaType> createTextstream(MediaType value) {
        return new JAXBElement<MediaType>(_Textstream_QNAME, MediaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransitionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/SMIL20/", name = "transition")
    public JAXBElement<TransitionType> createTransition(TransitionType value) {
        return new JAXBElement<TransitionType>(_Transition_QNAME, TransitionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.w3._2001.smil20.language.AnimateMotionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/SMIL20/", name = "animateMotion", substitutionHeadNamespace = "http://www.w3.org/2001/SMIL20/Language", substitutionHeadName = "animateMotion")
    public JAXBElement<org.w3._2001.smil20.language.AnimateMotionType> createAnimateMotion(org.w3._2001.smil20.language.AnimateMotionType value) {
        return new JAXBElement<org.w3._2001.smil20.language.AnimateMotionType>(_AnimateMotion_QNAME, org.w3._2001.smil20.language.AnimateMotionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/SMIL20/", name = "set", substitutionHeadNamespace = "http://www.w3.org/2001/SMIL20/Language", substitutionHeadName = "set")
    public JAXBElement<SetType> createSet(SetType value) {
        return new JAXBElement<SetType>(_Set_QNAME, SetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/SMIL20/", name = "a", substitutionHeadNamespace = "http://www.w3.org/2001/SMIL20/Language", substitutionHeadName = "a")
    public JAXBElement<AType> createA(AType value) {
        return new JAXBElement<AType>(_A_QNAME, AType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnchorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/SMIL20/", name = "anchor", substitutionHeadNamespace = "http://www.w3.org/2001/SMIL20/Language", substitutionHeadName = "anchor")
    public JAXBElement<AnchorType> createAnchor(AnchorType value) {
        return new JAXBElement<AnchorType>(_Anchor_QNAME, AnchorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExclType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/SMIL20/", name = "excl", substitutionHeadNamespace = "http://www.w3.org/2001/SMIL20/Language", substitutionHeadName = "excl")
    public JAXBElement<ExclType> createExcl(ExclType value) {
        return new JAXBElement<ExclType>(_Excl_QNAME, ExclType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopLayoutType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/SMIL20/", name = "topLayout", substitutionHeadNamespace = "http://www.w3.org/2001/SMIL20/Language", substitutionHeadName = "topLayout")
    public JAXBElement<TopLayoutType> createTopLayout(TopLayoutType value) {
        return new JAXBElement<TopLayoutType>(_TopLayout_QNAME, TopLayoutType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/SMIL20/", name = "seq", substitutionHeadNamespace = "http://www.w3.org/2001/SMIL20/Language", substitutionHeadName = "seq")
    public JAXBElement<SeqType> createSeq(SeqType value) {
        return new JAXBElement<SeqType>(_Seq_QNAME, SeqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/SMIL20/", name = "audio", substitutionHeadNamespace = "http://www.w3.org/2001/SMIL20/Language", substitutionHeadName = "audio")
    public JAXBElement<MediaType> createAudio(MediaType value) {
        return new JAXBElement<MediaType>(_Audio_QNAME, MediaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriorityClassType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/SMIL20/", name = "priorityClass", substitutionHeadNamespace = "http://www.w3.org/2001/SMIL20/Language", substitutionHeadName = "priorityClass")
    public JAXBElement<PriorityClassType> createPriorityClass(PriorityClassType value) {
        return new JAXBElement<PriorityClassType>(_PriorityClass_QNAME, PriorityClassType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BrushType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/SMIL20/", name = "brush", substitutionHeadNamespace = "http://www.w3.org/2001/SMIL20/Language", substitutionHeadName = "brush")
    public JAXBElement<BrushType> createBrush(BrushType value) {
        return new JAXBElement<BrushType>(_Brush_QNAME, BrushType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AreaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/SMIL20/", name = "area", substitutionHeadNamespace = "http://www.w3.org/2001/SMIL20/Language", substitutionHeadName = "area")
    public JAXBElement<AreaType> createArea(AreaType value) {
        return new JAXBElement<AreaType>(_Area_QNAME, AreaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/SMIL20/", name = "par", substitutionHeadNamespace = "http://www.w3.org/2001/SMIL20/Language", substitutionHeadName = "par")
    public JAXBElement<ParType> createPar(ParType value) {
        return new JAXBElement<ParType>(_Par_QNAME, ParType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomAttributesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/SMIL20/", name = "customAttributes", substitutionHeadNamespace = "http://www.w3.org/2001/SMIL20/Language", substitutionHeadName = "customAttributes")
    public JAXBElement<CustomAttributesType> createCustomAttributes(CustomAttributesType value) {
        return new JAXBElement<CustomAttributesType>(_CustomAttributes_QNAME, CustomAttributesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/SMIL20/", name = "region", substitutionHeadNamespace = "http://www.w3.org/2001/SMIL20/Language", substitutionHeadName = "region")
    public JAXBElement<RegionType> createRegion(RegionType value) {
        return new JAXBElement<RegionType>(_Region_QNAME, RegionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.w3._2001.smil20.language.AnimateColorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/SMIL20/", name = "animateColor", substitutionHeadNamespace = "http://www.w3.org/2001/SMIL20/Language", substitutionHeadName = "animateColor")
    public JAXBElement<org.w3._2001.smil20.language.AnimateColorType> createAnimateColor(org.w3._2001.smil20.language.AnimateColorType value) {
        return new JAXBElement<org.w3._2001.smil20.language.AnimateColorType>(_AnimateColor_QNAME, org.w3._2001.smil20.language.AnimateColorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BodyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/SMIL20/", name = "body", substitutionHeadNamespace = "http://www.w3.org/2001/SMIL20/Language", substitutionHeadName = "body")
    public JAXBElement<BodyType> createBody(BodyType value) {
        return new JAXBElement<BodyType>(_Body_QNAME, BodyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/SMIL20/", name = "ref", substitutionHeadNamespace = "http://www.w3.org/2001/SMIL20/Language", substitutionHeadName = "ref")
    public JAXBElement<MediaType> createRef(MediaType value) {
        return new JAXBElement<MediaType>(_Ref_QNAME, MediaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LayoutType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/SMIL20/", name = "layout", substitutionHeadNamespace = "http://www.w3.org/2001/SMIL20/Language", substitutionHeadName = "layout")
    public JAXBElement<LayoutType> createLayout(LayoutType value) {
        return new JAXBElement<LayoutType>(_Layout_QNAME, LayoutType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SwitchType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/SMIL20/", name = "switch", substitutionHeadNamespace = "http://www.w3.org/2001/SMIL20/Language", substitutionHeadName = "switch")
    public JAXBElement<SwitchType> createSwitch(SwitchType value) {
        return new JAXBElement<SwitchType>(_Switch_QNAME, SwitchType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/SMIL20/", name = "video", substitutionHeadNamespace = "http://www.w3.org/2001/SMIL20/Language", substitutionHeadName = "video")
    public JAXBElement<MediaType> createVideo(MediaType value) {
        return new JAXBElement<MediaType>(_Video_QNAME, MediaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SmilType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/SMIL20/", name = "smil", substitutionHeadNamespace = "http://www.w3.org/2001/SMIL20/Language", substitutionHeadName = "smil")
    public JAXBElement<SmilType> createSmil(SmilType value) {
        return new JAXBElement<SmilType>(_Smil_QNAME, SmilType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrefetchType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/SMIL20/", name = "prefetch", substitutionHeadNamespace = "http://www.w3.org/2001/SMIL20/Language", substitutionHeadName = "prefetch")
    public JAXBElement<PrefetchType> createPrefetch(PrefetchType value) {
        return new JAXBElement<PrefetchType>(_Prefetch_QNAME, PrefetchType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RootLayoutType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/SMIL20/", name = "root-layout", substitutionHeadNamespace = "http://www.w3.org/2001/SMIL20/Language", substitutionHeadName = "root-layout")
    public JAXBElement<RootLayoutType> createRootLayout(RootLayoutType value) {
        return new JAXBElement<RootLayoutType>(_RootLayout_QNAME, RootLayoutType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/SMIL20/", name = "img", substitutionHeadNamespace = "http://www.w3.org/2001/SMIL20/Language", substitutionHeadName = "img")
    public JAXBElement<MediaType> createImg(MediaType value) {
        return new JAXBElement<MediaType>(_Img_QNAME, MediaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParamType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/SMIL20/", name = "param", substitutionHeadNamespace = "http://www.w3.org/2001/SMIL20/Language", substitutionHeadName = "param")
    public JAXBElement<ParamType> createParam(ParamType value) {
        return new JAXBElement<ParamType>(_Param_QNAME, ParamType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeadType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/SMIL20/", name = "head", substitutionHeadNamespace = "http://www.w3.org/2001/SMIL20/Language", substitutionHeadName = "head")
    public JAXBElement<HeadType> createHead(HeadType value) {
        return new JAXBElement<HeadType>(_Head_QNAME, HeadType.class, null, value);
    }

}
