public class Limusiin extends Luksusauto{

    public Limusiin(String omanikuNimi, String automudel, boolean onElektriauto, int tootmisaasta) {
        super(omanikuNimi, automudel, onElektriauto, tootmisaasta);
    }

    @Override
    public double arvutaParanduseMaksumus(double kulutatudAeg) {
        return 1.5 * super.arvutaParanduseMaksumus(kulutatudAeg);
    }

    @Override
    public String autoliik() {
        return "Limusiin";
    }
}
