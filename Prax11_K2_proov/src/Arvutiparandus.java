import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Arvutiparandus {

    private static String[] getInfo(String infoSõne) {
        String[] info = infoSõne.split(";");
        if (info.length < 2 || info.length > 3) {
            throw new FormaadiErind("ebosobiv väljade arv: " + info.length);
        }
        return info;
    }

    public static boolean getOnKiirtöö(String sõne) {
        if (sõne.equals("kiirtöö")) {
            return true;
        } else if (sõne.equals("tavatöö")) {
            return false;
        }
        throw new FormaadiErind("Ebasobiv töö tüübi väärtus: " + sõne);
    }

    private static void monitorigaKontroll(String sõne) {
        if (!sõne.equals("monitoriga")) {
            throw new FormaadiErind("Ebasobiv kolmanda välja väärtus: " + sõne);
        }
    }

    private static LocalDateTime getRegistreerimiseAeg(String[] osad) {
        if (osad.length == 1) {
            return LocalDateTime.now();
        }
        return LocalDateTime.parse(osad[1]);
    }

    private static Arvuti loeArvuti(String rida) {
        String[] jupid = rida.split("@");
        String[] infoJupid = getInfo(jupid[0]);
        boolean onKiirtöö = getOnKiirtöö(infoJupid[1]);
        LocalDateTime registreerimiseAeg = getRegistreerimiseAeg(jupid);

        if(infoJupid.length == 3) {
            monitorigaKontroll(infoJupid[2]);
            return new VäliseMonitorigaArvuti(infoJupid[0], onKiirtöö, registreerimiseAeg);
        } else {
            return new Arvuti(infoJupid[0], onKiirtöö, registreerimiseAeg);
        }

    }

    private static List<Arvuti> loeTöödeNimekiri(String failiNimi) throws IOException {
        List<Arvuti> arvutid = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(failiNimi), "UTF-8"))) {

            String rida = br.readLine();
            while (rida != null) {
                try {
                    Arvuti arvuti = loeArvuti(rida);
                    arvutid.add(arvuti);
                } catch (FormaadiErind e) {
                    System.out.println(e.getMessage());
                }

                rida = br.readLine();
            }

        }

        return arvutid;
    }

    private static Map<String, Double> loeTunnitasu(String failiNimi) throws IOException {
        Map<String, Double> tunnitasud = new HashMap<>();
        try (DataInputStream dis = new DataInputStream(new FileInputStream(failiNimi))) {
            int arv = dis.readInt();
            for (int i = 0; i < arv; i++) {
                String nimi = dis.readUTF();
                double tasu = dis.readDouble();
                tunnitasud.put(nimi, tasu);
            }
        }
        return tunnitasud;
    }
    public static void main(String[] args) throws IOException {
        List<Arvuti> tavatööd = loeTöödeNimekiri("ootel_arvutid.txt");
        List<Arvuti> kiirtööd = new ArrayList<>();

        for (Arvuti arvuti : tavatööd) {
            if (arvuti.onKiirtöö()) {
                kiirtööd.add(arvuti);
            }
        }
        tavatööd.removeAll(kiirtööd);

        System.out.println(tavatööd);
        Map<String, Double> tunnitasud = loeTunnitasu("tunnitasud.dat");
        System.out.println(tunnitasud);
        List<Arvuti> tehtudTööd = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("Kas soovid parandada (P), uut tööd registreerida (R) või lõpetada (L) ?");
            String sisend = br.readLine();

            if (sisend.equals("P")) {
                Arvuti arvuti;
                if (kiirtööd.size() > 0) {
                    arvuti = kiirtööd.remove(0);
                } else {
                    arvuti = tavatööd.remove(0);
                }
                System.out.println(arvuti);
                System.out.println("Sisesta parandamiseks kulunud aeg (täisminutites): ");
                int aeg = Integer.parseInt(br.readLine());
                System.out.println("Sisesta enda nimi: ");
                String nimi = br.readLine();
                double baashind = tunnitasud.get(nimi) * aeg/60.0;
                double arvesumma = arvuti.arvutaArveSumma(baashind);
                tehtudTööd.add(arvuti);
                System.out.println("Töö tehtud, arve summa on " + arvesumma + " €!");
                
            } else if (sisend.equals("R")) {
                
            } else if (sisend.equals("L")) {
                
            }
        }
    }
}