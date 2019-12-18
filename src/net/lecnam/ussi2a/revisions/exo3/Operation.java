package net.lecnam.ussi2a.revisions.exo3;

public class Operation {

    double montant;
    String dateOperation;

    public Operation(double montant, String dateOperation) {
        this.montant = montant;
        this.dateOperation = dateOperation;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "montant=" + montant +
                ", dateOperation='" + dateOperation + '\'' +
                '}';
    }
}
