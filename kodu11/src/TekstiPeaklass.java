import java.io.File;
import java.io.IOException;
import java.util.Map;

public class TekstiPeaklass {
    public static void main(String[] args) throws IOException {
        String sõne = "kala ujub ja ema hakkab kala praadima";
        String sõne1 = "kala";
        TekstiAnalüsaator tekstiAnalüsaator = new TekstiAnalüsaator("");
        TekstiAnalüsaator tekst = new TekstiAnalüsaator(new File("test.txt"), "UTF-8");
        Map<String, Integer> sõnad = tekstiAnalüsaator.sõnadeSagedus();
        Map<String, Integer> uus = tekst.sõnadeSagedus();

        Map<String, Map<String, Integer>> järgnemine = tekst.sõnadeJärgnevus();

        System.out.println(sõnad.entrySet());
        System.out.println(uus.entrySet());
        System.out.println(järgnemine);
        System.out.println(new TekstiAnalüsaator(sõne).sõnadeJärgnevus());
        System.out.println(new TekstiAnalüsaator(sõne1).sõnadeJärgnevus());
    }
}