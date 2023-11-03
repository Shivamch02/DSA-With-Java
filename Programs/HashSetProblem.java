import java.util.*;

public class HashSetProblem {
    public static String getStart(HashMap<String, String> tickets) {
        HashMap<String, String> revMap = new HashMap<>();

        for (String key : tickets.keySet()) {
            revMap.put(tickets.get(key), key);
        }

        for (String key : tickets.keySet()) {
            if (!revMap.containsKey(key)) {
                return key; // starting point
            }
        }
        return null;

    }

    public static void main(String[] args) {
        // int arr1[] = { 7, 3, 9 };
        // int arr2[] = { 6, 3, 9, 2, 9, 4 };

        // union and intersection

        // HashSet<Integer> set = new HashSet<>();

        // for (int i = 0; i < arr1.length; i++) {
        // set.add(arr1[i]);
        // }

        // for (int i = 0; i < arr2.length; i++) {
        // set.add(arr2[i]);
        // }

        // System.out.println(set.size());

        // set.clear();

        // for (int i = 0; i < arr1.length; i++) {
        // set.add(arr1[i]);
        // }

        // int count = 0;
        // for (int i = 0; i < arr2.length; i++) {
        // if (set.contains(arr2[i])) {
        // count++;
        // set.remove(arr2[i]);
        // }
        // }
        // System.out.println(count);

        HashMap<String, String> tickets = new HashMap<>(); // tc 0(n)
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);
        System.out.print(start);
        for (String key : tickets.keySet()) {
            System.out.print("->" + tickets.get(start));
            start = tickets.get(start);
        }
        System.out.println();
    }
}
