package cz.hlubyluk.euler;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/** Problems runner. */
public class App {

    public static void main(String[] args) {
        try {
            Process process = Runtime.getRuntime().exec("/usr/local/bin/mvn test");
            process.waitFor();
            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line = "";
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
