package Gun13;

import java.util.Scanner;

public class deneme02 {
    public static void main(String[] args) {
        //Girilen 5 sayının pozitifini ayrı negatifini ayrı toplayın

        Scanner oku = new Scanner(System.in);
        int pToplam=0;
        int nToplam = 0;
        int i=0;

        while (i<5){
            System.out.print((i+1)+". Sayıyı Giriniz = ");
            int sayi= oku.nextInt();
            if (sayi>=0){
                pToplam+=sayi;
            }
            else nToplam+=sayi;
            i++;
        }

        System.out.println("Pozitif Sayılar Toplamı = " + pToplam);
        System.out.println("Negatif Sayılar Toplamı = " + nToplam);
    }
}
