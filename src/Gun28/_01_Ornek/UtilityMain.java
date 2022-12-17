package Gun28._01_Ornek;

public class UtilityMain {
    public static void main(String[] args) {
        myUtility myut = new myUtility();
        String strSayi = myut.getString(356);
        int sayi = myut.getInt("345");

        // bu metodlar nesneye ait!!!

        Math.random(); // ben bunu direk nesne tanimlamadan
                       // kendi metodlarimi yazmak istiyorum

        String strSayi2 = myUtility.getString2(23);
        int sayi2 = myUtility.getInt2("34");
        // bu metodlar nesne olusturmaya nesne olusturmaya ihtiyac duymayan
        // class a (tipe ait) ait metodlardir'
        // tipe ait oldugu icin tip adiyla cagirilabilir
        Integer.parseInt("34"); // bu metod tipe ait
        Integer rakam = 5;

        // nesneyi ilgilendiren metodlari normal yaziyoruz
        // nesneyi ilgilendirmeyen , tipi ilgilendiren
        // metodlari STATIC ile yaziyoruz


    }
}
