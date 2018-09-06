
package ca.on.gov.common.service.client.email;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GeneralCommunicationEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeneralCommunicationEventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EventID" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EnglishSubject" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EnglishTemplate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FrenchSubject" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FrenchTemplate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EventName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DeliveryDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EventStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralCommunicationEventType", propOrder = {
    "eventID",
    "description",
    "englishSubject",
    "englishTemplate",
    "frenchSubject",
    "frenchTemplate",
    "eventName",
    "deliveryDate",
    "comment",
    "eventStatus"
})
public class GeneralCommunicationEventType
    implements Serializable
{

    @XmlElement(name = "EventID")
    protected Long eventID;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "EnglishSubject", required = true)
    protected String englishSubject;
    @XmlElement(name = "EnglishTemplate", required = true)
    protected String englishTemplate;
    @XmlElement(name = "FrenchSubject", required = true)
    protected String frenchSubject;
    @XmlElement(name = "FrenchTemplate", required = true)
    protected String frenchTemplate;
    @XmlElement(name = "EventName", required = true)
    protected String eventName;
    @XmlElement(name = "DeliveryDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar deliveryDate;
    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElement(name = "EventStatus")
    protected String eventStatus;

    /**
     * Gets the value of the eventID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEventID() {
        return eventID;
    }

    /**
     * Sets the value of the eventID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEventID(Long value) {
        this.eventID = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the englishSubject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnglishSubject() {
        return englishSubject;
    }

    /**
     * Sets the value of the englishSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnglishSubject(String value) {
        this.englishSubject = value;
    }

    /**
     * Gets the value of the englishTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnglishTemplate() {
        return englishTemplate;
    }

    /**
     * Sets the value of the englishTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnglishTemplate(String value) {
        this.englishTemplate = value;
    }

    /**
     * Gets the value of the frenchSubject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrenchSubject() {
        return frenchSubject;
    }

    /**
     * Sets the value of the frenchSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrenchSubject(String value) {
        this.frenchSubject = value;
    }

    /**
     * Gets the value of the frenchTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrenchTemplate() {
        return frenchTemplate;
    }

    /**
     * Sets the value of the frenchTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrenchTemplate(String value) {
        this.frenchTemplate = value;
    }

    /**
     * Gets the value of the eventName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventName() {
        return eventName;
    }

    /**
     * Sets the value of the eventName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventName(String value) {
        this.eventName = value;
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

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the eventStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventStatus() {
        return eventStatus;
    }

    /**
     * Sets the value of the eventStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventStatus(String value) {
        this.eventStatus = value;
    }

}
