import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Peaklass {
    public static ArrayList<Teos> loeTeosed(String failinimi) throws Exception {
        ArrayList<Teos> teosed = new ArrayList<>();

        File fail = new File(failinimi);
        if (fail.exists()) {
            try (Scanner sc = new Scanner(fail, "UTF-8")) {
                while (sc.hasNextLine()) {
                    String rida = sc.nextLine();
                    String[] jupid = rida.split("; ");

                    if (rida.contains("/")) {
                        teosed.add(new Ajakiri(jupid[0], jupid[1], jupid[2], jupid[3]));
                    }
                }
            }
        } else {
            System.out.println("Sellist faili pole");
        }
        return teosed;
    }

    public static void main(String[] args) throws Exception {
        List<Teos> teosed = loeTeosed("laenutus.txt");

        Collections.sort(teosed);

        ViiviseHoiataja viiviseHoiataja = new ViiviseHoiataja(0.2);
        SuurimaViiviseLeidja suurimaViiviseLeidja = new SuurimaViiviseLeidja();

        for (Teos teos : teosed) {
            teos.arvutaViivis(viiviseHoiataja);
            teos.arvutaViivis(suurimaViiviseLeidja);
        }

        System.out.println("laenutajad üle tähtaja");
        for (String s : viiviseHoiataja.getHoiatatavadLaenutajad()) {
            System.out.println(s);
        }

        suurimaViiviseLeidja.saadaHoiatus();

    }
}