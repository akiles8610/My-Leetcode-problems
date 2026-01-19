class Solution{
    public int findNthDigit(int n){
        long len=1,cnt=9,start=1;
        while(n>len*cnt){
            n-=len*cnt;
            len++;
            cnt*=10;
            start*=10;
        }
        return String.valueOf(start+(n-1)/len).charAt((int)((n-1)%len))-'0';
    }
}
