package Gun45.ExceptionHandling;

import java.util.Scanner;

public class _02_JavaRunTimeException {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {

            Scanner input = new Scanner(System.in);

            try {
                System.out.print("Sayi1=");
                int sayi1 = input.nextInt();

                System.out.print("Sayi2=");
                int sayi2 = input.nextInt();

                System.out.println("bolum = " + sayi1 / sayi2);
            }
            catch (Exception hataBilgileri) // hata mesajlarini hata isimli Exception cinsinden degiskene attim
            {
                System.out.println("hata bilgileri =" +hataBilgileri.getMessage());
                i--;
            }
        }
        System.out.println("program bitti");
    }
}
