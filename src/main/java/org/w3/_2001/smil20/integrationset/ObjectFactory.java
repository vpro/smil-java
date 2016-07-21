//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.21 at 12:15:07 PM CEST 
//


package org.w3._2001.smil20.integrationset;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.w3._2001.smil20.language.MediaType;
import org.w3._2001.smil20.language.ParType;
import org.w3._2001.smil20.language.SeqType;
import org.w3._2001.smil20.language.SwitchType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.w3._2001.smil20.integrationset package. 
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

    private final static QName _Ref_QNAME = new QName("http://www.w3.org/2001/SMIL20/IntegrationSet", "ref");
    private final static QName _Par_QNAME = new QName("http://www.w3.org/2001/SMIL20/IntegrationSet", "par");
    private final static QName _Img_QNAME = new QName("http://www.w3.org/2001/SMIL20/IntegrationSet", "img");
    private final static QName _Switch_QNAME = new QName("http://www.w3.org/2001/SMIL20/IntegrationSet", "switch");
    private final static QName _Video_QNAME = new QName("http://www.w3.org/2001/SMIL20/IntegrationSet", "video");
    private final static QName _Textstream_QNAME = new QName("http://www.w3.org/2001/SMIL20/IntegrationSet", "textstream");
    private final static QName _Text_QNAME = new QName("http://www.w3.org/2001/SMIL20/IntegrationSet", "text");
    private final static QName _Animation_QNAME = new QName("http://www.w3.org/2001/SMIL20/IntegrationSet", "animation");
    private final static QName _Seq_QNAME = new QName("http://www.w3.org/2001/SMIL20/IntegrationSet", "seq");
    private final static QName _Audio_QNAME = new QName("http://www.w3.org/2001/SMIL20/IntegrationSet", "audio");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.w3._2001.smil20.integrationset
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/SMIL20/IntegrationSet", name = "ref", substitutionHeadNamespace = "http://www.w3.org/2001/SMIL20/Language", substitutionHeadName = "ref")
    public JAXBElement<MediaType> createRef(MediaType value) {
        return new JAXBElement<MediaType>(_Ref_QNAME, MediaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/SMIL20/IntegrationSet", name = "par", substitutionHeadNamespace = "http://www.w3.org/2001/SMIL20/Language", substitutionHeadName = "par")
    public JAXBElement<ParType> createPar(ParType value) {
        return new JAXBElement<ParType>(_Par_QNAME, ParType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/SMIL20/IntegrationSet", name = "img", substitutionHeadNamespace = "http://www.w3.org/2001/SMIL20/Language", substitutionHeadName = "img")
    public JAXBElement<MediaType> createImg(MediaType value) {
        return new JAXBElement<MediaType>(_Img_QNAME, MediaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SwitchType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/SMIL20/IntegrationSet", name = "switch", substitutionHeadNamespace = "http://www.w3.org/2001/SMIL20/Language", substitutionHeadName = "switch")
    public JAXBElement<SwitchType> createSwitch(SwitchType value) {
        return new JAXBElement<SwitchType>(_Switch_QNAME, SwitchType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/SMIL20/IntegrationSet", name = "video", substitutionHeadNamespace = "http://www.w3.org/2001/SMIL20/Language", substitutionHeadName = "video")
    public JAXBElement<MediaType> createVideo(MediaType value) {
        return new JAXBElement<MediaType>(_Video_QNAME, MediaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/SMIL20/IntegrationSet", name = "textstream", substitutionHeadNamespace = "http://www.w3.org/2001/SMIL20/Language", substitutionHeadName = "textstream")
    public JAXBElement<MediaType> createTextstream(MediaType value) {
        return new JAXBElement<MediaType>(_Textstream_QNAME, MediaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/SMIL20/IntegrationSet", name = "text", substitutionHeadNamespace = "http://www.w3.org/2001/SMIL20/Language", substitutionHeadName = "text")
    public JAXBElement<MediaType> createText(MediaType value) {
        return new JAXBElement<MediaType>(_Text_QNAME, MediaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/SMIL20/IntegrationSet", name = "animation", substitutionHeadNamespace = "http://www.w3.org/2001/SMIL20/Language", substitutionHeadName = "animation")
    public JAXBElement<MediaType> createAnimation(MediaType value) {
        return new JAXBElement<MediaType>(_Animation_QNAME, MediaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeqType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/SMIL20/IntegrationSet", name = "seq", substitutionHeadNamespace = "http://www.w3.org/2001/SMIL20/Language", substitutionHeadName = "seq")
    public JAXBElement<SeqType> createSeq(SeqType value) {
        return new JAXBElement<SeqType>(_Seq_QNAME, SeqType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/SMIL20/IntegrationSet", name = "audio", substitutionHeadNamespace = "http://www.w3.org/2001/SMIL20/Language", substitutionHeadName = "audio")
    public JAXBElement<MediaType> createAudio(MediaType value) {
        return new JAXBElement<MediaType>(_Audio_QNAME, MediaType.class, null, value);
    }

}