public class RemiseVIP implements Remise {
    @Override
    public double appliquerRemise(double montant) {
        return montant * 0.8;
    }
}
