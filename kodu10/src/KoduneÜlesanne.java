import java.time.LocalDate;

public class KoduneÜlesanne {
    private LocalDate tähtaeg;

    public KoduneÜlesanne(LocalDate tähtaeg) {
        if (tähtaeg.getDayOfWeek().toString().equals("SATURDAY") || tähtaeg.getDayOfWeek().toString().equals("SUNDAY")) {
            throw new IllegalArgumentException("ebasobiv kuupäev: " + tähtaeg.getDayOfMonth() + "." + tähtaeg.getMonthValue() + "." + tähtaeg.getYear());
        } else {
            this.tähtaeg = tähtaeg;
        }
    }

    public LocalDate getTähtaeg() {
        return tähtaeg;
    }

    public void setTähtaeg(LocalDate tähtaeg) {
        if (tähtaeg.getDayOfWeek().toString().equals("SATURDAY") || tähtaeg.getDayOfWeek().toString().equals("SUNDAY")) {
            throw new IllegalArgumentException("ebasobiv kuupäev: " + tähtaeg.getDayOfMonth() + "." + tähtaeg.getMonthValue() + "." + tähtaeg.getYear());
        } else {
            this.tähtaeg = tähtaeg;
        }
    }

    public static void main(String[] args) {
        LocalDate kuupäev = LocalDate.parse("2008-11-11");
        LocalDate kuupäevVale = LocalDate.parse("2008-11-08");

        KoduneÜlesanne koduneÜlesanne = new KoduneÜlesanne(kuupäev);
        koduneÜlesanne.setTähtaeg(kuupäevVale);

    }
}
