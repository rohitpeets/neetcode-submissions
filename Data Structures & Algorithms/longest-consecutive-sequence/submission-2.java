class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
            }else
            {
                HashSet<Integer> bank=new HashSet<>();
                int longest=1;
                for(int i:nums){
                    bank.add(i);
                }
                for (int keys:bank){
                    if(!bank.contains(keys-1)){
                        int currentNumber=keys;
                        int streak=1;
                        while(bank.contains(currentNumber+1)){
                            streak+=1;
                            currentNumber+=1;
                        }longest=Math.max(longest,streak);
                
        }
        
        
    }return longest;}
}}
