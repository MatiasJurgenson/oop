import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.Charset;

import static java.nio.charset.Charset.defaultCharset;

public class kodeering {
    public void kirjutaFaili(String tekst) {

    }

    public static void main(String[] args) throws Exception {
        String lause = "Andje käsi väsis ärä, võtje käsi ei väsi kunagi";
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("kodeering.txt", Charset.forName("windows-1257")))) {
            bw.write(lause);
        }

        try (BufferedReader br = new BufferedReader(new FileReader("kodeering.txt", Charset.forName("UTF-8")))) {
            System.out.println("lugesin rea:");
            System.out.println(br.readLine());
        }
    }

}
