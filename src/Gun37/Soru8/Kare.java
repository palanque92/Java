package Gun37.Soru8;

import Gun37.Soru6.Sekil;

public class Kare implements Sekil {
    @Override
    public double cevresi(int kisaKenar, int uzunKenar) {
        return 0;
    }

    @Override
    public double alalni(int kisaKenar, int uzunKenar) {
        return 0;
    }

    @Override
    public double cevresi(int... dizi) {
        return (dizi[0]+dizi[1])*2;
    }

    @Override
    public double alalni(int... dizi) {
        return dizi[0]+dizi[0];
    }
}
