package net.lecnam.ussi2a.revisions.exo4;

public class Carnivore extends Animal {

    @Override
    public double getCoutQuotidien() {
        return Math.pow((quantiteNourritureQuotidienne + 0.1), 2) / 5;
    }

}
