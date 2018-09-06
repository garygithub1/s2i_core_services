
package ca.on.gov.common.service.client.session;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="createSessionReturn" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "createSessionReturn"
})
@XmlRootElement(name = "createSessionResponse", namespace = "http://session.service.sodp.gsc.gov.on.ca")
public class CreateSessionResponse
    implements Serializable
{

    protected long createSessionReturn;

    /**
     * Gets the value of the createSessionReturn property.
     *
     */
    public long getCreateSessionReturn() {
        return createSessionReturn;
    }

    /**
     * Sets the value of the createSessionReturn property.
     *
     */
    public void setCreateSessionReturn(long value) {
        this.createSessionReturn = value;
    }

}
