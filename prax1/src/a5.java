public class a5 {
    public static void  main(String[] args) {
        /* Väljastage arvud 1st 5ni.
                Looge 2 muutujat: summa ja piir ning liida summale juurde arv 2 seni kuni summa saab suuremaks kui piir.
                Väljastage tsükli abil tekst "Tuletan meelde, et varsti algab loeng!" nii, et olenemata konkreetsest tsükli tingimusest see tekst vähemalt ühe korra väljastatakse. */
        for (int i = 1; i <= 5; i++){
            System.out.println(i);
        }
        int summa = 0;
        int piir = 9;
        while (summa <= piir) {
            summa += 2;
        }

        int i= 0;
        do {
            System.out.println("Tuletan meelde, et varsti algab loeng!");
        }
        while(false);

    }
}
