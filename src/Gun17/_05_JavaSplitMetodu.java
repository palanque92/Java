package Gun17;

import java.util.Arrays;

public class _05_JavaSplitMetodu {
    public static void main(String[] args) {
        // Split: bir stringi parcalara ayiriyor
        String cumle = "bugun hava oldukca soguk"; // bunu kelimelerine ayirmak istiyoruz
        //bugun
        //hava
        //oldukca
        //soguk
        String[] kelimeler=cumle.split(" ");
        // birsey verilmezse karakterlerine ayirir
        for (int i=0;i<kelimeler.length;i++)


        System.out.println("kelimeler = " + Arrays.toString(kelimeler));
    }
}
