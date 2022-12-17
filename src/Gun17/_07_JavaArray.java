package Gun17;

import java.util.Arrays;

public class _07_JavaArray {
    public static void main(String[] args) {
        // 100 elemanlı bir diziyi random (0-100 arası) doldurduktan sonra,
        // sadece tek elemanlarını bir başka diziye atayınız.
        int[] dizi = new int[100]; //100 elemanlı bir dizi tanımlayınız
        for (int i = 0; i < dizi.length; i++) // 0 - 99
            dizi[i] = (int) (Math.random() * 100); // 0 - 100 random sayi

        System.out.println(Arrays.toString(dizi));
        // sonra
        int[] tekler = new int[100]; // baska yeni bir dizi
        for (int i = 0; i < dizi.length; i++)
        {
            if (dizi[i]%2==1)
                tekler[i]=dizi[i];
        }
        System.out.println("dizi ="+Arrays.toString(dizi));
        System.out.println("tekler ="+Arrays.toString(tekler));

    }
}