public class VigaseVärviErind extends RuntimeException{
    private int värv;
    public VigaseVärviErind(int värv) {
        this.värv = värv;
    }

    public String toString() {
        return ("Pahur kommentaar. Vigane värv: " + värv);
    }

}
