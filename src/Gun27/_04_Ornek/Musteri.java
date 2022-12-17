package Gun27._04_Ornek;

import java.util.Scanner;

public class Musteri {
    String name;
    String surname;
    String adress;
    ElektrikHesabi elektrik;

    int tuketimEKle() {
        int toplam=0;
        for (int i = 0; i < 3; i++) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Aylik tuketilen miktari giriniz =");
            elektrik.toplamTuketim = scan.nextInt();
            toplam = toplam + elektrik.toplamTuketim;
            System.out.println(i+"aylik tuketilen enerji = " + toplam);

        }
        return toplam;
    }
    double odenecekFiyat (int toplam) {
        return Math.round(elektrik.fiyat=toplam*0.7);
    }
}