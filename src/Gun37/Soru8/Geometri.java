package Gun37.Soru8;


import Utility.MyFunc;

public class Geometri {
    // Kare, Dikdortken sınıflarından oluşacak bir geometri programı
    // yapılmak isteniyor.bunların ayrı ayrı , fakat ortak metodlarının
    // (cevresi() ve alani() )zorunlu olabilmesi için gerekli yapıyı kurunuz ve yazınız.
    public static void main(String[] args) {
        Dikdortgen dikdortgen = new Dikdortgen();
        System.out.println(dikdortgen.alalni(4,5));
        System.out.println(dikdortgen.cevresi(4,5));

        Kare kare = new Kare();
        System.out.println(kare.alalni(4));
        System.out.println(kare.alalni(4));

        Daire dr = new Daire();
        System.out.println("dr. cevresi(3) = " + dr.cevresi(3));
        System.out.println("dr. Alani = " + dr.alalni(3));

        double yeniSayi = MyFunc.yuvarla(dr.cevresi(3));
        System.out.println("de.cevresi(3) = " + yeniSayi);

        System.out.printf("%6.2f" ,  dr.cevresi(3));

        // printf : formatlı (toplam kaç hane ye yaz, noktadan sonra kaç hane kullan) yazdırma
        //  % : virgülden sonraki değişkeni gözteriyor
        // .  : ondalıklı bölümü gösteriyor
        // 6  : toplamda ekrandan kaç digit kullanılacak
        // 2  : ondalıklı kısmından kaç hane alınacağını gösteriyor
        // f  : double veya float için kullanılıyor, tam sayılar için d kullanılır
        //      stringler için s kullanılır.




    }
}
