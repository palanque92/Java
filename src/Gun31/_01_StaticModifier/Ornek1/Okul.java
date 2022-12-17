package Gun31._01_StaticModifier.Ornek1;

public class Okul {
    public static void main(String[] args) {
        Ogrenci ogr = new Ogrenci("Omer","Boncuk");
        Ogrenci ogr2 = new Ogrenci("Osman","Boncuk");
        Ogrenci ogr3 = new Ogrenci("Ali","Boncuk");

        // ...
        // ...

        Ogrenci ogr4 = new Ogrenci("Ersan","Kuneri");
        Ogrenci ogr5 = new Ogrenci("Darbeli","Matkap");

        System.out.println("Ogrenci bilgisi = " + ogr);
        System.out.println("Ogrenci bilgisi = " + ogr2);
        System.out.println("Ogrenci bilgisi = " + ogr3);
        System.out.println("Ogrenci bilgisi = " + ogr4);
        System.out.println("Ogrenci bilgisi = " + ogr5);


    }
}
