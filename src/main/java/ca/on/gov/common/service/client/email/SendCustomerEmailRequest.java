
package ca.on.gov.common.service.client.email;

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
 *         &lt;element name="CommunicationEventType" type="{http://data.s2i.sodp.gov.on.ca}CommunicationEventType"/>
 *         &lt;element name="CustomerID" type="{http://data.s2i.sodp.gov.on.ca}CustomerIDType"/>
 *         &lt;element name="Parameters" type="{http://data.s2i.sodp.gov.on.ca}NameValueParametersType" minOccurs="0"/>
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
    "communicationEventType",
    "customerID",
    "parameters"
})
@XmlRootElement(name = "SendCustomerEmailRequest")
public class SendCustomerEmailRequest
    implements Serializable
{

    @XmlElement(name = "CommunicationEventType", required = true)
    protected String communicationEventType;
    @XmlElement(name = "CustomerID", required = true)
    protected String customerID;
    @XmlElement(name = "Parameters")
    protected NameValueParametersType parameters;

    /**
     * Gets the value of the communicationEventType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommunicationEventType() {
        return communicationEventType;
    }

    /**
     * Sets the value of the communicationEventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommunicationEventType(String value) {
        this.communicationEventType = value;
    }

    /**
     * Gets the value of the customerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * Sets the value of the customerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerID(String value) {
        this.customerID = value;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link NameValueParametersType }
     *     
     */
    public NameValueParametersType getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameValueParametersType }
     *     
     */
    public void setParameters(NameValueParametersType value) {
        this.parameters = value;
    }

}
