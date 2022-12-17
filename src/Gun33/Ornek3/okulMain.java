package Gun33.Ornek3;

import java.util.Scanner;

public class okulMain {
    //  1- fieldları ad, soyad, yas olan bir Ogrenci sınıfı tanımlayınız.
    //  2- Ogrenci sınıfına ad, soyad  ve yas dan oluşan bir consructor tanımlayınız.
    //  3- Bütün fieldlar için encapsulation uygulayınız.
    //  4- okul isimli bir class tanımlayınız, fieldları okulAd, kontenjan,
    //     ArrayList cinsinden Öğrencileri olsun.
    //  5- main metodunun olduğu OkulMain isimli bir sınıf oluşturunuz.
    //  6- bir okul nesnesi oluşturup, bu okula max öğrenci miktarına ulaşana kadar kullanıcıdan alarak
    //     öğrenci ekleyiniz. Fakat oluşturacağınız öğrencilerin yaşı 15 i geçmemeli.
    //     bu yaşı geçen bir öğrenci eklenmek istenir ise yerine başka öğrenci isteyiniz.
    //  7- Öğrencilerin hepsine eşsiz bir ID ataması yapınız.
    public static void main(String[] args) {
        Okul yeniOkul = new Okul("Fatih Okulu",3);
        Scanner intInput = new Scanner(System.in);
        Scanner strInput = new Scanner(System.in);
        do {
            System.out.println(" Ogrenci adi =");String adsoyad = strInput.nextLine();
            System.out.println(" Ogrenci yasi =");int yas = intInput.nextInt();

            if ( yas < 15) {
                Ogrenci ogr = new Ogrenci(adsoyad,yas);
                yeniOkul.ogrenciler.add(ogr);
            }
            else
            {
                System.out.println("Ogrenci yasi okul icin uygun degil!!");
            }


        }while (yeniOkul.ogrenciler.size() < yeniOkul.getKontenjan());

        System.out.println("yeniOkul = " + yeniOkul);
        System.out.println("yeniOkul = " + yeniOkul.ogrenciler);
    }
}
