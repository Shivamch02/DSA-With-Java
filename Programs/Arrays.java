import java.util.*;

public class Arrays {

    // public static int getLargest(int numbers[]) {
    // int largest = Integer.MIN_VALUE;
    // for (int i = 0; i < numbers.length; i++) {
    // if (largest < numbers[i]) {
    // largest = numbers[i];
    // }
    // }
    // return largest;
    // }

    // public static int linearSearch(int numbers[], int key) {

    // // linear search

    // for (int i = 0; i < numbers.length; i++) {
    // if (numbers[i] == key) {
    // return i;
    // }
    // }
    // return -1;
    // }

    // // Binary Search

    // public static int binarySearch(int numbers[], int key) {

    // int start = 0;
    // int end = numbers.length - 1;

    // while (start <= end) {
    // int mid = (start + end) / 2;
    // if (numbers[mid] == key) {
    // return mid;
    // }
    // if (numbers[mid] < key) {
    // start = mid + 1;

    // } else {
    // end = mid - 1;
    // }
    // }
    // return -1;
    // }

    // // Reverse An Array
    // public static void reverse(int numbers[]) {
    // int start = 0;
    // int end = numbers.length - 1;
    // while (start < end) {
    // int temp = numbers[end];
    // numbers[end] = numbers[start];
    // numbers[start] = temp;

    // start++;
    // end--;
    // }

    // }

    // // print Pairs in array
    // public static void printPairs(int numbers[]) {

    // for (int i = 0; i <= numbers.length - 1; i++) {
    // int curr = numbers[i];
    // for (int j = i + 1; j <= numbers.length - 1; j++) {
    // System.out.print("(" + curr + "," + numbers[j] + ")");
    // }
    // System.out.println();
    // }

    // }

    // // pair sum for target value
    // public static int pairSum(int numbers[], int key) {
    // for (int i = 0; i <= numbers.length - 1; i++) {
    // int curr = numbers[i];
    // for (int j = i + 1; j <= numbers.length - 1; j++) {
    // if ((curr + numbers[j]) == key) {
    // System.out.println("(" + curr + "," + numbers[j] + ")");
    // }
    // }
    // }
    // return -1;

    // }

    // // Print sub arrays
    // public static void printSubArray(int numbers[]) {

    // for (int i = 0; i < numbers.length; i++) {
    // for (int j = i; j < numbers.length; j++) {
    // for (int k = i; k <= j; k++) {
    // System.out.print(numbers[k] + " ");
    // }
    // System.out.println();
    // }
    // System.out.println();
    // }
    // }

    // // max subarray

    // public static int maxSubArray(int numbers[]) {
    // int maxsubArray = 0;
    // int prefix[] = new int[numbers.length];
    // prefix[0] = numbers[0];
    // // calculating prefix array
    // for (int i = 1; i < prefix.length; i++) {
    // prefix[i] = prefix[i - 1] + numbers[i];
    // }

    // for (int i = 0; i < numbers.length; i++) {
    // int currSum = 0;
    // for (int j = i; j < numbers.length; j++) {
    // currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];

    // if (maxsubArray < currSum) {
    // maxsubArray = currSum;
    // }
    // }

    // }
    // return maxsubArray;
    // }

    // maximum subarray sum using kadanes algorithm optimized approach
    // public static void kadanes(int numbers[]) {
    // int ms = Integer.MIN_VALUE;
    // int cs = 0;
    // for (int i = 0; i < numbers.length; i++) {

    // cs = cs + numbers[i];
    // if (cs < 0) {
    // cs = 0;
    // }

    // ms = Math.max(cs, ms);
    // System.out.println(ms);

    // }
    // System.out.println(ms);

    // }

    // Trapping rain water
    // public static int trappedRainwater(int height[]) {

    // int n = height.length;
    // // calculate left max boundry - array
    // int leftMax[] = new int[n];
    // leftMax[0] = height[0];

    // for (int i = 1; i < n; i++) {

    // leftMax[i] = Math.max(leftMax[i - 1], height[i]);

    // }

    // // calculate right max boundry - array

    // int rightMax[] = new int[n];
    // rightMax[n - 1] = height[n - 1];

    // for (int i = n - 2; i >= 0; i--) {
    // rightMax[i] = Math.max(rightMax[i + 1], height[i]);
    // }

    // // loop for calculating trapped water

    // int trappedWater = 0;

    // for (int i = 0; i < n; i++) {

    // // calculate water level = Min(rightmaxboundry , leftmaxboundry);

    // int waterLevel = Math.min(rightMax[i], leftMax[i]);

    // // calculate trapped water = water level - height[i];

    // trappedWater += waterLevel - height[i];

    // }
    // return trappedWater;
    // }

    // buy and sell stocks
    // public static int buyAndSellStocks(int prices[]) {

    //     int buyPrice = Integer.MAX_VALUE;
    //     int maxProfit = 0;

    //     for (int i = 0; i < prices.length; i++) {
    //         if (buyPrice < prices[i]) {
    //             int profit = prices[i] - buyPrice;

    //             maxProfit = Math.max(maxProfit, profit);
    //         } else {
    //             buyPrice = prices[i];
    //         }
    //     }

    //     return maxProfit;

    // }

    public static void main(String[] args) {
        // int numbers[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        // int key =10;
        // int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        // int prices[] = { 7, 1, 5, 3, 6, 4 };

        // calling linear search fxn
        // System.out.println(linearSearch(numbers,key));
        // calling get largest in array fxn
        // System.out.println(getLargest(numbers));
        // calling binarySearch fxn
        // System.out.println(binarySearch(numbers, key));
        // calling reverse fxn
        // reverse(numbers);
        // printing the array
        // for (int i = 0; i < numbers.length - 1; i++) {
        // System.out.print(numbers[i]);
        // }
        // calling print pairs fxn
        // printPairs(numbers);
        // calling pair sum fxn
        // pairSum(numbers, key);
        // calling print sub array fxn
        // printSubArray(numbers);
        // calling maxsubarray fxn
        // System.out.println(maxSubArray(numbers));
        // calling kadanes fxn
        // kadanes(numbers);
        // calling trappedRainwater fxn
        // System.out.println(trappedRainwater(height));
        // calling buy and sell stocks fxn
        // System.out.println(buyAndSellStocks(prices));

    }
}