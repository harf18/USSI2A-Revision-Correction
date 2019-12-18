package net.lecnam.ussi2a.revisions.exo4;

public class ExceptionDepassementCout extends Exception {

    public ExceptionDepassementCout(Animal animal, Zoo zoo) {
        super("Impossible d'ajouter l'animal " + animal.getNom() + ", il coute " + animal.getCoutQuotidien() + "€ et le cout de revient du zoo est déjà de " + zoo.getCoutTotal() + "€");
    }
}
