package service;

import data.Voiture;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatistiqueTest {

    @Test
    void ZeroVoiture() {
        StatistiqueImpl stat = new StatistiqueImpl();
        Assertions.assertThrows(ArithmeticException.class, stat::prixMoyen);
    }

    @Test
    void UneVoiture() {
        StatistiqueImpl stat = new StatistiqueImpl();
        Echantillon e = new Echantillon(1, 150000);
        stat.ajouter(new Voiture("Ariel", 150000, "123AB12"));
        Assertions.assertTrue(e.equals(stat.prixMoyen()));
    }

    @Test
    void DeuxVoitures() {
        StatistiqueImpl stat = new StatistiqueImpl();
        Echantillon e = new Echantillon(2, 45000);
        stat.ajouter(new Voiture("Catheram", 40000, "456CD45"));
        stat.ajouter(new Voiture("Datsun", 50000, "789EF78"));
        Assertions.assertTrue(e.equals(stat.prixMoyen()));
    }
}
