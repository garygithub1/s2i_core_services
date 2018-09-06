
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
 *         &lt;element name="createTransactionReturn" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "createTransactionReturn"
})
@XmlRootElement(name = "createTransactionResponse", namespace = "http://transaction.service.sodp.gsc.gov.on.ca")
public class CreateTransactionResponse
    implements Serializable
{

    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long createTransactionReturn;

    /**
     * Gets the value of the createTransactionReturn property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getCreateTransactionReturn() {
        return createTransactionReturn;
    }

    /**
     * Sets the value of the createTransactionReturn property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setCreateTransactionReturn(Long value) {
        this.createTransactionReturn = value;
    }

}
