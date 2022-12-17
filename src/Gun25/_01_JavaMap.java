package Gun25;

import java.util.HashMap;

public class _01_JavaMap {
    public static void main(String[] args) {
        // Set -> HashSet,LinkedHashSet,TreeSet
        // Map -> HashMap,LinkedMap,TreeMap

        HashMap<Integer,String>hm=new HashMap<>();
        hm.put(1,"Omer Boncuk");
        hm.put(2,"Olga Nuris Boncuk");
        hm.put(3,"Mikail Boncuk");
        hm.put(4,"Enes Boncuk");

        System.out.println("hm = " + hm);
        System.out.println("hm.get(2) = " + hm.get(2));
        System.out.println("hm.get(3) = " + hm.get(3));
        System.out.println("hm.keySet() = " + hm.keySet());
        System.out.println("hm.values() = " + hm.values());
        
        hm.remove(4); // 4 atahtarindaki eleman silindi
        System.out.println("remove = " + hm);
        System.out.println("hm.size() = " + hm.size());

        hm.clear();
        System.out.println("clear = " + hm);
        
    }
}
