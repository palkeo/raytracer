package raytracer;

/**
 * Représente un plan par trois points. Un plan est vu comme un triangle
 * infini.
 */
public class Plane extends Triangle {

    /** Constructeur
     * @param texture La texture
     * @param P0
     * @param P1
     * @param P2
     */
    public Plane(Texture texture, Point3d P0, Point3d P1, Point3d P2) {
        super(texture, P0, P1, P2);
    }

    @Override
    protected boolean checkDontIntersect() {
        return lastSol == null;
    }
}

