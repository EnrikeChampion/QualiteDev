package service;

import java.util.Objects;

/**
 * Classe de données qui permet d'encapsuler de données
 *   * Nombre de voitures
 *   * Prix moyen de ce nombre de voitures
 */
public class Echantillon {

    int nombreDeVoitures;
    int prixMoyen;

    public Echantillon(){}

    public Echantillon(int nombreDeVoitures, int prixMoyen) {
        this.nombreDeVoitures = nombreDeVoitures;
        this.prixMoyen = prixMoyen;
    }

    public int getNombreDeVoitures() {
        return nombreDeVoitures;
    }

    public void setNombreDeVoitures(int nombreDeVoitures) {
        this.nombreDeVoitures = nombreDeVoitures;
    }

    public int getPrixMoyen() {
        return prixMoyen;
    }

    public void setPrixMoyen(int prixMoyen) {
        this.prixMoyen = prixMoyen;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Echantillon that)) return false;
        return getNombreDeVoitures() == that.getNombreDeVoitures() && getPrixMoyen() == that.getPrixMoyen();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNombreDeVoitures(), getPrixMoyen());
    }
}