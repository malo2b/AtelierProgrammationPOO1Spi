public class DePipe extends De {

    private final int minValue;

    public DePipe(int nbFaces, String nom, int minValue) {
        super(nbFaces,nom);
        if (minValue >= 1 && minValue <= nbFaces) {
            this.minValue = minValue;
        } else {
            this.minValue = 1;
        }
    }

    @Override
    public int lancer() {
        return minValue + r.nextInt(((nbFaces) + 1) - minValue);
    }
}
