package Gun12;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        System.out.print("Dersinizi ve notunuzu aralarında yazınız = ");
        String dersNot = oku.nextLine();
        int ikiNokta = dersNot.indexOf(":");
        int not = Integer.parseInt(dersNot.substring(ikiNokta + 1));
        if (not >= 90) {
            System.out.println("Notunuz A");
        } else if (not>=80) {
            System.out.println("Notunuz B");
        }else if (not>=70){
            System.out.println("Notunuz C");
        } else if (not>=60) {
            System.out.println("Notunuz D");
        } else if (not>=40) {
            System.out.println("Notunuz E");
        } else System.out.println("Notunuz F");

    }
}
