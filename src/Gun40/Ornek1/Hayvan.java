package Gun40.Ornek1;

public abstract class Hayvan {
    private final int id ;
    private String isim ;
    private boolean vahsi ;
    private String dogumTarihi  ;

    private static  int idSayac = 0 ;

    abstract void yiyecegi () ;
    abstract void yemekMiktari () ;
    abstract void gunlukUykuSuresi () ;
    abstract void sesi () ;




    public Hayvan(String isim, boolean vahsi, String dogumTarihi) {
        setIsim(isim);
        setVahsi(vahsi);
        setDogumTarihi(dogumTarihi);
        this.id=++idSayac;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public boolean isVahsi() {
        return vahsi;
    }

    public void setVahsi(boolean vahsi) {
        this.vahsi = vahsi;
    }

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    public int getIdSayac() {
        return idSayac;
    }


    @Override
    public String toString() {
        System.out.println(" *********************** ");
        System.out.println("id="+ id);
        System.out.println("isim="+ isim);
        System.out.println("vahsi="+ vahsi);
        System.out.println("Dogum tarihi="+ dogumTarihi);

        yemekMiktari();
        gunlukUykuSuresi();
        yiyecegi();
        sesi();

        return "Hayvan turetildi ";
    }
}
