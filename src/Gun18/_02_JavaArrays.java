package Gun18;

import java.util.Arrays;

public class _02_JavaArrays {
    public static void main(String[] args) {
        // 10 elemanlı bir diziyi random (0-100 arası) doldurduktan sonra,
        // sadece tek elemanlarını bir başka diziye atayınız.
        // yeni dizi de 0 lar olmasın.(yeni dizinin boyutu tekerin sayısı kadar olsun)

        int[] dizi=new int[10]; //100 elemanli bir dizi
        
        int tekMiktar =0;
        for (int i =0; i<dizi.length;i++){
            dizi[i]=(int)(Math.random()*100);
            
            if (dizi[i]%2==1)
                tekMiktar++;
        }
        System.out.println("dizi = " + Arrays.toString(dizi));
        System.out.println("tekMiktar = " + tekMiktar);

        int[] tekler =new int [tekMiktar];
        System.out.println("Tekler dizisi = " + Arrays.toString(tekler));

        int teklerIndexi = 0;
        for (int i=0;i<dizi.length;i++)
        {
            if (dizi[i]%2==1)
            {
                tekler[teklerIndexi]=dizi[i];
                teklerIndexi++;
            }
        }
        System.out.println("tekler sonra = " + Arrays.toString(tekler));
    }
}
