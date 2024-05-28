package topInterviewQuestions.easy;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,3,4,4,5,5};
        int result = removeDuplicates(nums);
        System.out.println("Indices: " + result);

    }

    /**
     *<a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array/">...</a>
     */
    public static int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {

                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}


