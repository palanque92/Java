package Gun31._01_StaticModifier.Ornek2;

public class Student {
    int id = 0 ;
    String fullName ;

    static int sayac=1;


    public Student(String fullName) {
        this.id = sayac++;
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}
