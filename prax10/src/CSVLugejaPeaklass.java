import java.util.Arrays;

public class CSVLugejaPeaklass {
    public static void main(String[] args) throws Exception {
        try(CSVLugeja csvLugeja = new CSVLugeja("fail.csv")) {
            String[] rida = csvLugeja.reaLugeja();
            while (rida != null) {
                System.out.println(Arrays.toString(rida));
                rida = csvLugeja.reaLugeja();
            }
        }
    }
}
