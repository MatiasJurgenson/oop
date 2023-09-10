public class SõnedeAnalüüsimine {
    public static void main(String[] args) {
        SõnedeAnalüsaator sõne = new SõnedeAnalüsaator("luuakse sõnede analüüsaator mingi sõne jaoks");
        sõne.väljastaSõne();
        System.out.println("Keskmise sõna pikkus on: " + sõne.leiaKeskminePikkus());
        System.out.println("Pikim sõna on: " + sõne.leiaPikimSõna());

    }
}
