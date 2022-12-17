package Gun37.Soru6;

public class Main {
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


    }
}
