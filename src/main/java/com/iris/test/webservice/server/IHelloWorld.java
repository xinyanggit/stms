package com.iris.test.webservice.server;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.RPC)
public interface IHelloWorld {
	
	String sayHi(String text);
    
}
