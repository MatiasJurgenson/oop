import java.util.ArrayList;
import java.util.List;

public abstract class Koristusmasin {
    private String masinaRegistrinumber;
    private List<Tee> koristatudTeed = new ArrayList<>();
    private double läbisõit;

    public Koristusmasin(String masinaRegistrinumber) {
        this.masinaRegistrinumber = masinaRegistrinumber;
    }

    public abstract void korista(Tee tee);

    //vajadusel get set


    public String getMasinaRegistrinumber() {
        return masinaRegistrinumber;
    }

    public List<Tee> getKoristatudTeed() {
        return koristatudTeed;
    }

    public double getLäbisõit() {
        return läbisõit;
    }

    public void setLäbisõit(double läbisõit) {
        this.läbisõit = läbisõit;
    }

    public String toString() {
        return "Masina registrinumber: " + masinaRegistrinumber + ", läbisõit: " +
                läbisõit + ", koristatud teed: " + koristatudTeed;
    }
}
