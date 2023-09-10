import java.util.Scanner;

public class Pilt {
    private int laius;
    private int kõrgus;
    private int[][] pikslid;

    public Pilt(int laius, int kõrgus) {
        this.laius = laius;
        this.kõrgus = kõrgus;
        this.pikslid = new int[kõrgus][laius];
    }

    public void määraPiksel(int x, int y, int väärtus) {
        if (x <= laius && y <= kõrgus) {
            if (väärtus <= 255 && väärtus >= 0) {
                pikslid[y][x] = väärtus;
            } else {
                throw new VigaseVärviErind(väärtus);
            }
        } else {
            throw new VigaseKoordinaadiErind(x, y);
        }
    }

    public int annaPiksel(int x, int y) {
        if (x <= laius && y <= kõrgus) {
            return pikslid[y][x];
        } else {
            throw new VigaseKoordinaadiErind(x, y);
        }
    }

    public static void main(String[] args) {
        Pilt pilt = new Pilt(10, 10);

        Scanner scan = new Scanner(System.in);

        loop:
        while (true){
            System.out.println("1. annaPiksel\n2. määraPiksel");
            System.out.println("Sisestage tegevuse number:");
            int käsk = scan.nextInt();
            switch (käsk) {
                case 1:
                    try {
                        System.out.println("Sisestage laius:");
                        int x = scan.nextInt();
                        System.out.println("Sisestage kõrgus:");
                        int y = scan.nextInt();
                        System.out.println(pilt.annaPiksel(x, y));
                    } catch (VigaseKoordinaadiErind e) {
                        System.out.println(e);
                    }
                    break;
                case 2:
                    try {
                        System.out.println("Sisestage laius:");
                        int x = scan.nextInt();
                        System.out.println("Sisestage kõrgus:");
                        int y = scan.nextInt();
                        System.out.println("Sisestage väärtus:");
                        int väärtus = scan.nextInt();
                        pilt.määraPiksel(x, y, väärtus);

                    } catch (VigaseKoordinaadiErind e) {
                        System.out.println(e);
                    } catch (VigaseVärviErind e) {
                        System.out.println(e);
                        break loop;
                    }
                    break;
            }


        }
    }
}
