
package com.iris.test.webservice.idcard.com._36wu;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�����ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetIdCardInfoResult" type="{http://www.36wu.com/}ResultOfIdCard" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getIdCardInfoResult"
})
@XmlRootElement(name = "GetIdCardInfoResponse")
public class GetIdCardInfoResponse {

    @XmlElement(name = "GetIdCardInfoResult")
    protected ResultOfIdCard getIdCardInfoResult;

    /**
     * ��ȡgetIdCardInfoResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ResultOfIdCard }
     *     
     */
    public ResultOfIdCard getGetIdCardInfoResult() {
        return getIdCardInfoResult;
    }

    /**
     * ����getIdCardInfoResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ResultOfIdCard }
     *     
     */
    public void setGetIdCardInfoResult(ResultOfIdCard value) {
        this.getIdCardInfoResult = value;
    }

}
