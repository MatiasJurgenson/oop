import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TudengPeaklass {
    public static List<AineHinne> loePunktideFail(String failiNimi) throws Exception {
        List<AineHinne> hinded = new ArrayList<>();
        try (
                BufferedReader sisse = new BufferedReader(new InputStreamReader(new FileInputStream(failiNimi),"UTF-8"));
        ) {
            String rida = sisse.readLine();
            while (rida != null) {
                String[] jupid = rida.split(":");
                hinded.add(new AineHinne(jupid[0], jupid[1].split(",")));
                rida = sisse.readLine(); // loeb järgmise rea
            }
        }
        return hinded;
    }

    public static void main(String[] args) throws Exception {
        Tudeng tudeng = new Tudeng("Mingi Tudeng", loePunktideFail("punktid.txt.txt"));
        System.out.println(tudeng);
        tudeng.salvestaBinaarfaili("tudeng.bin");
        tudeng = Tudeng.loeBinaarfailist("tudeng.bin");
        System.out.println(tudeng);
    }
}
