package cz.hlubyluk.euler;


import cz.hlubyluk.euler.problems.*;
import org.joda.time.Instant;
import org.joda.time.Interval;
import org.joda.time.Period;

/**
 * Problems runner.
 */
public class App {
    public static void main(String[] args) {
        Instant start = Instant.now();

        new Problem1().solve();
        new Problem2().solve();
        new Problem3().solve();
        new Problem4().solve();
        new Problem5().solve();
        new Problem6().solve();
        new Problem7().solve();
        new Problem8().solve();
        new Problem9().solve();
        new Problem10().solve();
        new Problem11().solve();
        new Problem12().solve();
        new Problem13().solve();
        new Problem14().solve();
        new Problem15().solve();
        new Problem16().solve();
        new Problem17().solve();
        new Problem18().solve();
        new Problem19().solve();
        new Problem20().solve();
        new Problem21().solve();
        new Problem22().solve();
        new Problem23().solve();

        Instant finish = Instant.now();

        Interval interval = new Interval(start, finish);
        Period period = interval.toPeriod();

        int minutes = period.getMinutes();
        int seconds = period.getSeconds();
        int millis = period.getMillis();

        String time = String.format("minutes %d, seconds %d, millis %d", minutes, seconds, millis);
        String format = String.format("result %s, iterval %s", time, interval.toString());
        System.out.println(format);
    }
}
