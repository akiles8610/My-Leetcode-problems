class Solution{
    public int countNumbersWithUniqueDigits(int n){
        if(n==0)return 1;
        n=Math.min(n,10);

        int ans=1,cur=9;
        for(int i=1;i<=n;i++){
            ans+=cur;
            cur*=10-i;
        }
        return ans;
    }
}
