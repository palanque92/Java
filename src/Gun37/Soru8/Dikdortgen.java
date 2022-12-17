package Gun37.Soru8;

public class Dikdortgen implements Sekil {


    @Override
    public double cevresi(int... dizi) {
        return (dizi[0]+dizi[1])*2;
    }

    @Override
    public double alalni(int... dizi) {
        return dizi[0]+dizi[1];
    }
}
