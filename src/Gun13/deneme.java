package Gun13;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        //1- Girilen bir ay numarasına göre , mevsimi yazdırınız
        System.out.print("Ayın Nosunu Girin Size Hangi Mevside Olduğunuz Söyleyelim? = ");
        int ay = oku.nextInt();
        switch (ay){
            case 9:
            case 10:
            case 11:
                System.out.println("Sonbahar Mevsimindesiniz");break;
            case 12:
            case 1:
            case 2:
                System.out.println("Kış Mevisimindesiniz");break;
            case 3:
            case 4:
            case 5:
                System.out.println("İlkbahar Mevsimindesiniz");break;
            case 6:
            case 7:
            case 8:
                System.out.println("Yaz Mevsimindesiniz");break;
            default:
                System.out.println("Hayırdır Sennabıyon?");break;
        }
    }
}
