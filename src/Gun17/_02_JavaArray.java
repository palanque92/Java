package Gun17;

public class _02_JavaArray {
    public static void main(String[] args) {
        // 100 elemanlı bir dizi tanımlayınız, 100 a kadar olan sayılardan Random atayarak
        // doldurunuz. Sonrasında en buyuk elemani ve indexi bulunuz

        int[]dizi=new int[100]; //100 elemanlı bir dizi tanımlayınız
        for (int i=0;i<dizi.length;i++) // 0 - 99
            dizi[i]=(int)(Math.random()*100); // 0 - 100 random sayi

        for (int i=0;i<dizi.length;i++)
            System.out.println(i+".Kutu="+dizi[i]);

        int enb =0;
        int enbIndex =0;
        for (int i=0;i<dizi.length;i++){
            if (dizi[i]>enb){
                enb = dizi[i];
                enbIndex = i;
            }
        }
        System.out.println("enb = " + enb);
        System.out.println("enbIndex = " + enbIndex);




    }
}
