package net.lecnam.ussi2a.revisions.exo2;

public class Employe {

    private String nom;
    private String dateNaissance;
    protected double salaire;

    public Employe(String nom, String dateNaissance, double salaire) {
        this.nom = nom;
        this.dateNaissance = dateNaissance;
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return nom + " | " + dateNaissance;
    }

    public void voirSalaire(){
        System.out.println(this.salaire);
    }

    public void augmenteSalaire(double augmentation){
        salaire += augmentation;
    }



}
