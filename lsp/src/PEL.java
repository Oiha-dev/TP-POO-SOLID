public class PEL implements Affichable {
    private double solde = 100;
    private final double tauxInteret = 0.03;

    @Override
    public double getSolde() {
        return solde;
    }
}
