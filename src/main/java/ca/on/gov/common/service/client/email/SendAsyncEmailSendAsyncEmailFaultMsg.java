
package ca.on.gov.common.service.client.email;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "DSFault", targetNamespace = "http://data.s2i.sodp.gov.on.ca")
public class SendAsyncEmailSendAsyncEmailFaultMsg
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private DSFault faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public SendAsyncEmailSendAsyncEmailFaultMsg(String message, DSFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public SendAsyncEmailSendAsyncEmailFaultMsg(String message, DSFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: ca.on.gov.common.service.client.email.DSFault
     */
    public DSFault getFaultInfo() {
        return faultInfo;
    }

}
