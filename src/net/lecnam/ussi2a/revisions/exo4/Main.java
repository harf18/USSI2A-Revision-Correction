package net.lecnam.ussi2a.revisions.exo4;

import net.lecnam.ussi2a.revisions.exo4.animaux.Aigle;
import net.lecnam.ussi2a.revisions.exo4.animaux.Champanze;
import net.lecnam.ussi2a.revisions.exo4.animaux.Orque;
import net.lecnam.ussi2a.revisions.exo4.animaux.Tigre;

public class Main {

    public static void main(String[] args) {

        Zoo zoo = new Zoo("Beauval", 1000);

        System.out.println(zoo.getCoutTotal());

        try {
            zoo.ajoutAnimal(new Orque("bibi"));
            zoo.ajoutAnimal(new Champanze("Chita"));
            zoo.ajoutAnimal(new Aigle("buz"));
            zoo.ajoutAnimal(new Tigre("sherka"));

        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println(zoo.getCoutTotal());
            zoo.afficheListAnimaux();
        }






    }

}
