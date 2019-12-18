package net.lecnam.ussi2a.revisions.exo3;

public class SoldeMiniException extends Exception {

    public SoldeMiniException(double montant, double solde) {
        super("Impossible d'executer l'opération d'un montant de " + montant + " il ne reste que " + solde +" sur le compte");
    }
}
