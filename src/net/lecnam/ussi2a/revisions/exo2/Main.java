package net.lecnam.ussi2a.revisions.exo2;

public class Main {

    public static void main(String[] args) {

        // Ajouter un employee
        Employe employe = new Employe("Homer Simpson", "10/10/1970", 1500);
        // Ajouter un ingenieur
        Ingenieur ingenieur = new Ingenieur("Waylon Smithers", "01/12/1980", 3000, 6);

        // Voir le salaire de l'employé
        employe.voirSalaire();
        // Voir le salaire de l'ingénieur
        ingenieur.voirSalaire();

        // augmenter le salaire l'employé
        employe.augmenteSalaire(10);
        // augmenter le grade de l'ingenieur
        ingenieur.setGrade(9);

        // Voir le salaire de l'employé
        employe.voirSalaire();
        // Voir le salaire de l'ingénieur
        ingenieur.voirSalaire();

    }
}