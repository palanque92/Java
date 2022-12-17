package Gun17;

import java.util.Scanner;

public class _06_JavaSplitMetodu {
    public static void main(String[] args) {
        Scanner oku =new Scanner(System.in);
        System.out.println("tarih giriniz =");
        String tarih = oku.nextLine();

        String[] zamanlar = tarih.split("/");

        for (int i=0;i<zamanlar.length;i++)
            System.out.println("zamanlar = " + zamanlar[i]);

        System.out.println("Gun = " + zamanlar[0]);
        System.out.println("Ay = " + zamanlar[1]);
        System.out.println("Yil = " + zamanlar[2]);

    }
}
