package Gun31._01_StaticModifier.Ornek1;

public class Ogrenci {
    String ad;
    String soyad;
    static String okulAd = "Harward University";
    //hepsi için geçerli tek bir tane eleman
    //Tekrarlayan ve tum nesneler için kullanılacak
    //değişkenler için STATIC kullanıyoruz.
    //static=sen bir tanesin
    //static varsa hafızadan tasarruf sağlar. hepsine atanır,
    //tek olarak hafızada bulunur

    public Ogrenci(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", okulAd='" + okulAd + '\'' +
                '}';
    }
}
