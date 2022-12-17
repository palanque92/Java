package OOPodev.Soru3;

public class Ogrenci {

    private String isim;
    private String adres;
    private Okul okul;
    private double ucret;
    private final UyeTipi uyeTipi = UyeTipi.OGRENCİ;

    public Ogrenci(String isim, String adres, Okul okul, double ucret) {
        setIsim(isim);
        setAdres(adres);
        setOkul(okul);
        setUcret(ucret);
        okul.ogrenciEkle(this);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public Okul getOkul() {
        return okul;
    }

    public void setOkul(Okul okul) {
        this.okul = okul;
    }

    public double getUcret() {
        return ucret;
    }

    public void setUcret(double ucret) {
        this.ucret = ucret;
    }

    public UyeTipi getUyeTipi() {
        return uyeTipi;
    }

    @Override
    public String toString() {
        return "\nİsim: " + isim + "\n" +
                "Adres: " + adres + "\n" +
                "Okul Ücreti: " + ucret ;
    }
}
