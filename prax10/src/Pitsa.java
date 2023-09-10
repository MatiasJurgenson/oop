public class Pitsa {
    private String nimi;
    private double hind;

    public Pitsa(String nimi, double hind) {
        this.nimi = nimi;
        this.hind = hind;
    }

    public String getNimi() {
        return nimi;
    }

    public double getHind() {
        return hind;
    }

    public String toString() {
        return "Pitsa " + nimi + " hind on " + hind;
    }
}
