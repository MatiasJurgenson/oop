public class PaarPeaklass {
    public static void main(String[] args) {
        Paar<String,Integer> paar1 = new Paar<>("nimi", 18);
        Paar<String,String> paar2 = new Paar<>("nimi", "aadress");

        System.out.println(paar1);
        System.out.println(paar2);
    }
}
