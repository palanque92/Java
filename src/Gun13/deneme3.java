package Gun13;


import java.util.Scanner;

public class deneme3 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        int[] dizi = new int[3];
        for (int i = 0; i < dizi.length; i++) {
            System.out.println((i + 1) + "sayi girniz =");
            dizi[i] = oku.nextInt();
        }
        enKucukYaz(dizi);
        enBuyukYaz(dizi);
        ortalamaBulYaz(dizi);
    }

    public static void enBuyukYaz(int[] metodDizi) {
        int enBuyuk = 0;
        for (int i = 0; i < metodDizi.length; i++) {
            if (metodDizi[i] > enBuyuk)
                enBuyuk = metodDizi[i];
        }
        System.out.println("en Buyuk sayisi = " + enBuyuk);
    }

    public static void enKucukYaz(int[] metodDizi) {
        int enKucuk = metodDizi[0];
        for (int i = 0; i < metodDizi.length; i++) {
            if (metodDizi[i] < enKucuk)
                enKucuk = metodDizi[i];
        }
        System.out.println("en kucuk sayisi = " + enKucuk);
    }
    public static void ortalamaBulYaz(int[] metodDizi){
        int toplam=0;
        for (int i = 0; i < metodDizi.length; i++) {
            toplam+=metodDizi[i];
        }
        System.out.println("toplam = " + toplam);
    }
}