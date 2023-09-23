import java.util.*;
import java.util.Arrays;
import java.util.Comparator;

public class Greedy {

    // ************** Activity Selection Problem ***************/
    // public static int activitySelection(int start[], int end[]) { // tc = o(n);
    // int maxAct = 0;
    // ArrayList<Integer> ans = new ArrayList<>();

    // // if end array is not sorted then sort the end array
    // int[][] activities = new int[start.length][3];
    // for (int i = 0; i < activities.length; i++) {
    // activities[i][0] = i;
    // activities[i][1] = start[i];
    // activities[i][2] = end[i];
    // }

    // // sort the activities array
    // Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

    // // first activity
    // maxAct = 1;
    // ans.add(0);

    // int lastEnd = end[0];
    // for (int i = 1; i < end.length; i++) {
    // if (start[i] >= lastEnd) {
    // maxAct++;
    // ans.add(i);
    // lastEnd = end[i];
    // }
    // }
    // return maxAct;

    // }

    // public static int maxValue(int val[], int weight[], int w) {
    // double ratio[][] = new double[val.length][2];
    // // 0th index and 1st ratio
    // for (int i = 0; i < val.length; i++) {
    // ratio[i][0] = i;
    // ratio[i][1] = val[i] / (double) weight[i];
    // }

    // Arrays.sort(ratio, Comparator.comparingDouble(arr -> arr[1]));

    // int capacity = w;
    // int finalValue = 0;
    // for (int i = ratio.length - 1; i >= 0; i--) {
    // int idx = (int) ratio[i][0];
    // if (capacity >= weight[idx]) {// include full item
    // finalValue += val[idx];
    // capacity -= weight[idx];
    // } else {// include fractional item
    // finalValue += ratio[i][1] * capacity;
    // capacity = 0;
    // break;
    // }
    // }
    // return finalValue;

    // }

    // public static int minAbsDifference(int A[], int B[]) {
    // Arrays.sort(A);
    // Arrays.sort(B);

    // int minDiff = 0;
    // for (int i = 0; i < A.length; i++) {
    // minDiff += Math.abs(A[i] - B[i]);
    // }
    // return minDiff;
    // }

    // public static int maxPairChain(int pairs[][]) {
    // Arrays.sort(pairs, Comparator.comparingDouble(arr -> arr[1]));

    // int chainLen = 1;
    // int chainEnd = pairs[0][1];

    // for (int i = 1; i < pairs.length; i++) {
    // if (pairs[i][0] > chainEnd) {
    // chainLen++;
    // chainEnd = pairs[i][1];
    // }
    // }
    // return chainLen;
    // }

    public static int indianCoins(Integer[] coins, int amount) {
        Arrays.sort(coins, Comparator.reverseOrder());

        int countCoins = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] <= amount) {
                while (coins[i] <= amount) {
                    countCoins++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
        return countCoins;

    }

    public static void main(String[] args) {
        // int[] start = { 1, 3, 0, 5, 8, 5 };
        // int[] end = { 2, 4, 6, 7, 9, 9 };

        // System.out.println(activitySelection(start, end));

        // int val[] = { 60, 100, 120 };
        // int weight[] = { 10, 20, 30 };
        // int w = 50;

        // System.out.println(maxValue(val, weight, w));

        // int A[] = { 1, 2, 3 };
        // int B[] = { 2, 1, 3 };

        // System.out.println(minAbsDifference(A, B));

        // int pairs[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };
        // System.out.println(maxPairChain(pairs));

        Integer coins[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };
        int amount = 1990;
        System.out.println(indianCoins(coins, amount));

    }
}
