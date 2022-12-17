package Gun20;

import java.util.Arrays;

public class Odev {
    public static void main(String[] args) {
        // String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        //
        //Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        //
        //Eğer aitse "true" çevirin.
        
        String[] Meyveler = {"Apple,Orange,Banana,Pineapple"};
        System.out.println("Elma varmi ? = " + Arrays.toString(Meyveler).contains("Apple"));

        // int Array oluşturun ve elemanları : 12,2,5,15,8
        //
        //En büyük değeri yazdırınız.


        int [] sayilar = {12,2,5,15,8};
        System.out.println("En buyuk sayi = " + Arrays.stream(sayilar).max());

        // int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        //
        //En küçük (minimum) sayıyı yazdırınız.

       int [] sayilar2 = {14,19,5,21};
        System.out.println("En kucuk sayi = " + Arrays.stream(sayilar2).min());

        // int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
        //
        //Arraydaki en büyük 2. elemanı yazdıran bir program yazın.

        int [] dizi = {15,25,22,18,30};
        int i ;
        int enbuyuk = dizi[0];
        int ikinci = dizi[0];
        for(i=0;i<dizi.length;i++){
            if(dizi[i]>enbuyuk)
            {
                ikinci=enbuyuk;
                enbuyuk=dizi[i];
            }
            else if(dizi[i]>ikinci){
                ikinci = dizi[i];
            }
        }
        System.out.println("ikinci en buyuk sayi: " +ikinci);

        //int Array oluşturun ve elemanları : 5,6,8,12,14,19
        //
        //Eğer sayı çiftse topla, tekse çıkar.
        //
        //**Örneğin:**
        //
        // **-5 + 6 + 8 + 12 + 14 - 19 = 16**
        //
        //Toplamlarını yazdırın.

        int[] dizi2 = {5,6,8,12,14,19};
        int cift =0;
        int tek =0;


        for (i = 0;i<dizi2.length;i++)
        {
            if (dizi2[i]%2==0){
                cift+=dizi2[i];
            }
            else
                tek-=dizi2[i];
        }
        System.out.println("cift = " + cift);
        System.out.println("tek = " + tek);

        // Oluşturacağınız int array'ini, length'i(eleman sayısı) 2 olan ve int array'inin(ilk oluşturduğunuz array) ilk ve son elementlerini kapsayan yeni array'e return edin.
        //
        //
        //
        // Oluşturacağınız int array'i =   ([1, 2, 3, 4])
        //
        // Sonuç bu şekilde olmalıdır. [1, 4]






        //





    }
}
