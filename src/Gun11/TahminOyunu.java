package Gun11;

import java.util.Scanner;

public class TahminOyunu {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.println("Minimum  tutacagi sayi =");
        int minSayi = oku.nextInt();
        System.out.println("Max tutacagi sayi =");
        int maxSayi = oku.nextInt();

        int randomSayi = (int)(Math.random()*(maxSayi-minSayi))+minSayi;

        System.out.print(minSayi + " ile " + maxSayi + " Arasında Bir Sayı Tahmin Ediniz = ");
        int tahmin = oku.nextInt();

        if (tahmin==randomSayi){
            System.out.println("Tebrikler Bildiniz");
        }
        else System.out.println("Bilemediniz. Tuttuğum Sayı = " + randomSayi);

        System.out.println(tahmin == randomSayi ? "Tebrikler bildiniz" : "Bilemediniz." + "Tuttugum sayi" + randomSayi);

    }
}
