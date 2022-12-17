package Gun33.Ornek3;

public class Ogrenci {
    private String fullName ;
    private int yas ;
    private int id ;

    private static int sayacId =0;

    public Ogrenci(String fullName, int yas) {
        this.id = ++sayacId;
        setFullName(fullName);
        setYas(yas);

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "fullName='" + fullName + '\'' +
                ", yas=" + yas +
                ", id=" + id +
                '}';
    }
}
