public class VigaseKoordinaadiErind extends RuntimeException{
    private int x;
    private int y;

    public VigaseKoordinaadiErind(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return ("vigased kordinaadid:\nx: " + x + " y: " + y);
    }
}
