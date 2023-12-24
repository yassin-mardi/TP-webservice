package org.example;

import proxy.BanqueWS;
import proxy.Ws;
import proxy.Compte;

import java.util.List;

public class ClientWS {
    public static void main(String[] args) {
       Ws proxy = new BanqueWS().getWsPort();
        System.out.println(proxy.converstionEuroToDH(800));
        Compte c1 = proxy.consultationCompte(5);
        System.out.println("code"+c1.getCode());
        System.out.println("solde"+c1.getSolde());
        System.out.println("date"+c1.getDate());
        List<Compte> listCompte = proxy.listeCompte();
        for (Compte c : listCompte){
            System.out.println("code"+c.getCode());
            System.out.println("solde"+c.getSolde());
            System.out.println("date"+c.getDate());
        }
    }
}
