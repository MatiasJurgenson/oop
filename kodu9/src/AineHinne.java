public class AineHinne {
    private String nimetus;
    private char hinne;

    public AineHinne(String nimetus, char hinne) {
        this.nimetus = nimetus;
        this.hinne = hinne;
    }

    public AineHinne(String nimetus, String[] massiiv) {
        this.nimetus = nimetus;
        this.hinne = hinnePunktideMassiivist(massiiv);
    }

    public String getNimetus() {
        return nimetus;
    }

    public char getHinne() {
        return hinne;
    }

    private char hinnePunktideMassiivist(String[] massiiv) {
        double summa = 0;
        for (String sõne : massiiv) {
            summa += Double.parseDouble(sõne);
        }
        if (summa > 90) return 'A';
        if (summa > 80) return 'B';
        if (summa > 70) return 'C';
        if (summa > 60) return 'D';
        if (summa >= 51) return 'E';
        return 'F';
    }

    public String toString() {
        return "Aine: " + nimetus + ", hinne: " + hinne;
    }
}
