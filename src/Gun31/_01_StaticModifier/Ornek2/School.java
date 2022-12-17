package Gun31._01_StaticModifier.Ornek2;

public class School {
    // Student (id, name, surName)
    // Yukarıdaki gibi 5 öğrenci tanımlayınız.
    // Her öğrencinin takip eden bir id si olmalı.(otomatik artan)
    // Ve en son kaç öğrenci olduğunu bulabilmeliyim.
    public static void main(String[] args) {
        Student ogr1 = new Student("Omer");
        Student ogr2 = new Student("Osman");
        Student ogr3 = new Student("Ali");

        System.out.println("ogr1 = " + ogr1);
        System.out.println("ogr2 = " + ogr2);
        System.out.println("ogr3 = " + ogr3);

        System.out.println("Ogrenci Sayisi = " + Student.sayac);

    }
}
