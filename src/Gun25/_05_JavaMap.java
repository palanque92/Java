package Gun25;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _05_JavaMap {
    public static void main(String[] args) {
        // Canlı Sözlük yapılmak isteniyor.
        // Kullanıcıya aşağıdaki gibi bir menü çıkarınız.
        // 1- Ekleme (Bu secekte kelimenin kendisi ve manasını bir cümle ile yazınız)
        // 2- Düzeltme (Bu secenkte kullanıcının kelimenin manasını düzelttiriniz.)
        // 3- Listeleme
        // 4- Arama (Bu secekte verilen bir kelimeyle başlayan tüm kelimelerin manaları)
        // 5- Silme
        // 6- Çıkış

        HashMap<Integer,String>liste =new HashMap<>();

        liste.put(1,"Ekleme\n");
        liste.put(2,"Duzeltme\n");
        liste.put(3,"Listeleme\n");
        liste.put(4,"Arama\n");
        liste.put(6,"Silme\n");
        liste.put(7,"Cikis\n");

        System.out.print("Liste = " + liste.entrySet());

        Scanner oku = new Scanner(System.in);
        System.out.println("Seciniz =");
        String kelime = oku.nextLine();










    }
}
