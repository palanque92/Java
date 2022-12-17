package Gun21;

import java.util.Scanner;

public class _08_JavaMethod {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        System.out.println("1.Sayi =");
        int sayi1 = oku.nextInt();

        System.out.println("2.Sayi =");
        int sayi2 = oku.nextInt();

        int enb=enbBul(sayi1,sayi2);
        System.out.println("enb = " + enb);



    }
    public static int enbBul (int sayi1 , int sayi2)
    {
        if (sayi1>sayi2)
            return sayi1;
        else
            return sayi2;
    }
}
