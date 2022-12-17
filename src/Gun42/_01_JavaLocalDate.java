package Gun42;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class _01_JavaLocalDate {
    public static void main(String[] args) {
        // LocalDate Sadece gun ay yil bilgisi tutar

        LocalDate tarih = LocalDate.now();

        System.out.println("tarih = " + tarih);

        System.out.println("tarih.getYear() = " + tarih.getYear());
        System.out.println("tarih.getMonth() = " + tarih.getMonth());
        System.out.println("tarih.getDayOfWeek() = " + tarih.getDayOfWeek().getValue());
        System.out.println("tarih.getDayOfMonth() = " + tarih.getDayOfMonth());
        System.out.println("tarih.getDayOfYear() = " + tarih.getDayOfYear());

        // kendisinde ki var olan formatlar
        System.out.println("tarih.format(DateTimeFormatter.ISO_DATE) = " + tarih.format(DateTimeFormatter.ISO_DATE));
        System.out.println("SHORT = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("MEDIUM = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("LONG = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println("FULL = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        System.out.println(LocalDate.now());

        // Localde aldigim tarihi istedigim ulkenin formatina gore diline gore nasil gosteririm.
        // Ornegin Localdeki saati Almanya saati olarak nasil gosteririm

        System.out.println("Almanya daki yerel saat = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.GERMAN)));

        // en-US : BIRINCISI dili , ikinicisi Ulkeyi temsil ediyor , US United States Amerika
        // en-UK :                                                 , UK United Kingdom England
        // fr-CA : Kanada fransizca
        // en-CA : Kanada ingilizce

        Locale[] kullanillabilirLokaller = Locale.getAvailableLocales();
        for (Locale l:kullanillabilirLokaller ) {
            System.out.println(l.getCountry());
            System.out.println("Dil ="+ l.getDisplayLanguage()+" Ulke "+l.getDisplayCountry()+" "+ l.getLanguage()+" "+l.getCountry());
        }

        Locale lokalCince = new Locale("zh","CN");
        System.out.println("Full lokal Cince = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(lokalCince)));

        // istedigim formatta gosterim
        System.out.println("\n ***** ISTEDIGIM FORMATTA GOSTERIM *****");
        System.out.println("tarih ="+tarih);

        DateTimeFormatter ozelFormat1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("tarih dd/MM/yyyy = " + tarih.format(ozelFormat1));

        DateTimeFormatter ozelFormat2 = DateTimeFormatter.ofPattern("dd/MM/yy");
        System.out.println("tarih dd/MM/yy = " + tarih.format(ozelFormat2));

        DateTimeFormatter ozelFormat3 = DateTimeFormatter.ofPattern("EEEE dd/MM/yyyy");
        System.out.println("tarih EEEE dd/MM/yyyy = " + tarih.format(ozelFormat3));

        DateTimeFormatter ozelFormat4 = DateTimeFormatter.ofPattern("EE dd/MM/yyyy");
        System.out.println("tarih EE dd/MM/yyyy = " + tarih.format(ozelFormat4));

        DateTimeFormatter ozelFormat5 = DateTimeFormatter.ofPattern("MMMM dd/MM/yyyy");
        System.out.println("tarih MMMM dd/MM/yyyy = " + tarih.format(ozelFormat5));

        System.out.println("ozel Format ve Dil = " + tarih.format(ozelFormat5.withLocale(Locale.ITALIAN)));

        System.out.println(" ***** ***** ***** ");
        // Kendimiz bir tarihi nasil set edebiliriz , olusturabiliriz . int sayi = 5

        LocalDate tarih1 = LocalDate.of(1992,3, 30);
        LocalDate tarih2 = LocalDate.of(1992, Month.DECEMBER,30);
        System.out.println("tarih1 = " + tarih1.format(ozelFormat1));
        System.out.println("tarih2.format(ozelFormat2) = " + tarih2.format(ozelFormat2));









    }
}
