package Gun37.Ornek3;

public class GeometriMain {
    public static void main(String[] args) {
        // bir interface in birden fazla class tarafindan imlrmente edilmesi
        Cember cember = new Cember();
        cember.ciz();

        Dikdortgen dikdortgen = new Dikdortgen();
        dikdortgen.ciz();

        cizdirme(cember);
        cizdirme(dikdortgen);


    }
    public static void cizdirme (ICizdirir cizdirir)
    {
        cizdirir.ciz();
    }
}
