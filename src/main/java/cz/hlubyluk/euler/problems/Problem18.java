package cz.hlubyluk.euler.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Maximum path sum I
 * Problem 18
 * <p>
 * By starting at the top of the triangle below and moving to adjacent numbers on the row below,
 * the maximum total from top to bottom is 23.
 * <p>
 * 3
 * 7 4
 * 2 4 6
 * 8 5 9 3
 * <p>
 * That is, 3 + 7 + 4 + 9 = 23.
 * <p>
 * Find the maximum total from top to bottom of the triangle below:
 * <p>
 * 75
 * 95  64
 * 17  47  82
 * 18  35  87  10
 * 20  04  82  47  65
 * 19  01  23  75  03  34
 * 88  02  77  73  07  63  67
 * 99  65  04  28  06  16  70  92
 * 41  41  26  56  83  40  80  70  33
 * 41  48  72  33  47  32  37  16  94  29
 * 53  71  44  65  25  43  91  52  97  51  14
 * 70  11  33  28  77  73  17  78  39  68  17  57
 * 91  71  52  38  17  14  91  43  58  50  27  29  48
 * 63  66  04  68  89  53  67  30  73  16  69  87  40  31
 * 04  62  98  27  23  09  70  98  73  93  38  53  60  04  23
 * <p>
 * NOTE: As there are only 16384 routes, it is possible to solve this problem by trying every route. However, Problem 67, is the same challenge with a triangle containing one-hundred rows; it cannot be solved by brute force, and requires a clever method! ;o)
 * <p>
 * Created by HlubyLuk on 13.08.16.
 */
public class Problem18 extends Problem {
    private static final String MAIN_TRIANGLE =
            "75\n" +
                    "95 64\n" +
                    "17 47 82\n" +
                    "18 35 87 10\n" +
                    "20 04 82 47 65\n" +
                    "19 01 23 75 03 34\n" +
                    "88 02 77 73 07 63 67\n" +
                    "99 65 04 28 06 16 70 92\n" +
                    "41 41 26 56 83 40 80 70 33\n" +
                    "41 48 72 33 47 32 37 16 94 29\n" +
                    "53 71 44 65 25 43 91 52 97 51 14\n" +
                    "70 11 33 28 77 73 17 78 39 68 17 57\n" +
                    "91 71 52 38 17 14 91 43 58 50 27 29 48\n" +
                    "63 66 04 68 89 53 67 30 73 16 69 87 40 31\n" +
                    "04 62 98 27 23 09 70 98 73 93 38 53 60 04 23";

    @Override
    public void solve() {
        int[][] triangle = parseTriangle();

        for (int i = triangle.length - 1; i > 0; i--) {
            for (int j = 0; j < triangle[i].length - 1; j++) {
                triangle[i - 1][j] += Math.max(triangle[i][j], triangle[i][j + 1]);
            }
        }

        System.out.println(triangle[0][0]);
    }

    private int[][] parseTriangle() {
        String[] rows = MAIN_TRIANGLE.split("\\n");
        int lengthRows = rows.length;
        int[][] ret = new int[lengthRows][];

        for (int i = 0; i < lengthRows; i++) {
            String row = rows[i];
            String[] cells = row.split(" ");
            int lengthCells = cells.length;
            int[] tmp = new int[lengthCells];

            for (int j = 0; j < lengthCells; j++) {
                String cell = cells[j];
                tmp[j] = Integer.valueOf(cell);
            }

            ret[i] = tmp;
        }

        return ret;
    }

    private class Coordinate {
        private int x, y;

        public Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return String.format("x = %d, y = %d", x, y);
        }

        private class Triangle {
            private Coordinate a, b, c;

            public Triangle(Coordinate a, Coordinate b, Coordinate c) {
                this.a = a;
                this.b = b;
                this.c = c;
            }

            @Override
            public String toString() {
                return String.format("a = %s, b = %s, c = %s", a, b, c);
            }
        }
    }
}