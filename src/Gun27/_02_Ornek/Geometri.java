package Gun27._02_Ornek;

public class Geometri {
    public static void main(String[] args) {

        Dikdortgen sekil = new Dikdortgen();
        sekil.kisaKenar=5;
        sekil.uzunKenar=10;

        int alan = sekil.alan(); // bunu yazmasakda asagidaki gibi yazsakda olur
        int cevre = sekil.cevre(); // bunu yazmasakda asagidaki gibi yazsakda olur

        System.out.println("alan = " + sekil.alan());
        System.out.println("cevre = " + sekil.cevre());

    }
}
