class Isik {

    private String nimi; // isendiväli isiku nime jaoks
    private double pikkus; // isendiväli isiku pikkuse jaoks
    private String isikukood;
    private double mass;

    // konstruktor
    public Isik(String nimi, double pikkus, String isikukood, double mass) {
        // isendiväljad nimi ja pikkus saavad väärtusteks
        // konstruktori parameetrite väärtused
        this.nimi = nimi;
        this.pikkus = pikkus;
        this.isikukood = isikukood;
        this.mass = mass;
    }

    public Isik() {
        nimi = "Nimetu";
        pikkus = 0.0;
    }
    public String getNimi() {
        return nimi;
    }

    public double getPikkus() {
        return pikkus;
    }

    public String getIsikukood() {
        return isikukood;
    }

    public double getMass() {
        return mass;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public void setPikkus(double pikkus) {
        if (pikkus > 0) {
            this.pikkus = pikkus;
        }

    }

    public void setMass(double mass) {
        if (mass > 0) {
            this.mass = mass;
        }
    }

    public int suusakepiPikkus() {
        return (int) Math.round(0.85 * pikkus * 100);
    }

    public double newton(double gravitatsioonijõud) {
        return mass * gravitatsioonijõud;
    }

    public String toString() {
        return "(" + nimi + "; " + pikkus + "; " + isikukood + "; " + mass + ")";
    }
}