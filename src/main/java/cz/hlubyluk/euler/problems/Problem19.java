package cz.hlubyluk.euler.problems;

import org.joda.time.DateTimeConstants;
import org.joda.time.LocalDate;

/**
 * Counting Sundays
 * Problem 19
 * <p>
 * You are given the following information, but you may prefer to do some research for yourself.
 * <p>
 * 1 Jan 1900 was a Monday.
 * Thirty days has September,
 * April, June and November.
 * All the rest have thirty-one,
 * Saving February alone,
 * Which has twenty-eight, rain or shine.
 * And on leap years, twenty-nine.
 * A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
 * <p>
 * How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?
 * <p>
 * Created by HlubyLuk on 13.08.16.
 */
public class Problem19 extends Problem {
    @Override
    public void solve() {
        LocalDate start = new LocalDate(1901, 1, 1);
        LocalDate stop = new LocalDate(2000, 12, 31);
        int ret = 0;

        while (start.isBefore(stop)) {
            if (start.getDayOfWeek() == DateTimeConstants.SUNDAY) {
                ret++;
            }

            start = start.plusMonths(1);
        }

        System.out.println(ret);
    }
}
