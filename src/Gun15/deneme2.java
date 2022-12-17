package Gun15;


import java.util.Scanner;

public class deneme2 {
    public static void main(String[] args) {
        // En giriniz:
        // Boy giriniz:
        // En x Boy şeklinde ekrana bir dikdörtgen çizdireceksin.
        // Örnek veriyorum 5x4 girdim. Bunu da tekrara kadar yapmaya çalışalım.
        // İçi boş bir dörtgen olacak. Simetrik olması önemli değil.
        // Önemli olan ilk ve son satır dışında iç bölümlerin kenarlardan sonra boş kalması.

        Scanner oku = new Scanner(System.in);
        System.out.print("En Giriniz = ");
        int en = oku.nextInt();
        System.out.print("Boy Giriniz = ");
        int boy = oku.nextInt();

        /*
         **********
         *        *
         *        *
         *        *
         **********

         * */


        for (int i = 0; i < en; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < boy - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < en - 2; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        for (int i = 0; i < en; i++) {
            System.out.print("*");

        }
    }
}