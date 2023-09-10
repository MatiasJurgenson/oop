public class Raamat extends Teos {

    public Raamat(String teoseKirjeldus, String tähis, String laenutaja, int päevadeArv) {
        super(teoseKirjeldus, tähis, laenutaja, päevadeArv);
    }

    @Override
    public boolean kasHoidlast() {
        if (this.getTähis().equals("kollane") || this.getTähis().equals("sinine")) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "raamat: " + super.toString();
    }
}
