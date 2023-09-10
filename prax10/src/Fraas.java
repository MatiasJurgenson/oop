public class Fraas {
    private String fraas;

    public Fraas(String fraas) {
        StringBuilder sb = new StringBuilder(fraas);
        String uus = sb.reverse().toString();
        if (fraas.equals(uus)){
            throw new PalindroomiErind(fraas);
        }
        this.fraas = fraas;
    }

    public String toString() {
        return "fraas: " + fraas;
    }
}
