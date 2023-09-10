public class Ajakiri extends Teos {

    public Ajakiri(String teoseKirjeldus, String tähis, String laenutaja, int päevadeArv) {
        super(teoseKirjeldus, tähis, laenutaja, päevadeArv);
    }

    @Override
    public boolean kasHoidlast() {
        String[] jupid = getTeoseKirjeldus().split("/");
        String aastaSõne = jupid[1].split(",")[0];
        int aasta = Integer.parseInt(aastaSõne);

        if (aasta <= 2000) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "Ajakiri: " + super.toString();
    }

}
