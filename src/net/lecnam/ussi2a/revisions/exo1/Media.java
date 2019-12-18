package net.lecnam.ussi2a.revisions.exo1;

public class Media {

    private String titre;
    private String auteur;
    protected String dateRetour;

    public Media(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;
    }

    public void setDateRetour(String dateRetour) {
        this.dateRetour = dateRetour;
    }

    @Override
    public String toString() {
        return this.titre + " | " + this.auteur + " | ";
    }
}
