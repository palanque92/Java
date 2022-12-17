package Gun31._02_FinalModifier.Ornek1;

public class Okul {
    public static void main(String[] args) {
        Ogrenci ogrenci1 = new Ogrenci("Omer Boncuk");
        Ogrenci ogrenci2 = new Ogrenci("Enes Boncuk");
        Ogrenci ogrenci3 = new Ogrenci("Miko Boncuk");

        System.out.println("ogrenci1 = " + ogrenci1);
        System.out.println("ogrenci2 = " + ogrenci2);
        System.out.println("ogrenci3 = " + ogrenci3);


        //ogr1.okulNo=2; // yapabiliyorum : int okulNo böyleyken

        //private : erişimi engeller ama class dan erişebilirim.
        //final : değerin BIRKEZ atandıktan sonra değiştirilmesini engeller.
        //final değişkenlere değer ne zaman atılabilir ?
        // ilk tanımlandığı zaman veya CONSTRUCTOR da.
    }
}
