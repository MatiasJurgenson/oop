import java.util.ArrayList;
import java.util.List;

public class Külastaja {
    private List<String> külastuseKirjeldused;
    private int vanus;
    private double kulud;

    public Külastaja(int vanus) {
        this.külastuseKirjeldused = new ArrayList<String>();
        this.vanus = vanus;
    }

    public int getVanus() {
        return vanus;
    }

    public void lisaKirjeldus(String sõne) {
        külastuseKirjeldused.add(sõne);
    }

    public List<String> kõikKirjeldused() {
        return külastuseKirjeldused;
    }

    public void lisaKulu(double kulu) {
        kulud += kulu;
    }

    public double kuludeSumma() {
        return kulud;
    }
}