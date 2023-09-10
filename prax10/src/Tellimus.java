import java.util.List;

public class Tellimus {
    private String tellija;
    private List<Pitsa> pitsad; //pizza time
    private int ooteaeg;

    public Tellimus(String tellija, List<Pitsa> pitsad, int ooteaeg) {
        this.tellija = tellija;
        this.pitsad = pitsad;
        this.ooteaeg = ooteaeg;
    }

    public double maksumus() {
        if (ooteaeg > 30) {
            throw new LiigaPikkOotamineErind("Ooteaeg on rohkem kui 30 min.");
        }
        double summa = 0;
        for (Pitsa pitsa : pitsad) {
            summa += pitsa.getHind();
        }
        return summa;
    }

    public String toString() {
        return "tellija: " + tellija + " pitsad: " + pitsad + " ooteaeg: " + ooteaeg;
    }
}
