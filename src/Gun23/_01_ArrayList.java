package Gun23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _01_ArrayList {
    public static void main(String[] args) {
        // ArrayList Collection grubunun bir elemani
        // Array i siralarken Array.sort u kullandigimiz gibi
        // ArrayList i Collection metodlarini kullanacagiz.

        ArrayList<Integer>rakamlar=new ArrayList<>();
        rakamlar.add(50);
        rakamlar.add(5);
        rakamlar.add(456);
        rakamlar.add(45);
        rakamlar.add(3);

        System.out.println("rakamlar = " + rakamlar);

        // siralama islemi
        Collections.sort(rakamlar);
        System.out.println("rakamlar = " + rakamlar);

        // tersine cevir
        Collections.reverse(rakamlar);
        System.out.println("rakamlar = " + rakamlar);

        // Max ve Min eleman bulma
        System.out.println("Collections.max(rakamlar) = " + Collections.max(rakamlar));
        System.out.println("Collections.min(rakamlar) = " + Collections.min(rakamlar));

        // butun elemanlari set etme
        Collections.fill(rakamlar,0); // butun elemanlara 0 atar
        System.out.println("rakamlar = " + rakamlar);

        // replace
        Collections.replaceAll(rakamlar,0,5); // eski degere yeni deger atama
        System.out.println("rakamlar = " + rakamlar);

        // tanimlarken deger atama
        int[] dizi = {2,3,4,5};
        ArrayList<Integer>Liste=new ArrayList<>(Arrays.asList(2,3,4,5,6));
        System.out.println("Liste = " + Liste);

        ArrayList<String>strListe=new ArrayList<>(Arrays.asList("1","2","3","4","5","6"));
        System.out.println("strListe = " + strListe);


    }
}
