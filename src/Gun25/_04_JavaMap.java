package Gun25;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class _04_JavaMap {
    public static void main(String[] args) {
        HashMap<Integer,String>hm=new HashMap<>();

        hm.put(9,"Tilki");
        hm.put(2,"kedi");
        hm.put(30,"kopek");
        hm.put(11,"kus");
        hm.put(4,"kurt");
        System.out.println("hm = " + hm); // hizli calisma  icin kendisine gore

        HashMap<Integer,String>lhm=new LinkedHashMap<>();
        lhm.put(9,"Tilki");
        lhm.put(2,"kedi");
        lhm.put(30,"kopek");
        lhm.put(11,"kus");
        lhm.put(4,"kurt");
        System.out.println("lhm = " + lhm); // ekleme sirasina gore

        Map<Integer,String>tm=new TreeMap<>();
        tm.put(9,"Tilki");
        tm.put(2,"kedi");
        tm.put(30,"kopek");
        tm.put(11,"kus");
        tm.put(4,"kurt");

        System.out.println("tm = " + tm); // key sirasina gore


    }
}
