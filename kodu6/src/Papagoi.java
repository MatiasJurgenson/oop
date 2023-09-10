public class Papagoi extends Linnud {
    public Papagoi(String nimi, boolean oskabLennata) {
        super(nimi, oskabLennata);
    }

    @Override //ülemklassi häälitsus() ülekatmine
    public void häälitsus() {
        System.out.println("häälitsus");
    }
}
