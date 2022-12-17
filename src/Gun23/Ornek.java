package Gun23;

import java.util.Scanner;

public class Ornek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("******* Main Manu ********"+
                           "\n1- Enter Grade" +
                           "\n2- View Grade" +
                           "\n3- View Avarage" +
                           "\n4- View min Grade" +
                           "\n5- View max Grade" +
                           "\n6- Exit" +
                           "\n*****************" +
                           "\nMake your Choise");
        int choise;
        do {
            choise = input.nextInt();
            switch (choise){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                default:
                    System.out.println("Yanlis secim tekrar dene");
            }
        }
        while (choise!=6);
    }
}
