import java.util.ArrayList;
import java.util.Arrays;

public class Tantsupaar {
    private String poisiNimi;
    private int poisiSünniaasta;
    private String tüdrukuNimi;
    private int tüdrukuSünniaasta;

    public Tantsupaar(String poisiNimi, int poisiSünniaasta, String tüdrukuNimi, int tüdrukuSünniaasta) {
        this.poisiNimi = poisiNimi;
        this.poisiSünniaasta = poisiSünniaasta;
        this.tüdrukuNimi = tüdrukuNimi;
        this.tüdrukuSünniaasta = tüdrukuSünniaasta;
    }

    public int getPoisiSünniaasta() {
        return poisiSünniaasta;
    }

    public int getTüdrukuSünniaasta() {
        return tüdrukuSünniaasta;
    }


    public String getPoisiNimi() {
        return poisiNimi;
    }

    public String getTüdrukuNimi() {
        return tüdrukuNimi;
    }

    public void setPoisiSünniaasta(int poisiSünniaasta) {
        this.poisiSünniaasta = poisiSünniaasta;
    }

    public void setTüdrukuSünniaasta(int tüdrukuSünniaasta) {
        this.tüdrukuSünniaasta = tüdrukuSünniaasta;
    }

    public void setPoisiNimi(String poisiNimi) {
        this.poisiNimi = poisiNimi;
    }

    public void setTüdrukuNimi(String tüdrukuNimi) {
        this.tüdrukuNimi = tüdrukuNimi;
    }

    public int vanimpartner(int aasta) {
        int tüdrdukVanus = aasta - tüdrukuSünniaasta;
        int poissVanus = aasta - poisiSünniaasta;
        return Math.max(poissVanus, tüdrdukVanus);
    }

    public boolean samaVanus() {
        if (tüdrukuSünniaasta == poisiSünniaasta) {
            return true;
        } else {
            return false;
        }
    }

    public String perenimed () {
        String[] poisiSplit = poisiNimi.split(" ");
        String[] tüdrukuSplit = tüdrukuNimi.split(" ");
        return poisiSplit[poisiSplit.length - 1] + " " + tüdrukuSplit[tüdrukuSplit.length - 1];
    }

    public String toString() {
        return "Perenimed on: " + perenimed();
    }

    public static void main(String[] args) {

    }
}
