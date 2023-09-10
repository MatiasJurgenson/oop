import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Peaklass {

    public static List<Tee> loeTeed(String failiNimi) throws Exception{
        List<Tee> teed = new ArrayList<>();

        File fail = new File(failiNimi);
        if (fail.exists()) {
            try (Scanner sc = new Scanner(fail, "UTF-8")) {
                while (sc.hasNextLine()) {
                    String rida = sc.nextLine();
                    String[] osad = rida.split("/");

                    teed.add(new Tee(osad[0], Double.parseDouble(osad[1]), Integer.parseInt(osad[2])));
                }
            }
        } else {
            System.out.println("Sellist faili pole");
        }
        return teed;
    }
    public static void main(String[] args) throws Exception{
        List<Tee> teed = loeTeed("teed.txt");

        Traktor traktor1 = new Traktor("123 UWU");
        Traktor traktor2 = new Traktor("360 YES");
        Traktor traktor3 = new Traktor("421 LMG");

        Maastur maastur1 = new Maastur("001 AAA", "01 AA");
        Maastur maastur2 = new Maastur("999 XYZ", "99 XY");

        Koristusmasin[] koristusmasinad = new Koristusmasin[] {traktor1, traktor2, traktor3, maastur1, maastur2};

        Collections.sort(teed);


        for (Tee tee : teed) {
            int index = (int)(Math.random() * 5);
            koristusmasinad[index].korista(tee);
        }

        System.out.println("");

        for (Koristusmasin koristusmasin : koristusmasinad) {
            System.out.println(koristusmasin.toString());
        }

    }
}