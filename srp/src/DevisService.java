import java.time.LocalDate;

public class DevisService {

    public void creerDevis(double montantHT) {
        double tva = montantHT * 0.2;
        double total = montantHT + tva;

        // Affichage
        AffichageDocument.afficherDevis(montantHT, tva, total);

        // Sauvegarde fichier
        SauvegardeDocument.sauvergardeDevis(montantHT, tva, total);
    }

}
