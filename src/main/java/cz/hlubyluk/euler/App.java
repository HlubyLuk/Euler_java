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
        System.out.println(new Problem28().solve());
        System.out.println(new Problem29().solve());
        System.out.println(new Problem30().solve());
        System.out.println(new Problem31().solve());
        System.out.println(new Problem32().solve());
        System.out.println(new Problem33().solve());
        System.out.println(new Problem34().solve());
        System.out.println(new Problem35().solve());
        System.out.println(new Problem36().solve());
        System.out.println(new Problem37().solve());
        Instant finish = Instant.now();
        Duration between = Duration.between(start, finish);
        String time = String.format(SECONDS, between.getSeconds(), TimeUnit.NANOSECONDS.toMillis(
                between.getNano()));
        String format = String.format(RESULT, time, between);
        System.out.println(format);
    }
}
