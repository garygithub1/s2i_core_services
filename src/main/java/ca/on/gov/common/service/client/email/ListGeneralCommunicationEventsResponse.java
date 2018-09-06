
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
 *         &lt;element name="GeneralCommunicationEvent" type="{http://data.s2i.sodp.gov.on.ca}GeneralCommunicationEventType" maxOccurs="unbounded" minOccurs="0"/>
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
    "generalCommunicationEvent"
})
@XmlRootElement(name = "ListGeneralCommunicationEventsResponse")
public class ListGeneralCommunicationEventsResponse
    implements Serializable
{

    @XmlElement(name = "GeneralCommunicationEvent")
    protected List<GeneralCommunicationEventType> generalCommunicationEvent;

    /**
     * Gets the value of the generalCommunicationEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generalCommunicationEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneralCommunicationEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeneralCommunicationEventType }
     * 
     * 
     */
    public List<GeneralCommunicationEventType> getGeneralCommunicationEvent() {
        if (generalCommunicationEvent == null) {
            generalCommunicationEvent = new ArrayList<GeneralCommunicationEventType>();
        }
        return this.generalCommunicationEvent;
    }

}
