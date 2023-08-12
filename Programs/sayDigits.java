import java.util.*;

public class sayDigits {

    public static void saydigits(int n, String digits[]) {
        if (n == 0) {
            return;
        }
        int i = n % 10;
        n = n / 10;

        System.out.print(digits[i] + " ");

    }

    public static void main(String[] args) {

        String[] digits = new String[] { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight",
                "nine" };
        int n = 5;
        saydigits(n, digits);
    }

}