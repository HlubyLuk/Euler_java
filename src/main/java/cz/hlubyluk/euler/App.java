package cz.hlubyluk.euler;


import cz.hlubyluk.euler.problems.*;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

/**
 * Problems runner.
 */
public class App {

    private static final String TIME = "minutes %d, seconds %d, millis %d";
    private static final String SECONDS = "seconds=%d, nano=%d";
    private static final String RESULT = "result %s, interval %s";

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
        new Problem24().solve();
        new Problem25().solve();
        new Problem26().solve();
        new Problem27().solve();
        new Problem28().solve();
        new Problem29().solve();
        new Problem30().solve();
        new Problem31().solve();
        new Problem32().solve();
        new Problem33().solve();
        new Problem34().solve();
        new Problem35().solve();
        Instant finish = Instant.now();
        Duration between = Duration.between(start, finish);
        String time = String.format(SECONDS, between.getSeconds(), TimeUnit.NANOSECONDS.toMillis(between.getNano()));
        String format = String.format(RESULT, time, between);
        System.out.println(format);
    }
}
