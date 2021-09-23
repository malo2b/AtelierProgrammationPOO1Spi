import java.util.*;

/**
 * de
 */
public class De {
    protected static int nbrDe = 1;

    protected static Random r = new Random();
    protected String nom;
    protected int nbFaces;

    public De() {
        this.nbFaces = 6;
        this.nom = "Dé n°" + nbrDe;
        nbrDe++;
    }

    public De(int nbFaces) {
        this();
        setNbFaces(nbFaces);
    }

    public De(int nbFaces, String nom) {
        this(nbFaces);
        if (nom != null && nom.length() > 0) {
            this.nom = nom;
        } else {
            this.nom = "Dé n°" + nbrDe;
        }
    }

    public int getNbFaces() {
        return nbFaces;
    }

    public void setNbFaces(int nbFaces) {
        if (nbFaces >= 3 && nbFaces <= 120) {
            this.nbFaces = nbFaces;
        } else {
            System.err.println("Veuillez saisir un nombre de face compris entre 3 et 120");
        }
    }

    public String getNom() {
        return nom;
    }

    public static int getNbrDe() {
        return nbrDe;
    }

    public int lancer() {
        return r.nextInt(nbFaces) + 1;
    }

    public int lancer(int nbLancer) {
        int meilleurNombre = 0;
        int resultatTirage = 0;
        for (int i = 0; i < nbLancer; i++) {
            resultatTirage = lancer();
            if (resultatTirage > meilleurNombre) {
                meilleurNombre = resultatTirage;
            }
        }
        return meilleurNombre;
    }

    @Override
    public String toString() {
        return "Nom : " + this.nom + ", Nombre faces = " + this.nbFaces;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof De && this.nbFaces == ((De)obj).nbFaces;
    }
}