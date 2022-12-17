package Gun36._04_polySoru;

public class OkulMain {
    public static void main(String[] args) {
        Ogrenci ogrenci = new Ogrenci("Omer","Boncuk","ogrenci","5A");
        Calisan calisan = new Calisan("Ismet","Temur","Ogretmen","Bilisim");

        Kisi.KimlikBelgesiYaz(ogrenci);
        Kisi.KimlikBelgesiYaz(calisan);

    }
}
