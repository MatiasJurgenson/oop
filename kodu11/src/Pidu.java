import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Pidu {
    public static void main(String[] args) throws Exception{
        Map<String, String> külalineKutsuja = new HashMap<>();

        try (BufferedReader sisse = new BufferedReader(new InputStreamReader(new FileInputStream(args[0]),"UTF-8"));
        ) {
            String rida = sisse.readLine();
            while (rida != null) {
                String[] jupid = rida.split(" ");
                külalineKutsuja.put(jupid[1], jupid[0]);
                rida = sisse.readLine(); // loeb järgmise rea
            }
        }

        String külaline = args[1];
        while (külalineKutsuja.containsKey(külaline)) {
            külaline = külalineKutsuja.get(külaline);
        }

        System.out.println(külaline);
    }
}
