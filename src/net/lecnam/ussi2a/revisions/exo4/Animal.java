package net.lecnam.ussi2a.revisions.exo4;

public abstract class Animal {

    protected String nom;
    protected int quantiteNourritureQuotidienne;

    public abstract double getCoutQuotidien();

    @Override
    public String toString() {
        return nom + " mange " + quantiteNourritureQuotidienne + " kg de nourriture par jour et coute " + getCoutQuotidien();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

}
