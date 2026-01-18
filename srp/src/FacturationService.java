import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class FacturationService {

    public void creerFacture(double montantHT, String clientName) {
        double tva = montantHT * 0.2;
        double total = montantHT + tva;

        // Affichage
        AffichageDocument.afficherFacture(clientName, montantHT, tva, total);

        // Sauvegarde fichier
        SauvegardeDocument.sauvergardeFacturation(clientName, montantHT, tva, total);
    }
}
