package Gun43;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class _01_JavaLocalDateTime {
    public static void main(String[] args) {
        // LocalDateTime hem tarih hem de saat bilgisi tutar.
        LocalDateTime dt = LocalDateTime.now();
        System.out.println("dt = " + dt);

        System.out.println("dt.getYear() = " + dt.getYear());
        System.out.println("dt.getMonth() = " + dt.getMonth());
        System.out.println("dt.getMonthValue() = " + dt.getMonthValue());
        System.out.println("dt.getDayOfYear() = " + dt.getDayOfYear());
        System.out.println("dt.getDayOfMonth() = " + dt.getDayOfMonth());
        System.out.println("dt.getWeek() = " + dt.getDayOfWeek());
        System.out.println("dt.getHour() = " + dt.getHour());
        System.out.println("dt.getMinute() = " + dt.getMinute());
        System.out.println("dt.getSecond() = " + dt.getSecond());
        System.out.println("dt.getNano() = " + dt.getNano());

        System.out.println("SHORT ="+ dt.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("MEDIUM ="+ dt.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        
        // ozel formatta istedigimiz gibi yazdirma
        DateTimeFormatter f =DateTimeFormatter.ofPattern("dd.MM.yyyy hh:mm");
        System.out.println("dt.format(f) = " + dt.format(f));

    }
}
