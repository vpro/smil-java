//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.21 at 12:15:07 PM CEST 
//


package org.w3._2001.smil20.customtestattributes;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.w3._2001.smil20.language.CustomAttributesType;
import org.w3._2001.smil20.language.CustomTestType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.w3._2001.smil20.customtestattributes package. 
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

    private final static QName _CustomAttributes_QNAME = new QName("http://www.w3.org/2001/SMIL20/CustomTestAttributes", "customAttributes");
    private final static QName _CustomTest_QNAME = new QName("http://www.w3.org/2001/SMIL20/CustomTestAttributes", "customTest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.w3._2001.smil20.customtestattributes
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomAttributesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/SMIL20/CustomTestAttributes", name = "customAttributes", substitutionHeadNamespace = "http://www.w3.org/2001/SMIL20/Language", substitutionHeadName = "customAttributes")
    public JAXBElement<CustomAttributesType> createCustomAttributes(CustomAttributesType value) {
        return new JAXBElement<CustomAttributesType>(_CustomAttributes_QNAME, CustomAttributesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomTestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/SMIL20/CustomTestAttributes", name = "customTest", substitutionHeadNamespace = "http://www.w3.org/2001/SMIL20/Language", substitutionHeadName = "customTest")
    public JAXBElement<CustomTestType> createCustomTest(CustomTestType value) {
        return new JAXBElement<CustomTestType>(_CustomTest_QNAME, CustomTestType.class, null, value);
    }

}
