import java.time.LocalDate;

public class KolmnurkneKook extends Kook {
    private double külg1;
    private double külg2;
    private double külg3;

    public KolmnurkneKook(String nimetus, LocalDate parimEnne, double ruutsentimeetrihind, double külg1, double külg2, double külg3) {
        super(nimetus, parimEnne, ruutsentimeetrihind);
        this.külg1 = külg1;
        this.külg2 = külg2;
        this.külg3 = külg3;
    }

    @Override
    public double pindala() {
        double poolÜmbermõõt = (külg1 + külg2 + külg3) / 2;
        return Math.sqrt(poolÜmbermõõt * (poolÜmbermõõt - külg1) * (poolÜmbermõõt - külg2) * (poolÜmbermõõt - külg3));
    }
}
