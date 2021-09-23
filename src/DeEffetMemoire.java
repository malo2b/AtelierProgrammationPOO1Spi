/**
 * DeEffetMemoire
 */
public class DeEffetMemoire extends De {

    private int valeurPrecedente;

    public DeEffetMemoire(int nbFaces, String nom) {
        super(nbFaces,nom);
        valeurPrecedente = 0;
    }

    @Override
    public int lancer() {
        int tirage = r.nextInt(nbFaces + 1);
        while (tirage == valeurPrecedente) {
            tirage = r.nextInt(nbFaces + 1);
        }
        valeurPrecedente = tirage;
        return tirage;
    }

}