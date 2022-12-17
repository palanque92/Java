package Gun33.Ornek2;

public class ArabaMain {
    // bir araba nesnesi olusturlmak isteniyor. fields(Renk,Model,MotorHacmi,KapiSayisi)
    // bir nesnenin verilerini OOP kurallarina uygun olarak verip aliniz.
    // Main de 1 tane nesne olusturup bunu kontrol ediniz.
    public static void main(String[] args) {
        araba arb1 = new araba();
        arb1.setRenk("kirmizi");
        arb1.setModel(2022);
        arb1.setMotorHacmi(6000);
        arb1.setKapiSayisi(4);
        System.out.println("arb1 = " + arb1);

        araba arb2 = new araba("siyah",2022,6000,5);
        System.out.println(arb2);


        // KURAL : genel yazilim kuralidir
        // butun degiskenler private yapilir
        // yani kapsulleme ile kullanilir
        // eger gerekiyorsa private kaldirilir
    }
}
