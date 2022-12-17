package Gun16;

import java.util.Arrays;

public class _06_JavaArray {
    public static void main(String[] args) {
        // 5 tv kanalı ismini bir diziye doldurunuz.
        // Daha sonra rndom olarak bir tanesini seçip ekrana seçileni yazıdırnız.

        String[] tvler={"trt1", "kanald", "atv","fox","habertürk"};

        int secilen= (int)(Math.random()*tvler.length); // 0 1 2 3 4
        System.out.println("secilen = " + secilen);
        System.out.println("tvler = " + tvler[secilen]);

        // gunun sorusu : bir döngü ile 5 tane buldurunuz
        // fakat bir buldunu tekrar bulmasın
        String[] kanallar = {"TRT1", "KanalD", "Atv", "Fox", "Habertürk"};

        int rastgeleIndex = (int) (Math.random() * kanallar.length);

        System.out.println("Rastgele Secilen Kanal : " + kanallar[rastgeleIndex]);

        String[] rastgeleSecilenKanallar = {"z","z","z","z","z"};


        for (int i = 0; i < kanallar.length; i++){

            Arrays.sort(rastgeleSecilenKanallar);

            rastgeleIndex = (int) (Math.random() * kanallar.length);

            if(Arrays.binarySearch(rastgeleSecilenKanallar,kanallar[rastgeleIndex]) >= 0){
                continue;
            }

            rastgeleSecilenKanallar[i] = kanallar[rastgeleIndex];

        }

        System.out.print("Rastgele Seçilen Kanallar :");

        for (int i = 0; i < rastgeleSecilenKanallar.length; i++) {

            if (!rastgeleSecilenKanallar[i].contains("z")) {
                System.out.print(" - " + rastgeleSecilenKanallar[i]);
            }
        }


    }
}
