package Gun41._02_Ornek;


import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        List<Hamburger> orders = new ArrayList<>();
        Scanner read = new Scanner(System.in);



        int secim = 0;
        do {
            menu();
            secim = read.nextInt();

            switch (secim) {
                case 1:
                    TekxasBurger tb = new TekxasBurger();
                    orders.add(tb);
                    break;
                case 2:
                    FakirBurger fk = new FakirBurger();
                    orders.add(fk);
                    break;
            }
        }while (secim < 3);

        System.out.println("Alinan siparisler");
        for ( Hamburger h : orders ) {
            System.out.println(h.getClass().getSimpleName());
        }
        System.out.println("siparisler hazirlaniyor");
        int totalPrice =0;
        for ( Hamburger h : orders ) {
            totalPrice+=h.price();
        }
        System.out.println("totalPrice = " + totalPrice + "$");




    }
    static void menu () {

        System.out.print("\n****Menü*****" +
                "\n1-Texas Burger (100 $)" +
                "\n2-Fakir Burger (40 $)" +
                "\n3-Tamam" +
                "\nSeciminiz=");

    }


}