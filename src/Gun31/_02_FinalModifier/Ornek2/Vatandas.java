package Gun31._02_FinalModifier.Ornek2;

public class Vatandas {
    String isim;
    private final int tcNo ;
    static int sayac =1;

    public Vatandas(String isim) {
        this.tcNo = sayac++;
        this.isim = isim;
    }

    @Override
    public String toString() {
        return "Vatandas{" +
                "isim='" + isim + '\'' +
                ", tcNo=" + tcNo +
                '}';
    }
}
