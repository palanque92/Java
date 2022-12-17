package Gun37.Soru6;

public class Dikdortgen implements Sekil{


    @Override
    public double cevresi(int kisaKenar, int uzunKenar) {
        return (kisaKenar*uzunKenar)*2;
    }

    @Override
    public double alalni(int kisaKenar, int uzunKenar) {
        return (kisaKenar*uzunKenar);
    }

    @Override
    public double cevresi(int... dizi) {
        return 0;
    }

    @Override
    public double alalni(int... dizi) {
        return 0;
    }
}
