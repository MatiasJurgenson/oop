import java.util.Scanner;

public class Korrutaja {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sisestage täisarv: ");
        String sõne = scan.nextLine();
        while (true) {
            try {
                int arv = Integer.parseInt(sõne);
                System.out.println(arv * 2);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Sisend ei olnud täisarv!");
                System.out.println("Sisestage täisarv: ");
                sõne = scan.nextLine();
            }
        }

    }
}
