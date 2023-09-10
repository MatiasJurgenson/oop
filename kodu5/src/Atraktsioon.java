import java.util.ArrayList;
import java.util.List;

public class Atraktsioon {

    private String atraktsiooniNimi;
    private int nõutudVanus;

    public Atraktsioon(String atraktsiooniNimi, int nõutudVanus) {
        this.atraktsiooniNimi = atraktsiooniNimi;
        this.nõutudVanus = nõutudVanus;
    }

    public boolean vanusedSobivad(Dokument[] dokumendid) {
        if (ebasobivadDokumendid(dokumendid).isEmpty()) {
            return true;
        }
        return false;
    }

    List<Dokument> ebasobivadDokumendid(Dokument[] dokumendid) {
        List<Dokument> ebasobilikud = new ArrayList<Dokument>();
        for (Dokument dokument : dokumendid) {
            if (!dokument.vanusOnVähemalt(nõutudVanus)) {
                ebasobilikud.add(dokument);
            }
        }
        return ebasobilikud;
    }

    public String toString() {
        return atraktsiooniNimi + " nõutud vanus on: " + nõutudVanus;
    }
}