import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.charset.Charset;

public class ül6 {
    public static void main(String[] args) throws Exception{
        //kui faili ei suleta siis sinna ei kirjutata
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(args[0], Charset.forName("UTF-8")));) {
            bw.write("Hello world!\n");
        }
    }
}
