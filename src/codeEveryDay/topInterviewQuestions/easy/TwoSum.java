package codeEveryDay.topInterviewQuestions.easy;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 22;
        int[] result = twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);

    }

    /**
     * <a href="https://leetcode.com/problems/two-sum/description/">...</a>
     */
    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0 ; i < nums.length ; i++ ){
            for(int j = i+1 ; j < nums.length ; j++ ){
                int sum = nums[i] + nums[j];
                if(sum == target ){
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {0, 0};
    }
}

/*
The code contains two nested loops:

1. The outer loop runs `n` times (`i` from 0 to `n-1`).
2. The inner loop runs up to `n-1` times for each iteration of the outer loop (`j` from `i+1` to `n-1`).

Each loop iteration is `O(n)`, so:

- Outer loop: `O(n)`
- Inner loop: `O(n)`

Combining both loops gives us \( O(n) \times O(n) = O(n^2) \).

Thus, the total time complexity is \( O(n^2) \). */

