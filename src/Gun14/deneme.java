package Gun14;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        // Girilen bir sayıya (dahil) kadar olan sayıların çarpımını bulunuz.
        // çarpimin değeri 100'ü geçtiğinde dur
        Scanner oku = new Scanner(System.in);
        System.out.print("Sayı Giriniz = ");
        int sayi = oku.nextInt();
        int carpim = 1;
        int i;

        for (i = 1; i <= sayi; i++) {
            if (carpim > 100) {
                break;
            }
            carpim *= i;
        }
        if (carpim > 100) {
            System.out.println("Çarpım 100'ü Geçtiği İçin İşlem Durduruldu.");
            carpim /= i-1;
        }

        System.out.println("Sonuç = " + carpim);
    }
}
