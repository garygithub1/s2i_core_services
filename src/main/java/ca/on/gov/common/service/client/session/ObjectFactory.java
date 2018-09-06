
package ca.on.gov.common.service.client.session;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;



/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the ca.on.gov.common.service.client.session package.
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

    private final static QName _DSFault_QNAME = new QName("http://service.sodp.gsc.gov.on.ca", "DSFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ca.on.gov.common.service.client.session
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DSFault }
     *
     */
    public DSFault createDSFault() {
        return new DSFault();
    }

    /**
     * Create an instance of {@link CloseSessionResponse }
     *
     */
    public CloseSessionResponse createCloseSessionResponse() {
        return new CloseSessionResponse();
    }

    /**
     * Create an instance of {@link CreateSessionResponse }
     *
     */
    public CreateSessionResponse createCreateSessionResponse() {
        return new CreateSessionResponse();
    }

    /**
     * Create an instance of {@link CloseSession }
     *
     */
    public CloseSession createCloseSession() {
        return new CloseSession();
    }

    /**
     * Create an instance of {@link CreateSession }
     *
     */
    public CreateSession createCreateSession() {
        return new CreateSession();
    }

    /**
     * Create an instance of {@link CreateTransactionResponse }
     *
     */
    public CreateTransactionResponse createCreateTransactionResponse() {
        return new CreateTransactionResponse();
    }

    /**
     * Create an instance of {@link FindSubTransaction }
     *
     */
    public FindSubTransaction createFindSubTransaction() {
        return new FindSubTransaction();
    }

    /**
     * Create an instance of {@link LogXml }
     *
     */
    public LogXml createLogXml() {
        return new LogXml();
    }

    /**
     * Create an instance of {@link CloseTransaction }
     *
     */
    public CloseTransaction createCloseTransaction() {
        return new CloseTransaction();
    }

    /**
     * Create an instance of {@link CloseTransactionResponse }
     *
     */
    public CloseTransactionResponse createCloseTransactionResponse() {
        return new CloseTransactionResponse();
    }

    /**
     * Create an instance of {@link TransactionStateChange }
     *
     */
    public TransactionStateChange createTransactionStateChange() {
        return new TransactionStateChange();
    }

    /**
     * Create an instance of {@link LogXmlResponse }
     *
     */
    public LogXmlResponse createLogXmlResponse() {
        return new LogXmlResponse();
    }

    /**
     * Create an instance of {@link LogTransactionResponse }
     *
     */
    public LogTransactionResponse createLogTransactionResponse() {
        return new LogTransactionResponse();
    }

    /**
     * Create an instance of {@link TransactionStateChangeResponse }
     *
     */
    public TransactionStateChangeResponse createTransactionStateChangeResponse() {
        return new TransactionStateChangeResponse();
    }

    /**
     * Create an instance of {@link CreateTransaction }
     *
     */
    public CreateTransaction createCreateTransaction() {
        return new CreateTransaction();
    }

    /**
     * Create an instance of {@link LogTransaction }
     *
     */
    public LogTransaction createLogTransaction() {
        return new LogTransaction();
    }

    /**
     * Create an instance of {@link FindSubTransactionResponse }
     *
     */
    public FindSubTransactionResponse createFindSubTransactionResponse() {
        return new FindSubTransactionResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DSFault }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://service.sodp.gsc.gov.on.ca", name = "DSFault")
    public JAXBElement<DSFault> createDSFault(DSFault value) {
        return new JAXBElement<DSFault>(_DSFault_QNAME, DSFault.class, null, value);
    }
}
