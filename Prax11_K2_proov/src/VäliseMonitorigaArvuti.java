import java.time.LocalDateTime;

public class VäliseMonitorigaArvuti extends Arvuti{
    public VäliseMonitorigaArvuti(String tootja, boolean kiirtöö, LocalDateTime registreerimiseAeg) {
        super(tootja, kiirtöö, registreerimiseAeg);
    }

    public String toString() {
        if(onKiirtöö()) {
            return getTootja() + ";kiirtöö;monitoriga@" + getRegistreerimiseAeg();
        }
        return getTootja() + ";tavatöö;monitoriga@" + getRegistreerimiseAeg();
    }
}
