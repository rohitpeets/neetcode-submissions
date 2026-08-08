class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> ls = new HashSet<>();
        for(int i:nums){
            if(!ls.contains(i)){
                ls.add(i);
            }else{
                return true;
            }
        }
        return false;
        
    }
}