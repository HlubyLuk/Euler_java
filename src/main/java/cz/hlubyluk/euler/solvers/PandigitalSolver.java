package cz.hlubyluk.euler.solvers;

import cz.hlubyluk.euler.utils.Constants;

import java.util.Locale;

/**
 * A number is said to be pandigital if it contains each of the digits from 0 to 9
 * (and whose leading digit must be nonzero). However, "zeroless" pandigital quantities contain the digits 1 through 9.
 * Sometimes exclusivity is also required so that each digit is restricted to appear exactly once.
 * For example, 6729/13458 is a (zeroless, restricted) pandigital fraction and 1023456789
 * is the smallest (zerofull) pandigital number.
 * <p>
 * Created by HlubyLuk on 17/10/2016.
 */
public class PandigitalSolver {
    private int multiplicand;
    private int multiplier;
    private int product;
    private boolean zeroLess;

    /**
     * Constructor.
     *
     * @param multiplicand number.
     * @param multiplier   number.
     */
    public PandigitalSolver(int multiplicand, int multiplier) {
        this.multiplicand = multiplicand;
        this.multiplier = multiplier;
        this.product = this.multiplicand * this.multiplier;
    }

    /**
     * Getter of product number.
     *
     * @return multiply of multiplicand and multiplier.
     */
    public int getProduct() {
        return product;
    }

    /**
     * Contains numbers from 0(1) to 9 and theirs multiplicand, multiplier and product together has only 10(9) digits.
     *
     * @param zeroLess contains zero.
     * @return {@link Boolean#TRUE} contains all, otherwise {@link Boolean#FALSE}.
     */
    public boolean isPandigital(boolean zeroLess) {
        this.zeroLess = zeroLess;

        return checkNumbers();
    }

    /**
     * Check multiplicand, multiplier and product contains all digits from 1 to 9 and has only 9 digits.
     *
     * @return {@link Boolean#TRUE} contains all digits and has only 9 digits, otherswise {@link Boolean#FALSE}.
     */
    private boolean checkNumbers() {
        String numbers = String.format(Locale.getDefault(), "%d%d%d", multiplicand, multiplier, this.product);
        boolean[] checkArray = {this.zeroLess, false, false, false, false, false, false, false, false, false};
        boolean tmp = true;
        int checkLength = this.zeroLess ? 9 : 10;

        if (numbers.length() != checkLength) {
            return false;
        }

        for (int i = 0; i < numbers.length(); i += 1) {
            char number = numbers.charAt(i);
            int character = number - Constants.ZERO_CHAR;

            if (!checkArray[character]) {
                checkArray[character] = true;
            }
        }

        for (boolean bool : checkArray) {
            tmp &= bool;
        }

        return tmp;
    }
}
