class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0,end=0,maxlen=0;
        ArrayList<Character> li=new ArrayList<>();
        while(end<s.length()){
            if(!li.contains(s.charAt(end))){
                li.add(s.charAt(end));
                end++;
                maxlen=Math.max(maxlen,li.size());
            }
            else{
                li.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }
        return maxlen;
    }
}