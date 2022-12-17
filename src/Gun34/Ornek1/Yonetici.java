package Gun34.Ornek1;

public class Yonetici extends Personel {

    public void zamYap () {
        System.out.println("zam yapildi");
    }
    private double YoneticiTazminati ;

    public double getYoneticiTazminati() {
        return YoneticiTazminati;
    }

    public void setYoneticiTazminati(double yoneticiTazminati) {
        YoneticiTazminati = yoneticiTazminati;
    }
}
