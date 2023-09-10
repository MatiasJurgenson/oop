public class Võistlused {
    static String lühendaja(String failiRida) {
        String[] massiiv = failiRida.split(" ");
        StringBuilder sbTulemus = new StringBuilder();
        for (String elem : massiiv) {
            if (elem.equals(massiiv[massiiv.length -1])){
                sbTulemus.append("'");
                sbTulemus.append(elem.substring(elem.length()-2));
            } else {
                sbTulemus.append(elem.toUpperCase().charAt(0));
            }

        }
        String tulemus = sbTulemus.toString();
        return tulemus;
    }

    public static void main(String[] args) throws Exception {
        java.io.File fail = new java.io.File("võistlused.txt");
        try (java.util.Scanner scammer = new java.util.Scanner(fail, "UTF-8")) {
            while (scammer.hasNextLine()) {
                String rida = scammer.nextLine();
                System.out.println(lühendaja(rida));
            }
        }
    }
}
