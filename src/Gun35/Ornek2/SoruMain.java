package Gun35.Ornek2;

public class SoruMain {
    // 1-aşağıdaki hiyerarşiye göre sınıfları olusturunuz
    //Sekil -> alan, cevre, toString
    //  Daire
    //  Dikdortgen
    //      Kare

    // 2- Türetilen sınıflardan uygun olanlarına yarıcap, uzunluk ve genislik ekleyiniz.
    // 3- Her bir sınıfa consructor ekleyiniz.
    // 4- Her metodun toStringini override yapınız.
    // 5- Her sınıfa alan ve çevre hesaplaması metodlarını ekleyiniz.
    // 6- Main de bunlardan nesne oluşturup sonuçları yazdırınız.
    public static void main(String[] args) {
        Daire daire = new Daire(5);
        System.out.println("daire = " + daire.alan());
        System.out.println("daire = " + daire.cevre());

        Dikdortgen dikdortgen = new Dikdortgen(5,5);
        System.out.println("dikdortgen.alan() = " + dikdortgen.alan());
        System.out.println("dikdortgen cevre = " + dikdortgen.cevre());
        
        Kare kare = new Kare(6);
        System.out.println("kare.alan() = " + kare.alan());
        System.out.println("kare.cevre() = " + kare.cevre());

    }
}
