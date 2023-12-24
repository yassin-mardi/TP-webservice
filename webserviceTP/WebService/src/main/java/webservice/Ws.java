package webservice;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import webservice.compte;

import java.util.Date;
import java.util.List;
@WebService(serviceName = "banqueWS")
public class Ws {
   @WebMethod(operationName = "converstionEuroToDH")
    public double convertion(@WebParam(name = "montant") double montant){
        return montant * 11;
    }
    @WebMethod(operationName = "consultationCompte")
    public compte consultation (@WebParam(name = "code")  int code){
        return new compte(code,Math.random(),new Date());

    }
    @WebMethod(operationName = "listeCompte")
    public List<compte> listCompte(){
        return List.of(
                new compte(1,Math.random(),new Date()),
                new compte(2,Math.random(),new Date()),
                new compte(3,Math.random(),new Date()),
                new compte(4,Math.random(),new Date())
        );

    }

}
