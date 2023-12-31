
package proxy;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.2
 * Generated source version: 3.0
 * 
 */
@WebService(name = "ws", targetNamespace = "http://webservice/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Ws {


    /**
     * 
     * @return
     *     returns java.util.List<proxy.Compte>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listeCompte", targetNamespace = "http://webservice/", className = "proxy.ListeCompte")
    @ResponseWrapper(localName = "listeCompteResponse", targetNamespace = "http://webservice/", className = "proxy.ListeCompteResponse")
    @Action(input = "http://webservice/ws/listeCompteRequest", output = "http://webservice/ws/listeCompteResponse")
    public List<Compte> listeCompte();

    /**
     * 
     * @param montant
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "converstionEuroToDH", targetNamespace = "http://webservice/", className = "proxy.ConverstionEuroToDH")
    @ResponseWrapper(localName = "converstionEuroToDHResponse", targetNamespace = "http://webservice/", className = "proxy.ConverstionEuroToDHResponse")
    @Action(input = "http://webservice/ws/converstionEuroToDHRequest", output = "http://webservice/ws/converstionEuroToDHResponse")
    public double converstionEuroToDH(
        @WebParam(name = "montant", targetNamespace = "")
        double montant);

    /**
     * 
     * @param code
     * @return
     *     returns proxy.Compte
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultationCompte", targetNamespace = "http://webservice/", className = "proxy.ConsultationCompte")
    @ResponseWrapper(localName = "consultationCompteResponse", targetNamespace = "http://webservice/", className = "proxy.ConsultationCompteResponse")
    @Action(input = "http://webservice/ws/consultationCompteRequest", output = "http://webservice/ws/consultationCompteResponse")
    public Compte consultationCompte(
        @WebParam(name = "code", targetNamespace = "")
        int code);

}
