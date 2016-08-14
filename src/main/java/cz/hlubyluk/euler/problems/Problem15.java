package cz.hlubyluk.euler.problems;

/**
 * Lattice paths
 * Problem 15
 * <p>
 * Starting in the top left corner of a 2×2 grid,
 * and only being able to move to the right and down,
 * there are exactly 6 routes to the bottom right corner.
 * <p>
 * How many such routes are there through a 20×20 grid?
 * <p>
 * Created by HlubyLuk on 13.08.16.
 */
public class Problem15 extends Problem {
    private static final int GRID_EDGE = 20;

    @Override
    public void solve() {
        long ret = binomialCoefficient(GRID_EDGE + GRID_EDGE, GRID_EDGE);

        String format = String.format("Count of routs is %d", ret);
        System.out.println(format);
    }
}
