package OOPodev.Soru2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner inputInt = new Scanner(System.in);


        System.out.print("isim : ");
        String ad = input.nextLine();
        System.out.print(" ***Daireler*** " +
                "\n0 odalı daire 1400 $ "+
                "\n1 odalı daire 1700 $ " +
                "\n2 odalı daire 2200 $ "+
                "\n3 odalı daire 2700 $ "+
                "\nKaç odalı daire istiyorsunuz :");

        int odaSayisi = inputInt.nextInt();

        boolean balkon;

        System.out.print("Balkon olsun ister miniz? (+200 $) (E/H) = ");
        balkon = input.nextLine().equalsIgnoreCase("E");

        rentApartments newApartment = new rentApartments(ad,odaSayisi,balkon);

        System.out.println(ad.toUpperCase() + " isimli kiracının kira bedeli _  "+
                rentApartments.retCalculator(newApartment)+" $" );





    }
}
