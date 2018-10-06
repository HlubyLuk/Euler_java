package cz.hlubyluk.euler.problems;

/**
 * The number, 1406357289, is a 0 to 9 pandigital number because it is made up of each of the digits
 * 0 to 9 in some order, but it also has a rather interesting sub-string divisibility property.
 *
 * <p>Let d1 be the 1st digit, d2 be the 2nd digit, and so on. In this way, we note the following:
 *
 * <p>d2d3d4=406 is divisible by 2
 *
 * <p>d3d4d5=063 is divisible by 3
 *
 * <p>d4d5d6=635 is divisible by 5
 *
 * <p>d5d6d7=357 is divisible by 7
 *
 * <p>d6d7d8=572 is divisible by 11
 *
 * <p>d7d8d9=728 is divisible by 13
 *
 * <p>d8d9d10=289 is divisible by 17
 *
 * <p>Find the sum of all 0 to 9 pandigital numbers with this property.
 *
 * @author HlubyLuk
 */
public final class Problem43 extends Problem {

    @Override
    public Number solve() {
        long tmp = 0l;
        int[] sequence = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] test = {2, 3, 5, 7, 11, 13, 17};
        do {
            boolean check = true;
            for (int i = 0; i < test.length && check; i += 1) {
                check &= this.toNumber(sequence, i + 1, 3) % test[i] == 0;
            }
            if (check) {
                tmp += this.toNumber(sequence, 0, sequence.length);
            }
        } while (this.nextLexicographicPermutations(sequence));
        return tmp;
    }

    private long toNumber(int[] arr, int from, int steps) {
        long tmp = 0;
        for (int i = from; i < from + steps; i += 1) {
            tmp = tmp * 10 + arr[i];
        }
        return tmp;
    }
}
