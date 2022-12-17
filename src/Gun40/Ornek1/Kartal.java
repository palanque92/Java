package Gun40.Ornek1;

public class Kartal extends Hayvan{

    public Kartal(String isim, boolean vahsi, String dogumTarihi) {
        super(isim, vahsi, dogumTarihi);
    }

    @Override
    void yiyecegi() {
        System.out.println("Et tuketir");
    }

    @Override
    void yemekMiktari() {
        System.out.println("1 kg");
    }

    @Override
    void gunlukUykuSuresi() {
        System.out.println("8");
    }

    @Override
    void sesi() {
        System.out.println("ciyak");
    }
}
