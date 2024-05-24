package codeEveryDay.topInterviewQuestions.easy;

public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 121;
        boolean result = isPalindrome(x);
        System.out.println("Indices: " + result);

    }

    /**
     * <a href="https://leetcode.com/problems/palindrome-number/">...</a>
     */
    public static boolean isPalindrome(int x) {
        int r = 0;
        int z = x;
        if (z < 0){
            return false;
        }
      while (z>0){
                int y = z % 10;
                r = r * 10 + y;
                z = z / 10;
        }
        return r == x;
    }
}


