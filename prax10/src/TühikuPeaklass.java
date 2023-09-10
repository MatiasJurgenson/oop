import java.util.Scanner;

public class TühikuPeaklass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sisestage lausid:");
        while (true){
            String lause = scan.nextLine();
            if (lause.endsWith(" .") || lause.endsWith(" !") || lause.endsWith(" ?")) {
                throw new TühikuErind("sõnes eelneb tühik vahetult lauselõpumärgile.");
            }
        }
    }
}
