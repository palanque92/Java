package Gun45.VeriTipleri;

import java.util.Arrays;

public class _01_VeriTipleriMetodda {
    public static void main(String[] args) {
        int sayi=5;
        sayi=sayiArttir(sayi);
        System.out.println("sayi = " + sayi);

        int[] dizi={1,2,3};
        diziSifirla(dizi);
        System.out.println("dizi = " + dizi + Arrays.toString(dizi));

        // Nesne Tip , Null olabilen ilkel tip. : object tip
        String isim="ismet";
        kelimeSifirla(isim);
        System.out.println("isim = " + isim);

        // Özet: Temel fark:
        // 1- İlkel tipler sadece 1 değer saklarlar, bu yüzden metodlara sadece değeri gider.Eşitlendiğinde sadece değer aktarılır.
        // 2- Nesne tipler İlkel tipten tek farkı NULL değeri alabilmeleri, bu yüzden ilkel tip gibi davranırlar
        // 3- Referans tipler metoda gönderildiklerinde kendileri giderler. Eşitlemelerde referanslar eşitlenir.
        // 4- Arraylist ler diziler de return eklemeye gerek yok sonraki deger icin ,
        // Ama int ,Integer ,String icin return eklemek gerekir.
        // 5- Esit mi
        // Ilkel tiplerde  == ve equals farketmez degerler karsilastirilir
        // Referance ve Nesne tipler icin esitlik kontrolunde == (esitmi 'n) in manasi referanslari ayni mi demek
        //                                                           equals in manası ise değerleri aynı mı demek

    }
    public static int sayiArttir (int sayi) {
        sayi=sayi+1;
        return sayi;

    }
    public static void diziSifirla(int[] a)
    {
        a[0]=0;
        a[1]=0;
        a[2]=0;
    }

    public static void kelimeSifirla (String kelime)
    {
        kelime="";
    }

}
