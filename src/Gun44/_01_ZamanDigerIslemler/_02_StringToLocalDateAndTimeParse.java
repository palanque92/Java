package Gun44._01_ZamanDigerIslemler;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class _02_StringToLocalDateAndTimeParse {
    public static void main(String[] args) {
        // Kullanicidan alinan ve string durumunda alan bir time veya tarih 
        // bilgisinin time veya tarih degiskenine cevrilmesi

        Scanner oku = new Scanner(System.in);
        System.out.print("Tarih giriniz (25 01 2020) = ");
        String strTarih = oku.nextLine();

        Long startTime = System.currentTimeMillis(); // sistemin performansi icin kod. basta ve sonda eklenir.
        
        // Kullanicinin girecegi formata gore format olusturuldu
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd MM yyyy");
        
        // String in formati bu formata uygun olmali , parse ile cevirdik.
        LocalDate tarih = LocalDate.parse(strTarih,f);

        System.out.println("tarih = " + tarih);
        System.out.println("tarih.format(f) = " + tarih.format(f));
        Long finishTime = System.currentTimeMillis(); // sistemin performansi icin kod. basta ve sonda eklenir.
        System.out.println("gecen sure = " + (finishTime-startTime)+"ms");

    }
}
