public class CalculateurRemise {

    public double calculerTotal(int typeClient, double montant) {
        Remise strategie = obtenirStrategie(typeClient);
        return strategie.appliquerRemise(montant);
    }

    private Remise obtenirStrategie(int typeClient) {
        switch (typeClient) {
            case 1:
                return new RemiseStandard();
            case 2:
                return new RemiseEtudiant();
            case 3:
                return new RemiseVIP();
            default:
                System.out.println("Type client inconnu");
                return new RemiseStandard();
        }
    }
}
