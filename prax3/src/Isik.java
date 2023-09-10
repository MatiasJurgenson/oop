public class Isik {
    private String nimi;
    private double pikkus;

    public Isik(String isikuNimi, double isikuPikkus) {
        nimi = isikuNimi;
        pikkus = isikuPikkus;
    }

    public int suusakepiPikkus() {
        return (int) Math.round(0.85 * pikkus * 100);
    }

    public static void main(String[] args) {
        /*
        kood ei kompileeri:
        System.out.println("suusakepi pikkus on " + suusakepiPikkus());

        kuna suusakepiPikkus() on isikumeetod mida pole veel loodud, seega seda ei saa kutsuda.
        selleks et suusakepiPikkus() saaks kasutada on vaja luua isik kasutades Isik() ja
        sellele isikule rakendada suusakepiPikkus(): isik.suusakepiPikkus()
         */

        Isik isik = new Isik("nimi", 1.89);
        System.out.println("suusakepi pikkus on " + isik.suusakepiPikkus());
    }
}






