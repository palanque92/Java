package Gun32.Ornek3;

public class AylarMain {
    public static void main(String[] args) {
        Aylar ay = Aylar.AGUSTOS;

        // Ayin kac gun surdugunu metod gerekiyor
        // ayin turkce yazilisini metod gerekiyor
        // ayin gercek nosu metod gerekiyor
        // ayin gercek sira nosu metod gerekiyor

        // JAVA DIYORKI BU SEKILDE TEK BIR KELIME VEYA
        // SAYI OLAN DEGERLERI OLACAKSA SANA BIR KOLAYLIK SAGLAR

        System.out.println("ay = " + ay);
        System.out.println("ay.ayAd = " + ay.ayAd);
        System.out.println("ay.ayno = " + ay.ayno);
        System.out.println("ay = " + ay.gunMiktar);

    }
}
