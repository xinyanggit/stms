package com.iris.test.webservice.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * This class was generated by Apache CXF 3.1.1
 * 2015-07-07T09:04:52.739+08:00
 * Generated source version: 3.1.1
 * 
 */
@WebService(targetNamespace = "http://server.webservice.test.iris.com/", name = "IHelloWorld")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface IHelloWorld {

    @WebResult(name = "return", targetNamespace = "http://server.webservice.test.iris.com/", partName = "return")
    @WebMethod
    public java.lang.String sayHi(
        @WebParam(partName = "arg0", name = "arg0")
        java.lang.String arg0
    );
}
