import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class InimenePeaklass {
    public static void main(String[] args) throws Exception {
        ArrayList<String> lapsed = new ArrayList<>();
        lapsed.add("ye");
        lapsed.add("ya");
        inimene inimene = new inimene("a", "b", lapsed);

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("inimene.bin"))) {
            dos.writeUTF(inimene.getEesnimi());
            dos.writeUTF(inimene.getPerenimi());
            dos.writeInt(inimene.getLasteNimed().size());
            for (String laps : inimene.getLasteNimed()) {
                dos.writeUTF(laps);
            }

        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream("inimene.bin"))) {
            String eesnimi = dis.readUTF();
            String perenimi = dis.readUTF();
            ArrayList<String> lasteNimed = new ArrayList<>();
            int arv = dis.readInt();
            for (int i = 0; i < arv; i++) {
                lasteNimed.add(dis.readUTF());
            }
            inimene uusInimene = new inimene(eesnimi, perenimi, lasteNimed);
            System.out.println(uusInimene);
        }
    }
}
