import java.time.LocalDate;


public abstract class Kook implements Comparable<Kook> {
    private String nimetus;
    private LocalDate parimEnne;
    private double ruutsentimeetrihind;

    public Kook(String nimetus, LocalDate parimEnne, double ruutsentimeetrihind) {
        if (nimetus.equals("")) {
            this.nimetus = "The cake is a lie";
        } else {
            this.nimetus = nimetus;
        }
        this.parimEnne = parimEnne;
        this.ruutsentimeetrihind = ruutsentimeetrihind;
    }

    public abstract double pindala();
    public double koogiHind() {
        return (double) Math.round(ruutsentimeetrihind * pindala() * 100) / 100;
    }

    public int compareTo (Kook muu) {
        return parimEnne.compareTo(muu.parimEnne);

    }

    public String toString() {
        return nimetus + " — " + koogiHind() + " eurot — parim enne " + parimEnne;
    }
}
