package Gun25;

import java.util.HashMap;

public class _03_JavaMap {
    public static void main(String[] args) {
        // Map = Set + Key -> Anahtarli set

        HashMap<String,String>vKartvizit=new HashMap<>();
        vKartvizit.put("isim","Ersan Kuneri");
        vKartvizit.put("email","donla@gmail.com");
        vKartvizit.put("adres","Cekmekoy/Turkiye");
        vKartvizit.put("telefon","05323524589");

        System.out.println("vKartvizit.get(\"isim\") = " + vKartvizit.get("isim"));
        System.out.println("vKartvizit.get(\"telefon\") = " + vKartvizit.get("telefon"));

        HashMap<String,String>eKartvizit=new HashMap<>();
        eKartvizit.put("isim","Lale Kalburan");
        eKartvizit.put("email","Lale@gmail.com");
        eKartvizit.put("adres","Ankara/Turkiye");
        eKartvizit.put("telefon","0505698589");

        // Kartvizitlerim diye bir defteri nasil tanimlaarim
        // Ersanin kartviziti
        // lalenin kartviziti

        HashMap<String,HashMap<String,String>  >Kartvizitlerim=new HashMap<>();
        Kartvizitlerim.put("Ersan",vKartvizit);
        Kartvizitlerim.put("Lale",eKartvizit);

        // volkanin telefon numarasina nasil ulasirim

        System.out.println("Kartvizitlerim.get(\"Ersan\") = " + Kartvizitlerim.get("Ersan"));
        System.out.println("Ersanin telefonu = " + Kartvizitlerim.get("Ersan").get("telefon"));
        System.out.println("Lalenin Adresi = " + Kartvizitlerim.get("Lale").get("adres"));



    }
}
