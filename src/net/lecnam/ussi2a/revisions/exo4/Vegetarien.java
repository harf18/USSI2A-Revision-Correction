package net.lecnam.ussi2a.revisions.exo4;

public class Vegetarien extends Animal {

    @Override
    public double getCoutQuotidien() {
        return 1.2 * Math.log((quantiteNourritureQuotidienne + 100) * 2 + 1);
    }
}
