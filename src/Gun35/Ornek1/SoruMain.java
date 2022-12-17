package Gun35.Ornek1;

public class SoruMain {// 1- Arac isimli bir superclass olusturunuz, fields : renk, motorHacmi, marka olsun.
    // 2- Consructor ekleyiniz.get ve set metodları ve toString Metodunu ekleyiniz.
    // 3- Bu sınıftan  Otobus sınıfını üretiniz, otobusun ayrıca yolcuKapasitesi field ını ekleyiniz.
    // 4- Bir AracPark isimli içinde main olan bir sınıf olucturunuz ve Otobus ten
    //    nesne oluşturarak, Otobusun özelliklerinin tümünü ekrana yazdırınız.
    public static void main(String[] args) {
        Otobus bus = new Otobus("Mavi",6000,"Mercedes-Benz",50);
        System.out.println("bus = " + bus);

    }
}
