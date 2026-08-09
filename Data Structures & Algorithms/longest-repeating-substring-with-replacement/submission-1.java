class Solution {
    public int characterReplacement(String s, int k) {
        int[] bank=new int[26];
        int left=0;
        int currentMax=0;
        int out=0;
        for(int right=0;right<s.length();right++){
            bank[s.charAt(right)-'A']++;
            currentMax=Math.max(currentMax,bank[s.charAt(right)-'A']);
            while((right-left+1-currentMax)>k){
                bank[s.charAt(left)-'A']--;

                left++;
            }
            out=Math.max(out,right-left+1);
        }
        return out;

        
    }
}
