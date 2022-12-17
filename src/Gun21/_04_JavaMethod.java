package Gun21;

import javax.swing.*;
import java.util.Scanner;

public class _04_JavaMethod {
    // kullanicinin girecegi bir sayiya kadar olan sayilarin carpimini (faktoriyel)
    // bir fonksiyonel buldurup bunun sonucunun mainde tekmi ciftmi oldugunu yazdiriniz
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //int faktoriyel = 1;


        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();


        //for(int i = 1; i <= sayi; i++)
        //{
        //    faktoriyel = faktoriyel * i;
        //    System.out.println(i + "!= " + faktoriyel);
        //}
        int carpim = faktoriyelBul(sayi);

        System.out.println("carpim = " + carpim);

        if (carpim%2==0)
        {
            System.out.println("cift");
        }else {
            System.out.println("tek");
        }



    }

    public static int faktoriyelBul(int sayi)
    {
        int carpim =1;
        for (int i =1;i<=sayi;i++)
            carpim = carpim *i;

        return carpim;
    }

}
