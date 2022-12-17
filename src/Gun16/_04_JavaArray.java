package Gun16;

import java.util.Scanner;

public class _04_JavaArray {
    public static void main(String[] args) {
        // 5 kisilik bir sinifin notlarini giriniz ve ortalamadan buyuk
        // kac not oldugunu yazdiriniz


        Scanner oku = new Scanner(System.in);
        int [] notlar = new int[5];

        int toplam = 0;

        for (int i=0; i<notlar.length;i++){
            System.out.println("Not =");
            notlar[i]=oku.nextInt();
            toplam=toplam+notlar[i];
        }
        int ort = toplam/notlar.length;

        int gecenSayisi=0;

        for (int i=0;i<notlar.length;i++)
        {
            if (notlar[i] >= ort){
                System.out.println(notlar[i]);
                gecenSayisi++;
            }
        }

        System.out.println("ort = " + ort);
        System.out.println("gecenSayisi = " + gecenSayisi);

        }
    }

