
package com.iris.test.webservice.cxpt;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.iris.test.webservice.cxpt package. 
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

    private final static QName _QueryQyDetail_QNAME = new QName("http://web.webservice.dt.com/", "queryQyDetail");
    private final static QName _QueryQyDetailResponse_QNAME = new QName("http://web.webservice.dt.com/", "queryQyDetailResponse");
    private final static QName _GetBlxxList_QNAME = new QName("http://web.webservice.dt.com/", "getBlxxList");
    private final static QName _GetBlxxListResponse_QNAME = new QName("http://web.webservice.dt.com/", "getBlxxListResponse");
    private final static QName _GetQyList_QNAME = new QName("http://web.webservice.dt.com/", "getQyList");
    private final static QName _GetQyListResponse_QNAME = new QName("http://web.webservice.dt.com/", "getQyListResponse");
    private final static QName _GetRyxxList_QNAME = new QName("http://web.webservice.dt.com/", "getRyxxList");
    private final static QName _GetRyxxListResponse_QNAME = new QName("http://web.webservice.dt.com/", "getRyxxListResponse");
    private final static QName _GetQyDetail_QNAME = new QName("http://web.webservice.dt.com/", "getQyDetail");
    private final static QName _GetQyDetailResponse_QNAME = new QName("http://web.webservice.dt.com/", "getQyDetailResponse");
    private final static QName _GetXzxkList_QNAME = new QName("http://web.webservice.dt.com/", "getXzxkList");
    private final static QName _GetXzxkListResponse_QNAME = new QName("http://web.webservice.dt.com/", "getXzxkListResponse");
    private final static QName _GetXzxkListResponseReturn_QNAME = new QName("http://web.webservice.dt.com/", "return");
    private final static QName _GetXzxkListArg0_QNAME = new QName("http://web.webservice.dt.com/", "arg0");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.iris.test.webservice.cxpt
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QueryQyDetail }
     * 
     */
    public QueryQyDetail createQueryQyDetail() {
        return new QueryQyDetail();
    }

    /**
     * Create an instance of {@link QueryQyDetailResponse }
     * 
     */
    public QueryQyDetailResponse createQueryQyDetailResponse() {
        return new QueryQyDetailResponse();
    }

    /**
     * Create an instance of {@link GetBlxxList }
     * 
     */
    public GetBlxxList createGetBlxxList() {
        return new GetBlxxList();
    }

    /**
     * Create an instance of {@link GetBlxxListResponse }
     * 
     */
    public GetBlxxListResponse createGetBlxxListResponse() {
        return new GetBlxxListResponse();
    }

    /**
     * Create an instance of {@link GetQyList }
     * 
     */
    public GetQyList createGetQyList() {
        return new GetQyList();
    }

    /**
     * Create an instance of {@link GetQyListResponse }
     * 
     */
    public GetQyListResponse createGetQyListResponse() {
        return new GetQyListResponse();
    }

    /**
     * Create an instance of {@link GetRyxxList }
     * 
     */
    public GetRyxxList createGetRyxxList() {
        return new GetRyxxList();
    }

    /**
     * Create an instance of {@link GetRyxxListResponse }
     * 
     */
    public GetRyxxListResponse createGetRyxxListResponse() {
        return new GetRyxxListResponse();
    }

    /**
     * Create an instance of {@link GetQyDetail }
     * 
     */
    public GetQyDetail createGetQyDetail() {
        return new GetQyDetail();
    }

    /**
     * Create an instance of {@link GetQyDetailResponse }
     * 
     */
    public GetQyDetailResponse createGetQyDetailResponse() {
        return new GetQyDetailResponse();
    }

    /**
     * Create an instance of {@link GetXzxkList }
     * 
     */
    public GetXzxkList createGetXzxkList() {
        return new GetXzxkList();
    }

    /**
     * Create an instance of {@link GetXzxkListResponse }
     * 
     */
    public GetXzxkListResponse createGetXzxkListResponse() {
        return new GetXzxkListResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryQyDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.webservice.dt.com/", name = "queryQyDetail")
    public JAXBElement<QueryQyDetail> createQueryQyDetail(QueryQyDetail value) {
        return new JAXBElement<QueryQyDetail>(_QueryQyDetail_QNAME, QueryQyDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QueryQyDetailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.webservice.dt.com/", name = "queryQyDetailResponse")
    public JAXBElement<QueryQyDetailResponse> createQueryQyDetailResponse(QueryQyDetailResponse value) {
        return new JAXBElement<QueryQyDetailResponse>(_QueryQyDetailResponse_QNAME, QueryQyDetailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBlxxList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.webservice.dt.com/", name = "getBlxxList")
    public JAXBElement<GetBlxxList> createGetBlxxList(GetBlxxList value) {
        return new JAXBElement<GetBlxxList>(_GetBlxxList_QNAME, GetBlxxList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBlxxListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.webservice.dt.com/", name = "getBlxxListResponse")
    public JAXBElement<GetBlxxListResponse> createGetBlxxListResponse(GetBlxxListResponse value) {
        return new JAXBElement<GetBlxxListResponse>(_GetBlxxListResponse_QNAME, GetBlxxListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetQyList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.webservice.dt.com/", name = "getQyList")
    public JAXBElement<GetQyList> createGetQyList(GetQyList value) {
        return new JAXBElement<GetQyList>(_GetQyList_QNAME, GetQyList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetQyListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.webservice.dt.com/", name = "getQyListResponse")
    public JAXBElement<GetQyListResponse> createGetQyListResponse(GetQyListResponse value) {
        return new JAXBElement<GetQyListResponse>(_GetQyListResponse_QNAME, GetQyListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRyxxList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.webservice.dt.com/", name = "getRyxxList")
    public JAXBElement<GetRyxxList> createGetRyxxList(GetRyxxList value) {
        return new JAXBElement<GetRyxxList>(_GetRyxxList_QNAME, GetRyxxList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRyxxListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.webservice.dt.com/", name = "getRyxxListResponse")
    public JAXBElement<GetRyxxListResponse> createGetRyxxListResponse(GetRyxxListResponse value) {
        return new JAXBElement<GetRyxxListResponse>(_GetRyxxListResponse_QNAME, GetRyxxListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetQyDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.webservice.dt.com/", name = "getQyDetail")
    public JAXBElement<GetQyDetail> createGetQyDetail(GetQyDetail value) {
        return new JAXBElement<GetQyDetail>(_GetQyDetail_QNAME, GetQyDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetQyDetailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.webservice.dt.com/", name = "getQyDetailResponse")
    public JAXBElement<GetQyDetailResponse> createGetQyDetailResponse(GetQyDetailResponse value) {
        return new JAXBElement<GetQyDetailResponse>(_GetQyDetailResponse_QNAME, GetQyDetailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetXzxkList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.webservice.dt.com/", name = "getXzxkList")
    public JAXBElement<GetXzxkList> createGetXzxkList(GetXzxkList value) {
        return new JAXBElement<GetXzxkList>(_GetXzxkList_QNAME, GetXzxkList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetXzxkListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.webservice.dt.com/", name = "getXzxkListResponse")
    public JAXBElement<GetXzxkListResponse> createGetXzxkListResponse(GetXzxkListResponse value) {
        return new JAXBElement<GetXzxkListResponse>(_GetXzxkListResponse_QNAME, GetXzxkListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.webservice.dt.com/", name = "return", scope = GetXzxkListResponse.class)
    public JAXBElement<String> createGetXzxkListResponseReturn(String value) {
        return new JAXBElement<String>(_GetXzxkListResponseReturn_QNAME, String.class, GetXzxkListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.webservice.dt.com/", name = "arg0", scope = GetXzxkList.class)
    public JAXBElement<String> createGetXzxkListArg0(String value) {
        return new JAXBElement<String>(_GetXzxkListArg0_QNAME, String.class, GetXzxkList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.webservice.dt.com/", name = "return", scope = GetQyDetailResponse.class)
    public JAXBElement<String> createGetQyDetailResponseReturn(String value) {
        return new JAXBElement<String>(_GetXzxkListResponseReturn_QNAME, String.class, GetQyDetailResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.webservice.dt.com/", name = "arg0", scope = GetQyDetail.class)
    public JAXBElement<String> createGetQyDetailArg0(String value) {
        return new JAXBElement<String>(_GetXzxkListArg0_QNAME, String.class, GetQyDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.webservice.dt.com/", name = "return", scope = GetRyxxListResponse.class)
    public JAXBElement<String> createGetRyxxListResponseReturn(String value) {
        return new JAXBElement<String>(_GetXzxkListResponseReturn_QNAME, String.class, GetRyxxListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.webservice.dt.com/", name = "arg0", scope = GetRyxxList.class)
    public JAXBElement<String> createGetRyxxListArg0(String value) {
        return new JAXBElement<String>(_GetXzxkListArg0_QNAME, String.class, GetRyxxList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.webservice.dt.com/", name = "return", scope = GetQyListResponse.class)
    public JAXBElement<String> createGetQyListResponseReturn(String value) {
        return new JAXBElement<String>(_GetXzxkListResponseReturn_QNAME, String.class, GetQyListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.webservice.dt.com/", name = "arg0", scope = GetQyList.class)
    public JAXBElement<String> createGetQyListArg0(String value) {
        return new JAXBElement<String>(_GetXzxkListArg0_QNAME, String.class, GetQyList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.webservice.dt.com/", name = "return", scope = GetBlxxListResponse.class)
    public JAXBElement<String> createGetBlxxListResponseReturn(String value) {
        return new JAXBElement<String>(_GetXzxkListResponseReturn_QNAME, String.class, GetBlxxListResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.webservice.dt.com/", name = "arg0", scope = GetBlxxList.class)
    public JAXBElement<String> createGetBlxxListArg0(String value) {
        return new JAXBElement<String>(_GetXzxkListArg0_QNAME, String.class, GetBlxxList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.webservice.dt.com/", name = "return", scope = QueryQyDetailResponse.class)
    public JAXBElement<String> createQueryQyDetailResponseReturn(String value) {
        return new JAXBElement<String>(_GetXzxkListResponseReturn_QNAME, String.class, QueryQyDetailResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.webservice.dt.com/", name = "arg0", scope = QueryQyDetail.class)
    public JAXBElement<String> createQueryQyDetailArg0(String value) {
        return new JAXBElement<String>(_GetXzxkListArg0_QNAME, String.class, QueryQyDetail.class, value);
    }

}
