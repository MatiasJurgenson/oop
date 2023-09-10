public class Test {
    public static void main(String[] args) {
        Külastaja peeter = new Külastaja("peeter", 2);
        Külastaja laur = new Külastaja("laur", 1);
        Külastaja uku = new Külastaja("uku", 42);

        Loosiratas loos = new Loosiratas();
        loos.lisaKülastaja(peeter);
        loos.lisaKülastaja(laur);
        loos.lisaKülastaja(uku);

        loos.kõigeAktiivsemad(2);
    }

}
