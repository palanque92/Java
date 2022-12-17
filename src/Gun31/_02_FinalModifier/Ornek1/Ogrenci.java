package Gun31._02_FinalModifier.Ornek1;

public class Ogrenci {
    private final int okulNo ;
    String tamAd ;
    private static int sayac=1;

    public Ogrenci(String tamAd) {
        this.okulNo=sayac++;
        this.tamAd = tamAd;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "okulNo=" + okulNo +
                ", tamAd='" + tamAd + '\'' +
                '}';
    }
}
