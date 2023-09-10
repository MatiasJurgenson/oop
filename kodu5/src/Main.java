import java.util.List;

public class Main {
    public static void main(String[] args) {
        Atraktsioon mäed = new Atraktsioon("mäed", 12);
        Atraktsioon loss = new Atraktsioon("loss", 14);
        Dokument[] dokumendid = {
                new IdKaart("50708071234"),
                new Õpilaspilet(2010)
        };

        List<Dokument> mäedEbasobivadDokumendid = mäed.ebasobivadDokumendid(dokumendid);
        List<Dokument> lossEbasobivadDokumendid = loss.ebasobivadDokumendid(dokumendid);

        for (Dokument dokument: mäedEbasobivadDokumendid){
            System.out.println(dokument);
        }
        System.out.println("sobib: " + mäed.vanusedSobivad(dokumendid));

        for (Dokument dokument: lossEbasobivadDokumendid){
            System.out.println(dokument);
        }
        System.out.println("sobib: " + loss.vanusedSobivad(dokumendid));
    }
}