package Gun21;

import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {
        // reverseString isminde bir method oluşturun.
        //
        //Bu method bir String'i parametre olarak alsın.
        //
        //Ve bu method, girilen String'i tersten yazsın.
        //
        //Terste yazılmış halini yazdırınız.
        //
        //Örn: String = "Java'yı Seviyorum."
        //
        //Print: .muroyiveS ıy'avaJ

        Scanner oku = new Scanner(System.in);
        System.out.println("Cumle gir =");
        String cumle = oku.nextLine();

        String cevir;
        String cevirilen = cevir(cumle);
        System.out.println("cevirilen yazi = " + cevirilen);
    }

    public static String cevir(String cumle) {
        if (cumle.isEmpty())
            return cumle;
        return cevir(cumle.substring(1))+cumle.charAt(0);
    }

}

