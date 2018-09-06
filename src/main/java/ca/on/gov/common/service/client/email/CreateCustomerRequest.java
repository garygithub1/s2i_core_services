
package ca.on.gov.common.service.client.email;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="PMID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Details" type="{http://data.s2i.sodp.gov.on.ca}CustomerDetailsType"/>
 *         &lt;element name="CustomerEmail" type="{http://data.s2i.sodp.gov.on.ca}CustomerEmailType" maxOccurs="unbounded"/>
 *         &lt;element name="NotificationPreference" type="{http://data.s2i.sodp.gov.on.ca}NotificationPreferenceType" maxOccurs="unbounded" minOccurs="0"/>
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
    "pmid",
    "details",
    "customerEmail",
    "notificationPreference"
})
@XmlRootElement(name = "CreateCustomerRequest")
public class CreateCustomerRequest
    implements Serializable
{

    @XmlElement(name = "PMID", required = true)
    protected String pmid;
    @XmlElement(name = "Details", required = true)
    protected CustomerDetailsType details;
    @XmlElement(name = "CustomerEmail", required = true)
    protected List<CustomerEmailType> customerEmail;
    @XmlElement(name = "NotificationPreference")
    protected List<NotificationPreferenceType> notificationPreference;

    /**
     * Gets the value of the pmid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPMID() {
        return pmid;
    }

    /**
     * Sets the value of the pmid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPMID(String value) {
        this.pmid = value;
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
     * Gets the value of the customerEmail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerEmail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerEmail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerEmailType }
     * 
     * 
     */
    public List<CustomerEmailType> getCustomerEmail() {
        if (customerEmail == null) {
            customerEmail = new ArrayList<CustomerEmailType>();
        }
        return this.customerEmail;
    }

    /**
     * Gets the value of the notificationPreference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notificationPreference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotificationPreference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotificationPreferenceType }
     * 
     * 
     */
    public List<NotificationPreferenceType> getNotificationPreference() {
        if (notificationPreference == null) {
            notificationPreference = new ArrayList<NotificationPreferenceType>();
        }
        return this.notificationPreference;
    }

}
