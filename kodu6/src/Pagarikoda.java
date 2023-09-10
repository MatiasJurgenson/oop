import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Pagarikoda {
    static List<Kook> loeKoogid(String failiNimi) throws Exception {
        List<Kook> koogid = new ArrayList<>();
        File fail = new File(failiNimi);
        try (Scanner scanner = new Scanner(fail, "UTF-8")) {
            while (scanner.hasNextLine()) {
                String rida = scanner.nextLine();
                String[] massiiv = rida.split("; ");
                if (massiiv.length == 4) {
                    Kook kook = new ÜmmarguneKook(massiiv[0], LocalDate.parse(massiiv[1]), Double.parseDouble(massiiv[2]), Double.parseDouble(massiiv[3]));
                    koogid.add(kook);
                } else if (massiiv.length == 5) {
                    Kook kook = new RistkülikukujulineKook(massiiv[0], LocalDate.parse(massiiv[1]), Double.parseDouble(massiiv[2]), Double.parseDouble(massiiv[3]), Double.parseDouble(massiiv[4]));
                    koogid.add(kook);
                } else {
                    Kook kook = new KolmnurkneKook(massiiv[0], LocalDate.parse(massiiv[1]), Double.parseDouble(massiiv[2]), Double.parseDouble(massiiv[3]), Double.parseDouble(massiiv[4]), Double.parseDouble(massiiv[5]));
                    koogid.add(kook);
                }
            }
        }
        return koogid;
    }
    public static void main(String[] args) throws Exception {
        List<Kook> koogid = loeKoogid("koogid.txt");
        Collections.sort(koogid);
        for (Kook kook : koogid) {
            System.out.println(kook);
        }
    }
}
