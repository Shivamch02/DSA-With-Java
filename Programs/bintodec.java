import java.util.*;

// binary to decimal

class bintodec{

    public static int bintoDec(int binNum){
        int pow = 0;
        int decNum = 0;
        
        while(binNum>0){
            int lastDig = binNum % 10;
            decNum = decNum + (lastDig * (int)Math.pow(2, pow));
            pow++;
            binNum = binNum/10;
            
        }
        return decNum;
    }

    //decimal to binary 

    public static int dectoBin(int n){
        int binNum = 0;
        int pow = 0;

        while(n>0){
            int rem = n%2;
            binNum = binNum + (rem * (int)Math.pow(10,pow));
            pow++;
            n = n/2;
        }
        return binNum;
    }

    public static void main(String[] args) {
        System.out.println("hello world");
        // System.out.println(bintoDec(101));
        System.out.println(dectoBin(11));
    }
}