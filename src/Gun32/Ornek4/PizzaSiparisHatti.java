package Gun32.Ornek4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PizzaSiparisHatti {
    // Bir pizza sipariş hattı yapılmak isteniyor.
    // Kullanıcıya Pizza için 1-Small,2-Medium,3-Large, 4-Goster
    // seçeneklerini bir menü şeklinde vererek, verdiği pizzaları
    // bir ARRAYLIST e atınız.
    // Goster (4) ü seçtiğinde her pizzadan kaçar tane sipariş
    // verdiğini bir metodda yazdırınız.
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        ArrayList<Pizza>siparis=new ArrayList<>();

        int secim ;

        do {
            menu();
            secim=oku.nextInt();
            switch (secim)
            {
                case 1: Pizza sp = new Pizza(PizzaSize.small);
                siparis.add(sp); break;
                case 2: Pizza mp = new Pizza(PizzaSize.medium);
                    siparis.add(mp); break;
                case 3: Pizza lp = new Pizza(PizzaSize.large);
                    siparis.add(lp); break;
                case 4:
                    siparisYaz(siparis);
                    break;

            }

        }while (secim <= 4);

    }
    public static void menu ()
    {
        System.out.println("***** PIZZA MENU *****");
        System.out.println("1- Small");
        System.out.println("2- Medium");
        System.out.println("3- Large");
        System.out.println("4- Sepet Goster");
        System.out.println("5- Cikis");
        System.out.println("Seciminiz =");
    }
    public static void siparisYaz (ArrayList<Pizza> siparis) {
        int s=0; int m=0; int l=0;
        for(Pizza p : siparis)
        {
            if (p.size == PizzaSize.small) s++;
            if (p.size == PizzaSize.medium) m++;
            if (p.size == PizzaSize.large) l++;
        }
        System.out.println("**** Siparisleriniz ****");
        System.out.println("small pizza count = " + s);
        System.out.println("medium pizza count = " + m);
        System.out.println("large pizza count = " + l);
    }
}
