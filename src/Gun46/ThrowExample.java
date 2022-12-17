package Gun46;

import java.util.Scanner;

public class ThrowExample {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.println("yeni sifre olusturma");


        System.out.println("yeni sifrenizi giriniz");
        String password = oku.nextLine();

        try {
            if (password.length() < 8) {
                throw new Exception("Sifre 8 karakterden kucuk olamaz");
                // bu mesaj ile hata olusur
            }
            if (password.length() > 15) {
                throw new Exception("sifre 15 karakterden buyuk olamaz");
            }
        } catch (Exception ex) {
            // hatalar bir kere toplanip hepsi icin yapilmasi gereken islemler
            // bir arada burada yapilabilir. mesela log tutma gibi
            System.out.println("Lutfen dikkat");
            System.out.println("Uyari " + ex.getMessage());
            // log tutma islemi
        }
    }
}
