public class Lasketiir implements Lõbustus{
    public void lõbusta(Külastaja külastaja) {
        int suvaline = (int) (Math.random()*20);
        külastaja.lisaKirjeldus("tabasin lasketiirus " + suvaline + " sihtmärki");
    }
}
