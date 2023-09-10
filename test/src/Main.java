import java.util.ArrayList;
import java.util.List;

public class Main {
    public Main(boolean suur) {
        if (suur) {
            System.out.println("jah");
        }
    }
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(1, 1);
        for (int i : list1) {
            System.out.println(i);
        }
    }
}