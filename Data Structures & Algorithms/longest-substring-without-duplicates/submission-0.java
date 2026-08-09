class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        Set<Character> bank=new HashSet<>();
        int result=0;
        for(int right=0;right<s.length();right++){
            char c=s.charAt(right);
            while(bank.contains(c)){
                bank.remove(s.charAt(left));
                left++;
            }
            bank.add(c);
            result=Math.max(result,right-left+1);
        }

        
        return result;
        
    }
}
