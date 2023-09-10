public class IDKaart {
    private String idNumber;
    private String nimi;
    private String isikukood;

    public IDKaart(String idNumber, String nimi, String isikukood) {
        this.idNumber = idNumber;
        this.nimi = nimi;
        this.isikukood = isikukood;
    }

    public String getIsikukood() {
        return isikukood;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getNimi() {
        return nimi;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public void setIsikukood(String isikukood) {
        this.isikukood = isikukood;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public String sugu() {
        //kui isikukoodi esimeseks numbriks on 1, 3 või 5, siis tegu on mehega; kui 2, 4 või 6, siis tegu on naisega
        int sugu = Integer.valueOf(isikukood.charAt(0));
        if (sugu % 2 == 0) {
            return "naine";
        } else {
            return "mees";
        }
    }
    public String sünnikuupäev() {
        /*
        2. ja 3. = sünniaasta 3. ja 4. numbrid (00...99)
        4. ja 5. = sünnikuu (01...12)
        6. ja 7. = sünnikuupäev (01...31)
        "1", kui 1800. ... 1899. a sündinud mees
        "2", kui 1800. ... 1899. a sündinud naine
        "3", kui 1900. ... 1999. a sündinud mees
        "4", kui 1900. ... 1999. a sündinud naine
        "5", kui 2000. ... 2099. a sündinud mees
        "6", kui 2000. ... 2099. a sündinud naine
        "7", kui 2100. ... 2199. a sündinud mees
        "8", kui 2100. ... 2199. a sündinud naine
                */
        String[] koodlahti = isikukood.split("");
        int esimene = Integer.getInteger(koodlahti[0]);

        if (esimene == 2) {

        } else if (esimene == 3) {

        } else if (esimene == 4) {

        } else if (esimene == 5) {

        } else if (esimene == 6) {

        } else if (esimene == 7) {
            ;
        } else if (esimene == 8) {

        } else {

        }

        // PP.KK.AAAA
        return "UwU";

    }
}
