package com.gauravkp.ws.soap.ts;

import javax.xml.ws.Endpoint;

public class TimeServicePublisher {
  
	public static void main(String[ ] args) {
		Endpoint.publish("http://127.0.0.1:9876/ts", new TimeServiceImpl());
		
		System.out.println("Started...");
	}
}