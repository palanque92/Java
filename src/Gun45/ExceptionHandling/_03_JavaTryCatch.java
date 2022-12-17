package Gun45.ExceptionHandling;

import java.time.LocalDate;
import java.time.Month;

public class _03_JavaTryCatch {
    public static void main(String[] args) {
        System.out.println("program basladi");

        try { // dene , hatanin basladigi yerin ustune konur.
            LocalDate tarih = LocalDate.of(2022, Month.FEBRUARY,30);

        } // hata oldugu zaman programi kirma
        catch (Exception ex) // ex isimli degiskende olusan hatalarin bilgisi ataniyor
        { // hata oldugunda yapilmasi istenenler buraya yaziliyor
            System.out.println("Hata olustu lutfen tekrar deneyiniz");

        }
        System.out.println("program calismaya devam etti");
        System.out.println("program bitti");


    }
}
