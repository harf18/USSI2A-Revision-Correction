package net.lecnam.ussi2a.revisions.exo1;

import java.util.ArrayList;
import java.util.List;

public class Emprunteur {

    private String nom;
    private String prenom;

    private List<Media> mediaEmpruntes;

    public Emprunteur(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        mediaEmpruntes = new ArrayList<Media>();
    }

    public void empreint(Media media, String dateRetour) {
        media.setDateRetour(dateRetour);
        mediaEmpruntes.add(media);
    }

    public void voirEmpreints(){
        for (Media media : mediaEmpruntes) {
            System.out.println(media);
        }
    }



}
