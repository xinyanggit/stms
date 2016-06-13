package com.iris.test.webservice.mobileInfows.cn.com.webxml;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.1
 * 2015-07-09T17:52:46.470+08:00
 * Generated source version: 3.1.1
 * 
 */
@WebService(targetNamespace = "http://WebXml.com.cn/", name = "MobileCodeWSHttpPost")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface MobileCodeWSHttpPost {

    /**
     * <br /><h3>获得国内手机号码归属地数据库信息</h3><p>输入参数：无；返回数据：一维字符串数组（省份 城市 记录数量）。</p><br />
     */
    @WebResult(name = "ArrayOfString", targetNamespace = "http://WebXml.com.cn/", partName = "Body")
    @WebMethod
    public ArrayOfString getDatabaseInfo();

    /**
     * <br /><h3>获得国内手机号码归属地省份、地区和手机卡类型信息</h3><p>输入参数：mobileCode = 字符串（手机号码，最少前7位数字），userID = 字符串（商业用户ID） 免费用户为空字符串；返回数据：字符串（手机号码：省份 城市 手机卡类型）。</p><br />
     */
    @WebResult(name = "string", targetNamespace = "http://WebXml.com.cn/", partName = "Body")
    @WebMethod
    public java.lang.String getMobileCodeInfo(
        @WebParam(partName = "mobileCode", name = "mobileCode", targetNamespace = "http://WebXml.com.cn/")
        java.lang.String mobileCode,
        @WebParam(partName = "userID", name = "userID", targetNamespace = "http://WebXml.com.cn/")
        java.lang.String userID
    );
}
