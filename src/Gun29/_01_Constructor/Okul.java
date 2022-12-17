package Gun29._01_Constructor;

public class Okul {
    public static void main(String[] args) {
        Student ogr1 = new Student(); // nesnesin olusturulmas ani
                                      // () bu bir metod isareti
        // 1.yontem
        ogr1.id=1;
        ogr1.name="Omer";
        ogr1.surname="Boncuk";
        ogr1.classroom=12;
        System.out.println("ogr1.name = " + ogr1.name);


        // 2.Yontem
        Student ogr2 = new Student(1,"Mehmet","Temur",11);
        System.out.println("ogr2.name = " + ogr2.name);


        Student ogr3 = new Student(3,"Mko","Boncuk");
        System.out.println("ogr3.name = " + ogr3.name);


    }
}
