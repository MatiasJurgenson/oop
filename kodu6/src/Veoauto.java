public class Veoauto extends Auto{
    private boolean füüsilineIsik;

    public Veoauto(String omanikuNimi, String automudel, boolean onElektriauto, boolean füüsilineIsik) {
        super(omanikuNimi, automudel, onElektriauto);
        this.füüsilineIsik = füüsilineIsik;
    }

    @Override
    public double arvutaParanduseMaksumus(double kulutatudAeg) {
         if (füüsilineIsik) {
             return 2 * super.arvutaParanduseMaksumus(kulutatudAeg);
         }
         return 3 * super.arvutaParanduseMaksumus(kulutatudAeg);
    }
}
