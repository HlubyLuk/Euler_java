package cz.hlubyluk.euler.problems;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * The nth term of the sequence of triangle numbers is given by, tn = ½n(n+1); so the first ten
 * triangle numbers are:
 *
 * <p>1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
 *
 * <p>By converting each letter in a word to a number corresponding to its alphabetical position and
 * adding these values we form a word value. For example, the word value for SKY is 19 + 11 + 25 =
 * 55 = t10. If the word value is a triangle number then we shall call the word a triangle word.
 *
 * <p>Using words.txt (right click and 'Save Link/Target As...'), a 16K text file containing nearly
 * two-thousand common English words, how many are triangle words?
 *
 * @author HlubyLuk
 */
public final class Problem42 extends Problem {

    public String[] getData() {
        try {
            String root = System.getProperty("user.dir");
            Path path = Paths.get(root + "/src/main/java/cz/hlubyluk/euler/assets/p042_words.txt");
            byte[] bytes = Files.readAllBytes(path);
            String nameText = new String(bytes);
            nameText = nameText.replaceAll("[\"]", "");
            return nameText.split(",");
        } catch (IOException e) {
            throw new RuntimeException("File not found!!!");
        }
    }

    @Override
    public Number solve() {
        int result = 0;
        Map<Integer, Integer> buffer = new TreeMap<>();
        for (String item : this.getData()) {
            int values = 0;
            for (char c : item.toCharArray()) {
                values += c - 'A' + 1;
            }
            if (!buffer.containsValue(values) || buffer.isEmpty()) {
                Set<Integer> keys = buffer.keySet();
                int i = keys.isEmpty() ? 1 : new LinkedList<>(keys).getLast() + 1;
                for (; ; i += 1) {
                    int triangle = i * (i + 1) / 2;
                    if (triangle > values) {
                        break;
                    }
                    buffer.put(i, triangle);
                }
            }
            if (buffer.containsValue(values)) {
                result += 1;
            }
        }
        return result;
    }
}
