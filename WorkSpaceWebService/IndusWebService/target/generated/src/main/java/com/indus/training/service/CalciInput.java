
package com.indus.training.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalciInput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalciInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="param1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="param2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalciInput", propOrder = {
    "param1",
    "param2"
})
public class CalciInput {

    protected double param1;
    protected double param2;

    /**
     * Gets the value of the param1 property.
     * 
     */
    public double getParam1() {
        return param1;
    }

    /**
     * Sets the value of the param1 property.
     * 
     */
    public void setParam1(double value) {
        this.param1 = value;
    }

    /**
     * Gets the value of the param2 property.
     * 
     */
    public double getParam2() {
        return param2;
    }

    /**
     * Sets the value of the param2 property.
     * 
     */
    public void setParam2(double value) {
        this.param2 = value;
    }

}
