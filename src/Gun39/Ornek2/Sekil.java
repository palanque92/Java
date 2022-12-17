package Gun39.Ornek2;


import Utility.MyFunc;

public abstract class Sekil {
    private String name ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract double alan () ;
    public abstract double cevre () ;

    public void ciz () {
        System.out.println(this.name+"Isimli sekil cizildi");
    }

    @Override
    public String toString() {
        return "\nSekil adi =" + name+
                "\nAlan="+ MyFunc.yuvarla(alan())+
                "\nCevre="+ MyFunc.yuvarla(cevre());
    }
}
