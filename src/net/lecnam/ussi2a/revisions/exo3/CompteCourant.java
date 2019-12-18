package net.lecnam.ussi2a.revisions.exo3;

public class CompteCourant extends Compte {

    private double autorisationDecouvert;



    @Override
    public void ajoutOperation(Operation operation) throws SoldeMiniException {
        if (solde + autorisationDecouvert + operation.montant < 0){
            throw new SoldeMiniException(operation.montant, solde);
        }
        this.operationList.add(operation);
        this.solde += operation.montant;
    }

    public double getAutorisationDecouvert() {
        return autorisationDecouvert;
    }

    public void setAutorisationDecouvert(double autorisationDecouvert) {
        this.autorisationDecouvert = autorisationDecouvert;
    }

}
