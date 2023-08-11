import java.net.SocketTimeoutException;
import java.util.*;
import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class Strings {
    // // is string palindrome
    // public static boolean isPalindrome(String str) {
    // for (int i = 0; i < str.length() / 2; i++) {
    // if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
    // return false;
    // }
    // }
    // return true;
    // }

    // get shortes path
    // public static float getShortestPath(String path) {
    // int x = 0, y = 0;

    // for (int i = 0; i < path.length(); i++) {
    // char dir = path.charAt(i);
    // if (dir == 'S') {
    // y--;
    // } else if (dir == 'N') {
    // y++;
    // } else if (dir == 'W') {
    // x--;
    // } else {
    // x++;
    // }
    // }
    // int X2 = x * x;
    // int Y2 = y * y;

    // return (float) Math.sqrt(X2 + Y2);

    // }

    // SubString
    // public static String subString(String str, int si, int ei) {
    // String subStr = "";
    // for (int i = si; i < ei; i++) {
    // subStr += str.charAt(i);
    // }
    // return subStr;
    // }

    // to Uppercase string
    // public static String toUppercase(String str) {
    // StringBuilder sb = new StringBuilder("");
    // char ch = Character.toUpperCase(str.charAt(0));
    // sb.append(ch);

    // for (int i = 1; i < str.length(); i++) {
    // if (str.charAt(i) == ' ' && i < str.length() - 1) {
    // sb.append(str.charAt(i));
    // i++;
    // sb.append(Character.toUpperCase(str.charAt(i)));

    // } else {
    // sb.append(str.charAt(i));
    // }
    // }
    // return sb.toString();
    // }

    // String compress
    // public static String Compress(String str) {
    // String newStr = "";
    // for (int i = 0; i < str.length(); i++) {
    // Integer count = 1;
    // while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
    // count++;
    // i++;
    // }
    // newStr += str.charAt(i);
    // if (count > 1) {
    // newStr += count.toString();
    // }
    // }
    // return newStr;
    // }

    public static void main(String[] args) {
        // String path = "WNEENESENNN";
        // String str = "hello world";

        // String fruits[] = { "apple", "mango", "banana" };
        // String largest = fruits[0];

        // for (int i = 1; i < fruits.length; i++) {
        // if (largest.compareTo(fruits[i]) < 0) {
        // largest = fruits[i];
        // }
        // }

        // System.out.println(largest);
        // System.out.println(isPalindrome(str));
        // System.out.println(getShortestPath(path));
        // System.out.println(subString(str, 0, 5));
        // System.out.println(toUppercase(str));
        System.out.println(Compress(str));
    }

}
