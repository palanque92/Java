package Gun42;

import Utility.MyFunc;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _04_Soru {
    public static void main(String[] args) {
        // Alınan saati geriye doğru 60sn saydırınız.
        LocalTime saat = LocalTime.now();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println("saat =" + saat.format(f));

        LocalTime saat2 = LocalTime.of(saat.getHour(), saat.getMinute(), 59);
        System.out.println("saat2 format(f) =" + saat2.format(f));

        int st = saat.getHour();
        int dakika = saat.getMinute();
        int saniye = saat.getSecond();

        for (int sn = saniye; sn >= 0; sn--) {
            saat2 = LocalTime.of(saat2.getHour(), dakika, sn);
            System.out.print("\r"+saat2.format(f));
            MyFunc.Bekle(1);

            if (sn == 0)
            {
                dakika--;
                sn=60;
            }
            if (dakika == 0)
            {
                st -- ;
                dakika=59;
                sn=60;
            }
        }
    }
}
