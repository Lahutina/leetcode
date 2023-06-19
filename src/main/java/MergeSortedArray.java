public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = n + m - 1, mi = m - 1, ni = n - 1;

        while (mi >= 0 && ni >= 0 && i >= 0) {
            if (nums1[mi] >= nums2[ni]) {
                nums1[i] = nums1[mi];
                mi--;
            } else {
                nums1[i] = nums2[ni];
                ni--;
            }
            i--;
        }

        while (ni >= 0) {
            nums1[i] = nums2[ni];
            ni--;
            i--;
        }
    }
}
