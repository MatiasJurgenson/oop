public class testRaamat {
    public static void main (String[] argv) {
        Isik Oskar = new Isik("Oskar Luts", 1.9, "90", 2);
        Raamat kevade = new Raamat(Oskar, "Kevade");
        Raamat[] riiul = new Raamat[100];
        riiul[8] = kevade;
        System.out.println(riiul[8]);

        Isik autor = new Isik("Eduard Vilde", 1.9, "90", 2);

        for (int i = 0; i < riiul.length; i++) {
            riiul[i] = new Raamat(autor, "Kogutud teosed " + String.valueOf(i + 1));
        }

        System.out.println("10. raamat riiulil on " + riiul[9] + ".");
    }
}
