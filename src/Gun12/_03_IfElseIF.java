package Gun12;

import java.util.Scanner;

public class _03_IfElseIF {
    public static void main(String[] args) {
        // Soru : Kullanıcıdan  Fizik:90   şeklinde not bilgisini alınız.
        // >= 90 için A
        // >= 80 için B
        // >= 70 için C
        // >= 60 için D
        // >= 40 için E
        // < 40 için F yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Ders ve Notu =");  // Fizik:  77    Kimya90
        String dersNot = oku.nextLine(); // Fizik:  45

        int ogrNot = Integer.parseInt(dersNot.replaceAll("[^0-9]", "")); // 0-9 dışındakile boşaltıldı
        String dersAd = dersNot.replaceAll("[0-9]", "");  // sayıları boşalt

        System.out.println("ogrNot = " + ogrNot);
        System.out.println("dersAd = " + dersAd);

        if (ogrNot >= 90)
            System.out.println("A");
        else if (ogrNot >= 80)
            System.out.println("B");
        else if (ogrNot >= 70)
            System.out.println("C");
        else if (ogrNot >= 60)
            System.out.println("D");
        else if (ogrNot >= 40)
            System.out.println("E");
        else
            System.out.println("F");

        //Scanner oku = new Scanner(System.in);
        //        System.out.print("Dersinizi ve notunuzu aralarında yazınız = ");
        //        String dersNot = oku.nextLine();
        //        int not = Integer.parseInt(dersNot.replaceAll("\D",""));
        //        if (not >= 90) {
        //            System.out.println("Notunuz A");
        //        } else if (not>=80) {
        //            System.out.println("Notunuz B");
        //        }else if (not>=70){
        //            System.out.println("Notunuz C");
        //        } else if (not>=60) {
        //            System.out.println("Notunuz D");
        //        } else if (not>=40) {
        //            System.out.println("Notunuz E");
        //        } else System.out.println("Notunuz F");


    }
}
