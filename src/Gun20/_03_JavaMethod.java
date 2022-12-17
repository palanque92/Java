package Gun20;

public class _03_JavaMethod {
    public static void main(String[] args) {
        merhabaYaz();  // Math.random();
        merhabaYazIsme("Omer");  // Math.abs(-10);
        darbeliMatkap("darbeli matkap");

        _04_JavaMethod.tekMiCiftMi(40);
    }

    public static void merhabaYaz() {
        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba Dünya");
    }

    public static void merhabaYazIsme(String isim)
    {
        System.out.println(isim+" Merhaba");
    }

    public static void darbeliMatkap (String yazi) {
        System.out.println(yazi+"Ayda sevisenler");
    }

}