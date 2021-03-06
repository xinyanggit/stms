package com.iris.test.webservice.client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.1
 * 2015-07-07T09:04:52.774+08:00
 * Generated source version: 3.1.1
 * 
 */
@WebServiceClient(name = "helloWorld", 
                  wsdlLocation = "http://127.0.0.1:83/stms/webservice/greeting?wsdl",
                  targetNamespace = "http://server.webservice.test.iris.com/") 
public class HelloWorld extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://server.webservice.test.iris.com/", "helloWorld");
    public final static QName HelloWorldImplPort = new QName("http://server.webservice.test.iris.com/", "HelloWorldImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://127.0.0.1:83/stms/webservice/greeting?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(HelloWorld.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://127.0.0.1:83/stms/webservice/greeting?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public HelloWorld(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public HelloWorld(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloWorld() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public HelloWorld(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public HelloWorld(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public HelloWorld(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns IHelloWorld
     */
    @WebEndpoint(name = "HelloWorldImplPort")
    public IHelloWorld getHelloWorldImplPort() {
        return super.getPort(HelloWorldImplPort, IHelloWorld.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IHelloWorld
     */
    @WebEndpoint(name = "HelloWorldImplPort")
    public IHelloWorld getHelloWorldImplPort(WebServiceFeature... features) {
        return super.getPort(HelloWorldImplPort, IHelloWorld.class, features);
    }

}
