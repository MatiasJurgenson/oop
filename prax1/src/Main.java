import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // UwU
        int a = 7;
        int summa = 0;

        for (int i = 1; i <= 5; i++) {
            summa += i;
        }
        System.out.println(summa);

        int summa2 = 0;
        int i = 1;
        while (i <= 5) {
            summa2 += i;
            i++;
        }
        System.out.println(summa2);
        int summa3= 0;
        i = 1;
        do {
            summa3 += i;
            i++;
        }
        while (i <= 5);
        System.out.println(summa2);
    }


}