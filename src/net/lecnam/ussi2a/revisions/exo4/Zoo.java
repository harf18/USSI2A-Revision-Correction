package net.lecnam.ussi2a.revisions.exo4;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    String nom;
    double budgetQuotidienMaxi;
    List<Animal> animalList = new ArrayList<Animal>();

    public Zoo(String nom, double budgetQuotidienMaxi) {
        this.nom = nom;
        this.budgetQuotidienMaxi = budgetQuotidienMaxi;
    }

    void ajoutAnimal(Animal animal) throws ExceptionDepassementCout {
        if (animal.getCoutQuotidien() + getCoutTotal() > budgetQuotidienMaxi) {
            throw new ExceptionDepassementCout(animal, this);
        }
        animalList.add(animal);
    }

    void afficheListAnimaux(){
        for (Animal a : animalList){
            System.out.println(a);
        }
    }

    double getCoutTotal(){
        double coutTotal = 0;
        for (Animal a : animalList){
            coutTotal += a.getCoutQuotidien();
        }
        return coutTotal;

    }



}
