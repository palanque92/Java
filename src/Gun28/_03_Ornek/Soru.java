package Gun28._03_Ornek;
// Bir Üniversitede öğrencilere ders kaydı yapılacaktır.
// 1- Lesson : fields : name, credit (1-10 arasında değer alıyor).
// 2- Student: fields : name, maxSaat, dersleri listesini tutacak bir liste.
// 3- 3 adet ders oluşturunuz.
// 4- 1 adet öğrenci tanımlayınız alabileceği maxCredit si 10 olsun.
// 5- Bu öğrencinin ders listesine açılmış dersleri ekleyiniz.
//    ders eklerken max alabileceği Saati geçmemeli, geçerse
//    uyarı versi, alabileceğiniz max credi doldu şeklinde.
// 6- Unıversıte kurallarını yazdıran 2 maddelik bir not yazdıran metod ekleyinız.


import java.util.ArrayList;

public class Soru {
    public static void main(String[] args) {
        Students.universiteKurallari();

        Lessons ders1 = new Lessons();
        ders1.name="Tarih101";
        ders1.saat=4;

        Lessons ders2 = new Lessons();
        ders2.name="Java101";
        ders2.saat=3;

        Lessons ders3 = new Lessons();
        ders3.name="Algi101";
        ders3.saat=6;

        Students ogr1 = new Students();
        ogr1.name = "Ayser";
        ogr1.maxSaat = 10;

        ogr1.dersEkle(ders1);
        ogr1.dersEkle(ders2);
        ogr1.dersEkle(ders3);
        ogr1.dersleriYazdir();
    }
}
