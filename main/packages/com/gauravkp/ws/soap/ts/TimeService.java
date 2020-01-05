/**
 * 
 */
package com.gauravkp.ws.soap.ts;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * a Service end point interface(SEI)
 * @author Gaurav Pandey
 *
 */
@WebService //indicate it is SEI
public interface TimeService {
   @WebMethod //it is a service operation
   String getTimeAsString();
}
