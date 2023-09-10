import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Peaklass {
    public static void main(String[] args) throws InterruptedException {
        List<String> failid = Arrays.asList("1.txt", "2.txt", "3.txt", "4.txt");

        // loome järjekorrad ja määrame järjekorra maksimaalse suuruse
        BlockingQueue<Integer> summad = new ArrayBlockingQueue<>(10);
        BlockingQueue<String> algflailid = new ArrayBlockingQueue<>(10);

        // lisame kõik failid tööde järjekorda
        algflailid.addAll(failid);

        // käivitame töölised (mõlemad võtavad võidu ühisest järjekorrast ülesandeid)
        new Thread(new Lugeja(algflailid, summad)).start();
        new Thread(new Lugeja(algflailid, summad)).start();
        new Thread(new Lugeja(algflailid, summad)).start();

        for (int i = 0; i < failid.size(); i++) {
            // võtame tulemuste järjekorrast järgmise summa (vajadusel ootame)
            System.out.println(summad.take());
        }
    }
}
