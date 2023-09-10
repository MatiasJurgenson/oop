import java.time.LocalDateTime;

public class Arvuti {
    private String tootja;
    private boolean kiirtöö;
    private LocalDateTime registreerimiseAeg;
    private double arveSumma;

    public Arvuti(String tootja, boolean kiirtöö, LocalDateTime registreerimiseAeg) {
        this.tootja = tootja;
        this.kiirtöö = kiirtöö;
        this.registreerimiseAeg = registreerimiseAeg;
    }

    public String getTootja() {
        return tootja;
    }

    public boolean onKiirtöö() {
        return kiirtöö;
    }

    public LocalDateTime getRegistreerimiseAeg() {
        return registreerimiseAeg;
    }

    public void setArveSumma(double arveSumma) {
        this.arveSumma = arveSumma;
    }

    public double arvutaArveSumma(double baashind) {
        double summa = baashind + 2;
        if (onKiirtöö()) {
            summa += 10;
        }
        arveSumma = summa;
        return summa;
    }

    public String toString() {
        if(onKiirtöö()) {
            return tootja + ";kiirtöö@" + registreerimiseAeg;
        }
        return tootja + ";tavatöö@" + registreerimiseAeg;
    }
}
