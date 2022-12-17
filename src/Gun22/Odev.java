package Gun22;

import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {
        //1-Ismi **randomNum** olan bir method oluşturun.
        //Parametre olarak **int max** almalı.
        //Bu method, 0 ile max arasında random bir değer döndürmelidir.
        //Random numarayı döndürünüz.
        Scanner oku= new Scanner(System.in);

        System.out.print("Maksimum Sayı Giriniz = ");
        System.out.print("Random Sayı = " + randomNum(oku.nextInt()));

    }


    public static Integer randomNum(int max){
        int sonuc= (int) (Math.random()*max);

        return sonuc;
    }
}
