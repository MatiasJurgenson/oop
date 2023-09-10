public class Main {

    static int staatiline(int a, int b) {
        return a + b;
    }
    static double staatiline(double a) {
        return Math.round(Math.pow(a, 2));
    }
    static void staatiline(String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }

    }
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        double c = 3.5;
        String d = "sõne";
        System.out.println(staatiline(a, b));
        System.out.println(staatiline(c));
        staatiline(d, b);


    }
}