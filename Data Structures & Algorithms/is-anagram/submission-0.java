class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }else{
            int[] ls1=new int[26];
            for(int i=0;i<s.length();i++){
                ls1[s.charAt(i)-'a']++;
                ls1[t.charAt(i)-'a']--;
            }
            for(int j:ls1){
                if(j!=0){
                    return false;
                }
            }
            return true;
        }
        

    }
}
