package Gun27._03_Ornek;

public class Sirket {
    public static void main(String[] args) {
        // 1- Adım : Person isimli bir class tanımlayınız : name, surname, age
        // 2- Adım : main de 2 tane bu sınıftan nesne oluşturup deger atayınız.
        // 3- Adım : Bu degerlerı yazıdırınız.
        // 4- Adım : getBirthYear isminde Person a ait bir metod yazınız,
        //           çalıştığında kişinin doğum yılını versin.
        // 5- Adım : getInitials isminde kişinin adının ilk harfi.soyadının ilk harfi
        //           şeklinde (Büyük harf) veren metodu yazınız. örnek ahmet demir : A.D.

        Person person = new Person();
        person.name="Omer";
        person.surname="boncuk";
        person.age=30;

        Person person1 = new Person();
        person1.name="Olga";
        person1.surname="boncuk";
        person1.age=41;
        // 1. yontem
        System.out.println("personnel information  = " + person.name+" "+person.surname+" "+person.age+" "+ person.getBirthdayYear()+" "+person.getInitials() );
        System.out.println("personnel information  = " + person1.name+" "+person1.surname+" "+person1.age+" "+person1.getBirthdayYear()+" "+person1.getInitials());
        // 2. yontem // method
        bilgiYazdir(person);
        bilgiYazdir(person1);
        //3. yontem en iyi yontem ilgili metodu kendi clasin a at // void ile kisa yol yazdirma
        person.bilgiYazdir();
        person1.bilgiYazdir();

        System.out.println("person = " + person.getBirthdayYear());
        System.out.println("person1.getBirthdayYear() = " + person1.getBirthdayYear());

        System.out.println("person = " + person.getInitials());
        System.out.println("person1.getInitials() = " + person1.getInitials());

        person.getBirthdayYear();
        person1.getBirthdayYear();

        person.getInitials();
        person1.getInitials();



    }
    public static void bilgiYazdir(Person p){
        System.out.println("personnel information = " + p.name+" "+p.surname+" "+p.age+" "+p.getBirthdayYear()+" "+p.getInitials());
    }
}
