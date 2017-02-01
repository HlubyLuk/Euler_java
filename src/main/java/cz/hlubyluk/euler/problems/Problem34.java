package cz.hlubyluk.euler.problems;

import java.util.Locale;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Digit factorials
 * Problem 34
 * <p/>
 * 145 is a curious number, as 1! + 4! + 5! = 1 + 24 + 120 = 145.
 * <p/>
 * Find the sum of all numbers which are equal to the sum of the factorial of their digits.
 * <p/>
 * Note: as 1! = 1 and 2! = 2 are not sums they are not included.
 * <p/>
 * Created by HlubyLuk on 01/02/2017.
 */
public class Problem34 extends Problem {
    @Override
    public Number solve() {
        return IntStream.range(3, this.factorial(9).intValue())
                .filter(this::isCuriousNumber)
                .sum();
    }

    private boolean isCuriousNumber(int number) {
        return String.valueOf(number)
                .chars()
                .map(x -> this.factorial(x - '0').intValue())
                .sum() == number;
    }
}
