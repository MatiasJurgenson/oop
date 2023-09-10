public class Seade {
   private int kood;
   private String nimetus;
   private double käibemaksutaHind;
   private static double käibemaksuprotsent = 20;

    public Seade(int kood, String nimetus, double käibemaksutaHind) {
        this.kood = kood;
        this.nimetus = nimetus;
        this.käibemaksutaHind = käibemaksutaHind;
    }

    public static double getKäibemaksuprotsent() {
        return käibemaksuprotsent;
    }

    public int getKood() {
        return kood;
    }

    public double getKäibemaksutaHind() {
        return käibemaksutaHind;
    }

    public String getNimetus() {
        return nimetus;
    }

    public static void setKäibemaksuprotsent(double käibemaksuprotsent) {
        Seade.käibemaksuprotsent = käibemaksuprotsent;
    }

    public void setKood(int kood) {
        this.kood = kood;
    }

    public void setKäibemaksutaHind(double käibemaksutaHind) {
        this.käibemaksutaHind = käibemaksutaHind;
    }

    public void setNimetus(String nimetus) {
        this.nimetus = nimetus;
    }

    public double kmhind() {
        return käibemaksutaHind * (1 + käibemaksuprotsent/100);
    }

    public String toString() {
        return "(" + "seadme kood: " + kood + ", " +
                "seadme nimetus: " + nimetus + ", " +
                "seadme hind: " + käibemaksutaHind + ", " +
                "käibemaks: " + käibemaksuprotsent + "%, " +
                "seadme hind käibemaksuga: " + kmhind() + ")";
    }
}

 class TestSeade {
    public static void main(String[] args) {

        Seade seade1 = new Seade(123, "telefon", 300);
        Seade seade2 = new Seade(234, "monitor", 200);
        Seade seade3 = new Seade(420, "usb pulk", 100);

        System.out.println(seade1.toString());
        System.out.println(seade2.toString());
        System.out.println(seade3.toString());
    }
}