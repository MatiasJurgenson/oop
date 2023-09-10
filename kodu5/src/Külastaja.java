public class Külastaja implements Comparable<Külastaja>{
    private String nimi;
    private int külastatudAtraktsioonideArv;

    public Külastaja(String nimi, int külastatudAtraktsioonideArv) {
        this.nimi = nimi;
        this.külastatudAtraktsioonideArv = külastatudAtraktsioonideArv;
    }

    public String getNimi() {
        return nimi;
    }

    public int getKülastatudAtraktsioonideArv() {
        return külastatudAtraktsioonideArv;
    }

    public int compareTo (Külastaja muu) {
        //return külastatudAtraktsioonideArv.compareTo(muu.külastatudAtraktsioonideArv);
        if (külastatudAtraktsioonideArv < muu.külastatudAtraktsioonideArv)
            return -1;
        if (külastatudAtraktsioonideArv > muu.külastatudAtraktsioonideArv)
            return 1;
        return 0;
    }

    public String toString() {
        return "külastaja nimi: " + nimi;
    }

}