class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len=nums1.length+nums2.length;
        double median;
        int[] res=new int[len];
        for(int i=0;i<nums1.length;i++){
            res[i]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            res[nums1.length+i]=nums2[i];
        }
        Arrays.sort(res);
          int len2=res.length;
          if(len2%2!=0)
          median=res[(len2)/2];
          else
          median=(res[len2/2-1]+res[len2/2])/2.0;
          return median;

          
        
    }
}