package Gun39.Ornek2;

public class Dikdortgen extends Sekil {
    private int kisaKenar ;
    private int uzunKenar ;

    public Dikdortgen(int kisaKenar, int uzunKenar) {
        setKisaKenar(kisaKenar);
        setUzunKenar(uzunKenar);
    }

    @Override
    public double alan() {
        return kisaKenar*uzunKenar;
    }

    @Override
    public double cevre() {
        return kisaKenar*uzunKenar*2;
    }

    public int getKisaKenar() {
        return kisaKenar;
    }

    public void setKisaKenar(int kisaKenar) {
        this.kisaKenar = kisaKenar;
    }

    public int getUzunKenar() {
        return uzunKenar;
    }

    public void setUzunKenar(int uzunKenar) {
        this.uzunKenar = uzunKenar;
    }

}
