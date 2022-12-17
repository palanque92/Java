package Gun30.Soru;

import java.util.Scanner;

public class Banka {
    // SEN ATM YAP OMER!!!!
    // Hesap (yatan(int), cekilen(int), bakiye(int)(direk erişim olmamalı))
    // Musteri (hesapID(int), ad, soyad, MusteriHesap(Hesap tipinde))
    // Bir banka uygulaması için 1 müşteri tanımlayınız,
    // müşterini hesabına sırasıyla 100 tl, 200tl yatırınız,sonra 50 TL çekiniz.
    // Müşteirinin toplan yatanı, toplam cekılenı ve kalan bakiyesini yazdırınız.
    // bakiyeye direk para atanamadıgını kontrol ediniz.
    public static void main(String[] args) {
        
        Musteri musteri = new Musteri();
        
        musteri.ad="Omer";
        musteri.soyad="Boncuk";
        musteri.hesapID=1;
        
        musteri.hesap.paraYatir(100);
        musteri.hesap.paraYatir(200);
        musteri.hesap.paraCek(50);
        System.out.println("musteri.hesap = " + musteri.hesap);
        
        
        
        
    }
}
