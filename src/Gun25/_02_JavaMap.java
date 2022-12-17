package Gun25;

import java.util.HashMap;
import java.util.Map;

public class _02_JavaMap {
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(1,"Omer Boncuk");
        hm.put(2,"Olga Nuris Boncuk");
        hm.put(3,"Mikail Boncuk");
        hm.put(4,"Enes Boncuk");

        System.out.println("hm.keySet() = " + hm.keySet());
        System.out.println("hm.values() = " + hm.values());
        
        for (Integer k: hm.keySet())
        System.out.println("k = " + k);
        
        for (String v:hm.values())
            System.out.println("v = " + v);
        
        for (Map.Entry<Integer,String> kv:hm.entrySet()){
            System.out.println("kv.getKey() = " + kv.getKey());
            System.out.println("kv.getValue() = " + kv.getValue());
        }
        for (Map.Entry<Integer,String>kv:hm.entrySet())
            System.out.println("Anahtar ve deger = " + kv.getKey()+"-"+kv.getValue());
    }
}
