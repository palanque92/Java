package OOPodev.Soru3;

public class Calisan {

    private String isim;
    private String adres;
    private Okul okul;
    private double maas;
    private final UyeTipi uyeTipi = UyeTipi.CALİSAN;

    public Calisan(String isim, String adres, Okul okul, double maas) {
        setIsim(isim);
        setAdres(adres);
        setOkul(okul);
        setMaas(maas);
        okul.calisanEkle(this);
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

    public double getMaas() {
        return maas;
    }

    public void setMaas(double maas) {
        this.maas = maas;
    }

    public UyeTipi getUyeTipi() {
        return uyeTipi;
    }

    @Override
    public String toString() {
        return "\nİsim: " + isim + "\n" +
                "Adres: " + adres + "\n" +
                "Maaş: " + maas;
    }


}
