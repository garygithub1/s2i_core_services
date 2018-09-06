
package ca.on.gov.common.service.client.email;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ca.on.gov.common.service.client.email package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ActiveCustomerRequest_QNAME = new QName("http://data.s2i.sodp.gov.on.ca", "ActiveCustomerRequest");
    private final static QName _FindCustomersByEmailRequest_QNAME = new QName("http://data.s2i.sodp.gov.on.ca", "FindCustomersByEmailRequest");
    private final static QName _PutGeneralCommunicationEventRequest_QNAME = new QName("http://data.s2i.sodp.gov.on.ca", "PutGeneralCommunicationEventRequest");
    private final static QName _DeleteCustomerRequest_QNAME = new QName("http://data.s2i.sodp.gov.on.ca", "DeleteCustomerRequest");
    private final static QName _GetCustomerRequest_QNAME = new QName("http://data.s2i.sodp.gov.on.ca", "GetCustomerRequest");
    private final static QName _CustomerID_QNAME = new QName("http://data.s2i.sodp.gov.on.ca", "CustomerID");
    private final static QName _FindCustomersByServiceRequest_QNAME = new QName("http://data.s2i.sodp.gov.on.ca", "FindCustomersByServiceRequest");
    private final static QName _GetCustomerResponse_QNAME = new QName("http://data.s2i.sodp.gov.on.ca", "GetCustomerResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ca.on.gov.common.service.client.email
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MessageAttachmentsType }
     * 
     */
    public MessageAttachmentsType createMessageAttachmentsType() {
        return new MessageAttachmentsType();
    }

    /**
     * Create an instance of {@link NameValueParametersType }
     * 
     */
    public NameValueParametersType createNameValueParametersType() {
        return new NameValueParametersType();
    }

    /**
     * Create an instance of {@link DSFault }
     * 
     */
    public DSFault createDSFault() {
        return new DSFault();
    }

    /**
     * Create an instance of {@link SendAsyncEmailRequest }
     * 
     */
    public SendAsyncEmailRequest createSendAsyncEmailRequest() {
        return new SendAsyncEmailRequest();
    }

    /**
     * Create an instance of {@link CustomerDetailsType }
     * 
     */
    public CustomerDetailsType createCustomerDetailsType() {
        return new CustomerDetailsType();
    }

    /**
     * Create an instance of {@link ListGeneralCommunicationEventsRequest }
     * 
     */
    public ListGeneralCommunicationEventsRequest createListGeneralCommunicationEventsRequest() {
        return new ListGeneralCommunicationEventsRequest();
    }

    /**
     * Create an instance of {@link GeneralCommunicationEventType }
     * 
     */
    public GeneralCommunicationEventType createGeneralCommunicationEventType() {
        return new GeneralCommunicationEventType();
    }

    /**
     * Create an instance of {@link SendAnonymousEmailRequest }
     * 
     */
    public SendAnonymousEmailRequest createSendAnonymousEmailRequest() {
        return new SendAnonymousEmailRequest();
    }

    /**
     * Create an instance of {@link ListGeneralCommunicationEventsResponse }
     * 
     */
    public ListGeneralCommunicationEventsResponse createListGeneralCommunicationEventsResponse() {
        return new ListGeneralCommunicationEventsResponse();
    }

    /**
     * Create an instance of {@link CreateCustomerRequest }
     * 
     */
    public CreateCustomerRequest createCreateCustomerRequest() {
        return new CreateCustomerRequest();
    }

    /**
     * Create an instance of {@link CustomerEmailType }
     * 
     */
    public CustomerEmailType createCustomerEmailType() {
        return new CustomerEmailType();
    }

    /**
     * Create an instance of {@link NotificationPreferenceType }
     * 
     */
    public NotificationPreferenceType createNotificationPreferenceType() {
        return new NotificationPreferenceType();
    }

    /**
     * Create an instance of {@link DeleteNotificationRequest }
     * 
     */
    public DeleteNotificationRequest createDeleteNotificationRequest() {
        return new DeleteNotificationRequest();
    }

    /**
     * Create an instance of {@link SendCustomerEmailRequest }
     * 
     */
    public SendCustomerEmailRequest createSendCustomerEmailRequest() {
        return new SendCustomerEmailRequest();
    }

    /**
     * Create an instance of {@link FindCustomersByServiceResponse }
     * 
     */
    public FindCustomersByServiceResponse createFindCustomersByServiceResponse() {
        return new FindCustomersByServiceResponse();
    }

    /**
     * Create an instance of {@link CustomerType }
     * 
     */
    public CustomerType createCustomerType() {
        return new CustomerType();
    }

    /**
     * Create an instance of {@link FindCustomersByEmailResponse }
     * 
     */
    public FindCustomersByEmailResponse createFindCustomersByEmailResponse() {
        return new FindCustomersByEmailResponse();
    }

    /**
     * Create an instance of {@link VoidResponse }
     * 
     */
    public VoidResponse createVoidResponse() {
        return new VoidResponse();
    }

    /**
     * Create an instance of {@link InvalidateEmailRequest }
     * 
     */
    public InvalidateEmailRequest createInvalidateEmailRequest() {
        return new InvalidateEmailRequest();
    }

    /**
     * Create an instance of {@link UpdateCustomerRequest }
     * 
     */
    public UpdateCustomerRequest createUpdateCustomerRequest() {
        return new UpdateCustomerRequest();
    }

    /**
     * Create an instance of {@link AddNotificationRequest }
     * 
     */
    public AddNotificationRequest createAddNotificationRequest() {
        return new AddNotificationRequest();
    }

    /**
     * Create an instance of {@link NotificationEmailType }
     * 
     */
    public NotificationEmailType createNotificationEmailType() {
        return new NotificationEmailType();
    }

    /**
     * Create an instance of {@link ReminderPreferenceType }
     * 
     */
    public ReminderPreferenceType createReminderPreferenceType() {
        return new ReminderPreferenceType();
    }

    /**
     * Create an instance of {@link MessageAttachmentsType.Attachment }
     * 
     */
    public MessageAttachmentsType.Attachment createMessageAttachmentsTypeAttachment() {
        return new MessageAttachmentsType.Attachment();
    }

    /**
     * Create an instance of {@link NameValueParametersType.Parameter }
     * 
     */
    public NameValueParametersType.Parameter createNameValueParametersTypeParameter() {
        return new NameValueParametersType.Parameter();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://data.s2i.sodp.gov.on.ca", name = "ActiveCustomerRequest")
    public JAXBElement<String> createActiveCustomerRequest(String value) {
        return new JAXBElement<String>(_ActiveCustomerRequest_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://data.s2i.sodp.gov.on.ca", name = "FindCustomersByEmailRequest")
    public JAXBElement<String> createFindCustomersByEmailRequest(String value) {
        return new JAXBElement<String>(_FindCustomersByEmailRequest_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GeneralCommunicationEventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://data.s2i.sodp.gov.on.ca", name = "PutGeneralCommunicationEventRequest")
    public JAXBElement<GeneralCommunicationEventType> createPutGeneralCommunicationEventRequest(GeneralCommunicationEventType value) {
        return new JAXBElement<GeneralCommunicationEventType>(_PutGeneralCommunicationEventRequest_QNAME, GeneralCommunicationEventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://data.s2i.sodp.gov.on.ca", name = "DeleteCustomerRequest")
    public JAXBElement<String> createDeleteCustomerRequest(String value) {
        return new JAXBElement<String>(_DeleteCustomerRequest_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://data.s2i.sodp.gov.on.ca", name = "GetCustomerRequest")
    public JAXBElement<String> createGetCustomerRequest(String value) {
        return new JAXBElement<String>(_GetCustomerRequest_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://data.s2i.sodp.gov.on.ca", name = "CustomerID")
    public JAXBElement<String> createCustomerID(String value) {
        return new JAXBElement<String>(_CustomerID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://data.s2i.sodp.gov.on.ca", name = "FindCustomersByServiceRequest")
    public JAXBElement<String> createFindCustomersByServiceRequest(String value) {
        return new JAXBElement<String>(_FindCustomersByServiceRequest_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://data.s2i.sodp.gov.on.ca", name = "GetCustomerResponse")
    public JAXBElement<CustomerType> createGetCustomerResponse(CustomerType value) {
        return new JAXBElement<CustomerType>(_GetCustomerResponse_QNAME, CustomerType.class, null, value);
    }

}
