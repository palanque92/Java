package Gun31._02_FinalModifier.Ornek2;

public class VatandaslikProgrami {
    // Vatandas isimli bir Class tanımlayınız (fields: isim, tcNo)
    // tcNo değerini int olarak alınız ve nesne oluşturulurken
    // sıralı olarak atayınız.Daha sonradan değeri değiştirilemesin.
    // kontrol için mainde 2 kişi tanımlayınız.
    // tc nonu değiştirilemediğini kontrol ediniz.
    public static void main(String[] args) {
        Vatandas vatandas1 = new Vatandas("Omer Boncuk");
        Vatandas vatandas2 = new Vatandas("Olga Boncuk");

        System.out.println("vatandas bilgisi = " + vatandas1);
        System.out.println("vatandas bilgisi = " + vatandas2);

    }
}
