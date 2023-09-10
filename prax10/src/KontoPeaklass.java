public class KontoPeaklass {
    public static void main(String[] args) {
        Konto konto = new Konto("UwU", 100);
        System.out.println(konto);
        try {
            konto.osta(70);
        } catch (RahaEiJätkuErind e) {
            System.out.println("Ostmiseks ei jätkunud raha.");
        }
        System.out.println(konto);
        try {
            konto.osta(70);
        } catch (RahaEiJätkuErind e) {
            System.out.println("Ostmiseks ei jätkunud raha.");
        }
        System.out.println(konto);

        try {
            konto.paneJuurde(10);
        } catch (NegatiivneSummaErind e) {
            System.out.println(e.getMessage());
        }

        System.out.println(konto);

        try {
            konto.paneJuurde(-10);
        } catch (NegatiivneSummaErind e) {
            System.out.println(e.getMessage());
        }

        System.out.println(konto);

    }
}
