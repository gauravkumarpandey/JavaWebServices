
package com.gauravkp.ws.soap.ts.client;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "TimeService", targetNamespace = "http://ts.soap.ws.gauravkp.com/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface TimeService {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://ts.soap.ws.gauravkp.com/TimeService/getTimeAsStringRequest", output = "http://ts.soap.ws.gauravkp.com/TimeService/getTimeAsStringResponse")
    public String getTimeAsString();

}
