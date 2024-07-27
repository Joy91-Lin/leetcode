/**
 * 88. Merge Sorted Array----pre practice
 * 可建新array空間
 * 
 * T: O(m+n)
 * S: O(m+n)
 */
 class Solution {
    public static void main(String[] args) {
        int[] n1 = new int[]{1,2,3,0,0,0};
        int[] n2 = new int[]{2,5,6};
        merge(n1, 3, n2, 3);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[nums1.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < m && j < n) {
            if(nums1[i] < nums2[j]){
                result[k] = nums1[i];
                i++;
            } else {
                result[k] = nums2[j];
                j++;
            }
            k++;
        }

        while(i < m){
            result[k] = nums1[i];
            i++;
            k++;
        }
        while(j < n){
            result[k] = nums2[j];
            j++;
            k++;
        }
        System.arraycopy(result, 0, nums1, 0, nums1.length);
    }
}