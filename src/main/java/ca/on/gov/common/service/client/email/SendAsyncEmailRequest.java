
package ca.on.gov.common.service.client.email;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="CustomerID" type="{http://data.s2i.sodp.gov.on.ca}CustomerIDType" minOccurs="0"/>
 *         &lt;element name="Details" type="{http://data.s2i.sodp.gov.on.ca}CustomerDetailsType" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Parameters" type="{http://data.s2i.sodp.gov.on.ca}NameValueParametersType" minOccurs="0"/>
 *         &lt;element name="Attachments" type="{http://data.s2i.sodp.gov.on.ca}MessageAttachmentsType" minOccurs="0"/>
 *         &lt;element name="DeliveryDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
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
    "details",
    "email",
    "parameters",
    "attachments",
    "deliveryDate"
})
@XmlRootElement(name = "SendAsyncEmailRequest")
public class SendAsyncEmailRequest
    implements Serializable
{

    @XmlElement(name = "CommunicationEventType", required = true)
    protected String communicationEventType;
    @XmlElement(name = "CustomerID")
    protected String customerID;
    @XmlElement(name = "Details")
    protected CustomerDetailsType details;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "Parameters")
    protected NameValueParametersType parameters;
    @XmlElement(name = "Attachments")
    protected MessageAttachmentsType attachments;
    @XmlElement(name = "DeliveryDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar deliveryDate;

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
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerDetailsType }
     *     
     */
    public CustomerDetailsType getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerDetailsType }
     *     
     */
    public void setDetails(CustomerDetailsType value) {
        this.details = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
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

    /**
     * Gets the value of the attachments property.
     * 
     * @return
     *     possible object is
     *     {@link MessageAttachmentsType }
     *     
     */
    public MessageAttachmentsType getAttachments() {
        return attachments;
    }

    /**
     * Sets the value of the attachments property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageAttachmentsType }
     *     
     */
    public void setAttachments(MessageAttachmentsType value) {
        this.attachments = value;
    }

    /**
     * Gets the value of the deliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * Sets the value of the deliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeliveryDate(XMLGregorianCalendar value) {
        this.deliveryDate = value;
    }

}
