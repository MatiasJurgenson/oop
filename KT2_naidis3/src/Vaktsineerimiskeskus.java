import java.io.*;
import java.util.*;

public class Vaktsineerimiskeskus {

    public static void main(String[] args) throws IOException {
        try (BufferedReader kasutajaSisend = new BufferedReader(new InputStreamReader(System.in))) {
            Queue<Broneering> broneeringud = loeBroneeringud("broneeringud.dat");
            List<Broneering> lõpetatud = new ArrayList<>();
            while (true) {
                System.out.println("Palun valige üks järgmistest tegevustest:");
                System.out.print("(J)ärgmine broneering, (V)aata lõpetatud broneeringuid vaktsiinide kaupa, (S)alvesta ja lõpeta: ");
                String kasutajaRida = kasutajaSisend.readLine();
                if (kasutajaRida.equals("J")) {
                    järgmine(broneeringud, lõpetatud);
                } else if (kasutajaRida.equals("V")) {
                    vaata(kasutajaSisend, lõpetatud);
                } else if (kasutajaRida.equals("S")) {
                    salvesta(lõpetatud);
                    break;
                }
            }
        }
    }

    private static void salvesta(List<Broneering> lõpetatud) throws IOException {
        Map<String, List<Broneering>> vaktsiinid = vaktsiinideKaupa(lõpetatud);
        for (String vaktsiin : vaktsiinid.keySet()) {
            try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(vaktsiin.toLowerCase() + ".txt"), "UTF-8"))) {
                List<Broneering> broneeringud = vaktsiinid.get(vaktsiin);
                for (Broneering broneering : broneeringud) {
                    bw.write(broneering.getNimi() + ";" + broneering.getAeg() + ";" + broneering.getMitmes());
                    bw.newLine();
                }
            }
        }
        System.out.println("Broneeringud salvestatud!");
    }

    private static void vaata(BufferedReader kasutajaSisend, List<Broneering> lõpetatud) throws IOException {
        if (lõpetatud.isEmpty()) {
            System.out.println("Lõpetatud broneeringuid pole!");
        } else {
            Map<String, List<Broneering>> vaktsiinid = vaktsiinideKaupa(lõpetatud);
            System.out.println("On olemas järgmiste vaktsiinide lõpetatud broneeringud: " + vaktsiinid.keySet());
            System.out.print("Sisesta vaktsiin: ");
            while (true) {
                String kasutajaRida = kasutajaSisend.readLine();
                if (!vaktsiinid.containsKey(kasutajaRida)) {
                    System.out.print("Sellist vaktsiini pole. Vali vaktsiin uuesti: " + vaktsiinid.keySet() + " : ");
                } else {
                    System.out.println(kasutajaRida + " vaktsiiniga lõpetatud broneeringud:");
                    for (Broneering broneering : vaktsiinid.get(kasutajaRida)) {
                        System.out.println(broneering);
                    }
                    break;
                }
            }
        }
    }

    private static void järgmine(Queue<Broneering> broneeringud, List<Broneering> lõpetatud) {
        if (broneeringud.isEmpty()) {
            System.out.println("Ootel broneeringuid pole!");
        } else {
            Broneering järgmine = broneeringud.poll();
            System.out.println("Järgmine broneering on: " + järgmine.toString());
            lõpetatud.add(järgmine);
        }
    }

    private static Queue<Broneering> loeBroneeringud(String failinimi) throws IOException {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(failinimi))) {
            Queue<Broneering> tulemus = new LinkedList<>();
            int broneeringuteArv = dis.readInt();
            for (int i = 0; i < broneeringuteArv; i++) {
                String patsiendiNimi = dis.readUTF();
                String aeg = dis.readUTF();
                String vaktsiin = dis.readUTF();
                int vaktsineerimiskord = dis.readInt();
                try {
                    Broneering uusBroneering = new Broneering(patsiendiNimi, aeg, vaktsiin, vaktsineerimiskord);
                    tulemus.add(uusBroneering);
                } catch (EbasobivArvErind e) {
                    System.out.println(e.getMessage());
                }
            }
            return tulemus;
        }
    }

    private static Map<String, List<Broneering>> vaktsiinideKaupa(List<Broneering> lõpetatud) {
        Map<String, List<Broneering>> tulemus = new HashMap<>();
        for (Broneering broneering : lõpetatud) {
            String vaktsiin = broneering.getVaktsiin();
            if (!tulemus.containsKey(vaktsiin))
                tulemus.put(vaktsiin, new ArrayList<>());
            tulemus.get(vaktsiin).add(broneering);
        }
        return tulemus;
    }


}
