package cz.hlubyluk.euler.entity;

/**
 * Southeast conner of {@link SubMatrix}.
 */
public class Coordinate {
    private final int x;
    private final int y;

    /**
     * Constructor.
     *
     * @param x coordinate.
     * @param y coordinate.
     */
    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Getter.
     *
     * @return x coordinate.
     */
    int getX() {
        return x;
    }

    /**
     * Getter.
     *
     * @return y coordinate.
     */
    int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
