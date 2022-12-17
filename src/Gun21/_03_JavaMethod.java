package Gun21;

import java.util.Scanner;

public class _03_JavaMethod {
    // Kullanıcının gireceği 2 sayıdan büyük olanını bulma işlemini bir metodda
    // yaptıktan sonra main de yazdırınız.
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
        int donecek = sayi1 > sayi2 ? sayi1:sayi2;
        return donecek;
    }

}
