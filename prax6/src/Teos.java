public abstract class Teos implements Comparable<Teos>{
    private String teoseKirjeldus;
    private String tähis;
    private String laenutaja;
    private int päevadeArv;

    public String getTähis() {
        return tähis;
    }

    public String getTeoseKirjeldus() {
        return teoseKirjeldus;
    }

    public Teos(String teoseKirjeldus, String tähis, String laenutaja, int päevadeArv) {
        this.teoseKirjeldus = teoseKirjeldus;
        this.tähis = tähis;
        this.laenutaja = laenutaja;
        this.päevadeArv = päevadeArv;
    }

    public abstract boolean kasHoidlast();
    public int laenutusaeg() {
        if (tähis.equals("roheline")) {
            return 1;
        } else if (tähis.equals("puudub")) {
            return 14;
        } else if (tähis.equals("kollane")) {
            return 30;
        } else if (tähis.equals("sinine")) {
            return 60;
        }
        return 0;
    }

    public double päevaneViivis() {
        int laenutusAeg = laenutusaeg();
        if (laenutusAeg == 30 || laenutusAeg == 60) {
            return 0.05;
        } else if (laenutusAeg == 14) {
            return 0.15;
        } else if (laenutusAeg == 1) {
            return 2;
        }
        return 0;
    }

    public void arvutaViivis(Kontrollija kontrollija) {
        if (päevadeArv > laenutusaeg()) {
            double viiviseSuurus = (päevadeArv - laenutusaeg())*päevaneViivis();
            kontrollija.salvestaViivis(laenutaja, teoseKirjeldus, viiviseSuurus);
        }
    }

    public String toString() {
        return teoseKirjeldus + tähis + laenutaja + päevadeArv + kasHoidlast();
    }

    public int compareTo(Teos teos) {
        return teoseKirjeldus.compareTo(teos.teoseKirjeldus);
    }
}
