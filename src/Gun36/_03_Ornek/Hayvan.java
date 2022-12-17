package Gun36._03_Ornek;

public class Hayvan {
    private String name ;

    public Hayvan(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void ses ()
    {
        System.out.println("Hayvan ses cikardi");
    }
}
