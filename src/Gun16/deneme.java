package Gun16;

public class deneme {
    public static void main(String[] args) {
        int [] dizi = new int[5];

        for (int i = 0; i < dizi.length; i++)
            dizi[i]=(int)(Math.random()*100);

        for (int i = 0; i < dizi.length; i++)
            System.out.println(i+". Kutu = " + dizi[i]);
        int tekMiktar =0;
        int ciftMiktar=0;
        for (int i = 0;i< dizi.length;i++) {
            if (dizi[i]%2==0){
                ciftMiktar++;
            } else {
                tekMiktar++;
            }
        }
        System.out.println("tekmiktar = " + tekMiktar);
        System.out.println("ciftMiktar = " + ciftMiktar);




    }
}
