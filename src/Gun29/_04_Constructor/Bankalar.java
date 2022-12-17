package Gun29._04_Constructor;

public class Bankalar {
    public static void main(String[] args) {
        // Bir banka class ı tanımlayınız.
        // 3 adet field ekleyiniz.(adi, subeSayisi, kurulusYili)
        // 3 adet constructor ekleyin.
        // toString metodu oluşturun.
        // 3 tane nesne oluşturup mainde yazdırınız.
        Banka bank1 = new Banka("OmerBank",34,1992,2.11);
        Banka bank2 = new Banka("SevenBank",12,4.22);
        Banka bank3 = new Banka("AdamBank",40,1900,3.50);


        bank1.yazdir();
        bank2.yazdir();
        bank3.yazdir();




    }
}
