package Gun18;

import java.util.Arrays;
import java.util.Scanner;

public class _04_JavaArrays {
    public static void main(String[] args) {
        // 10 elemanlı bir diziyi, 10 a kadar olan sayılarla random duldurunuz,
        // sonrasında kullancıdan alacağınız bir sayının dizide olup olmadığını
        // var veya yok diyerek yazdırınız.
        // TODO :hem negatif hem pozitif 10 sayi ureten bir algoritma yaziniz

        int[] dizi=new int[10];
        for(int i=0;i< dizi.length ;i++)
            dizi[i]= (int)(Math.random()*10);

        System.out.println(Arrays.toString(dizi));

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayi giriniz=");
        int aranaSayi=oku.nextInt();

        for(int i=0;i< dizi.length ;i++)
        {
            if (dizi[i] ==  aranaSayi)
                System.out.println("var");
            else
                System.out.println("YOK");
        }

        // 2 tane oldugunda da sadece 1 kere VAR yazsın
        // bulamazsa YOK yazsın
        // bulduktan sonra DEVAM ETMESIN
        // var sa 1 kez yoksa 1 kez yazdiriyoruz demi hocam? evet

    }
}
