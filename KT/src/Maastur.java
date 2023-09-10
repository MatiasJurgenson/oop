public class Maastur extends Koristusmasin {
    private String haagiseRegistrinumber;

    public Maastur(String masinaRegistrinumber, String haagiseRegistrinumber) {
        super(masinaRegistrinumber);
        this.haagiseRegistrinumber = haagiseRegistrinumber;
    }

    @Override
    public void korista(Tee tee) {
        System.out.println(tee.toString() + ", " + getMasinaRegistrinumber() + ", Teed koristab maastur");
        setLäbisõit(getLäbisõit() + tee.getPikkus() * 3);
        getKoristatudTeed().add(tee);
    }

    public String toString() {
        return super.toString() + ", haagise registrinumber: " + haagiseRegistrinumber;
    }
}
