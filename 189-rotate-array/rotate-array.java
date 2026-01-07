class Solution {
    public void rotate(int[] nums, int k) {
        /*int temp=0;
        for(int i=0;i<k;i++){
         temp=nums[nums.length-1];
        for(int j=nums.length-1;j>0;j--){
         nums[j]=nums[j-1];
       }
         nums[0]=temp;
}
        
    }
}*/
        int n = nums.length;
        k = k % n;

        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
    }
}





