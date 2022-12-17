package Gun40.Ornek2;

public class ABMain {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("a.mesaj = " + a.mesaj);
        B b = new B();
        System.out.println("b.mesaj = " + b.mesaj);
        
        A a1 = new A();
        System.out.println("a1.mesaj = " + a1.mesaj);



        // calisinca nasil bir cikti verir.
        // Soru: static biliyormusun?
        // cevap : a.mesaj =  A' dan mesaj var
        //         b.mesaj = B'den merhaba
        //         a1.mesaj = B'den merhaba

        // A class da ctatic olmasaydi

        // cevap :a.mesaj =  A' dan mesaj var
        //        b.mesaj = B'den merhaba
        //        a1.mesaj =  A' dan mesaj var
    }
}
