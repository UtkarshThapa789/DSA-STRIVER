package ARRAY;

public class Next_Permutation {

    // Function to find the next permutation
    public static void nextPermutation(int[] nums) {

        int idx = -1;
        int n = nums.length;

        // Step 1: Find the breakpoint
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                idx = i;
                break;
            }
        }

        // Step 2: If no breakpoint exists, reverse the whole array
        if (idx == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        // Step 3: Find the next greater element from the right
        for (int i = n - 1; i > idx; i--) {
            if (nums[i] > nums[idx]) {
                swap(nums, i, idx);
                break;
            }
        }

        // Step 4: Reverse the suffix
        reverse(nums, idx + 1, n - 1);
    }

    // Swap two elements
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Reverse part of the array
    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};

        System.out.print("Original Array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        nextPermutation(nums);

        System.out.print("\nNext Permutation: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}