public class AutodeParandamine {
    public static void main(String[] args) {
        Auto auto = new Auto("Peeter", "911A", true);
        Veoauto veoauto = new Veoauto("Andrus", "900B", false, false);
        Luksusauto luksusauto = new Luksusauto("Paan", "420C", false, 1900);
        Limusiin limusiin = new Limusiin("Meelis", "123D", true, 2019);

        //elektriauto=true, tootmisaasta=1900, töötunde=1.0
        Luksusauto error = new Luksusauto("Error", "ei", true,1900);


        double juhuslik = ((int) (Math.random() * 20) + 1) / 2.0;

        Autoteenindus autoteenindus = new Autoteenindus();

        Auto[] autod = {auto, veoauto, luksusauto, limusiin};

        for (Auto parandatav : autod) {
            autoteenindus.paranda(parandatav, juhuslik);
            juhuslik = ((int) (Math.random() * 20) + 1) / 2.0;
        }
        System.out.println(autoteenindus);
        autoteenindus.paranda(error, 1);

    }

}
