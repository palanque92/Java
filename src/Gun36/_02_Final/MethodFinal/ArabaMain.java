package Gun36._02_Final.MethodFinal;

public class ArabaMain {
    public static void main(String[] args) {
        Araba araba = new Araba("kara tasiti","mavi");
        araba.VasitaOzelYazdir(); // kullanabilirsin bir engel yok. ama final metdolar degistitilemez
        System.out.println("araba = " + araba);
    }
}
