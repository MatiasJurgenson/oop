public class Programmeerija {
    private String programmeerijaNimi;
    private double riduKoodi;
    private int tasseKohvi;
    private Kohv lemmikkohv;

    public Programmeerija(String programmeerijaNimi, double riduKoodi, int tasseKohvi, Kohv lemmikkohv) {
        this.programmeerijaNimi = programmeerijaNimi;
        this.riduKoodi = riduKoodi;
        this.tasseKohvi = tasseKohvi;
        this.lemmikkohv = lemmikkohv;
    }
    public Programmeerija(String programmeerijaNimi, double riduKoodi) {
        this.programmeerijaNimi = programmeerijaNimi;
        this.riduKoodi = riduKoodi;
    }

    public int getTasseKohvi() {
        return tasseKohvi;
    }
    public double getRiduKoodi() {
        return riduKoodi;
    }
    public void setTasseKohvi(int tasseKohvi) {
        this.tasseKohvi = tasseKohvi;
    }
    public void setRiduKoodi(double riduKoodi) {
        this.riduKoodi = riduKoodi;
    }

    public boolean kasJoobKohvi() {
        if (lemmikkohv != null) {
            return true;
        }
        else {
            return false;
        }
    }

    public double koodiTassiKohta() {
        if (kasJoobKohvi()) {
            return riduKoodi / tasseKohvi;
        }
        else {
            System.out.println(programmeerijaNimi + " ei joo kohvi.");
            return -1;
        }
    }

    public String toString() {
        if (kasJoobKohvi()) {
            return programmeerijaNimi + ", " + lemmikkohv.getKohvisort() + ", " + lemmikkohv.getHind()
                    + ", " + lemmikkohv.tassideMaksumus(tasseKohvi) + ", " + koodiTassiKohta();
        }
        else {
            return programmeerijaNimi + " ei joo kohvi.";
        }
    }
}