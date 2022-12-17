package Gun26;

public class _01_JavaClassAndObject {
    // metodlarin yazildigi yer
    public static void main(String[] args) {
        // programin basladigi yer

        Araba Tesla = new Araba();
        Tesla.renk="kirmizi";
        Tesla.modelYili=2022;
        Tesla.motorHacmi=6000;
        Tesla.plaka="Omer92";

        System.out.println("Tesla.renk = " + Tesla.renk);
        System.out.println("Tesla.plaka = " + Tesla.plaka);
        System.out.println("Tesla.motorHacmi = " + Tesla.motorHacmi);
        System.out.println("Tesla.modelYili = " + Tesla.modelYili);


    }
    // metodlarin yazildigi yer
}

class Araba { // bu bizim bize ozgu tipimiz.
    int modelYili;
    String renk;
    double motorHacmi;
    String plaka;
}
