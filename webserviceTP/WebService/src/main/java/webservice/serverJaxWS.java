package webservice;

import jakarta.xml.ws.Endpoint;

public class serverJaxWS {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8787/",new ws());
        System.out.println("server up");
    }
}
