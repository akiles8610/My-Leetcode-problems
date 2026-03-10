class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                res[i]=nums[i];
            }
            else{
                int steps=Math.abs(nums[i]);
                int pos=i;
                if(nums[i]>0){
                    for(int j=0;j<steps;j++){
                        pos=(pos + 1) % n;
                    }
                }
                    else{
                        for(int j=0;j<steps;j++){
                            pos=(pos-1 +n) %n;
                        }
                    }
            res[i]=nums[pos];
            }

        }
        return res;
    }
}