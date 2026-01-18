public class PEL extends CompteBancaire {
    private final double tauxInteret = 0.03;

    @Override
    public boolean peutRetirer() {
        return false;
    }
}
