import java.time.LocalDate;

public class RistkülikukujulineKook extends Kook {
    private double laius;
    private double pikkus;

    public RistkülikukujulineKook(String nimetus, LocalDate parimEnne, double ruutsentimeetrihind, double laius, double pikkus) {
        super(nimetus, parimEnne, ruutsentimeetrihind);
        this.laius = laius;
        this.pikkus = pikkus;
    }

    @Override
    public double pindala() {
        return laius * pikkus;
    }
}
