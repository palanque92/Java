package Gun22;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class _02_ArrayList {
    public static void main(String[] args) {
        // Bir öğretmenden girmek istediği kadar notu alınız, ve
        // ortalamayı geçen öğrenci sayısını bulunuz.
        // Öğretmene devam etmek istiyormusunuz (E/H) şeklinde sorunuz

        ArrayList<Integer> notlar = new ArrayList<>();
        Scanner intOku = new Scanner(System.in);
        Scanner strOku = new Scanner(System.in);

        String devamMi ="";
        int toplam =0;
        do{
            System.out.print("Not =");
            int not = intOku.nextInt();
            notlar.add(not);
            toplam=toplam+not;

            System.out.print("Devam etmek istiyormusunuz (E/H)");
            devamMi = strOku.nextLine();
        } while (devamMi.equalsIgnoreCase("E")); // Kontrol sonda oldugundan , kac kere donecegi belli degil.

        System.out.println("notlar = " + notlar);

        int ort = toplam / notlar.size();
        int gecenSayisi=0;

        for (int i=0;i<notlar.size();i++)
            if (notlar.get(i)>ort)
                gecenSayisi++;

        System.out.println("gecenSayisi = " + gecenSayisi);



    }
}
