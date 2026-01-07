class Solution {
    public int missingNumber(int[] nums) {
        int len=nums.length;
        Arrays.sort(nums);
        int sum=0;
        for(int i:nums){
        sum+=i;
        }
        int total=len*(len+1)/2;
        return total-sum;

    }
}