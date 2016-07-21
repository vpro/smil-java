//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.21 at 12:15:07 PM CEST 
//


package org.w3._2001.smil20.basiclinking;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.w3._2001.smil20.language.AType;
import org.w3._2001.smil20.language.AnchorType;
import org.w3._2001.smil20.language.AreaType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.w3._2001.smil20.basiclinking package. 
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

    private final static QName _Area_QNAME = new QName("http://www.w3.org/2001/SMIL20/BasicLinking", "area");
    private final static QName _A_QNAME = new QName("http://www.w3.org/2001/SMIL20/BasicLinking", "a");
    private final static QName _Anchor_QNAME = new QName("http://www.w3.org/2001/SMIL20/BasicLinking", "anchor");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.w3._2001.smil20.basiclinking
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AreaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/SMIL20/BasicLinking", name = "area", substitutionHeadNamespace = "http://www.w3.org/2001/SMIL20/Language", substitutionHeadName = "area")
    public JAXBElement<AreaType> createArea(AreaType value) {
        return new JAXBElement<AreaType>(_Area_QNAME, AreaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/SMIL20/BasicLinking", name = "a", substitutionHeadNamespace = "http://www.w3.org/2001/SMIL20/Language", substitutionHeadName = "a")
    public JAXBElement<AType> createA(AType value) {
        return new JAXBElement<AType>(_A_QNAME, AType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnchorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/SMIL20/BasicLinking", name = "anchor", substitutionHeadNamespace = "http://www.w3.org/2001/SMIL20/Language", substitutionHeadName = "anchor")
    public JAXBElement<AnchorType> createAnchor(AnchorType value) {
        return new JAXBElement<AnchorType>(_Anchor_QNAME, AnchorType.class, null, value);
    }

}
