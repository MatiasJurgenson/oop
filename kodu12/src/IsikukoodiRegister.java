import java.util.ArrayList;
import java.util.List;

public class IsikukoodiRegister {
    private List<String> isikukoodid = new ArrayList<>();


    public void registreeri(String isikukood) {
        synchronized (isikukoodid) {
            if (!isikukoodid.contains(isikukood)) {
                isikukoodid.add(isikukood);
            }
        }
    }

    public int järjekorranumber(String isikukood) {
        synchronized (isikukoodid) {
            return isikukoodid.indexOf(isikukood);
        }
    }
}