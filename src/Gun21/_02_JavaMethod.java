package Gun21;

public class _02_JavaMethod {
    public static void main(String[] args) {
        System.out.println("Merhaba Dunya");
        System.out.println("Merhaba Dunya");

        merhabaYaz(); // giden yok , donen yok
        toplamYaz(4,5); // giden var , donen yok
        int enb = Math.max(4,5); // giden var donen var
        double sayi = Math.random(); // giden yok donen var

        // **************************************************//

        enbYaz(4,5); // giden var donen yok

        int donen = enbBul(4,5); // gidem var , donen de var
        System.out.println("donen = " + donen);

    }
    public static int enbBul (int sayi1, int sayi2)
    {
        int donecek =0;
        if (sayi1<sayi2)
            donecek=sayi1;
        else
            donecek=sayi2;
        return donecek;
    }

    public static void toplamYaz(int sayi1,int sayi2)
    {
        System.out.println(sayi1+sayi2);
    }
    public static void  merhabaYaz ()
    {
        System.out.println("Merhaba Dunya");
    }

    public static void enbYaz (int sayi1 , int sayi2)
    {
        if (sayi1>sayi2)
            System.out.println("sayi1 = " + sayi1);
        else
            System.out.println("sayi2 = " + sayi2);
    }

}
