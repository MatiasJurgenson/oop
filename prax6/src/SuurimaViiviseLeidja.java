import java.util.List;

public class SuurimaViiviseLeidja implements Kontrollija{

    private String laenutaja;
    private String kirjeldus;
    private double viivis;
    public void saadaHoiatus() {
        System.out.println(laenutaja + " " + kirjeldus);
    }

    @Override
    public void salvestaViivis(String laenutajaNimi, String teoseKirjeldus, double viiviseSuurus) {
        if (viiviseSuurus > viivis) {
            this.laenutaja = laenutajaNimi;
            this.kirjeldus = teoseKirjeldus;
            this.viivis = viiviseSuurus;
        }
    }
}
