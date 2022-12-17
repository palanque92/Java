package Gun32.Ornek2;

public class Soru {
    // Bir User yetkilendirme modülü yapılması isteniyor.
    // USER ROLÜ : ADMIN, MUDUR, SATIS, PERSONEL
    // USER STATUSU : AKTIF, PASIF
    // Yukarıdaki şekilde bir USER class ı tanımlayınız
    // Farklı yetki ve statüde 2 kullanıcı ve bir de ADMIN
    // kullanıcısı tanımlayınız.
    // UserSilme isimli fonksiyona bu userları gönderiniz.
    // ADMIN kullanıcısı için bu user silinemez uyarısı verdirelim
    public static void main(String[] args) {
        User user1 = new User("Omer",Role.ADMIN,Statu.AKTIVE);
        User user2 = new User("Olga",Role.SATIS,Statu.AKTIVE);
        User user3 = new User("Enes",Role.MUDUR,Statu.AKTIVE);
        User user4 = new User("Miko",Role.STAJYER,Statu.AKTIVE);
        User user = new User("Ayse",Role.PERSONEL,Statu.AKTIVE);

        System.out.println("user = " + user1.username+user1.role+user1.statu);


        userDelete(user1);
        userDelete(user2);
        userDelete(user3);

    }
    public static void userDelete (User kullanici)
    {
        if (kullanici.role==Role.ADMIN)
        {
            System.out.println("Admin silinemez");
        }
        else
        {
             // bu bolumde silme islemi yapildi
        }
    }
}
