package Gun18;

import java.util.Arrays;

public class _03_JavaArrays {
    public static void main(String[] args) {
        // 10 elemanlı bir diziyi random (0-100 arası) doldurduktan sonra,
        // tek elemanlarını ayri bir bir baska diziyue , cift elemanlarini baska
        // diziye sadece atanana elemanlarin sayisi kadar olacak sekilde atayiniz

        int[] dizi=new int[10]; //10 elemanli bir dizi


        int ciftMiktar=0;
        int tekMiktar=0;
        for (int i=0;i<dizi.length;i++){
            dizi[i]=(int)(Math.random()*100);
            if (dizi[i]%2==0)
                ciftMiktar++;
            else
                tekMiktar++;
        }
        System.out.println("dizi = " + Arrays.toString(dizi));

        int[]tekDizi = new int[tekMiktar];
        int[]ciftDizi= new int[ciftMiktar];

        int cIndex =0;
        int tIndex=0;
        for (int i=0;i<dizi.length;i++){
            if (dizi[i]%2==0){
                ciftDizi[cIndex]=dizi[i];
                cIndex++;
            }
            else{
                tekDizi[tIndex]=dizi[i];
                tIndex++;
            }
        }
        System.out.println("Cift = " + Arrays.toString(ciftDizi));
        System.out.println("Tek = " + Arrays.toString(tekDizi));
    }
}
