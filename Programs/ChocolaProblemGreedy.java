import java.util.Comparator;
import java.util.*;

public class ChocolaProblemGreedy {
    public static void main(String[] args) {
        int n = 4;
        int m = 6;
        Integer costVer[] = { 2, 1, 3, 1, 4 };// m-1;
        Integer costHor[] = { 4, 1, 2 }; // n-1;

        Arrays.sort(costHor, Collections.reverseOrder());
        Arrays.sort(costVer, Collections.reverseOrder());

        int h = 0, v = 0;
        int hp = 1;
        int vp = 1;
        int cost = 0;

        while (h < costHor.length && v < costVer.length) {
            // vertical cost < horizontal cost
            if (costVer[v] <= costHor[h]) { // horizontal cut
                cost += (costHor[h] * vp);
                hp++;
                h++;
            } else {
                cost += (costVer[v] * hp);
                vp++;
                v++;
            }
        }

        while (h < costHor.length) {
            cost += (costHor[h] * vp);
            hp++;
            h++;
        }

        while (v < costVer.length) {
            cost += (costVer[v] * hp);
            vp++;
            v++;
        }

        System.out.println("min cost of cuts =" + cost);
    }
}