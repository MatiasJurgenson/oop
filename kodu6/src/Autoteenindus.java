public class Autoteenindus {
    private int parandatudAutod;
    private double tulu;

    public void paranda(Auto auto, double ajakulu) {
        System.out.println(auto.toString() + " - " + auto.arvutaParanduseMaksumus(ajakulu));
        tulu += auto.arvutaParanduseMaksumus(ajakulu);
        parandatudAutod++;
    }

    public String toString() {
        return "Parandatud autosid: " + parandatudAutod + ", tulu: " + tulu;
    }
}
