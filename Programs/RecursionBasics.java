import javax.swing.UIDefaults.ProxyLazyValue;

public class RecursionBasics {

    public static void PrintDec(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        PrintDec(n - 1);
    }

    public static void PrintInc(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        PrintInc(n - 1);
        System.out.print(n + " ");
    }

    public static int fact(int n) {
        if (n == 1) {
            return 1;
        }
        int fn = n * fact(n - 1);
        return fn;
    }

    public static int calcSum(int n) {
        if (n == 1) {
            return 1;
        }
        int sum = n + calcSum(n - 1);
        return sum;
    }

    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int fnm1 = fib(n - 1);
        int fnm2 = fib(n - 2);

        int fn = fnm1 + fnm2;
        return fn;
    }

    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return isSorted(arr, i + 1);
    }

    public static int firstOccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }

        return firstOccurence(arr, key, i + 1);
    }

    public static int lastOccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccurence(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }

        return isFound;
    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }

    public static int optimizedPower(int a, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = optimizedPower(a, n / 2);
        int halfPowerSq = halfPower * halfPower;

        if (n % 2 != 0) {
            halfPowerSq = a * halfPowerSq;
        }
        return halfPowerSq;
    }

    public static int tilingProblem(int n) {
        if (n == 0 || n == 1) {
            return 1;

        }

        // verticle case
        int fnm1 = tilingProblem(n - 1);

        // horizontal case
        int fnm2 = tilingProblem(n - 2);

        int totWays = fnm1 + fnm2;
        return totWays;
    }

    public static void removeDuplicatesInString(String str, int idx, StringBuilder newStr, boolean map[]) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        // kaam
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            // duplicate find
            removeDuplicatesInString(str, idx + 1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicatesInString(str, idx + 1, newStr.append(currChar), map);
        }
    }

    public static int friendsPairing(int n) {
        if (n == 1 || n == 2)
            return n;
        return friendsPairing(n - 1) + (n - 1) * friendsPairing(n - 2);
    }

    public static void printBinString(int n, int lastPlace, String str) {

        if (n == 0) {
            System.out.println(str);
            return;
        }
        printBinString(n - 1, 0, str + "0");
        if (lastPlace == 0) {
            printBinString(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
        // String str = "appnnacollege";
        // removeDuplicatesInString(str, 0, new StringBuilder(""), new boolean[26]);
        // System.out.println(friendsPairing(3));
        // printBinString(3, 0, "0");
        PrintDec(5);

    }

}
