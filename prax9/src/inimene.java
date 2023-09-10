import java.util.List;

public class inimene {
    private String eesnimi;
    private String perenimi;
    private List<String> lasteNimed;

    public inimene(String eesnimi, String perenimi, List<String> lasteNimed) {
        this.eesnimi = eesnimi;
        this.perenimi = perenimi;
        this.lasteNimed = lasteNimed;
    }

    public String getEesnimi() {
        return eesnimi;
    }

    public String getPerenimi() {
        return perenimi;
    }

    public List<String> getLasteNimed() {
        return lasteNimed;
    }

    public String toString() {
        return eesnimi + " " + perenimi + " " + lasteNimed;
    }
}
