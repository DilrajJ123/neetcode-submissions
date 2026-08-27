class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int pointerOne = m - 1;
        int pointerTwo = n - 1;
        int pointer = m + n - 1;


        while (pointerOne >= 0 && pointerTwo >= 0){
            if (nums1[pointerOne] > nums2[pointerTwo]){
                nums1[pointer] = nums1[pointerOne];
                pointerOne--;
            }
            else {
                nums1[pointer] = nums2[pointerTwo];
                pointerTwo--;
            }
            pointer--;
        }
        while (pointerTwo >= 0){
            nums1[pointer] = nums2[pointerTwo];
            pointerTwo--;
            pointer--;
        }
    }
}