import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Taara {

    public static ArrayList<String> loeFail() throws Exception {
        ArrayList<String> read = new ArrayList<>();
        File fail = new File("Taara.txt");
        if (fail.exists()) {
            try (Scanner sc = new Scanner(fail, "UTF-8")) {
                while (sc.hasNextLine()) {
                    String line = sc.nextLine();
                    read.add(line);
                }
            }
        } else {
            System.out.println("Faili ei elsisteeri");
        }
        return read;

    }

    public static void main(String[] args) throws Exception{
        ArrayList<String> read = loeFail();
        System.out.println(read);
    }

}
