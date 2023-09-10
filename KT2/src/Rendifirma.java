import java.io.*;
import java.util.*;

public class Rendifirma {

    private static List<Retk> loeRetked(String failinimi) throws IOException {
        List<Retk> retked = new ArrayList<>();

        try (DataInputStream dis = new DataInputStream(new FileInputStream(failinimi))) {
            int retki = dis.readInt();
            for (int i = 0; i < retki; i++) {
                try{
                    String laenutaja = dis.readUTF();
                    double distants = dis.readDouble();
                    int kestus = dis.readInt();
                    Retk retk = new Retk(laenutaja, distants, kestus);
                    retked.add(retk);
                } catch (KahtlaneKestusErind e) {
                    System.out.println(e.getMessage());
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    return retked;
                }
            }
        }

        return retked;
    }

    // abimeetod retke lisamiseks vastavalt distantsile
    private static void lisaRetkDistantsijärgi(double distants, Map<String, List<Retk>> grupeering, Retk retk) {
        if (distants <= 1.5) {
            if (!grupeering.containsKey("lühike")) {
                grupeering.put("lühike", new ArrayList<>());
            }

            grupeering.get("lühike").add(retk);

        } else if (distants <= 5) {
            if (!grupeering.containsKey("keskmine")) {
                grupeering.put("keskmine", new ArrayList<>());
            }

            grupeering.get("keskmine").add(retk);

        } else {
            if (!grupeering.containsKey("pikk")) {
                grupeering.put("pikk", new ArrayList<>());
            }

            grupeering.get("pikk").add(retk);

        }
    }

    private static Map<String, List<Retk>> pikkuseKaupa(List<Retk> retked) {
        Map<String, List<Retk>> grupeering = new HashMap<>();
        // väike <= 1.5 km
        // keskmine <= 5 km
        // pikkad ülejäänud

        for (Retk retk : retked) {
            double distants = retk.getDistants();
            lisaRetkDistantsijärgi(distants, grupeering, retk);
        }

        return grupeering;
    }

    //abimeetod retke lisamiseks
    private static void lisaRetk(Map<String, List<Retk>> grupeering) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //sõne, ujukoma, täisarv
        System.out.println("Sisesta laenutaja nimi:");
        String laenutaja = br.readLine();
        System.out.println("Sisesta sõidetud distants (kilomeetrites):");
        double distants = Double.parseDouble(br.readLine());
        System.out.println("Sisesta laentuse kestus minutites:");
        int kestus = Integer.parseInt(br.readLine());
        try {
            Retk retk = new Retk(laenutaja, distants, kestus);
            lisaRetkDistantsijärgi(distants, grupeering, retk);

        } catch (KahtlaneKestusErind e) {
            System.out.println(e.getMessage() + " Ei õnnestunud retke lisada.");
        }
    }

    private static void vaataStatistikat(Map<String, List<Retk>> grupeering) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("On olemas järgmised katekooriad: " + grupeering.keySet());
        while (true) {

            String sisend = br.readLine();
            List<Retk> retked = grupeering.get(sisend);
            if (retked == null) {
                System.out.println("Sellist katekooriat ei ole! Sisestage katekooria uuesti: ");
            } else {
                int kokku = retked.size();
                int kestus = 0;
                for (Retk retk : retked) {
                    kestus += retk.getKestus();
                }
                System.out.println("Kokku tehti " + kokku + " sellist retke. Nende kestus oli keskmiselt " + (kestus/kokku));
                break;
            }
        }
    }

    private static void salvesta(Map<String, List<Retk>> grupeering) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("statistika.txt"), "UTF-8"))) {
            for (String grupp : grupeering.keySet()) {
                List<Retk> retked = grupeering.get(grupp);
                Collections.sort(retked);
                for (Retk rekt : retked) {
                    bw.write(rekt.toString());
                    bw.newLine();
                }
            }
        }
        System.out.println("Retked salestatud!");
    }

    public static void main(String[] args) throws Exception {
        List<Retk> retked = loeRetked("retked.dat");
        Map<String, List<Retk>> grupeering = pikkuseKaupa(retked);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("Palun valige üks järgnevatest tegevustest: (L) lisa retk, (V), vaata retkede statistikat, " +
                    "(S) salvesta ja lõpeta:");
            String sisend = br.readLine();
            if (sisend.equals("L")) {
                lisaRetk(grupeering);
            } else if (sisend.equals("V")) {
                vaataStatistikat(grupeering);
            } else if (sisend.equals("S")) {
                salvesta(grupeering);
                break;
            }
        }
    }
}