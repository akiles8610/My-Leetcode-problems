class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res=new int[nums1.length];

        
        for(int i=0;i<nums1.length;i++){
        int k=-1;
            for(int v=0;v<nums2.length;v++){
                if(nums1[i]==nums2[v]){
                    k=v;
                    break;
                }
            }
                int a=-1;
            for(int j=k+1;j<nums2.length;j++){
                if(nums2[j]>nums1[i]){
                    a=nums2[j];
                    break;
                }
            }
            res[i]=a;
        }
         return res;
            
            

        
    }
}