package Gun13;

import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {
        //1- Girilen bir sayıya kadar olan sayıların çarpım sonucnu bulunuz
        Scanner oku = new Scanner(System.in);
        System.out.println("Bir sayi giriniz =");

        int sayi = oku.nextInt();

        int i =1;
        int toplam =1;
        while (i<=sayi){
            toplam *=i;
            i++;

        }
        System.out.println("carpim = " + toplam);

        //2- 0-100 arasındaki sayılardan teklerin ayrı çiftlerin ayrı toplamını bulunuz.

        int tek = 0;
        int cift = 0;
        int sayac =0;

        while (sayac<100){
            if (sayac%2 ==1){
                tek +=sayac;
            } else {
                cift += sayac;
            }
            sayac++;
        }
        System.out.println("cift sayilarin toplami = " + cift + "\ntek sayilarin toplami = " +tek );

        //3- 100 den 0 a kadar olan tüm tek sayıları ekrana yazdırınız.
        int sayac1 = 100;
        while (sayac1 > 0) {
            if (sayac1 % 2 == 1) {
                System.out.println(sayac1);
            }
            sayac1--;
        }
        //4- 0 ile 100 arasındaki sayılardan hem 4 e hem de 5 tam bölünebilen sayıları ekrana yazdırınız.
        int s = 0;
        while (s < 100) {
            if (s % 4 == 0 && s % 5 == 0) {
                System.out.println("4 ile 5 e tam bolunebilen sayilar= " + s);
            }
            s++;
        }

        //5- Sayı bulmaca oyununu tam hali ile cözünüz. kullanıcıya 10 hak veriniz.
        Scanner input = new Scanner(System.in);
        System.out.print("hangi sayiya kadar tutulsun= ");
        int sinir = input.nextInt();
        int tutulanSayi = (int) (Math.random() + sinir);
        int hak = 1;
        int tahmin;
        do {
            System.out.print("tahminin nedir: ");
            tahmin = input.nextInt();
            if (hak == 10) {
                System.out.println("Tahmin etme hakkiniz doldu");
                break;
            }
            if (tahmin < tutulanSayi)
                System.out.println("Buyuk sayi giriniz.");
            if (tahmin > tutulanSayi)
                System.out.println("Kucuk sayi giriniz.");
            if (tahmin == tutulanSayi) {
                System.out.println("TEBRİKLER !!");
                break;
            }
            hak++;
        } while (tutulanSayi != tahmin);










    }
}
