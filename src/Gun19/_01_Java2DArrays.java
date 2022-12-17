package Gun19;

import java.util.Scanner;

public class _01_Java2DArrays {
    public static void main(String[] args) {
        int sayi=0; // 1 tane sayi tutyor
        int[] ders1Notlari = new int[40]; // 40 tane sayi saklayabilir
        int[] ders2Notlari = new int[40];
        int[] ders3Notlari = new int[40]; // index 0-39

        int[][] tumDersNotlari = new int[3][40]; // 3 ders 40 ogrenci
                                                 // 3 satir 40 sutun
                                                 // her satir 0-39
                                                 // 0.satir 1.satir 2.satir
                                                 // 0,1,2 - 0,1,2,3.... 39
        ders1Notlari[0]=80; // tek boyutlu dizide ilk elemana 80 atandi
        tumDersNotlari[0][0]=80; // 2 boyutlu dizide ilk satirin ilk sutununa 80 atandi

        System.out.println(tumDersNotlari[0][0]);
        Scanner oku = new Scanner(System.in);
        tumDersNotlari[0][0]=oku.nextInt();
    }
}
