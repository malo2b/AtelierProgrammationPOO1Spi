public class DeFaceAutre extends De {

    private Face [] mesFaces;

    public DeFaceAutre(int nbFaces, String nom) {
        super(nbFaces, nom);
        mesFaces = new Face[nbFaces];
    }

    public void setValeurFace(int index, String valeur) { // Type : 0 = int; 1 = float; 2 = String
        mesFaces[index] = new FaceString();
        mesFaces[index].setValeur(valeur);
    }

    public void setValeurFace(int index, int valeur) {
        mesFaces[index] = new FaceInt();
        mesFaces[index].setValeur(valeur);
    }

    public void setValeurFace(int index, float valeur) {
        mesFaces[index] = new FaceFloat();
        mesFaces[index].setValeur(valeur);
    }

    public String valeurFace(int numeroFace) {
        return mesFaces[numeroFace].retourneValeur();
    }
}
