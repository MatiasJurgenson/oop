import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Tudeng {
    private String nimi;
    private List<AineHinne> hinded;

    public Tudeng(String nimi, List<AineHinne> hinded) {
        this.nimi = nimi;
        this.hinded = hinded;
    }

    public void salvestaBinaarfaili(String failiNimi) throws Exception {
        try (
                DataOutputStream dos = new DataOutputStream( new FileOutputStream(failiNimi))
        ) {
            dos.writeInt(hinded.size());
            dos.writeUTF(nimi);
            for (AineHinne aineHinne : hinded) {
                dos.writeUTF(aineHinne.getNimetus());
                dos.writeChar(aineHinne.getHinne());
            }

        }
    }

    public static Tudeng loeBinaarfailist(String failiNimi) throws Exception {
        String nimi = "";
        List<AineHinne> aineHinne = new ArrayList<>();
        try (
                DataInputStream dis = new DataInputStream(
                        new FileInputStream(failiNimi))
        ) {
            int aineteArv = dis.readInt();
            nimi = dis.readUTF();
            for (int i = 0; i < aineteArv; i++) {
                aineHinne.add(new AineHinne(dis.readUTF(), dis.readChar()));
            }

        }
        return new Tudeng(nimi, aineHinne);
    }

    public String toString() {
        return nimi + ": " + hinded;
    }
}
