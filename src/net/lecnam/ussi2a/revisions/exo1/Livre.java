package net.lecnam.ussi2a.revisions.exo1;

public class Livre extends Media {


    private int nombreDePage;

    public Livre(String titre, String auteur, int nombreDePage) {
        super(titre, auteur);
        this.nombreDePage = nombreDePage;
    }

    @Override
    public String toString() {
        return "Livre | " + super.toString() + " | " + nombreDePage + " pages | A retourner le : " + dateRetour;
    }

}
