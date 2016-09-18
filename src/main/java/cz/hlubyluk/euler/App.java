package cz.hlubyluk.euler;


import cz.hlubyluk.euler.problems.*;
import org.joda.time.Instant;
import org.joda.time.Interval;
import org.joda.time.Period;

/**
 * Problems runner.
 */
public class App {

    private static final String TIME = "minutes %d, seconds %d, millis %d";
    private static final String RESULT = "result %s, iterval %s";

    public static void main(String[] args) {
        Instant start = Instant.now();

        System.out.println(new Problem1().solve());
        System.out.println(new Problem2().solve());
        System.out.println(new Problem3().solve());
        System.out.println(new Problem4().solve());
        System.out.println(new Problem5().solve());
        System.out.println(new Problem6().solve());
        System.out.println(new Problem7().solve());
        System.out.println(new Problem8().solve());
        System.out.println(new Problem9().solve());
        System.out.println(new Problem10().solve());
        System.out.println(new Problem11().solve());
        System.out.println(new Problem12().solve());
        System.out.println(new Problem13().solve());
        System.out.println(new Problem14().solve());
        System.out.println(new Problem15().solve());
        System.out.println(new Problem16().solve());
        System.out.println(new Problem17().solve());
        System.out.println(new Problem18().solve());
        System.out.println(new Problem19().solve());
        System.out.println(new Problem20().solve());
        System.out.println(new Problem21().solve());
        System.out.println(new Problem22().solve());
        System.out.println(new Problem23().solve());
        System.out.println(new Problem24().solve());
        System.out.println(new Problem25().solve());
        System.out.println(new Problem26().solve());
        System.out.println(new Problem27().solve());

        Instant finish = Instant.now();

        Interval interval = new Interval(start, finish);
        Period period = interval.toPeriod();

        int minutes = period.getMinutes();
        int seconds = period.getSeconds();
        int millis = period.getMillis();

        String time = String.format(TIME, minutes, seconds, millis);
        String format = String.format(RESULT, time, interval.toString());
        System.out.println(format);
    }
}
