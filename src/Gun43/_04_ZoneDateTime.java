package Gun43;

import java.time.Duration;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.Temporal;
import java.util.Set;

public class _04_ZoneDateTime {
    // Baska zaman bolgelerinin (Zone) zaman bilgisini alma
    public static void main(String[] args) {
        ZonedDateTime zdt = ZonedDateTime.now();
         // su anda benim bulundugum default zoneID ye gore zamani verecek ;

        System.out.println("zdt = " + zdt);

        Set<String> zamanBolgeleri = ZoneId.getAvailableZoneIds();

        for (String z : zamanBolgeleri ) {
            if (z.toLowerCase().contains("lon"))
                System.out.println("z = " + z);
        }

        ZoneId zoneIdLondon = ZoneId.of("Europe/London");
        ZonedDateTime saatLondon = ZonedDateTime.now(zoneIdLondon);
        System.out.println("saatLondon = " + saatLondon);

        ZoneId zoneIdIstanbul = ZoneId.of("Europe/Istanbul");
        ZonedDateTime saatIstanbul = ZonedDateTime.now(zoneIdIstanbul);
        System.out.println("saatIstanbul = " + saatIstanbul);



    }
}
