package Gun17;

import java.util.Arrays;

public class _04_JavaArrayMetodlar {
    public static void main(String[] args) {
        // Arrays.toString(dizi)
        String[]isimler={"omer","ali","osman","ebubekir"};
        System.out.println("Arrays.toString(isimler) = " + Arrays.toString(isimler));
        
        // Array.sort(isimler)
        Arrays.sort(isimler); // siralama islemi yapildi
        System.out.println("isimler = " + Arrays.toString(isimler));
        
        // diziler esitmi ? Arrays.equals(dizi1,dizi2)
        int[] a={1,2,4,5,67};
        int[] b={1,2,4,5,67};
        int[] c={1,2,4,5,67};

        System.out.println("Arrays.equals(a,b) = " + Arrays.equals(a,b)); // true
        System.out.println("Arrays.equals(a,c) = " + Arrays.equals(a,c)); // false
        
        // Arrays.fill -> butun kutucuklara 7 atar
        Arrays.fill(c,7);
        System.out.println("Arrays.toString(c) = " + Arrays.toString(c));

        //Arrays.binarySearch(rakamlar, 5)   -> Sıralı dizide aranan elemanın indexi verir
        // aranan elaman birden fazla ise herhangi birini verebilir.
        // esas amacı var mı yok mu kontrolü, var ise indexini verir, yok ise negatif sayı döndürür

        int[] rakamlar={2,7,4,6,5};
        System.out.println("Arrays.sort(rak) = " + Arrays.toString(rakamlar));
        Arrays.sort(rakamlar);
        System.out.println("Arrays.sort(rak) = " + Arrays.toString(rakamlar));
        System.out.println("Arrays.binarySearch(rakamlar,7) = " + Arrays.binarySearch(rakamlar, 7));

        
    }
}
