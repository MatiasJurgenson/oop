public class Konto {
    private String nimi;
    private double summa;

    public Konto(String nimi, double summa) {
        setNimi(nimi);
        setSumma(summa);
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public void setSumma(double summa) {
        if (summa < 0){
            throw new NegatiivneSummaErind("Summa " + summa + " on negatiivne.");
        }
        this.summa = summa;
    }

    public void osta(double hind) {
        if (this.summa < hind) {
            throw new RahaEiJätkuErind("Kontal on liiga vähe raha (" + summa + "), et osta sja hinnaga " + hind);
        }
        this.summa -= hind;
    }

    public void paneJuurde(double summa) {
        if (summa < 0){
            throw new NegatiivneSummaErind("Summa " + summa + " on negatiivne.");
        }
        setSumma(this.summa += summa);
    }

    public String toString() {
        return nimi + ": " + summa;
    }
}
