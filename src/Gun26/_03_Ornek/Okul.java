package Gun26._03_Ornek;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {
        // Ogretmen için not defteri programı yapılma isteniyor.
        // Her ogrencının okulNo(int), tamAdi(String) ve notu(int) vardır.
        // Öğretmenden 3 öğrenci için bu bilgileri alınız.
        // bütün öğrencileri yazdırınız.
        Scanner sayiOku = new Scanner(System.in);
        Scanner strOku = new Scanner(System.in);

        ArrayList<Ogrenci> snf = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Ogrenci ogr = new Ogrenci();

            System.out.println("tam ad =");
            ogr.tamAd = strOku.nextLine();

            System.out.println("okul no =");
            ogr.okulNo = sayiOku.nextInt();

            System.out.println("not");
            ogr.not = sayiOku.nextInt();

            snf.add(ogr);
            //}
            // for (Ogrenci ogr : snf) {
            //    System.out.println("Ogrenci bilgileri = " + ogr.tamAd+" "+ogr.okulNo+" "+ogr.not);
            }

            bilgiYazdir(snf);
            ortalama(snf);

        }
        public static void bilgiYazdir (ArrayList < Ogrenci > snf)
        {
            for (Ogrenci ogr : snf)
                System.out.println("ogr bilgisi = " + ogr.tamAd + " " + ogr.okulNo + " " + ogr.not);
        }
        public static void ortalama (ArrayList<Ogrenci>snf)
        {
            int notTop = 0;
            for (Ogrenci ogr : snf) {
                notTop=notTop + ogr.not;
            }
            int ort = notTop/snf.size();

            for (Ogrenci ogr : snf ){
                if (ogr.not >= ort)
                    System.out.println(ogr.okulNo+" "+ogr.tamAd+" "+ogr.not+ " Gecti ");
                else
                    System.out.println(ogr.okulNo+" "+ogr.tamAd+" "+ogr.not+ " Kaldi ");
            }
        }
    }
