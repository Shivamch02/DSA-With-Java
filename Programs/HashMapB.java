import java.util.*;
import java.util.TreeMap;

public class HashMapB {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        lhm.put("India", 100);
        lhm.put("China", 160);
        lhm.put("Nepal", 50);

        TreeMap<String, Integer> tm = new TreeMap<>();

        tm.put("India", 100);
        tm.put("China", 160);
        tm.put("Nepal", 50);

        System.out.println(lhm);
        System.out.println(tm);
    }
}
