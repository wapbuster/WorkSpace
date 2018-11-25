
package com.indus.training.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalciOutput complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalciOutput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="param1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="param2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="result" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="operation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalciOutput", propOrder = {
    "param1",
    "param2",
    "result",
    "operation"
})
public class CalciOutput {

    protected Double param1;
    protected Double param2;
    protected double result;
    @XmlElement(required = true)
    protected String operation;

    /**
     * Gets the value of the param1 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getParam1() {
        return param1;
    }

    /**
     * Sets the value of the param1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setParam1(Double value) {
        this.param1 = value;
    }

    /**
     * Gets the value of the param2 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getParam2() {
        return param2;
    }

    /**
     * Sets the value of the param2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setParam2(Double value) {
        this.param2 = value;
    }

    /**
     * Gets the value of the result property.
     * 
     */
    public double getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     */
    public void setResult(double value) {
        this.result = value;
    }

    /**
     * Gets the value of the operation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Sets the value of the operation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperation(String value) {
        this.operation = value;
    }

}
