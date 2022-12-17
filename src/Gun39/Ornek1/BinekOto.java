package Gun39.Ornek1;

public abstract class BinekOto {
    private String Marka ;
    private int UretimYili ;
    private int vitesAdeti ;


    public BinekOto(String marka, int uretimYili, int vitesAdeti) {
        setMarka(marka);
        setUretimYili(uretimYili);
        setVitesAdeti(vitesAdeti);
    }

    abstract String HizlammaSuresi ();


    public String getMarka() {
        return Marka;
    }

    public void setMarka(String marka) {
        Marka = marka;
    }

    public int getUretimYili() {
        return UretimYili;
    }

    public void setUretimYili(int uretimYili) {
        UretimYili = uretimYili;
    }

    public int getVitesAdeti() {
        return vitesAdeti;
    }

    public void setVitesAdeti(int vitesAdeti) {
        this.vitesAdeti = vitesAdeti;
    }

    @Override
    public String toString() {
        return "BinekOto{" +
                "Marka='" + Marka + '\'' +
                ", UretimYili=" + UretimYili +
                ", vitesAdeti=" + vitesAdeti +
                '}';
    }
}
