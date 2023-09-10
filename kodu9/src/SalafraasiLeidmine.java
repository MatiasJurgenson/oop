import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class SalafraasiLeidmine {
    public static String leiaEluUniversumiJaKõigeSalafraas(String failiNimi) throws Exception {
        String lause;
        int suurus = 0;
        try (
                RandomAccessFile raf = new
                        RandomAccessFile(failiNimi, "r")
        ) {

            raf.seek(42);

            int tulemus = raf.read();

            while (tulemus != 0) {
                suurus += 1;
                if (tulemus == -1) {
                    return null;
                }
                tulemus = raf.read();
            }

            raf.seek(42);
            byte[] bytes = new byte[suurus];
            raf.read(bytes);

            lause = new String(bytes, "UTF-8");

        }

        return lause;
    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        try (BufferedWriter välja = new BufferedWriter(new FileWriter("salafraasid.txt")))
        {
            while (true) {

                System.out.println("Sisesta faili nimi:");
                String vastus = scan.nextLine();
                if (vastus.equals("")) {
                    break;
                } else {
                    String lause = leiaEluUniversumiJaKõigeSalafraas(vastus);
                    if (lause != null) {
                        välja.write(lause + "\n");
                    } else {
                        System.out.println("Salafraasi ei leidnud");
                    }
                }

            }
        }
    }
}
