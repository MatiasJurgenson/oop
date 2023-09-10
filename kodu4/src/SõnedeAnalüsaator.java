public class SõnedeAnalüsaator {
    private String analüüsitavSõne;

    public SõnedeAnalüsaator(String analüüsitavSõne) {
        this.analüüsitavSõne = analüüsitavSõne;
    }

    void väljastaSõne() {
        System.out.println("Analüüsitav sõne on " + analüüsitavSõne);
    }

    double leiaKeskminePikkus() {
        String[] massiiv = analüüsitavSõne.split(" ");
        double summa = 0;
        for (String elem : massiiv) {
            summa += elem.length();
        }
        return summa / massiiv.length;
    }

    String leiaPikimSõna() {
        String[] massiiv = analüüsitavSõne.split(" ");
        int maxPikkus = 0;
        String pikimSõna = "";
        for (String elem : massiiv) {
            if (elem.length() > maxPikkus){
                maxPikkus = elem.length();
                pikimSõna = elem;
            }
        }
        return pikimSõna;
    }
}