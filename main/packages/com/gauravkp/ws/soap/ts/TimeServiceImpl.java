package com.gauravkp.ws.soap.ts;

import java.time.LocalDateTime;

import javax.jws.WebService;

/**
* The @WebService property endpointInterface
links the
* SIB (this class) to the SEI
(com.gauravkp.ws.soap.TimeService).
* Note that the method implementations are not
annotated
* as @WebMethods.
*/
@WebService(endpointInterface = "com.gauravkp.ws.soap.ts.TimeService")
public class TimeServiceImpl implements TimeService {

	@Override
	public String getTimeAsString() {
		 return LocalDateTime
				 .now()
				 .toString();
	}

}
