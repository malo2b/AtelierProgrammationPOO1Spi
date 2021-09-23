public class App {
    public static void main(String[] args) throws Exception {
        // De monDe = new De();
        // System.out.println("Mon dé s'appelle : " + monDe.getNom());
        // System.out.println("Il possède : " + monDe.getNbFaces() + " faces !");
        // De monNouveauDe = new De(4);
        // System.out.println("Mon nouveau dé possède " + monNouveauDe.getNbFaces() + " faces !");
        // System.out.println("Je lance mon dé et obtien la valeur : " + monDe.lancer());
        // System.out.println("Je lance mon nouveau dé et obtien la valeur : " + monNouveauDe.lancer());

        // De monDeParDefaut = new De();
        // System.out.println("Mon dé par defaut possède " + monNouveauDe.getNbFaces() + " faces et s'appelle " + monNouveauDe.getNom());
        // System.out.println("Je lance mon dé par déaut 6 fois et obtient comme meilleur resultat : " + monDeParDefaut.lancer(6));

        // System.out.println(monDeParDefaut);
        // System.out.println("Est ce que monDe = monDeParDefaut : " + monDe.equals(monDeParDefaut));

        // DePipe monDePipe = new DePipe(6, "Dé Pipé", 3);
        // for (int i = 0; i < 6; i++) {
        //     System.out.println("Je lance mon dé pipé et obtien la valeur : " + monDePipe.lancer());
        // }

        // DeEffetMemoire monDeEffetMemoire = new DeEffetMemoire(6, "Mon dé a effet mémoire");
        // System.out.println("Mon dé a effet mémoire : " + monDeEffetMemoire);
        // for (int i = 0; i < 10; i++) {
        //     System.out.println("Je lance mon dé a éffet mémoire et obtient la valeur : " + monDeEffetMemoire.lancer());
        // }

        DeFaceAutre monDeFaceAutre = new DeFaceAutre(4,"Mon dé a face autres");
        monDeFaceAutre.setValeurFace(0,0); // Face 0 vaut 0
        monDeFaceAutre.setValeurFace(1,"Bois 1 shot"); // Face 1 vaut "Bois un shot"
        monDeFaceAutre.setValeurFace(2,1.25f); // Face 2 vaut 1,25
        monDeFaceAutre.setValeurFace(3,"Fait 5 pompes"); // Face 3 vaut "Patate dans la tete du joueur de droite"
        for (int i = 0; i < 5; i++) {
            System.out.println(
                "Resultat du tirage du dé : " +
                monDeFaceAutre.valeurFace(
                    monDeFaceAutre.lancer()-1
                )
            );
        }
    }
}
