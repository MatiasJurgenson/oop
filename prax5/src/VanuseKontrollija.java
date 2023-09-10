public class VanuseKontrollija implements Lõbustus{
    private int nõutudVanus;
    private Lõbustus delegaat;

    public VanuseKontrollija(int nõutudVanus, Lõbustus delegaat) {
        this.nõutudVanus = nõutudVanus;
        this.delegaat = delegaat;
    }

    public void lõbusta(Külastaja külastaja) {
        if (külastaja.getVanus() < nõutudVanus) {
            külastaja.lisaKirjeldus("külastaja ei läbinud vanusekontrolli");
        } else {
            delegaat.lõbusta(külastaja);
        }
    }
}
