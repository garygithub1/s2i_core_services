
package ca.on.gov.common.service.client.email;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationPreferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationPreferenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NotificationService" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IsEnrolled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="NotificationKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NotificationStatus" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="ACT"/>
 *               &lt;enumeration value="ANC"/>
 *               &lt;enumeration value="IDC"/>
 *               &lt;enumeration value="INA"/>
 *               &lt;enumeration value="INM"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ReminderPreference" type="{http://data.s2i.sodp.gov.on.ca}ReminderPreferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NotificationEmails" type="{http://data.s2i.sodp.gov.on.ca}NotificationEmailType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationPreferenceType", propOrder = {
    "notificationService",
    "isEnrolled",
    "notificationKey",
    "notificationStatus",
    "reminderPreference",
    "notificationEmails"
})
public class NotificationPreferenceType
    implements Serializable
{

    @XmlElement(name = "NotificationService", required = true)
    protected String notificationService;
    @XmlElement(name = "IsEnrolled")
    protected boolean isEnrolled;
    @XmlElement(name = "NotificationKey")
    protected String notificationKey;
    @XmlElement(name = "NotificationStatus")
    protected String notificationStatus;
    @XmlElement(name = "ReminderPreference")
    protected List<ReminderPreferenceType> reminderPreference;
    @XmlElement(name = "NotificationEmails")
    protected NotificationEmailType notificationEmails;

    /**
     * Gets the value of the notificationService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationService() {
        return notificationService;
    }

    /**
     * Sets the value of the notificationService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationService(String value) {
        this.notificationService = value;
    }

    /**
     * Gets the value of the isEnrolled property.
     * 
     */
    public boolean isIsEnrolled() {
        return isEnrolled;
    }

    /**
     * Sets the value of the isEnrolled property.
     * 
     */
    public void setIsEnrolled(boolean value) {
        this.isEnrolled = value;
    }

    /**
     * Gets the value of the notificationKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationKey() {
        return notificationKey;
    }

    /**
     * Sets the value of the notificationKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationKey(String value) {
        this.notificationKey = value;
    }

    /**
     * Gets the value of the notificationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationStatus() {
        return notificationStatus;
    }

    /**
     * Sets the value of the notificationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationStatus(String value) {
        this.notificationStatus = value;
    }

    /**
     * Gets the value of the reminderPreference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reminderPreference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReminderPreference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReminderPreferenceType }
     * 
     * 
     */
    public List<ReminderPreferenceType> getReminderPreference() {
        if (reminderPreference == null) {
            reminderPreference = new ArrayList<ReminderPreferenceType>();
        }
        return this.reminderPreference;
    }

    /**
     * Gets the value of the notificationEmails property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationEmailType }
     *     
     */
    public NotificationEmailType getNotificationEmails() {
        return notificationEmails;
    }

    /**
     * Sets the value of the notificationEmails property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationEmailType }
     *     
     */
    public void setNotificationEmails(NotificationEmailType value) {
        this.notificationEmails = value;
    }

}
