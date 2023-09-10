import java.time.LocalDate;

public class ÜmmarguneKook extends Kook {

    private double läbimõõt;
    public ÜmmarguneKook(String nimetus, LocalDate parimEnne, double ruutsentimeetrihind, double läbimõõt) {
        super(nimetus, parimEnne, ruutsentimeetrihind);
        this.läbimõõt = läbimõõt;
    }

    @Override
    public double pindala() {
        return Math.PI * Math.pow((läbimõõt / 2), 2);
    }
}
