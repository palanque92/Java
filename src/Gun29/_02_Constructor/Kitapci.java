package Gun29._02_Constructor;

public class Kitapci {
    public static void main(String[] args) {
        Book kit1 = new Book();
        kit1.name="Harry Potter";
        kit1.publishYear=1997;
        kit1.author="JK ROWLING";

        // 2. Constructor
        Book kit2 = new Book("Yuzuklerin efendisi","JRR TOLKIEN");
        Book kit3 = new Book("Sefiller");

        kit1.yazdir();
        kit2.yazdir();
        kit3.yazdir();

        System.out.println("kit1 = " + kit1.toString()); // toString zaten otomatik yapiyor
        System.out.println("kit1 = " + kit1);
        System.out.println("kit2 = " + kit2);
        System.out.println("kit3 = " + kit3);

    }
}
