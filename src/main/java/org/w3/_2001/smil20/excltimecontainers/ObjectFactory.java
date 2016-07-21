//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.07.21 at 12:15:07 PM CEST 
//


package org.w3._2001.smil20.excltimecontainers;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.w3._2001.smil20.language.ExclType;
import org.w3._2001.smil20.language.PriorityClassType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.w3._2001.smil20.excltimecontainers package. 
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

    private final static QName _PriorityClass_QNAME = new QName("http://www.w3.org/2001/SMIL20/ExclTimeContainers", "priorityClass");
    private final static QName _Excl_QNAME = new QName("http://www.w3.org/2001/SMIL20/ExclTimeContainers", "excl");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.w3._2001.smil20.excltimecontainers
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriorityClassType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/SMIL20/ExclTimeContainers", name = "priorityClass", substitutionHeadNamespace = "http://www.w3.org/2001/SMIL20/Language", substitutionHeadName = "priorityClass")
    public JAXBElement<PriorityClassType> createPriorityClass(PriorityClassType value) {
        return new JAXBElement<PriorityClassType>(_PriorityClass_QNAME, PriorityClassType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExclType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2001/SMIL20/ExclTimeContainers", name = "excl", substitutionHeadNamespace = "http://www.w3.org/2001/SMIL20/Language", substitutionHeadName = "excl")
    public JAXBElement<ExclType> createExcl(ExclType value) {
        return new JAXBElement<ExclType>(_Excl_QNAME, ExclType.class, null, value);
    }

}