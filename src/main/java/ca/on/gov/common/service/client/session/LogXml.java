
package ca.on.gov.common.service.client.session;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="xmlType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dataXml" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "transactionId",
    "xmlType",
    "dataXml"
})
@XmlRootElement(name = "logXml")
public class LogXml
    implements Serializable
{

    protected long transactionId;
    @XmlElement(required = true, nillable = true)
    protected String xmlType;
    @XmlElement(required = true, nillable = true)
    protected String dataXml;

    /**
     * Gets the value of the transactionId property.
     * 
     */
    public long getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     */
    public void setTransactionId(long value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the xmlType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlType() {
        return xmlType;
    }

    /**
     * Sets the value of the xmlType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlType(String value) {
        this.xmlType = value;
    }

    /**
     * Gets the value of the dataXml property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataXml() {
        return dataXml;
    }

    /**
     * Sets the value of the dataXml property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataXml(String value) {
        this.dataXml = value;
    }

}
