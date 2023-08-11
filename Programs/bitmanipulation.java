class bitmanipulation {
    // Even or Odd by bits
    // public static void oddOrEven(int n) {
    // int bitMask = 1;
    // if ((n & bitMask) == 0) {
    // System.out.println("Even");
    // } else {
    // System.out.println("Odd");
    // }
    // }

    // Get Ith bit
    // public static int getIthBit(int n, int i) {
    // int bitMask = 1 << i;
    // if ((n & bitMask) == 0) {
    // return 0;
    // } else {
    // return 1;
    // }
    // }

    // set ith bit
    // public static int setIthBit(int n, int i) {
    // int bitMask = 1 << i;
    // return n | bitMask;
    // }

    // clear ith bit
    // public static int clearIthBit(int n, int i) {
    // int bitMask = ~(1 << i);
    // return n & bitMask;
    // }

    // update ith bit
    // public static int updateIthBit(int n, int i, int newBit) {
    // if (newBit == 0) {
    // return clearIthBit(10, 1);
    // } else {
    // return setIthBit(10, 2);
    // }
    // }

    // clear i bits
    // public static int clearIBits(int n, int i) {
    // int bitMask = (~0) << i;
    // return n & bitMask;
    // }

    // power of two
    // public static boolean isPowerOfTwo(int n) {
    // return (n & (n - 1)) == 0;
    // }

    // count set bits
    public static int countSetBits(int n) {
    int count = 0;
    while (n > 0) {
    if ((n & 1) != 0) {
    count++;
    }
    n = n >> 1;
    }
    return count;
    }

    // fast expo
    public static int fastExpo(int a, int n) {
        int answer = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                answer = answer * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        // oddOrEven(5);
        System.out.println(fastExpo(3, 5));
    }
}