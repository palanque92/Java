package Gun23;

import java.util.ArrayList;

public class _02_ArrayList {
    public static void main(String[] args) {
        /*****************************/
        int sayi = 5; // tek bir sayi tutabilen degisken
        int[] dizi = new int[20]; // 20 adet sayi tutabilen degisken
        int[][] tablo = new int[20][2]; // 20*2 lik sayi saklayabilen degisken

        ArrayList<Integer> liste = new ArrayList<>(); // istenildigi kadar sayi eklenebilen degisken


        /******************************/

        // 3 ogrencinin ders notlarini bir degiskende nasil birlestiririz
        ArrayList<Integer> matnotlari = new ArrayList<>(); // tek bir dersin notlari // 1 yaprak
        ArrayList<Integer> fiznotlari = new ArrayList<>(); // fiz dersin notlari     // 1 yaprak
        ArrayList<Integer> kimnotlari = new ArrayList<>(); // kim dersinin notlari   // 1 yaprak

        matnotlari.add(50);
        matnotlari.add(70);
        matnotlari.add(80);

        fiznotlari.add(30);
        fiznotlari.add(40);

        kimnotlari.add(60);
        kimnotlari.add(70);
        kimnotlari.add(80);
        kimnotlari.add(90);

        // ArrayList in ArrayListi nasil yaparim
        ArrayList<ArrayList<Integer>> notlarListesi = new ArrayList<>();
        notlarListesi.add(matnotlari);
        notlarListesi.add(fiznotlari);
        notlarListesi.add(kimnotlari);
        // butun notlar listesinde su anda , yani Arraylistlerin listesi

        notlarListesi.get(0);
        notlarListesi.get(0).get(0);

        System.out.println("notlarListesi.get(0) = " + notlarListesi.get(0)); // 0. listeyi verdi
        System.out.println("notlarListesi.get(1) = " + notlarListesi.get(1)); // 1. listeyi verdi
        System.out.println("notlarListesi.get(2) = " + notlarListesi.get(2)); // 2. listeyi verdi

        // yukaridakilerin yerine bu dongu
        for (int i = 0; i < notlarListesi.size(); i++)
            System.out.println("notlarListesi = " + notlarListesi.get(i));

        for (int i = 0; i < notlarListesi.size(); i++) {
            for (int j = 0; j < notlarListesi.get(i).size(); j++) {
                System.out.print(notlarListesi.get(i).get(j) + "\t");
            }
            System.out.println();
        }
    }
}