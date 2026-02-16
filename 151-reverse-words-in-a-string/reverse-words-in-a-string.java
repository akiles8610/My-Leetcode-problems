class Solution {
    public String reverseWords(String s) {
        String[] hi=s.split(" +");
        StringBuilder sb=new StringBuilder();
        for(int i=hi.length-1;i>=0;i--){
            sb.append(hi[i]);
            sb.append(" ");
        }
        return sb.toString().trim();


        
    }
}