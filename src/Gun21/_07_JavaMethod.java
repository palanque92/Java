package Gun21;

public class _07_JavaMethod {
    public static void main(String[] args) {
        int s1 =45;
        int s2 =4;
        int s3 =67;
        int s4 =23;

        int sonuc = toplam(s1,s2);
        int sonuc2 = toplam(s1,s2,s3);
        int sonuc3 = toplam(s1,s2,s3,s4);

        // parametreler ayni tip sadece miktarlari farkli
        // bu tip durumlar icin bir kolaylik saglanmis

        System.out.println("sonuc = " + sonuc);
        System.out.println("sonuc2 = " + sonuc2);
        System.out.println("sonuc3 = " + sonuc3);
    }
    public static int toplam (int...sayilar)
    {
        int toplam =0;
        for (int i = 0;i<sayilar.length;i++)
            toplam=toplam+sayilar[i];
        return toplam;
    }
    //public static int toplam (int s1,int s2,int s3) {
    //    return s1 + s2 + s3;
    }
    //public static int toplam (int s1,int s2,int s3,int s4) {
    //   return s1 + s2 + s3 + s4;
    //    }
    // }
