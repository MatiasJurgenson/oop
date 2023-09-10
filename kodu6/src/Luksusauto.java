import java.util.Date;

public class Luksusauto extends Auto{
    private int tootmisaasta;

    public Luksusauto(String omanikuNimi, String automudel, boolean onElektriauto, int tootmisaasta) {
        super(omanikuNimi, automudel, onElektriauto);
        this.tootmisaasta = tootmisaasta;
    }

    public double arvutaParanduseMaksumus(double kulutatudAeg) {
        Date päev = new Date();
        int aasta = päev.getYear();
        if (aasta - tootmisaasta > 70) {
            return 10 * super.arvutaParanduseMaksumus(kulutatudAeg);
        }
        return 15 * super.arvutaParanduseMaksumus(kulutatudAeg);
    }
}
