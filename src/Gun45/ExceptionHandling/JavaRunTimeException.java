package Gun45.ExceptionHandling;

public class JavaRunTimeException {
    public static void main(String[] args) {
        System.out.println("program calismaya basladi");
        String kelime = "";
        char ilkKelime = kelime.charAt(3);
        System.out.println("Program bitti");
    }
}

// daha calismadan once olusmus eksikliklerden kaynakli hatalara
// derleme zamani yani COMPILE ERROR , Exception diyoruz.

// program calistikdan sonra calisma zamani icerisindeki hatalara
// calisma zamani yani runtime error Exception diyoruz
