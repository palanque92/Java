package Gun30.ATM;

public class deneme {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Hesap hesap = new Hesap("Omer.Boncuk", "123", 10000);

        atm.calis(hesap);
        System.out.println("Program Çıkılıyor... Güle Güle.");
    }
}


