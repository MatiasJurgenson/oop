import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Vaateratas vaaterattast = new Vaateratas();
        Lasketiir lasketiirust = new Lasketiir();
        Kloun IT = new Kloun("IT");

        TasulineLõbustus UwU = new TasulineLõbustus(2.25, vaaterattast);
        TasulineLõbustus OwO = new TasulineLõbustus(1.5, lasketiirust);
        VanuseKontrollija tujurikkuja = new VanuseKontrollija(10, OwO);


        LõbustavKloun kloun = new LõbustavKloun(IT);

        List<Lõbustus> lõbustused = new ArrayList<Lõbustus>();
        lõbustused.add(UwU);
        lõbustused.add(tujurikkuja);
        lõbustused.add(kloun);


        Lõbustuspark lõbustuspark = new Lõbustuspark(lõbustused);

        Külastaja peeter = new Külastaja(9);
        Külastaja paan = new Külastaja(11);

        lõbustuspark.alustaSeiklust(peeter);
        lõbustuspark.alustaSeiklust(paan);


    }
}