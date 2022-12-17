package Gun23;

import java.util.ArrayList;

public class _03_Java2DArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> matnotlari = new ArrayList<>(); // tek bir dersin notlari // 1 yaprak
        ArrayList<Integer> fiznotlari = new ArrayList<>(); // fiz dersin notlari     // 1 yaprak
        ArrayList<Integer> kimnotlari = new ArrayList<>(); // kim dersinin notlari   // 1 yaprak

        matnotlari.add(50);
        matnotlari.add(70);
        matnotlari.add(80);

        fiznotlari.add(30);
        fiznotlari.add(40);

        kimnotlari.add(60);
        kimnotlari.add(70);
        kimnotlari.add(80);
        kimnotlari.add(90);

        // ArrayList in ArrayListi nasil yaparim
        ArrayList<ArrayList<Integer>> notlarListesi = new ArrayList<>();
        notlarListesi.add(matnotlari);
        notlarListesi.add(fiznotlari);
        notlarListesi.add(kimnotlari);
        // notlari ekrana ders adlarini bir ArraListten olarak her dersin adini ve notlarini
        // her bir satira yazdirniz
        // Matematik : 40 50 60
        // Fizik : 30 40
        // Kimya ; 70 80 90 100
        ArrayList<String>dersAdlari=new ArrayList<>();
        dersAdlari.add("Matematik");
        dersAdlari.add("Fizik");
        dersAdlari.add("Kimya");

        for (int i = 0;i<notlarListesi.size();i++){
            System.out.println(dersAdlari.get(i)+" : ");
            for ( int j = 0;j<notlarListesi.get(i).size();j++){
                System.out.println(notlarListesi.get(i).get(j)+"\t");
            }
            System.out.println();
        }

    }
}
