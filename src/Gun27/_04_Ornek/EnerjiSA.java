package Gun27._04_Ornek;

public class EnerjiSA {
    public static void main(String[] args) {
        /*
        1.Adım  :Musteri isimli (fields: name) isimli bir class tanımlayınız.
        2.Adım  :ElektrikHesabi isimli (fields : toplamTuketim(int), birimFiyat(double),
                 fatura(double))  class tanımlayınız
        3.Adım  :Musteri a bir ElektrikHesabi ekleyiniz.
        4.Adım  :1 tane müşteri oluşturunuz,
        5.Adım  :Musteriye ait her ay tüketilen enerjiyi toplayacak bir metod yazınız.
                 tuketimEkle olsun her verilen aylık rakamı toplayarak biriktirsin.
        6.Adım  :Ödenecek rakamı  toplam tüketimi  oran(0.7) ile çarparak hesaplatınız, yazdırınız.

        ipucu : hesabı olşuturduktan sonra tuketimEkle metoduna 2,3 ay tüketim ekletiniz, faturayı
                ondan sonra toplam alarak çıkartınız  */

        Musteri client = new Musteri();
        client.name="Omer";
        client.surname="Boncuk";
        client.adress="Litvanya";
        client.elektrik=new ElektrikHesabi();
        client.elektrik.toplamTuketim=200;
        client.elektrik.birimFiyat=0.7;
        client.elektrik.odemeTarihi="12/09/2022";

        System.out.println("OmerSan Elektrik AS");
        System.out.println("Musterinin adi soyadi = " + client.name+" "+client.surname);
        System.out.println("Musterinin adress = " + client.adress);

        System.out.println("Birim fiyat = " + client.elektrik.birimFiyat);
        System.out.println("fatura = " + client.odenecekFiyat(client.tuketimEKle())+" TL");
        System.out.println("Son odeme tarihi = " + client.elektrik.odemeTarihi);


    }
}
