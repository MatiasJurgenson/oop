public class Kohv {
    private String kohvisort;
    private double hind;

    public Kohv(String kohvisort, double hind) {
        this.kohvisort = kohvisort;
        this.hind = hind;
    }

    public String getKohvisort() {
        return kohvisort;
    }
    public double getHind() {
        return hind;
    }

    public double tassideMaksumus(int tassideArv) {
        return hind * tassideArv;
    }
}