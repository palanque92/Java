package Gun43;

import java.time.LocalDate;
import java.time.Period;

public class _02_Period {
    public static void main(String[] args) {
        // 2 tarih arasindaki zaman farki gosterir
        // LocalDate le icin kullanilir.

        LocalDate dogumTarihi = LocalDate.of(1992,3,30);
        LocalDate buGun = LocalDate.now();

        Period fark = Period.between(dogumTarihi,buGun);
        System.out.println("fark = " + fark);

        System.out.println("fark.getYears() = " + fark.getYears());
        System.out.println("fark.getMonths() = " + fark.getMonths());
        System.out.println("fark.getDays() = " + fark.getDays());

        System.out.println(fark.getYears()+" yasindasiniz");

        // **************************************** //

        Period period3Gun = Period.ofDays(3);
        Period period3Ay = Period.ofMonths(3);

        LocalDate ucGunSonra = buGun.plus(period3Gun);
        LocalDate ucAySonra = buGun.plus(period3Ay);

        System.out.println("ucAySonra = " + ucAySonra);
        System.out.println("ucGunSonra = " + ucGunSonra);

        // Ornek kursun bitis suresini bulunuz (6ay)
        // ne kadar sure kaldi

        LocalDate kursStart =LocalDate.of(2022,7,25);
        Period kursSure = Period.ofMonths(6);
        LocalDate kursBitis = kursStart.plus(kursSure);

        System.out.println("kursBitis = " + kursBitis);
        System.out.println("kursBitis.getDayOfWeek() = " + kursBitis.getDayOfWeek());

        // kursun bitmesine ne kadar sure kaldi 
        Period kacGunKaldi = Period.between(buGun,kursBitis);
        System.out.println("kacGunKaldi.getDays() = " + kacGunKaldi.getMonths());
        // kurs ne kadar suredir devam ediyor
        Period devamSuresi = Period.between(kursStart,buGun);
        System.out.println("devamSuresi = " + devamSuresi);



    }
}
