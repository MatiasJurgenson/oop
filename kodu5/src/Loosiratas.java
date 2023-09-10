import java.util.*;

public class Loosiratas {

    private List<Külastaja> osalejad = new ArrayList<>();
    public void lisaKülastaja(Külastaja külastaja) {
        osalejad.add(külastaja);
    }
    public void lisaKülastaja(String nimi, int külastusteArv) {
        Külastaja külastaja = new Külastaja(nimi, külastusteArv);
        osalejad.add(külastaja);

    }

    public List<Külastaja> kõigeAktiivsemad(int n) {

        Collections.sort(osalejad);
        osalejad.toString();

        int külastajateArv = osalejad.size();


        List<Külastaja> aktiivsemad = new ArrayList<Külastaja>();

        if (külastajateArv > n) {
            külastajateArv = n;
        }

        for (int i = 0; i < külastajateArv; i++) {
            System.out.println(osalejad.get(osalejad.size() - 1 - i));
            aktiivsemad.add(osalejad.get(osalejad.size() - 1 - i));
        }

        return aktiivsemad;
    }

    public Külastaja loosiVõitja() {
        List<Külastaja> valikud = kõigeAktiivsemad(3);
        Random generator = new Random();
        int suvaline = generator.nextInt(3);
        return valikud.get(suvaline);

    }
}