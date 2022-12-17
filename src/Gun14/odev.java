package Gun14;

import java.util.Scanner;

public class odev {
    public static void main(String[] args) {
        //1- Girilen bir sayının simetrik sayı (12321, 55555, 45554, 11611,77377)
        //sayı olup olmadığını bulunuz
        Scanner input = new Scanner(System.in);
        System.out.print("bir sayı giriniz: ");
        int sayi = input.nextInt();
        int control = sayi;
        int tersi = 0;
        for (int i = sayi; i > 0; i /= 10) {
            int basamak = i % 10;
            tersi = tersi * 10 + basamak;
        }
        if (control == tersi) {
            System.out.println("sayı simetrik");
        } else {
            System.out.println("sayı simetrik değil");
        }

        //2- Aşağıdaki do-while döngüsüne denk while döngüsü hangisidir?
        /*
           do {
           x = x + y;
           } while (x < z);
           while (x < z) {
           x = x + y;
           x++;
           }
           */
        //3. Aşağıdaki for döngüsüne denk while döngüsü hangisidir? (başlangıçta toplam=0 varsayın)
        int toplam = 0;
        int i = 0;
        while (i <= 100) {
            toplam += i;
            i++;
        }

        //4- Aşağıdaki çıktıyı veren programı yazınız
        // *****
        // ****
        // ***
        // **
        // *

        for (int i1 = 5; i1 >= 0; i1--) {
            for (int j = i1; j < 5; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i1; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        //5- Aşağıdaki çıktıyı veren programı yazınız
        // **********
        // ********
        // ******
        // ****
        // **

        for (int i2 = 5; i2 > 0; i2--) {
            for (int j = i2; j < 10; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i2; k++) {
                System.out.print("*" + "*");
            }
            System.out.println(" ");
            }




        }
}
