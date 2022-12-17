package Gun35.Ornek2;

public class Dikdortgen extends Sekil{
    private int kisaKenar ;
    private int uzunKenar ;

    public Dikdortgen(int kisaKenar, int uzunKenar) {
        setKisaKenar(kisaKenar);
        setUzunKenar(uzunKenar);
    }

    public int getKisaKenar() {
        return kisaKenar;
    }

    public void setKisaKenar(int kisaKenar) {
        if (kisaKenar>0)
        this.kisaKenar = kisaKenar;
    }

    public int getUzunKenar() {
        return uzunKenar;
    }

    public void setUzunKenar(int uzunKenar) {
        if (uzunKenar>0)
        this.uzunKenar = uzunKenar;
    }
    public double alan () {
        return uzunKenar + kisaKenar;
    }
    public double cevre () {
        return uzunKenar + kisaKenar * 2;
    }



}
