public class Kodanik {
    private String eesnimi;
    private String perekonnanimi;
    private String isikukood;
    private boolean juhiloaOlemasolu;

    public Kodanik(String eesnimi, String perekonnanimi, String isikukood, boolean juhiloaOlemasolu) {
        this.eesnimi = eesnimi;
        this.perekonnanimi = perekonnanimi;
        this.isikukood = isikukood;
        this.juhiloaOlemasolu = juhiloaOlemasolu;
    }

    public String getIsikukood() {
        return isikukood;
    }
    boolean kasJuhilubaOnOlemas() {
        return juhiloaOlemasolu;
    }

    boolean kasOnTäiskasvanuAastal2018() {
        if (isikukood.charAt(0) == ("5".charAt(0)) || isikukood.charAt(0) =="6".charAt(0)){
            if (18 - Integer.parseInt(isikukood.substring(1, 3)) == 18) {
                return true;
            } else {
                return false;
            }
        } else {
            return true;
        }
    }

    public String toString() {
        return eesnimi + " " + perekonnanimi;
    }
}
