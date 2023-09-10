import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.Charset;

public class PuhvertatudVood {
    public static void main(String[] args) throws Exception {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Fail1.txt", Charset.forName("UTF-8")))) {
            bw.write(args[0] + "\n");
        }

        /* tagastab null, sest ei kirjuta
        BufferedWriter bw = new BufferedWriter(new FileWriter("Fail1.txt", Charset.forName("UTF-8")));
        bw.write(args[0] + "\n");
         */

        try (BufferedReader br = new BufferedReader(new FileReader("Fail1.txt", Charset.forName("UTF-8")))) {
            System.out.println(br.readLine());
        }
    }
}
