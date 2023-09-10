import java.util.List;

public class Lõbustuspark {
    private List<Lõbustus> lõbustus;

    public Lõbustuspark(List<Lõbustus> lõbustus) {
        this.lõbustus = lõbustus;
    }

    public void alustaSeiklust(Külastaja külastaja){
        System.out.println("alustan seiklust");
        for (Lõbustus lõbustus : lõbustus) {
            lõbustus.lõbusta(külastaja);
            System.out.println(külastaja.kuludeSumma());
        }
        System.out.println(külastaja.kõikKirjeldused());
    }
}
