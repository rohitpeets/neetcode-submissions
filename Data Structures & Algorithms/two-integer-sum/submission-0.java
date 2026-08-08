class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>bank=new HashMap<>();
        int[] out=new int[2];
        for(int i=0;i<nums.length;i++){
            int goal=target-nums[i];
            if(bank.containsKey(goal)){
                out[1]=i;
                out[0]=bank.get(goal);
                return out;
            }else{
                bank.put(nums[i],i);
            }
            

        }
        return out;
    }
}
