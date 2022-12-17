package Gun21;

public class _06_JavaMethod {
    public static void main(String[] args) {
        int s1 =4;
        int s2 =12;
        int s3 =34;
        int s4 =45;

        int sonuc1=toplamBul(s1,s2);
        int sonuc2=toplamBul(s1,s2,s3);

        String ad = "omer";
        String soyAd = "boncuk";
        String tamAd=toplamBul(ad,soyAd);

        System.out.println("tamAd = " + tamAd);
        System.out.println("sonuc1 = " + sonuc1);
        System.out.println("sonuc2 = " + sonuc2);

    }
    public static String toplamBul(String s1,String s2)
    {
        return s1+s2;
    }

    public static int toplamBul(int s1,int s2)
    {
        return s1+s2;
    }

    public static int toplamBul(int s1,int s2,int s3)
    {
        return s1 + s2 + s3;
    }

}
