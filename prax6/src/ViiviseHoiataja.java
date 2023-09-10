import java.util.ArrayList;
import java.util.List;

public class ViiviseHoiataja implements Kontrollija {
    double lubatudViivis;
    List<String> hoiatatavadLaenutajad = new ArrayList<>();

    public ViiviseHoiataja(double lubatudViivis) {
        this.lubatudViivis = lubatudViivis;
    }

    @Override
    public void salvestaViivis(String laenutajaNimi, String teoseKirjeldus, double viiviseSuurus) {
        if (viiviseSuurus > lubatudViivis) {
            if (!hoiatatavadLaenutajad.contains(laenutajaNimi)) {
                hoiatatavadLaenutajad.add(laenutajaNimi);
            }
        }
    }

    public List<String> getHoiatatavadLaenutajad() {
        return hoiatatavadLaenutajad;
    }
}
