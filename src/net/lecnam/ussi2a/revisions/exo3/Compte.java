package net.lecnam.ussi2a.revisions.exo3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Compte {

    protected double solde;
    protected List<Operation> operationList = new ArrayList<Operation>();

    public void ajoutOperation(Operation operation) throws SoldeMiniException {
        if (solde + operation.montant < 0){
            throw new SoldeMiniException(operation.montant, solde);
        }
        this.operationList.add(operation);
        this.solde += operation.montant;
    }

    @Override
    public String toString() {
        return "Le solde du " + this.getClass().getSimpleName() + " est de : " + solde;
    }

    public void listeOperation() {

        List<Operation> operationListInverse = new ArrayList<Operation>(operationList);
        Collections.reverse(operationListInverse);
        for (int i=0;i <5; i++) {
            System.out.println(operationListInverse.get(i));
        }
    }
}
