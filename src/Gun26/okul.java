package Gun26;

import java.util.ArrayList;
import java.util.Scanner;

public class okul {
    public static void main(String[] args) {
        // bir okulda kayıt programı için öğrenci bilgilerini alan modül
        //yazılacaktır.Öğrenci ye ait bilgiler (adı,soyadı,sınıfı ve adres) vardır.
        // bu yapıyı oluşturunuz.

        Scanner oku = new Scanner(System.in);
        ArrayList <Ogrenci> liste = new ArrayList<>();

        for (int i = 0; i < 3; i++) {

            Ogrenci ogr = new Ogrenci();

            System.out.println("Ogrencinin adi =");
            ogr.ad = oku.nextLine();

            System.out.println("Ogrencinin Soyadi =");
            ogr.soyad = oku.nextLine();

            System.out.println("Ogrencinin sinifi =");
            ogr.sinif = oku.nextLine();

            System.out.println("Ogrencinin adresi =");
            ogr.adres = oku.nextLine();

            liste.add(ogr);
        }
        for (Ogrenci ogr : liste) {
            System.out.println("Ogrenci bilgileri = " + ogr.ad+" "+ogr.soyad+" "+ogr.sinif+" "+ogr.adres);
        }
    }
}
class Ogrenci {
    String ad ;
    String soyad ;
    String sinif ;
    String adres ;
}