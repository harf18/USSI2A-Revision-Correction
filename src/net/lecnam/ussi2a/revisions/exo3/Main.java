package net.lecnam.ussi2a.revisions.exo3;

public class Main {

    public static void main(String[] args) {

        Client vibrac = new Client("vibrac");

        vibrac.getCompteCourant().setAutorisationDecouvert(300);
        vibrac.getCompteEpargneList().get(0).setTauxInteret(2);

        Operation versementInitial = new Operation(1000, "10/11/2019");

        Operation retrait = new Operation(-100, "10/11/2019");
        Operation retrait2 = new Operation(-100, "10/11/2019");
        Operation retrait3 = new Operation(-100, "10/11/2019");
        Operation retrait4 = new Operation(-100, "10/11/2019");
        Operation retrait5 = new Operation(-100, "10/11/2019");
        Operation retrait6 = new Operation(-1000, "10/11/2019");

        try {
            vibrac.getCompteCourant().ajoutOperation(versementInitial);
            System.out.println(vibrac.getCompteCourant().toString());

            vibrac.getCompteCourant().ajoutOperation(retrait);
            vibrac.getCompteCourant().ajoutOperation(retrait2);
            vibrac.getCompteCourant().ajoutOperation(retrait3);
            vibrac.getCompteCourant().ajoutOperation(retrait4);
            vibrac.getCompteCourant().ajoutOperation(retrait5);
            System.out.println(vibrac.getCompteCourant().toString());

            vibrac.getCompteCourant().ajoutOperation(retrait6);
            System.out.println(vibrac.getCompteCourant().toString());



        } catch (SoldeMiniException e) {
            System.out.println(e.getMessage());
        } finally {
            vibrac.afficheDetailCompte();
            vibrac.getCompteCourant().listeOperation();
        }


    }

}
