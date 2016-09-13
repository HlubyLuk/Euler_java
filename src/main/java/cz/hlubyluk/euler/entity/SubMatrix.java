package cz.hlubyluk.euler.entity;


import java.util.Arrays;

/**
 * Subset of matrix.
 */
public class SubMatrix implements Comparable<SubMatrix> {

    private final Coordinate startPoint;
    /**
     * row, column, main diagonal, secondary diagonal
     */
    private int[] products = new int[4];
    /**
     * row, column, main diagonal, secondary diagonal
     */
    private int direction;
    /**
     * Original matrix.
     */
    private int[][] matrix;
    /**
     * Length of edge.
     */
    private int edgeLength;

    /**
     * Constructor.
     *
     * @param startPoint {@link Coordinate}.
     */
    public SubMatrix(Coordinate startPoint) {
        this.startPoint = startPoint;
    }

    /**
     * Start of computing products of {@link SubMatrix}.
     */
    public void computeMaxProduct() {
        int row = startPoint.getX();
        int column = startPoint.getY();

        products[0] = rowsMax(row, column);
        products[1] = columnMax(row, column);
        products[2] = mainDiagonalMax(row);
        products[3] = otherDiagonal(row, column);
    }

    /**
     * Compute product of other diagonal.
     *
     * @param row    start from row.
     * @param column start from column.
     * @return sum of other diagonal.
     */
    private int otherDiagonal(int row, int column) {
        return matrix[row][column + 3] *
                matrix[row + 1][column + 2] *
                matrix[row + 2][column + 1] *
                matrix[row + 3][column];

    }

    /**
     * Compute product of main diagonal.
     *
     * @param row start from row.
     * @return sum of main diagonal.
     */
    private int mainDiagonalMax(int row) {
        int ret = 1;

        for (int i = row; i < edgeLength; i++) {
            ret *= matrix[i][i];
        }

        return ret;
    }

    /**
     * Compute maximum sum of {@link SubMatrix} in columns.
     *
     * @param row    start from row.
     * @param column start from column.
     * @return max sum.
     */
    private int columnMax(int row, int column) {
        int ret = Integer.MIN_VALUE;

        for (int y = column; y < column + edgeLength; y++) {
            int temp = matrix[row][y] *
                    matrix[row + 1][y] *
                    matrix[row + 2][y] *
                    matrix[row + 3][y];

            if (ret < temp) {
                ret = temp;
            }
        }

        return ret;
    }

    /**
     * Compute maximum sum of {@link SubMatrix} in rows.
     *
     * @param row    start from row.
     * @param column start from column.
     * @return max sum.
     */
    private int rowsMax(int row, int column) {
        int ret = Integer.MIN_VALUE;

        for (int x = row; x < row + edgeLength; x++) {
            int temp = matrix[x][column] *
                    matrix[x][column + 1] *
                    matrix[x][column + 2] *
                    matrix[x][column + 3];

            if (ret < temp) {
                ret = temp;
            }
        }

        return ret;
    }

    /**
     * Getter of maximum sum.
     *
     * @return max sum.
     */
    private int getMaxProduct() {
        int ret = Integer.MIN_VALUE;

        for (int i = 0; i < products.length; i++) {
            if (ret < products[i]) {
                ret = products[i];
                direction = i;
            }
        }

        return ret;
    }

    /**
     * Setter of {@link #matrix}.
     *
     * @param matrix two dimensions array fo {@link Integer}.
     */
    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    /**
     * Setter of {@link #edgeLength}.
     *
     * @param edgeLength length of sub-matrix edge.
     */
    public void setEdgeLength(int edgeLength) {
        this.edgeLength = edgeLength;
    }

    @Override
    public int compareTo(SubMatrix o) {
        int x = getMaxProduct();
        int y = o.getMaxProduct();

        return (x < y) ? -1 : ((x == y) ? 0 : 1);
    }

    @Override
    public String toString() {
        return "SubMatrix{" +
                "startPoint=" + startPoint +
                ", products=" + Arrays.toString(products) +
                ", maxProduct=" + getMaxProduct() +
                ", direction=" + direction +
                '}';
    }
}
