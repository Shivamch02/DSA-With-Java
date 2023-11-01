import java.util.*;

public class HashSetB {
    public static void main(String[] args) {

        // HashSet<Integer> set = new HashSet<>();

        // set.add(1);
        // set.add(2);
        // set.add(4);
        // set.add(2);
        // set.add(1);

        // System.out.println(set);
        // set.remove(2);
        // System.out.println(set.contains(2));

        // System.out.println(set.size());
        // System.out.println(set.isEmpty());
        // set.clear();
        // System.out.println(set.size());

        // using iterator

        // HashSet<String> cities = new HashSet<>();

        // cities.add("Delhi");
        // cities.add("Noida");
        // cities.add("Bangluru");
        // cities.add("Mumbai");

        // Iterator it = cities.iterator();
        // while (it.hasNext()) {
        // System.out.println(it.next());
        // }

        // for (String city : cities) {
        // System.out.println(city);
        // }
        // System.out.println(cities);

        // LinkedHashSet<String> lhs = new LinkedHashSet<>();

        // lhs.add("Delhi");
        // lhs.add("Noida");
        // lhs.add("Bangluru");
        // lhs.add("Mumbai");

        // System.out.println(lhs);

        // TreeSet<String> ts = new TreeSet<>();

        // ts.add("Delhi");
        // ts.add("Noida");
        // ts.add("Bangluru");
        // ts.add("Mumbai");

        // System.out.println(ts);
        int num[] = { 4, 3, 2, 5, 6, 7, 3, 4, 2, 1 };
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < num.length; i++) {
            set.add(num[i]);
        }

        System.out.println(set.size());
    }
}
