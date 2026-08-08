class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right=numbers.length-1;
        int[] out=new int[2];
        while(left<right){
            int curSum=numbers[left]+numbers[right];
            if(curSum<target){
                left++;
            }else if(curSum>target){
                right--;
            }else if(curSum==target){
                out[0]=left+1;
                out[1]=right+1;
                return out;
            }
        }
        return out;
        
    }
}
