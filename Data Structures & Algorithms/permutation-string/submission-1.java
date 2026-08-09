class Solution {
    public boolean matches(int[] a,int[] b){
        for(int i=0;i<26;i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        int window=s1.length();
        int[] bank=new int[26];
        for (char c:s1.toCharArray()){
            bank[c-'a']++;
        }
        int right=s1.length()-1;;
        while(right<s2.length()){
            int[] check=new int[26];
            for (int left=right-(s1.length()-1);left<=right;left++){
                check[s2.charAt(left)-'a']++;
            }
            if(Arrays.equals(bank,check)){
                return true;
            }

            right++;
        }
        return false;
        
    }
}
