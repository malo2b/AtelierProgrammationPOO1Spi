public class FaceInt extends Face{

    private int valeur;

    public int getValeur() {
        return valeur;
    }

    public String retourneValeur() {
        return String.valueOf(valeur);
    }

    public void setValeur(Object valeur) {
        this.valeur = (int)valeur;
    }
}
