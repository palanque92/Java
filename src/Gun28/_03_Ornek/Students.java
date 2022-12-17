package Gun28._03_Ornek;


import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class Students {
    String name;
    int maxSaat =0;
    static ArrayList<Lessons> dersler = new ArrayList<>();

    void dersEkle (Lessons yeniDers){
    int aldigiToplamSaat = 0;
    for (Lessons d: dersler)
        aldigiToplamSaat=aldigiToplamSaat+d.saat;
    if (aldigiToplamSaat+yeniDers.saat>maxSaat)
        System.out.println("Max Ders saati asildi Ders eklenmedi");
    else
        dersler.add(yeniDers);

    }
    void dersleriYazdir()
    {
        System.out.println("\n*** Transkript ***");
        System.out.println("Sayin " +name);
        System.out.println("Aldiginiz dersler asagidadir");
        for (Lessons d: dersler)
            System.out.println( d.name+ " " + d.saat);
    }
    static void  universiteKurallari()
    {
        System.out.println("Kural1 : Kahvalti yapmadan derse gelme");
    }

}