package Gun20;

public class _02_JavaMethod {
    //buraya metodların yazılabileceği yerler
    public static void main(String[] args) { // ana calisana kisim burasi buradan digerlerini caigiricaz
        Math.max(5,6); // bir seyler gonderiliyor geriye , deger aliniyor
        Math.random(); // bir seyler gonderilmiyor , geriye deger aliniyor

        System.out.println("Merhaba Dunya");
        System.out.println("Merhaba Dunya");
        System.out.println("Merhaba Dunya");

        MerhabaYaz();
        MerhabaYaz();
        MerhabaYaz();
    } // mainin bitisi
    public static void MerhabaYaz()
    {
        System.out.println("fonksiyonda/metodda Merhaba Dunya");
    }
    // Metodlar tekrarlayan kodlardan kurtulup bir kere yazıp sonra tekrar çağırmak için
    // ve büyük programı parçalara bölüp kod karışıklığının önüne geçmek için kullanılır.
    // temiz kod için
}
