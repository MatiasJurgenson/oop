public class Kohvijoomine {

    public static void main(String[] args) {
        Kohv java = new Kohv("java", 4.20);
        Kohv expresso = new Kohv("expresso", 5.50);
        Programmeerija Jaak = new Programmeerija("Jaak", 10, 2, java);
        Programmeerija Juhan = new Programmeerija("Juhan", 15, 3, expresso);
        Programmeerija Juku = new Programmeerija("Juku", 20);

        System.out.println(Jaak.toString());
        System.out.println(Juhan.toString());
        System.out.println(Juku.toString());

        Jaak.setTasseKohvi(Jaak.getTasseKohvi() + 3);
        Juhan.setTasseKohvi(Juhan.getTasseKohvi() + 3);

        Jaak.setRiduKoodi(Jaak.getRiduKoodi() * 2);
        Juhan.setRiduKoodi(Juhan.getRiduKoodi() * 2);

        Juku.setRiduKoodi(Juku.getRiduKoodi() + 100);

        System.out.println(Jaak.toString());
        System.out.println(Juhan.toString());
        System.out.println(Juku.toString());
    }


}