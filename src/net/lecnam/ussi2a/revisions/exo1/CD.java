package net.lecnam.ussi2a.revisions.exo1;

public class CD extends Media {


    private int nombreTitre;
    private int duree;

    public CD(String titre, String auteur, int nombreTitre, int duree) {
        super(titre, auteur);
        this.nombreTitre = nombreTitre;
        this.duree = duree;
    }

    @Override
    public String toString() {
        return "CD | " + super.toString() + " | " + nombreTitre + " Titres | " + duree + " secondes | A retourner le : " + dateRetour;
    }


}
