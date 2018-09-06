
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
 *         &lt;element name="groupTransactionId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="transactionKey" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "groupTransactionId",
    "transactionKey"
})
@XmlRootElement(name = "findSubTransaction")
public class FindSubTransaction
    implements Serializable
{

    protected long groupTransactionId;
    @XmlElement(required = true, nillable = true)
    protected String transactionKey;

    /**
     * Gets the value of the groupTransactionId property.
     * 
     */
    public long getGroupTransactionId() {
        return groupTransactionId;
    }

    /**
     * Sets the value of the groupTransactionId property.
     * 
     */
    public void setGroupTransactionId(long value) {
        this.groupTransactionId = value;
    }

    /**
     * Gets the value of the transactionKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionKey() {
        return transactionKey;
    }

    /**
     * Sets the value of the transactionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionKey(String value) {
        this.transactionKey = value;
    }

}
