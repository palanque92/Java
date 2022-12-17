package Gun31._02_FinalModifier.Ornek3;

import java.util.Scanner;

public class Zaman {
    // Sabitler isimli bir Class da sabit bir şekilde
    // bir gündeki saat sayısı, bir saatdaki dakika sayısı ve
    // bir dakikadaki saniye sayısını tanımlayınız.(bu degerler değiştirilemez olmalı)
    // mainde kullanıcıdan gun, saat, dakika alarak toplam
    // saniyeyi bulunuz.

    public static void main(String[] args) {
        Sabitler zaman = new Sabitler();

        int gun = 0;
        int saat = 0;
        int dakika = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Gun =");
        gun = input.nextInt();
        System.out.println("Saat =");
        saat = input.nextInt();
        System.out.println("Dakika =");
        dakika = input.nextInt();
        // 1. yontem
        int toplamSaniye = gun*Sabitler.birgundekiSaatSayisi*Sabitler.birsaattekiDakikaSayisi*Sabitler.birdakikadakiSaniyeSayisi
                +
                saat*Sabitler.birsaattekiDakikaSayisi*Sabitler.birdakikadakiSaniyeSayisi
                +
                dakika*Sabitler.birdakikadakiSaniyeSayisi;

        System.out.println("toplam Saniye = " + toplamSaniye);

        // 2. yontem ve olmasi gereken yontem
        System.out.println("Toplam saniye yazdirma = " + Sabitler.toSecond(gun,saat,dakika));




    }
}

// PUBLIC : bütün heryerden ulaşabiliyorum. package class farketmez.
// STATIC : Obje tanımlamadan ulaşım sağlayabiliriz. Class içi kullanımlar için geçerlidir.
// FINAL  : Value değiştirilemez. Değiştirmek için ilk tanımlama yada CONSTRUCTER tanımlarken yeni VALUE atanabilir.
// INT    : tipi