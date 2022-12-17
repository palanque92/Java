package Gun39.Ornek2;

public class Geometri {
    public static void main(String[] args) {
        Dikdortgen dikdortgen = new Dikdortgen(2,4);
        dikdortgen.setName("Dikdirtgen Sekli");
        System.out.println(dikdortgen);


        Daire daire = new Daire(2);
        daire.setName("Daire Sekli");
        System.out.println(daire);

        Daire daire1 = new Daire(4);
        daire1.setName("Daire1 Sekli");
        System.out.println(daire1);


    }
}
