package cz.hlubyluk.euler.entity;

import java.util.HashMap;

/**
 * Show key and his count.
 * Created by HlubyLuk on 18/11/2016.
 */
public class MapCounting extends HashMap<Integer, Integer> {
    private static final int DEFAULT = 0;
    private static final int START = DEFAULT;
    private static final int STEP = 1;

    /**
     * Constructor.
     * @param capacity of counter.
     */
    public MapCounting(int capacity) {
        for (int i = START; i <= capacity; i += STEP) this.put(i, DEFAULT);
    }

    /**
     * Increment count of key.
     * @param key to increment.
     */
    public void add(int key) {
        this.put(key, this.get(key) + 1);
    }
}
