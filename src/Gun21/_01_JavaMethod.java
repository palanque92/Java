package Gun21;

import java.util.Scanner;
// Kullanıcıya aşağıdaki gibi bir menü çıkartarak, kullanıcı çıkış seçeneğini seçene kadar
// sürekli işlemleri yapınız ve her bir menü için gerekli değerleri parametre alan fonksiyon olarak yazınız.
        /*  1-toplama
            2-çıkarma
            3-çarpma
            4-bolme
            5-Faktöryel
            6-Çıkış
        Bir işlem seçiniz */

public class _01_JavaMethod {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        int secim;

        do {
            menuYaz();
            secim = oku.nextInt();
            if (secim < 5) { islemYap(secim);
            }


        } while (secim < 5);

        System.out.println("Cikis yapildi");


    }

    public static void menuYaz() {
        System.out.println(
                "1-Toplama\n" +
                        "2-Cikarma\n" +
                        "3-Carpma\n" +
                        "4-Bolme\n" +
                        "5-Cikis\n" +
                        "Seciminiz");
    }

    public static void islemYap(int secim) {
        Scanner oku = new Scanner(System.in);
        System.out.println("Sayi1=");
        int sayi1 = oku.nextInt();
        System.out.println("Sayi2=");
        int sayi2 = oku.nextInt();

        switch (secim) {
            case 1:
                System.out.println("Sonuc=" + (sayi1 + sayi2));
                break;
            case 2:
                System.out.println("Sonuc=" + (sayi1 - sayi2));
                break;
            case 3:
                System.out.println("Sonuc=" + (sayi1 * sayi2));
                break;
            case 4:
                System.out.println("Sonuc=" + (sayi1 / sayi2));
                break;
            case 5:
                System.out.println("Sonuc=");
                break;
        }
    }
}
// TODO : 4 işlem kısmınıda ayrı bir fonksiyonda yapalım
// TODO : menülere yeni bir seçenek olarak girilen sayıya kadar çarpımı veren faktörel i de ekleyelim