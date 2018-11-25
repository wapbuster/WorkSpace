
package com.indus.training.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.indus.training.service package. 
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

    private final static QName _CalOut_QNAME = new QName("http://domain.training.indus.com", "CalOut");
    private final static QName _CalIn_QNAME = new QName("http://domain.training.indus.com", "CalIn");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.indus.training.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalciInput }
     * 
     */
    public CalciInput createCalciInput() {
        return new CalciInput();
    }

    /**
     * Create an instance of {@link CalciOutput }
     * 
     */
    public CalciOutput createCalciOutput() {
        return new CalciOutput();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalciOutput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain.training.indus.com", name = "CalOut")
    public JAXBElement<CalciOutput> createCalOut(CalciOutput value) {
        return new JAXBElement<CalciOutput>(_CalOut_QNAME, CalciOutput.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalciInput }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://domain.training.indus.com", name = "CalIn")
    public JAXBElement<CalciInput> createCalIn(CalciInput value) {
        return new JAXBElement<CalciInput>(_CalIn_QNAME, CalciInput.class, null, value);
    }

}
