public class RemiseEtudiant implements Remise {
    @Override
    public double appliquerRemise(double montant) {
        return montant * 0.9;
    }
}
