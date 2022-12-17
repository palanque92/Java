package Gun45.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _04_JavaTryCatch {
    public static void main(String[] args) {
        System.out.println("program basladi");

        for (int i = 0; i < 3; i++) {

            Scanner input = new Scanner(System.in);

            try {
                System.out.print("Sayi1=");
                int sayi1 = input.nextInt();

                System.out.print("Sayi2=");
                int sayi2 = input.nextInt();

                System.out.println("bolum = " + sayi1 / sayi2);
                // kelime,charAt(5); // genel hataya dusmesi icin kontrol
            }
            catch (InputMismatchException ex) // bu tipten hata olursa
            {
                System.out.println("Lutfen sayi giriniz ");
                i--;
            }

            catch (ArithmeticException ex) // bu tipten hata olursa
            {
                System.out.println("Sifira bolme hatasi ");
                i--;
            }

            catch (Exception ex) // Genel hata olursa , yukardakilerin disinda
            {
                System.out.println("Lutfen tekrar deneyiniz ");
                i--;
            }

        }
        System.out.println("program bitti");
    }
}
