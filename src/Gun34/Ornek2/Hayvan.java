package Gun34.Ornek2;

public class Hayvan {
   private String renk ;
   private int kilo ;
   private String cins ;

   public void konustu (){
       System.out.println("Hayvan ses cikardi");
   }

    public Hayvan(String renk, int kilo, String cins) {
        setRenk(renk);
        setKilo(kilo);
        setCins(cins);
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    public String getCins() {
        return cins;
    }

    public void setCins(String cins) {
        this.cins = cins;
    }

    @Override
    public String toString() {
        return "Hayvan{" +
                "renk='" + renk + '\'' +
                ", kilo=" + kilo +
                ", cins='" + cins + '\'' +
                '}';
    }
}
