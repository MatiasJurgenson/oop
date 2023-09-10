import java.util.ArrayList;

public class TranspordiametiKampaania {
    static ArrayList<Kodanik> loeKodanikud(String failiNimi) throws Exception {
        ArrayList<Kodanik> kodanikud = new ArrayList<>();
        java.io.File fail = new java.io.File(failiNimi);
        try (java.util.Scanner scammer = new java.util.Scanner(fail, "UTF-8")) {
            while (scammer.hasNextLine()) {
                String rida = scammer.nextLine();
                String[] massiiv = rida.split(",");
                boolean olemasolu;
                if (massiiv[3].equals("Puudub")) {
                    olemasolu = false;
                } else {
                    olemasolu = true;
                }
                kodanikud.add(new Kodanik(massiiv[1], massiiv[0], massiiv[2], olemasolu));
            }
        }
        return kodanikud;
    }
    public static void main(String[] args) throws Exception {
        ArrayList<Kodanik>   kodanikud = loeKodanikud("kodanikud.txt");
        ArrayList<Kodanik> kingitusega = new ArrayList<>();
        for (Kodanik kodanik : kodanikud) {
            if (kodanik.kasJuhilubaOnOlemas()) {
                System.out.println(kodanik + " juhiluba kingituseks ei saanud, põhjus: juhiluba on juba olemas.");
            } else if (kodanik.kasOnTäiskasvanuAastal2018()) {
                System.out.println(kodanik + " sai juhiloa kingituseks.");
                kingitusega.add(kodanik);
            } else {
                System.out.println(kodanik + " juhiluba kingituseks ei saanud, põhjus: pole täiskasvanu.");
            }
        }

        kodanikud.removeAll(kingitusega);

        System.out.println("\nKodanikud, kes jäid kingitusest ilma:");
        for (Kodanik kodanik : kodanikud) {
            System.out.println(kodanik.getIsikukood());
        }
    }
}
