public class AffichageDocument {
    public static void afficherFacture(String clientName, double montantHT, double tva, double total) {
        System.out.println("\n--- FACTURE ---");
        System.out.println("Date : " + java.time.LocalDate.now());
        System.out.println("Client : " + clientName);
        System.out.println("Montant HT : " + montantHT);
        System.out.println("TVA : " + tva);
        System.out.println("Total TTC : " + total);
    }

    public static void afficherDevis(double montantHT, double tva, double total) {
        System.out.println("\n--- DEVIS ---");
        System.out.println("Date : " + java.time.LocalDate.now());
        System.out.println("Montant HT : " + montantHT);
        System.out.println("TVA : " + tva);
        System.out.println("Total TTC : " + total);
        System.out.println("Valable 30 jours");
    }
}
