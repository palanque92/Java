package Gun33.Ornek1;

public class KisiMain {
    public static void main(String[] args) {
        Kisi kisi1 = new Kisi();
        kisi1.ad="Omer";
        kisi1.soyad="Boncuk";
        kisi1.setAd("Omer");
        kisi1.setSoyadd("Boncuk");
        kisi1.yasAta(-25);
        System.out.println(kisi1.yasVer());
        System.out.println("kisi1 = " + kisi1);
    }
    // degiskeni direk erisime kapatip
    // bir metod ile korumali veri gonderme ve alma
    // islemine Encasulation denir.
}
