import java.util.*;

public class Hashing {
    public static void main(String args[]) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);

        System.out.println(hm);
        // get 0(1)
        // System.out.println(hm.get("India"));
        // // containsKey 0(1)
        // System.out.println(hm.containsKey("India"));

        // remove 0(1)
        // System.out.println(hm.remove("China"));
        // System.out.println(hm);

        // size
        // System.out.println(hm.size());

        // is Empty
        // System.out.println(hm.isEmpty());

        // clear
        // hm.clear();

        // Iterate
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println(k + " " + hm.get(k));
        }
    }
}