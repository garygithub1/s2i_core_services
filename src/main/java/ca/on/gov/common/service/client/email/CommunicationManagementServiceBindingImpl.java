package ca.on.gov.common.service.client.email;



@javax.jws.WebService (endpointInterface="ca.on.gov.common.service.client.email.CommunicationManagementService", targetNamespace="http://intf.comm.s2i.sodp.gov.on.ca", serviceName="CommunicationManagementServicePort", portName="CommunicationManagementServicePort")
public class CommunicationManagementServiceBindingImpl{

    public VoidResponse sendCustomerEmail(SendCustomerEmailRequest sendCustomerEmailRequestMessage) throws SendCustomerEmailFault {
        // TODO Auto-generated method stub
        return null;
    }

    public VoidResponse sendAnonymousEmail(SendAnonymousEmailRequest sendAnonymousEmailRequestMessage) throws SendAnonymousEmailFault {
        // TODO Auto-generated method stub
        return null;
    }

    public VoidResponse sendAsyncEmail(SendAsyncEmailRequest sendAsyncEmailRequestMessage) throws SendAsyncEmailSendAsyncEmailFaultMsg {
        // TODO Auto-generated method stub
        return null;
    }

    public ListGeneralCommunicationEventsResponse listGeneralCommunicationEvents(ListGeneralCommunicationEventsRequest listGeneralCommunicationEventsRequestMessage) throws ListGeneralCommunicationEventsFault {
        // TODO Auto-generated method stub
        return null;
    }

    public VoidResponse putGeneralCommunicationEvent(GeneralCommunicationEventType putGeneralCommunicationEventRequestMessage) throws PutGeneralCommunicationEventFault {
        // TODO Auto-generated method stub
        return null;
    }

}