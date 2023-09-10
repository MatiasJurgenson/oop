import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.Charset;

public class paroolid {
    public static void otsiParoole(String failiNimi) throws Exception{
        try (BufferedReader br = new BufferedReader(new FileReader(failiNimi, Charset.forName("UTF-8")));
        BufferedWriter bw = new BufferedWriter(new FileWriter("paroolid.txt", Charset.forName("UTF-8")))) {
            String rida = br.readLine();
            while (rida != null) {
                if (rida.contains(" parool: ")){
                    String[] jupid = rida.split(" parool: ");
                    String parool = jupid[1].split(" ")[0];
                    bw.write(parool + "\n");
                }
                rida = br.readLine();
            }
        }
    }

    public static void main(String[] args) throws Exception  {
        otsiParoole("peidetud.txt");
    }
}
