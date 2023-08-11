import java.util.*;

class arrays2d {

    // taking input in 2d arrays

    // public static void inputin2dArrays(int arr[][]) {
    // Scanner sc = new Scanner(System.in);
    // for (int i = 0; i < arr.length; i++) {
    // for (int j = 0; j < arr[0].length; j++) {
    // arr[i][j] = sc.nextInt();
    // }
    // }

    // }

    // printing 2d arrays

    // public static void print2dArray(int arr[][]) {
    // for (int i = 0; i < arr.length; i++) {
    // for (int j = 0; j < arr[0].length; j++) {
    // System.out.print(arr[i][j] + " ");
    // }
    // System.out.println();
    // }

    // }

    // search in 2d arrays

    // public static boolean searchin2dArrays(int arr[][], int key) {
    // for (int i = 0; i < arr.length; i++) {
    // for (int j = 0; j < arr[0].length; j++) {
    // if (arr[i][j] == key) {
    // return true;
    // }

    // }
    // }
    // return false;
    // }

    // printing spiral of 2d arrays

    // public static void spiralPrint(int arr[][]) {
    // int startRow = 0;
    // int endRow = arr.length - 1;
    // int startCol = 0;
    // int endCol = arr[0].length - 1;

    // while (startRow <= endRow && startCol <= endCol) {
    // // top
    // for (int j = startCol; j <= endCol; j++) {
    // System.out.print(arr[startRow][j] + " ");
    // }
    // // right
    // for (int i = startRow + 1; i <= endCol; i++) {
    // System.out.print(arr[i][endCol] + " ");
    // }
    // // bottom
    // for (int j = endCol - 1; j >= startCol; j--) {
    // if (startRow == endRow) {
    // break;
    // }
    // System.out.print(arr[endRow][j] + " ");
    // }
    // // left
    // for (int i = endRow - 1; i >= startRow + 1; i--) {
    // if (startCol == endCol) {
    // break;
    // }
    // System.out.print(arr[i][startCol] + " ");
    // }
    // startCol++;
    // startRow++;
    // endCol--;
    // endRow--;
    // }
    // }

    // diagonal sum problem
    // public static int diagonalSum(int arr[][]) {
    // int sum = 0;
    // for (int i = 0; i < arr.length; i++) {
    // // primary diagonal
    // sum = sum + arr[i][i];
    // // secondry diagonal
    // if (i != arr.length - 1 - i) {
    // sum += arr[i][arr.length - 1 - i];
    // }
    // }
    // return sum;
    // }

    // staircase Search
    // public static boolean staircaseSearch(int arr[][], int key) {
    // int row = 0;
    // int col = arr[0].length - 1;

    // while (row < arr.length && col >= 0) {
    // if (arr[row][col] == key) {
    // return true;
    // } else if (arr[row][col] < key) {
    // row++;
    // } else {
    // col--;
    // }
    // }
    // return false;

    // }

    public static void main(String[] args) {
        System.out.println("2D Arrays");

        int arr[][] = { { 10, 20, 30 },
                { 15, 25, 35 },
                { 27, 29, 37 } };

        int key = 35;

        // int key = 11;

        // inputin2dArrays(arr);

        // print2dArray(arr);

        // System.out.println(searchin2dArrays(arr, key));

        // spiralPrint(arr);

        // System.out.println(diagonalSum(arr));

        // System.out.println(staircaseSearch(arr, key));
    }
}