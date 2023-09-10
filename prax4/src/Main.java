import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] jupid = new String[]{"U", "w", "U"};

        ArrayList<String> jupidList = new ArrayList<>();
        jupidList.addAll(Arrays.asList(jupid));
        System.out.println(jupidList);

        String pikksõne = String.join("", Arrays.copyOfRange(jupid, 0, jupid.length));
        System.out.println(pikksõne);
    }
}