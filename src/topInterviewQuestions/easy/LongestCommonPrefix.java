package topInterviewQuestions.easy;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] arrayOfStrings = {"flower", "flow", "flight"};
        String result = longestCommonPrefix(arrayOfStrings);
        System.out.println("result: " + result);

    }

    /**
     * <a href="https://leetcode.com/problems/longest-common-prefix/">...</a>
     */
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];

        int i = 0;
        while (i < first.length() && i < last.length() && first.charAt(i) == last.charAt(i)) {
            i++;
        }

        return first.substring(0, i);
    }
}

/*
Overall Time Complexity:
The sorting step dominates the complexity, which is 𝑂(𝑛log⁡𝑛)O(n log n).
The prefix comparison step adds an additional 𝑂(𝑚)O(m) complexity.
Thus, the overall time complexity of the code is:𝑂(𝑛log𝑛+𝑚)O(n log n+m)
. */

