package Gun15;

public class GununSorusu {
    public static void main(String[] args) {
        // Aşağıdaki görüntüyü veren programı yazınız(yanlızca 1 yıldız ile yapınız)
        //     *   4 boşul 1 yıldız
        //    **   3 boşluk 2 yıldız
        //   ***
        //  ****
        // *****
        int s,b,y;
        for (s=1; s<=5; s++) {
            for(b=s; b<=4;b++) {
                System.out.print(" ");
            }
            for (y=1; y<=s; y++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }


    }
}
