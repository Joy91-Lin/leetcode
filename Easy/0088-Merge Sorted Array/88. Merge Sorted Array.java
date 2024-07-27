/**
 * 88. Merge Sorted Array
 * 
 * Hint: backward
 * T: O(m+n)
 * S: O(1)
 */


 class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = --m;
        int j = --n;
        int k = nums1.length - 1;
        while (i >= 0 && j >= 0){
            if(nums1[i] < nums2[j]){
                nums1[k] = nums2[j];
                j--;
            } else{
                nums1[k] = nums1[i];
                i--;
            }
            k--;
        }

        while(j >= 0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}