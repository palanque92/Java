package Gun20;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        //1- Girilen bir sayıya kadar olan sayıların çarpım sonucnu bulunuz.
        Scanner input = new Scanner(System.in);
        System.out.print("bir sayi giriniz: ");
        int sayi = input.nextInt();
        int i = 1;
        int toplam = 1;
        while (i <= sayi) {
            toplam *= i;
            i++;
        }
        System.out.println("carpım= " + toplam);

        //2- 0-100 arasındaki sayılardan teklerin ayrı çiftlerin ayrı toplamını bulunuz.
        int cift = 0;
        int tek = 0;
        int sayac = 0;
        while (sayac < 100) {
            if (sayac % 2 == 1) {
                tek += sayac;
            } else {
                cift += sayac;
            }
            sayac++;
        }
        System.out.println("cift sayilar toplam= " + cift + "\ntek sayilar toplam= " + tek);

        //3- 100 den 0 a kadar olan tüm tek sayıları ekrana yazdırınız.
        int sayac1 = 100;
        while (sayac1 > 0) {
            if (sayac1 % 2 == 1) {
                System.out.println(sayac1);
            }
            sayac1--;
        }

        //4- 0 ile 100 arasındaki sayılardan hem 4 e hem de 5 tam bölünebilen sayıları ekrana yazdırınız.
        int j = 0;
        while (j < 100) {
            if (j % 4 == 0 && j % 5 == 0) {
                System.out.println("4 ile 5 e tam bolunebilen sayilar= " + j);
            }
            j++;
        }

        //5- Sayı bulmaca oyununu tam hali ile cözünüz. kullanıcıya 10 hak veriniz.
        Scanner input1 = new Scanner(System.in);
        System.out.print("hangi sayiya kadar tutulsun= ");
        int sinir = input1.nextInt();
        int tutulanSayi = (int) (Math.random() * sinir);
        int hak = 1;
        int tahmin;
        do {
            System.out.print("tahminin nedir: ");
            tahmin = input1.nextInt();
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
