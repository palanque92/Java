package Gun14;

public class _07_forLoop {
    public static void main(String[] args) {
        for (int i=0; i<=255; i++) {
            String harf = Character.toString ((char) i);
            String escape=harf.replaceAll("\\W",".");
            if (escape.equals("."))
                continue;
            System.out.println("Sayı Değeri = " + i + " - Karakteri = " + harf + " ");
        }
    }
}
