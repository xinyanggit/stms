
package com.iris.test.webservice.cxpt;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.1
 * 2016-06-14T11:33:47.754+08:00
 * Generated source version: 3.1.1
 * 
 */
public final class ICdxyWebserviceActionPortType_ICdxyWebserviceActionPort_Client {

    private static final QName SERVICE_NAME = new QName("http://web.webservice.dt.com/", "ICdxyWebserviceAction");

    private ICdxyWebserviceActionPortType_ICdxyWebserviceActionPort_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = ICdxyWebserviceAction.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        ICdxyWebserviceAction ss = new ICdxyWebserviceAction(wsdlURL, SERVICE_NAME);
        ICdxyWebserviceActionPortType port = ss.getICdxyWebserviceActionPort();  
        
        {
        System.out.println("Invoking queryQyDetail...");
        java.lang.String _queryQyDetail_arg0 = "";
        java.lang.String _queryQyDetail__return = port.queryQyDetail(_queryQyDetail_arg0);
        System.out.println("queryQyDetail.result=" + _queryQyDetail__return);


        }
        {
        System.out.println("Invoking getBlxxList...");
        java.lang.String _getBlxxList_arg0 = "";
        java.lang.String _getBlxxList__return = port.getBlxxList(_getBlxxList_arg0);
        System.out.println("getBlxxList.result=" + _getBlxxList__return);


        }
        {
        System.out.println("Invoking getQyList...");
        java.lang.String _getQyList_arg0 = "";
        java.lang.String _getQyList__return = port.getQyList(_getQyList_arg0);
        System.out.println("getQyList.result=" + _getQyList__return);


        }
        {
        System.out.println("Invoking getQyDetail...");
        java.lang.String _getQyDetail_arg0 = "";
        java.lang.String _getQyDetail__return = port.getQyDetail(_getQyDetail_arg0);
        System.out.println("getQyDetail.result=" + _getQyDetail__return);


        }
        {
        System.out.println("Invoking getRyxxList...");
        java.lang.String _getRyxxList_arg0 = "";
        java.lang.String _getRyxxList__return = port.getRyxxList(_getRyxxList_arg0);
        System.out.println("getRyxxList.result=" + _getRyxxList__return);


        }
        {
        System.out.println("Invoking getXzxkList...");
        java.lang.String _getXzxkList_arg0 = "";
        java.lang.String _getXzxkList__return = port.getXzxkList(_getXzxkList_arg0);
        System.out.println("getXzxkList.result=" + _getXzxkList__return);


        }

        System.exit(0);
    }

}