package Gun29._01_Constructor;

public class Student {
    int id;
    String name;
    String surname;
    int classroom;

    Student(){ // Constructor -> yapici metodlar
        // nesne olustururken yapmak istediklerin icin burayi kullan
        System.out.println("Nesne olusturuldu");
    }
    Student(int id,String name,String surname,int classroom) {
        this.id=id; // this id :-> classin id si id : local degisken parametre
        this.name=name;
        this.surname=surname;
        this.classroom=classroom;

    }
    Student(int id,String name,String surname) {
        this(id,name,surname,0);
//        this.id=id; // this id :-> classin id si id : local degisken parametre
//        this.name=name;
//        this.surname=surname;
//        this.classroom=0;

    }

    Student(int id,String name) {
        this(id,name,"",0);
    }

}
