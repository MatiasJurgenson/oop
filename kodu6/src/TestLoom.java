public class TestLoom {
    public static void main(String[] args) {
        Papagoi papagoi = new Papagoi("Pa", true);
        Madu madu = new Madu("Ma", 0);

        Loomad loom = new Loomad("Lo");
        loom = madu; //polümorfism

        papagoi.häälitsus(); //dünaamiline seostamine
        loom.toString();
    }
}