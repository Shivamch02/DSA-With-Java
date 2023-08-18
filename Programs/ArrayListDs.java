
// import java.util.ArrayList;
// import java.util.Collections;
import java.util.*;

public class ArrayListDs {

    // public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
    // int temp = list.get(idx1);
    // list.set(idx1, list.get(idx2));
    // list.set(idx2, temp);

    // }

    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<>();
        // add method
        // list.add(1);// tc = o(1)
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);

        // list.add(1, 9); // o(n)

        // System.out.println(list);
        // System.out.println(list.size());

        // get method tc=o(1)
        // System.out.println(list.get(2));

        // remove method
        // list.remove(2);// tc =o(n)
        // System.out.println(list);

        // set method tc=o(n)
        // list.set(2, 10);
        // System.out.println(list);

        // contains method
        // System.out.println(list.contains(4));

        // int idx1 = 1;
        // int idx2 = 3;
        // System.out.println(list);
        // swap(list, idx1, idx2);
        // System.out.println(list);

        // System.out.println(list);
        // Collections.sort(list);// ascending
        // System.out.println(list);
        // Collections.sort(list, Collections.reverseOrder());// decending order
        // System.out.println(list);

        // 2d ArrayList
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        mainList.add(list);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);
        list2.add(8);
        list2.add(10);
        mainList.add(list2);

        ArrayList<Integer> list3 = new ArrayList<>();
        list.add(3);
        list.add(6);
        list.add(9);
        list.add(12);
        list.add(15);
        mainList.add(list3);

        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for (int j = 0; j < currList.size(); j++) {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }

        System.out.println(mainList);

    }
}
