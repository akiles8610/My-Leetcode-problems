class Solution {
    public int subtractProductAndSum(int n) {
        int temp=n;
        int sum=0,prod=1;
        while(temp!=0){
            int digit=temp%10;
            sum+=digit;
            prod*=digit;
            temp=temp/10;
        }
        int diff=prod-sum;
        return diff;
        
    }
}