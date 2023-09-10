public class Retk implements Comparable<Retk>{
    private String laenutaja;
    private double distants;
    private int kestus;

    public Retk(String laenutaja, double distants, int kestus) throws KahtlaneKestusErind {
        this.laenutaja = laenutaja;
        this.distants = distants;
        if (kestus > 60) {
            throw new KahtlaneKestusErind("Kestusaeg " + kestus + " min on kahtlane.");
        }
        this.kestus = kestus;
    }

    public String getLaenutaja() {
        return laenutaja;
    }

    public double getDistants() {
        return distants;
    }

    public int getKestus() {
        return kestus;
    }



    public String toString() {
        return laenutaja + ";" + distants + ";" + kestus;
    }

    @Override
    public int compareTo(Retk o) {
        return Double.compare(distants, o.getDistants());
    }
}
