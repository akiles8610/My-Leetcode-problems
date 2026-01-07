class Solution {
    public int maximumProduct(int[] nums) {
        int prod=1,prod2=1;;
        int n=nums.length;
        Arrays.sort(nums);
        int a=nums[n-1],b=nums[n-2],c=nums[n-3];
         prod=a*b*c;
         prod2=nums[0]*nums[1]*nums[n-1];
         if(prod>prod2){
         return prod;
         }

        return prod2;
        
    }
}