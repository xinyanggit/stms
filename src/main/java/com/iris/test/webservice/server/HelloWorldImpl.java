package com.iris.test.webservice.server;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import org.springframework.stereotype.Service;

@Service("helloWorldService")
@WebService(endpointInterface="com.iris.test.webservice.server.IHelloWorld",serviceName="helloWorld")
@SOAPBinding(style=Style.RPC)
public class HelloWorldImpl implements IHelloWorld {

	public String sayHi(String text) {
		 return "Hello " + text;
	}

}
