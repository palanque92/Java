package OOPodev.Soru3;

public class Main {
    public static void main(String[] args) {

        Okul okul = new Okul("100.Yıl Lisesi", 200);

        Ogrenci ogrenci = new Ogrenci("Efe Kaya", "İstanbul/Türkiye", okul, 35000);
        Ogrenci ogrenci2 = new Ogrenci("Ece Üstün", "İstanbul/Türkiye", okul, 35000);
        Calisan calisan = new Calisan("Ahmet Ün", "İstanbul/Türkiye", okul, 5000);
        Calisan calisan2 = new Calisan("Harun Yıldız", "İstanbul/Türkiye", okul, 6000);

        System.out.println(okul.getIsim() + "\n" + "Okul Kapasitesi: " + okul.getMaxOgrenci());
        okul.ogrencilerYaz();
        okul.calisanlariYaz();


    }
}
