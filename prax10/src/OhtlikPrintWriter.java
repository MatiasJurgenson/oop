import java.io.IOException;
import java.io.PrintWriter;

public class OhtlikPrintWriter {
    static void kirjuta(String failiNimi, String tekst) throws IOException {
        PrintWriter writer = new PrintWriter(failiNimi, "UTF-8");
        writer.write(tekst);

        try {
            if (writer.checkError()) {
                throw new IOException();
            }
        } finally {
            writer.close();
        }
    }
}
