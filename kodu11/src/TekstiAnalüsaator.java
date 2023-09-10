import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

import static java.nio.file.Files.newBufferedWriter;
import static java.nio.file.Files.readString;

public class TekstiAnalüsaator {
    public String tekst;

    public TekstiAnalüsaator(String tekst) {
        this.tekst = tekst.replace(System.lineSeparator(), " ");
    }

    public TekstiAnalüsaator(File file, String kodeering) throws IOException {
        this.tekst = readString(file.toPath(), Charset.forName(kodeering)).replace(System.lineSeparator(), " ");
    }

    public Map<String, Integer> sõnadeSagedus() {
        String[] sõned = tekst.split(" ");

        Map<String, Integer> sõnad = new HashMap<>();

        if (sõned[0].equals("")) {
            return sõnad;
        }

        for (String sõna : sõned) {

            sõnad.merge(sõna, 1, Integer::sum);
        }
        return sõnad;
    }

    public Map<String, Map<String, Integer>> sõnadeJärgnevus() {
        String[] sõned = tekst.split(" ");

        Map<String, Map<String, Integer>> järgnemine = new HashMap<>();

        for (int i = 0; i < sõned.length - 1; i++) {
            Map<String, Integer> kujutis = järgnemine.get(sõned[i]);

            if (kujutis == null) {
                järgnemine.put(sõned[i], new HashMap<String, Integer>());
                järgnemine.get(sõned[i]).put(sõned[i+1], 1);
            } else {
                Integer number = kujutis.get(sõned[i+1]);

                if (number == null)
                    järgnemine.get(sõned[i]).put(sõned[i+1], 1);
                else {

                    järgnemine.get(sõned[i]).put(sõned[i+1], number + 1);
                }
            }
        }
        return järgnemine;
    }
}
