package Gun27._01_Ornek;

public class Kampus {
    public static void main(String[] args) {
        // Bir kampus programı için asagıdaki özellikte bilgilerin
        // kaydedileceği clasları yazınız.
        // Okul :  adı, mudurAdi, ucreti(double)
        // Ogrenci : okulNo, tamAd, okulu

        // bu şekilde 1 öğrenci tanımlayıp bütün bilgileri kendiniz atayıp
        // yazdırınız.

        Ogrenci ogr1 = new Ogrenci();
        ogr1.okulNo = 1;
        ogr1.tamAd = "Omer Boncuk";
        ogr1.okulu = new Okul();
        ogr1.okulu.ad = "Ataturk okulu";
        ogr1.okulu.mudurAdi="Ersan Kuneri";
        ogr1.okulu.ucret = 1000;

        System.out.println("Ogrenci bilgisi = " + ogr1.tamAd + " " + ogr1.okulNo + " " + ogr1.okulu.ad + " " + ogr1.okulu.mudurAdi + " "+ogr1.okulu.ucret);
    }
}
