package OOPodev.Soru3;

import java.util.ArrayList;

public class Okul {

    private String isim;
    private int maxOgrenci = 200;

    private ArrayList<Ogrenci> ogrenciler;
    private ArrayList<Calisan> calisanlar;

    public Okul(String isim, int maxOgrenci) {
        setIsim(isim);
        setMaxOgrenci(maxOgrenci);
        setOgrenciler(new ArrayList<>());
        setCalisanlar(new ArrayList<>());
    }

    public int getMaxOgrenci() {
        return maxOgrenci;
    }

    public void setMaxOgrenci(int maxOgrenci) {

        this.maxOgrenci = maxOgrenci;
    }

    public ArrayList<Ogrenci> getOgrenciler() {
        return ogrenciler;
    }

    public void setOgrenciler(ArrayList<Ogrenci> ogrenciler) {
        this.ogrenciler = ogrenciler;
    }

    public ArrayList<Calisan> getCalisanlar() {
        return calisanlar;
    }

    public void setCalisanlar(ArrayList<Calisan> calisanlar) {
        this.calisanlar = calisanlar;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void ogrenciEkle(Ogrenci ogrenci) {
        ogrenciler.add(ogrenci);
    }

    public void calisanEkle(Calisan calisan) {
        calisanlar.add(calisan);
    }

    @Override
    public String toString() {
        return isim;
    }

    public void ogrencilerYaz() {
        System.out.println("\nÖğrenciler: ");
        for (Ogrenci o : this.getOgrenciler()) {
            System.out.println("\nİsim: " + o.getIsim() + "\n" + "Üye Tipi: " + o.getUyeTipi() + "\n" +
                    "Adres: " + o.getAdres() + "\n" + "Okul Adı: " + o.getOkul() + "\n" +
                    "Okul Ücreti: " + o.getUcret());
        }
    }

    public void calisanlariYaz() {
        System.out.println("\nÇalışanlar: ");
        for (Calisan c : this.getCalisanlar()) {
            System.out.println("\nİsim: " + c.getIsim() + "\n" + "Üye Tipi: " + c.getUyeTipi() + "\n" +
                    "Adres: " + c.getAdres() + "\n" + "Okul Adı:" + c.getOkul() + "\n" +
                    "Maaş: " + c.getMaas());
        }
    }
}
