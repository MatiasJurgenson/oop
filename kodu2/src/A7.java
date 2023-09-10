public class A7 {

    public static void main(String[] args) {
        //String eesnimi, int kehamass, double pikkus
        int kehamass = Integer.parseInt(args[1]);
        double pikkus = Double.parseDouble(args[2]);
        double Kindeks = kehamass / (Math.pow(pikkus, 2));
        System.out.println(Kindeks);
        if (Kindeks > 25) {
            System.out.println("Oled ülekaalus.");
        }
        else if (Kindeks < 19) {
            System.out.println("Oled alakaalus");
        }
        else {
            System.out.println("Oled normaalkaalus.");
        }
    }
}
