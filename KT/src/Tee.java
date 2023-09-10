public class Tee implements Comparable<Tee>{
    private String nimi;
    private double pikkus;
    private int koristamisePrioteet;

    public Tee(String nimi, double pikkus, int koristamisePrioteet) {
        this.nimi = nimi;
        this.pikkus = pikkus;
        this.koristamisePrioteet = koristamisePrioteet;
    }
    //get set kui vaja


    public double getPikkus() {
        return pikkus;
    }

    public String toString() {
        return "Tee nimi: " + nimi + ", pikkus: " + pikkus + ", proteet: " + koristamisePrioteet;
    }

    public int compareTo(Tee tee) {
        return Integer.compare(koristamisePrioteet, tee.koristamisePrioteet);
    }

}
