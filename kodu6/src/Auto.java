public class Auto {
    private String omanikuNimi;
    private String automudel;
    private boolean onElektriauto;

    public Auto(String omanikuNimi, String automudel, boolean onElektriauto) {
        this.omanikuNimi = omanikuNimi;
        this.automudel = automudel;
        this.onElektriauto = onElektriauto;
    }

    public double arvutaParanduseMaksumus(double kulutatudAeg) {
        if (onElektriauto) {
            return 36 * kulutatudAeg;
        }
        return 40 * kulutatudAeg;
    }

    public String autoliik() {
        return "Sõiduauto";
    }

    public String toString() {
        return autoliik() + "; Mudel: " + automudel + "; omanik: " + omanikuNimi;
    }
}
