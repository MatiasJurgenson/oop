public class Traktor extends Koristusmasin {
    public Traktor(String masinaRegistrinumber) {
        super(masinaRegistrinumber);
    }

    @Override
    public void korista(Tee tee) {
        System.out.println(tee.toString() + ", " + getMasinaRegistrinumber() + ", Teed koristab traktor");
        setLäbisõit(getLäbisõit() + tee.getPikkus() * 2);
        getKoristatudTeed().add(tee);
    }
}
