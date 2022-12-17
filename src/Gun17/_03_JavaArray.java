package Gun17;

public class _03_JavaArray {
    public static void main(String[] args) {
        // 100 Elemanlı bir diziyi random olarak 100 e kadar olan sayılarla doldurunuz.
        // Sonrasında tek ve cift eleman sayilarini bulunuz
        int[]dizi=new int[100]; //100 elemanlı bir dizi tanımlayınız
        for (int i=0;i<dizi.length;i++) // 0 - 99
            dizi[i]=(int)(Math.random()*100); // 0 - 100 random sayi

        for (int i=0;i<dizi.length;i++)
            System.out.println(i+".Kutu="+dizi[i]);

        int tekMiktar =0;
        int ciftMiktar=0;
        for (int i =0;i<dizi.length;i++){
            if (dizi[i]%2==0){
                ciftMiktar++;
            } else {
                tekMiktar++;
            }
        }
        System.out.println("tekMiktar = " + tekMiktar);
        System.out.println("ciftMiktar = " + ciftMiktar);
    }
}
