package cz.hlubyluk.euler.problems;

import java.math.BigDecimal;

/**
 * Self powers Problem 48 
 * The series, 1^1 + 2^2 + 3^3 + ... + 10^10 = 10405071317.
 *
 * Find the last ten digits of the series, 1^1 + 2^2 + 3^3 + ... + 1000^1000.
 * @author HlubyLuk
 */
public class Problem48 extends Problem {

	@Override
	public Number solve() {
		BigDecimal tmp = BigDecimal.ZERO;
		for (int i = 1; i <= 1000; i += 1) {
			tmp = tmp.add(new BigDecimal(i).pow(i));
		}
		String x = String.valueOf(tmp);
		return Long.valueOf(x.substring(x.length() - 10));
	}

}
