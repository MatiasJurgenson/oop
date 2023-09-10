import java.io.*;
import java.nio.charset.Charset;

public class CSVLugeja implements AutoCloseable {
    private BufferedReader br;

    public CSVLugeja(String failiNimi) throws Exception {
        if (!failiNimi.toLowerCase().endsWith(".csv")) {
            throw new IOException();
        }
        this.br = new BufferedReader(new FileReader(failiNimi));
    }

    public String[] reaLugeja() throws Exception{
        String rida = br.readLine();
        if (rida == null){
            return null;
        }
        return rida.split(",");
    }

    @Override
    public void close() throws Exception {
        br.close();
    }
}
