package Gun34.Ornek3;

public class SirketMain {
    //Calisan isminde bi class tanımlayınız properties/fields(isim, maas, maasKatSayisi(int))
    //consructor ve maashesapla Metodu(maas*maasKatSayisi) ekleyiniz. toString metodu ekleyiniz.
    //GenelMudur isimli bir classı Calisan sınıfından türetip, extra field olarak tazminat ekleyiniz.
    //GenelMudur classında maasHesaplaya tazminat da ekleyiniz.
    //SirketMain diye yazacağınız main in olduğu yerde, 1 calısan ve 1 GenelMüdür tanımlayarak,
    //maaşları hesaplatıp, bordroyu yazdırınız.
    public static void main(String[] args) {
        Calisan calisan = new Calisan("Birkan Filiz",5000,2);
        System.out.println("calisan.maasHesapla() = " + calisan.maasHesapla() + calisan.getIsim());
        System.out.println("calisan = " + calisan);
        GenelMudur genelMudur = new GenelMudur("Omer Boncuk",10000,3,10000);
        System.out.println("genelMudur.maasHesapla() = " + genelMudur.maasHesapla()+genelMudur.getIsim());
        System.out.println("genelMudur = " + genelMudur);



    }
}
// TODO: 16/09/2022 İnterface abstrackt ve polimorfizm arastir bunlar OOP konusu