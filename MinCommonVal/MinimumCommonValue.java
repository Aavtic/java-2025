class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int max = (nums1[m-1]> nums2[n-1]? nums1[m-1]: nums2[n-1]);
        int min = max + 1;

        int i = 0, j = 0;

        while (i < m && j < n) {
            System.out.println(i + " " + j);
            if (nums1[i] < nums2[j]) {
                ++i;
            } else if (nums1[i] > nums2[j])  {
                ++j;
            } else {
                if (nums1[i] < min) {
                    return nums1[i];
                }

            }
        }

        return -1;
    }
}
