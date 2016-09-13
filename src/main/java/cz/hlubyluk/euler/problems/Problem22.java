package cz.hlubyluk.euler.problems;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

/**
 * Names scores
 * Problem 22
 * <p>
 * Using names.txt (in assets folder), a 46K text file containing over five-thousand first names,
 * begin by sorting it into alphabetical order. Then working out the alphabetical value for each name,
 * multiply this value by its alphabetical position in the list to obtain a name score.
 * <p>
 * For example, when the list is sorted into alphabetical order,
 * COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list.
 * So, COLIN would obtain a score of 938 × 53 = 49714.
 * <p>
 * What is the total of all the name scores in the file?
 * <p>
 * Created by HlubyLuk on 14.08.16.
 */
public class Problem22 extends Problem {

    @Override
    public void solve() {
        BigInteger ret = BigInteger.ZERO;

        String[] names = getNames();

        Arrays.parallelSort(names);

        for (int i = 0; i < names.length; i++) {
            String name = names[i];

            int charactersScore = 0;
            for (int j = 0; j < name.length(); j++) {
                int characterNumber = Character.codePointAt(name, j) - 'A' + 1;

                charactersScore += characterNumber;
            }

            int nameSchore = (i + 1) * charactersScore;
            BigInteger val = new BigInteger(String.valueOf(nameSchore));
            ret = ret.add(val);
        }

        System.out.println(ret);
    }

    /**
     * Open text file with names and read into array.
     *
     * @return Parsed array names.
     */
    private String[] getNames() {
        try {
            String root = System.getProperty("user.dir");
            Path path = Paths.get(root + "/src/main/java/cz/hlubyluk/euler/assets/manes.txt");
            byte[] bytes = Files.readAllBytes(path);

            String nameText = new String(bytes);
            nameText = nameText.replaceAll("[\"]", "");

            return nameText.split(",");
        } catch (IOException e) {
            throw new RuntimeException("File not found!!!");
        }
    }
}
