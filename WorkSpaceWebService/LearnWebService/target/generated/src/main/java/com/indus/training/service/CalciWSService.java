
package com.indus.training.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebService(name = "CalciWSService", targetNamespace = "http://www.example.org/CalciWSService/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CalciWSService {


    /**
     * 
     * @param in
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "NewOperation", action = "http://www.example.org/CalciWSService/NewOperation")
    @WebResult(name = "out", targetNamespace = "")
    @RequestWrapper(localName = "NewOperation", targetNamespace = "http://www.example.org/CalciWSService/", className = "com.indus.training.service.NewOperation")
    @ResponseWrapper(localName = "NewOperationResponse", targetNamespace = "http://www.example.org/CalciWSService/", className = "com.indus.training.service.NewOperationResponse")
    public String newOperation(
        @WebParam(name = "in", targetNamespace = "")
        String in);

}