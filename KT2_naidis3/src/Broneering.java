public class Broneering {

    private String nimi;
    private String aeg;
    private String vaktsiin;
    private int mitmes;

    public Broneering(String nimi, String arg, String vaktsiin, int mitmes) throws EbasobivArvErind {
        this.nimi = nimi;
        this.aeg = arg;
        this.vaktsiin = vaktsiin;
        this.mitmes = mitmes;
        if (!(mitmes == 1 || mitmes == 2)) {
            throw new EbasobivArvErind("Ebasobiv broneering: " + toString());
        }
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public String getAeg() {
        return aeg;
    }

    public void setAeg(String aeg) {
        this.aeg = aeg;
    }

    public String getVaktsiin() {
        return vaktsiin;
    }

    public void setVaktsiin(String vaktsiin) {
        this.vaktsiin = vaktsiin;
    }

    public int getMitmes() {
        return mitmes;
    }

    public void setMitmes(int mitmes) {
        this.mitmes = mitmes;
    }

    @Override
    public String toString() {
        return nimi + ", " + aeg + ", vaktsiin " + vaktsiin + ", " + mitmes + ". kord";
    }
}
