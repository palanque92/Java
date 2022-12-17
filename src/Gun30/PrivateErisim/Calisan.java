package Gun30.PrivateErisim;

public class Calisan {
    int id ;
    String name ;
    String surname ;

    private String password ;

   public void sifreAta (String sifre)
   {
       if (sifre.length()>=8) {
           this.password = sifre;
           System.out.println("sifre basariyla atandi");
       }
       else
           System.out.println("sifre kurala uygun degil");
   }
   public void sifreGoster ()
   {
       System.out.println("****"+password.substring(4));
   }


}
