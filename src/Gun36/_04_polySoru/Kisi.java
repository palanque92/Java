package Gun36._04_polySoru;

public class Kisi {
    private String ad ;
    private String soyad ;
    private String gorevi ;

    public Kisi(String ad, String soyad, String gorevi) {
        setAd(ad);
        setSoyad(soyad);
        setGorevi(gorevi);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getGorevi() {
        return gorevi;
    }

    public void setGorevi(String gorevi) {
        this.gorevi = gorevi;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", gorevi='" + gorevi + '\'' +
                '}';
    }
    public static void KimlikBelgesiYaz (Kisi gelenKisi)
    {
        System.out.println(" **** Kimlik belgesi **** ");
        System.out.println("Adi =" + gelenKisi.ad);
        System.out.println("soyad = " + gelenKisi.soyad);
        System.out.println("gorevi = " + gelenKisi.gorevi);

        if (gelenKisi instanceof Ogrenci) // bu gelen kisi ogrenci
            System.out.println(" = " + ((Ogrenci)gelenKisi).getSubesi());
        else
            if (gelenKisi instanceof Calisan) // bu gelen kisi calisan mi
                System.out.println("gele = " + ((Calisan) gelenKisi).getDepartmani());
    }
}
