package Gun19;public class _06_Java2DArrays {
    public static void main(String[] args) {
        int [] [] tablo = { // 5.satir 3 sutun ->5*3
                {2,4,}, // 0.satir
                {3,5,7}, //1.satir
                {6,7,99,235}, // 2.satir
                {62,884}, // 2.satir
                {6,1}, // 2.satir
        };


        System.out.println("Satir miktari = " + tablo.length);
        System.out.println("0.satirdaki suutn sayisi = " + tablo[0].length);
        System.out.println("1.satirdaki suutn sayisi = " + tablo[1].length);
        System.out.println("2.satirdaki suutn sayisi = " + tablo[2].length);
        System.out.println("3.satirdaki suutn sayisi = " + tablo[3].length);
        System.out.println("4.satirdaki suutn sayisi = " + tablo[4].length);

        for (int i =0;i< tablo.length;i++) {

            for (int j = 0; j < tablo[i].length; j++) {
                System.out.print(tablo[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
