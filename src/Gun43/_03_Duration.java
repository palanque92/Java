package Gun43;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class _03_Duration {
    public static void main(String[] args) {
        // Duration : hem LocalTime hemde LocalDateTime in kendi aralarindaki farki
        // verir . Yani saat in her zaman arasindaki farki bulur.

        // LocalTime
        LocalTime dersBaslangic = LocalTime.of(8,30);
        LocalTime dersBitis = LocalTime.of(11,15);

        // arasindaki farki alma
        Duration gunlukDersSaati = Duration.between(dersBaslangic,dersBitis);
        System.out.println("gunlukDersSaati = " + gunlukDersSaati.toHours());
        System.out.println("gunlukDersSaati.toMinutes() = " + gunlukDersSaati.toMinutes());
        System.out.println("gunlukDersSaati.toMillis() = " + gunlukDersSaati.toMillis());

        // LocalDateTime *** 2 Tarih-Saat arasindaki fark ***
        LocalDateTime from = LocalDateTime.of(2022,1,1,0,0);
        LocalDateTime to = LocalDateTime.now();

        // arasindaki farki alma
        Duration farkZamani = Duration.between(from,to);

        System.out.println("farkZamani = " + farkZamani);
        System.out.println("farkZamani.toDays() = " + farkZamani.toDays());
        System.out.println("farkZamani.toHours() = " + farkZamani.toHours());
        System.out.println("farkZamani.toMinutes() = " + farkZamani.toMinutes());
        
    }
}
