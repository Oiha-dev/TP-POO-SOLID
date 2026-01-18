public class CompteBancaire implements Affichable, Debiteable {
    protected double solde = 100;

    @Override
    public double getSolde() {
        return solde;
    }

    @Override
    public void retirer(double montant) {
        solde -= montant;
        System.out.println("Retrait effectué. Nouveau solde : " + solde);
    }
}
