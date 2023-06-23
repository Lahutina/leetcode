public class RemoveDuplicatesFromSortedArray2 {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        boolean duplicates = false;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i] && !duplicates) {
                nums[k++] = nums[i];
                duplicates = true;
            } else if (nums[i - 1] != nums[i]) {
                nums[k++] = nums[i];
                duplicates = false;
            }
        }

        return k;
    }
}
