package data;

public class Voiture {
    private String marque;
    private int prix;
    private String plaque;

    public Voiture(String marque, int prix, String plaque) {
        try {
            this.marque = marque;
            this.prix = prix;
            if (plaque.matches("[0-9]{3}[A-Z]{2}[0-9]{2}")) {
                this.plaque = plaque;
            } else {
                throw new IllegalStateException("Plaque invalide");
            }
        } catch(RuntimeException e) {
            System.out.println(e.getMessage() + " : " + plaque);
        }
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public String getPlaque() {
        return plaque;
    }

    public void setPlaque(String plaque) {
        try{
            if (plaque.matches("[0-9]{3}[A-Z]{2}[0-9]{2}")){
                this.plaque = plaque;
            } else {
                throw new IllegalStateException("Plaque invalide");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage() + " : " + plaque);
        }
    }

    @Override
    public String toString() {
        return "Cette voiture est une " + marque + " coûtant " + prix + " euros.";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Voiture voiture = (Voiture) obj;
        return prix == voiture.prix && marque.equals(voiture.marque);
    }
}
