package net.lecnam.ussi2a.revisions.exo3;

import java.util.ArrayList;
import java.util.List;

public class Client {

    String nom;
    CompteCourant compteCourant;
    List<CompteEpargne> compteEpargneList = new ArrayList<CompteEpargne>();

    public Client(String nom) {
        compteCourant = new CompteCourant();
        compteEpargneList.add(new CompteEpargne());
    }

    public CompteCourant getCompteCourant() {
        return compteCourant;
    }

    public void setCompteCourant(CompteCourant compteCourant) {
        this.compteCourant = compteCourant;
    }

    public List<CompteEpargne> getCompteEpargneList() {
        return compteEpargneList;
    }

    public void setCompteEpargneList(List<CompteEpargne> compteEpargneList) {
        this.compteEpargneList = compteEpargneList;
    }

    public void afficheDetailCompte() {
        System.out.println(compteCourant);
        for (Compte c : compteEpargneList) {
            System.out.println(c);
        }
    }
}
