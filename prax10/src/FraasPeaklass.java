public class FraasPeaklass {
    public static void main(String[] args) {
        try {
            Fraas f1 = new Fraas("aias sadas saia");
        } catch (PalindroomiErind e){
            System.out.println(e.getMessage());
        }

        try {
            Fraas f2 = new Fraas("aias sadas lund");
        } catch (PalindroomiErind e){
            System.out.println(e.getMessage());
        }
    }
}
