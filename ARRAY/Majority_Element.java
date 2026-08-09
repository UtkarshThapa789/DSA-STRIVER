package ARRAY;
class Solution {

    public int majorityElement(int[] nums) {

        int count = 0;
        int element = 0;

        // Step 1: Find the candidate
        for (int i = 0; i < nums.length; i++) {

            if (count == 0) {
                element = nums[i];
            }

            if (nums[i] == element) {
                count++;
            } else {
                count--;
            }
        }

        // Step 2: Verify the candidate
        count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == element) {
                count++;
            }
        }

        if (count > nums.length / 2) {
            return element;
        }

        return -1;
    }
}

public class Majority_Element {

    public static void main(String[] args) {

        int[] nums = {2, 2, 1, 1, 1, 2, 2};

        Solution obj = new Solution();

        int ans = obj.majorityElement(nums);

        if (ans != -1) {
            System.out.println("Majority Element: " + ans);
        } else {
            System.out.println("No Majority Element Found");
        }
    }
}