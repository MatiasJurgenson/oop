import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //ül 1
        /*
        int[] m1 = {-10, 17, 21};
        int[] m2 = {-2, 5, 17, 28};
        int[] m3 = {0, 1, 2, 3, -1};

        System.out.println(Arrays.toString(ühildamine(m1, m2)));
        System.out.println(Arrays.toString(ümberpööramine(m3)));
        */

        //Ül 2
        int[] poisid = {180, 175, 200, 172, 169, 183, 188};
        int[] tüdrukud = {165, 167, 172, 169, 162};

        System.out.println(massiiv_sõneks(poisid));



        System.out.println(Arrays.deepToString(tansupaarid(poisid, tüdrukud)));
        System.out.println(Arrays.toString(üksikud(poisid, tüdrukud)));


    }

    static  int[] ühildamine(int[] a, int[] b) {

        int[] uus = new int[a.length + b.length];

        int i = 0;

        for (; i < a.length; i++) {
            uus[i] = a[i];
        }
        for (int c = 0; c < b.length; c++, i++) {
            uus[i] = b[c];
        }

        java.util.Arrays.sort(uus);

        return uus;
    }

    static int[] ümberpööramine(int[] massiiv) {
        int[] uus_massiiv = new int[massiiv.length];

        for (int i = 0 ; i < massiiv.length; i++) {
            uus_massiiv[i] = -massiiv[massiiv.length - i - 1];
        }

        return uus_massiiv;
    }

    static int[][] tansupaarid (int[] poisid, int[] tüdrukud) {
        java.util.Arrays.sort(poisid);
        java.util.Arrays.sort(tüdrukud);

        int paaride_arv = Math.min(poisid.length, tüdrukud.length);

        int[][] paarid = new int[paaride_arv][2];


        for (int i = 0; i < paaride_arv; i++) {
            int[] paar = {poisid[i], tüdrukud[i]};
            paarid[i] = paar;
        }


        return paarid;
    }

    static int[] üksikud(int[] poisid, int[] tüdrukud) {
        int paaride_arv = Math.min(poisid.length, tüdrukud.length);

        if (poisid.length > paaride_arv) {
            int[] üksikud = new int[poisid.length - paaride_arv];
            int üksikud_x = 0;
            for (int i = paaride_arv; i < poisid.length; i++, üksikud_x++) {
                üksikud[üksikud_x] = poisid[i];
            }
            return üksikud;
        }
        else if (tüdrukud.length > paaride_arv) {
            int[] üksikud = new int[tüdrukud.length - paaride_arv];
            int üksikud_x = 0;
            for (int i = paaride_arv; i < tüdrukud.length; i++, üksikud_x++) {
                üksikud[üksikud_x] = poisid[i];

            }
            return üksikud;
        }
        else {
            return new int[0];
            }
    }

    static String massiiv_sõneks(int[] massiiv) {
        String sõne = "";
        for (int i = 0; i < massiiv.length; i++) {
            if (i == massiiv.length -1) {
                sõne += massiiv[i];
            }
            else {
                sõne += massiiv[i] + ", ";
            }
        }
        return sõne;

    }


}