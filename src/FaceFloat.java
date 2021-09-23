public class FaceFloat extends Face {

    private float valeur;

    public float getValeur() {
        return valeur;
    }

    public String retourneValeur() {
        return String.valueOf(valeur);
    }

    public void setValeur(Object valeur) {
        this.valeur = (Float)valeur;
    }
}