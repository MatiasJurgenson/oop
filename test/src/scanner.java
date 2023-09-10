import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner("fail.txt")) {
            while (sc.hasNextLine()) {
                String rida = sc.nextLine();
                String[] tükid = rida.split(" ");
                for (String t : tükid) {
                    System.out.println(t);
                }
            }
        }
    }
}
