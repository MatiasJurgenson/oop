public class TestKlass {
    public static void main(String[] args) {
        Tantsupaar paarilised = new Tantsupaar("C D", 1000, "A B", 1001);
        System.out.println(paarilised.toString());
        System.out.println(paarilised.samaVanus());
        System.out.println(paarilised.vanimpartner(2023));
    }
}
