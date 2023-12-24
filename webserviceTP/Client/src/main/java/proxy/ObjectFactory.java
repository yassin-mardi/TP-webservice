
package proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
 * <p>An ObjectFactory allows you to programmatically 
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

    private static final QName _ConsultationCompte_QNAME = new QName("http://webservice/", "consultationCompte");
    private static final QName _ConsultationCompteResponse_QNAME = new QName("http://webservice/", "consultationCompteResponse");
    private static final QName _ConverstionEuroToDH_QNAME = new QName("http://webservice/", "converstionEuroToDH");
    private static final QName _ConverstionEuroToDHResponse_QNAME = new QName("http://webservice/", "converstionEuroToDHResponse");
    private static final QName _ListeCompte_QNAME = new QName("http://webservice/", "listeCompte");
    private static final QName _ListeCompteResponse_QNAME = new QName("http://webservice/", "listeCompteResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultationCompte }
     * 
     * @return
     *     the new instance of {@link ConsultationCompte }
     */
    public ConsultationCompte createConsultationCompte() {
        return new ConsultationCompte();
    }

    /**
     * Create an instance of {@link ConsultationCompteResponse }
     * 
     * @return
     *     the new instance of {@link ConsultationCompteResponse }
     */
    public ConsultationCompteResponse createConsultationCompteResponse() {
        return new ConsultationCompteResponse();
    }

    /**
     * Create an instance of {@link ConverstionEuroToDH }
     * 
     * @return
     *     the new instance of {@link ConverstionEuroToDH }
     */
    public ConverstionEuroToDH createConverstionEuroToDH() {
        return new ConverstionEuroToDH();
    }

    /**
     * Create an instance of {@link ConverstionEuroToDHResponse }
     * 
     * @return
     *     the new instance of {@link ConverstionEuroToDHResponse }
     */
    public ConverstionEuroToDHResponse createConverstionEuroToDHResponse() {
        return new ConverstionEuroToDHResponse();
    }

    /**
     * Create an instance of {@link ListeCompte }
     * 
     * @return
     *     the new instance of {@link ListeCompte }
     */
    public ListeCompte createListeCompte() {
        return new ListeCompte();
    }

    /**
     * Create an instance of {@link ListeCompteResponse }
     * 
     * @return
     *     the new instance of {@link ListeCompteResponse }
     */
    public ListeCompteResponse createListeCompteResponse() {
        return new ListeCompteResponse();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     * @return
     *     the new instance of {@link Compte }
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultationCompte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultationCompte }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "consultationCompte")
    public JAXBElement<ConsultationCompte> createConsultationCompte(ConsultationCompte value) {
        return new JAXBElement<>(_ConsultationCompte_QNAME, ConsultationCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultationCompteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsultationCompteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "consultationCompteResponse")
    public JAXBElement<ConsultationCompteResponse> createConsultationCompteResponse(ConsultationCompteResponse value) {
        return new JAXBElement<>(_ConsultationCompteResponse_QNAME, ConsultationCompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConverstionEuroToDH }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConverstionEuroToDH }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "converstionEuroToDH")
    public JAXBElement<ConverstionEuroToDH> createConverstionEuroToDH(ConverstionEuroToDH value) {
        return new JAXBElement<>(_ConverstionEuroToDH_QNAME, ConverstionEuroToDH.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConverstionEuroToDHResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConverstionEuroToDHResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "converstionEuroToDHResponse")
    public JAXBElement<ConverstionEuroToDHResponse> createConverstionEuroToDHResponse(ConverstionEuroToDHResponse value) {
        return new JAXBElement<>(_ConverstionEuroToDHResponse_QNAME, ConverstionEuroToDHResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListeCompte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListeCompte }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "listeCompte")
    public JAXBElement<ListeCompte> createListeCompte(ListeCompte value) {
        return new JAXBElement<>(_ListeCompte_QNAME, ListeCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListeCompteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListeCompteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservice/", name = "listeCompteResponse")
    public JAXBElement<ListeCompteResponse> createListeCompteResponse(ListeCompteResponse value) {
        return new JAXBElement<>(_ListeCompteResponse_QNAME, ListeCompteResponse.class, null, value);
    }

}
