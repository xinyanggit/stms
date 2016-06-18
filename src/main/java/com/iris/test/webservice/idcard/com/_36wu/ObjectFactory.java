
package com.iris.test.webservice.idcard.com._36wu;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com._36wu package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ResultOfIdCard_QNAME = new QName("http://www.36wu.com/", "ResultOfIdCard");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com._36wu
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetIdCardInfo }
     * 
     */
    public GetIdCardInfo createGetIdCardInfo() {
        return new GetIdCardInfo();
    }

    /**
     * Create an instance of {@link GetIdCardInfoResponse }
     * 
     */
    public GetIdCardInfoResponse createGetIdCardInfoResponse() {
        return new GetIdCardInfoResponse();
    }

    /**
     * Create an instance of {@link ResultOfIdCard }
     * 
     */
    public ResultOfIdCard createResultOfIdCard() {
        return new ResultOfIdCard();
    }

    /**
     * Create an instance of {@link IdCard }
     * 
     */
    public IdCard createIdCard() {
        return new IdCard();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResultOfIdCard }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.36wu.com/", name = "ResultOfIdCard")
    public JAXBElement<ResultOfIdCard> createResultOfIdCard(ResultOfIdCard value) {
        return new JAXBElement<ResultOfIdCard>(_ResultOfIdCard_QNAME, ResultOfIdCard.class, null, value);
    }

}
