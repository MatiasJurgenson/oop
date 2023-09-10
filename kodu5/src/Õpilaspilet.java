import java.time.LocalDate;

public class Õpilaspilet implements Dokument{
    private int sünniaasta;
    public Õpilaspilet(int sünniaasta) {
        this.sünniaasta = sünniaasta;
    }
    public boolean vanusOnVähemalt(int x) {
        return sünniaasta + x <= LocalDate.now().getYear();
    }

    public String toString() {
        return "sündinud: " + sünniaasta;
    }
}