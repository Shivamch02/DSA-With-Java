class palindrome{

    public static boolean isPalindrome(int n){
        int myNum = n;
        int pow = 0;
        int palindrome =0;

    while (n>0){
        int rem = n%10;
        palindrome = (palindrome*10)+rem;
        pow++;
        n =n/10;
        }
        if(myNum == palindrome){
            return true;
        }
     
        return false;
    }


    public static void main(String[] args) {
        System.out.println(isPalindrome(121));

    }
}