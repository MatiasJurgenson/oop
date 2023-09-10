import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.BlockingQueue;

public class Lugeja implements Runnable {

        // järjekord, mille kaudu ülesandeid vastu võetakse
        private BlockingQueue<String> algfailid;

        // järjekord, mille kaudu lahendused tagasi saadetakse
        private BlockingQueue<Integer> summad;

  public Lugeja(BlockingQueue<String> algfailid, BlockingQueue<Integer> summad) {
            this.algfailid = algfailid;
            this.summad = summad;
        }

        @Override
        public void run() {
            try {
                while (true) {
                    // proovime järgmise ülesande (faili) vastu võtta
                    String fail = algfailid.poll();
                    if (fail == null)
                        break; // ülesanded said otsa, lõpetame töö

                    int summa = 0;

                    try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fail), "UTF-8"))) {
                        String rida = br.readLine();
                        while (rida != null) {
                            String[] jupid = rida.split(" ");
                            rida = br.readLine();
                            for (int i = 0; i < jupid.length; i++) {
                                summa += Integer.parseInt(jupid[i]);
                            }
                        }
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }
                    // saadame lahenduse tagasi
                    summad.put(summa);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
}
