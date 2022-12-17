package OOPodev.Soru1;

import java.util.Scanner;

public class soruMain {
    public static void main (String[] args) {
        Scanner okuInt = new Scanner(System.in);
        Scanner okuStr = new Scanner(System.in);

        System.out.print("isim : ");
        String ad = okuStr.nextLine();
        System.out.print("Üye olmak istiyor musunuz( E/H ) : ");
        if (okuStr.next().equalsIgnoreCase("E")) {
            System.out.print("Üyelik tipleri " +
                    "\n1 - Gold ($40 per month) " +
                    "\n2 - Silver ($20 per month)" +
                    "\n3 - Bronze ($10 per month)" +
                    "\nÜyelik tipi giriniz = ");


            switch (okuInt.nextInt()) {
                case 1:
                    Subscribe uye1 = new Subscribe(ad, true, membersShip.GOLD);
                    System.out.println("Welcome to membership " + ad.toUpperCase() +
                            " Your membership is 40 dollar for month you can enjoy the videos" +
                            ", all homework and see you soon.");
                    break;
                case 2:
                    Subscribe uye2 = new Subscribe(ad, true, membersShip.SILVER);
                    System.out.println("Welcome to membership " + ad.toUpperCase() +
                            " Your membership is 20 dollar for month you can enjoy the videos" +
                            "and all homework.");
                    break;
                case 3:
                    Subscribe uye3 = new Subscribe(ad, true, membersShip.BRONZE);
                    System.out.println("Welcome to membership " + ad.toUpperCase() +
                            " Your membership is 10 dollar for month you can" +
                            "enjoy the videos.");
                    break;
            }

        } else System.out.println("See you when you want to be a member. Thanks ");

    }
}
