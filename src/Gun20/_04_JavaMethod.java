package Gun20;

import java.util.Scanner;

public class _04_JavaMethod {
    public static void main(String[] args) {
        // kullanıcıdan bir sayı alarak tek mi çift mi yazdırınız.

        tekMiCiftMi();
        tekMiCiftMi();
        Gun20._02_JavaMethod.MerhabaYaz();

    }

    public static void tekMiCiftMi(){

        Scanner oku = new Scanner(System.in);
        System.out.println("Sayi giriniz");
        int sayi = oku.nextInt();
        if (sayi%2==0)
            System.out.println("cift");
        else
            System.out.println("tek");
    }
    public static void tekMiCiftMi(int sayi){

        if (sayi%2==0)
            System.out.println("cift");
        else
            System.out.println("tek");
    }


}
