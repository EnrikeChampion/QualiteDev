package enrike;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VoitureTest {

    @Test
    public void CreerVoiture() {
        Voiture voiture = new Voiture("Toyota", 20000, "123AB12");
        Assertions.assertEquals("Toyota", voiture.getMarque(), "Doit être Toyota");
        Assertions.assertEquals(20000, voiture.getPrix(), "Doit être 20000 euros");
        Assertions.assertEquals("123AB12", voiture.getPlaque(), "Doit être 123AB12");
    }

    @Test
    public void CreerVoitureException() {
        Assertions.assertThrows(IllegalStateException.class, () -> new Voiture("Toyota", 20000, "123AB123"));
    }

    @Test
    public void ChangerAttributsVoiture(){
        Voiture voiture = new Voiture("Nissan", 10000, "123AB12");
        voiture.setMarque("Subaru");
        voiture.setPrix(15000);
        voiture.setPlaque("456CD45");
        Assertions.assertEquals("Subaru", voiture.getMarque(), "Doit être Subaru");
        Assertions.assertEquals(15000, voiture.getPrix(), "Doit être 15000 euros");
        Assertions.assertEquals("456CD45", voiture.getPlaque(), "Doit être 456CD45");
    }

    @Test
    public void ChangerAttributsVoitureException(){
        Voiture voiture = new Voiture("Nissan", 10000, "123AB12");
        Assertions.assertThrows(IllegalStateException.class, () -> voiture.setPlaque("123AB123"));
    }
}
