class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
       // for(int i=m-1;i<nums1.length;i++){
        int i=m;
            for(int j=0;j<nums2.length;j++){
                nums1[i]=nums2[j];
                i++;
            }
        Arrays.sort(nums1);


        
    }
}