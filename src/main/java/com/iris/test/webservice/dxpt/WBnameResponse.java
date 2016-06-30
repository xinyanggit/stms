
package com.iris.test.webservice.dxpt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WBnameResult" type="{http://tempuri.org/}ResultsKind"/&gt;
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
    "wBnameResult"
})
@XmlRootElement(name = "WBnameResponse")
public class WBnameResponse {

    @XmlElement(name = "WBnameResult", required = true)
    @XmlSchemaType(name = "string")
    protected ResultsKind wBnameResult;

    /**
     * 获取wBnameResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResultsKind }
     *     
     */
    public ResultsKind getWBnameResult() {
        return wBnameResult;
    }

    /**
     * 设置wBnameResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResultsKind }
     *     
     */
    public void setWBnameResult(ResultsKind value) {
        this.wBnameResult = value;
    }

}
