package Gun22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _03_ArrayList {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        // sadece tek sayı olan elemanlarını ayrı diziye atayarak
        // yazdırınız.
        Scanner oku = new Scanner(System.in);
        int [] dizi = new int[6];
        for (int i = 0;i<dizi.length;i++)
        {
            System.out.println("Sayi =");
            dizi[i]=oku.nextInt();
        }
        System.out.println(Arrays.toString(dizi));

        // 1.Yontem
        ArrayList<Integer>tekler=new ArrayList<>();
        for (int i = 0;i<dizi.length;i++){
            if (dizi[i]%2==1)
                tekler.add(dizi[i]);
        }
        // 2.Yontem
        tekler = tekElemanolarAta(dizi);
        System.out.println("tekler = " + tekler);

    }
    public static ArrayList<Integer>tekElemanolarAta(int [] dizi)
    {
        ArrayList<Integer>tekler=new ArrayList<>();
        for (int i = 0; i < dizi.length;i++) {
            if (dizi[i]%2==1)
                tekler.add(dizi[i]);
        }
        return tekler;
    }

}
