public class CompteBancaire {
    protected double solde = 100;

    public boolean peutRetirer() {
        return true;
    }

    public void retirer(double montant) {
        if (!peutRetirer()) {
            System.out.println("Retrait impossible pour ce type de compte.");
            System.out.println("Solde actuel : " + solde);
            return;
        }
        solde -= montant;
        System.out.println("Retrait effectué. Nouveau solde : " + solde);
    }
}
