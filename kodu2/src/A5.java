public class A5 {
    static int pikkus(int a, int b) {
        return (int) Math.round(Math.random()*(b-a)+a);
    }

    static int[] massiiv(int c, int a, int b) {
        int[] d = new int[c];
        for (int i=0; i < c; i++) {
            d[i] = pikkus(a, b);
        }
        return d;
    }

    static double Hkeskmine(int[] a) {
        double summa = 0;
        for (double elem : a) {
            summa += 1 / elem;
        }

        return a.length / summa;
    }
    public static void main(String[] args) {
        int[] väiksed = massiiv(10, 60, 100);
        int[] keskmised = massiiv(15, 101, 140);
        int[] suured = massiiv(20, 141, 200);
        for (int elem : väiksed) {
            System.out.println(elem);
        }
        for (int elem : keskmised) {
            System.out.println(elem);
        }
        for (int elem : suured) {
            System.out.println(elem);
        }
        for (int elem : väiksed) {
            if (elem > 80) {
                System.out.println(elem);
            }
        }

        System.out.println(Hkeskmine(suured));


    }
}
