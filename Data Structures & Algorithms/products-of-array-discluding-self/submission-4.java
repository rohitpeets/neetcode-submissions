class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] bank=new int[nums.length];
        bank[0]=1;
        int prefix=1;
        int postfix=1;
        for(int i=0;i<nums.length;i++){
            if(i>0){
                prefix=prefix*nums[i-1];
            }else{
                prefix=1;
            }
            bank[i]=prefix;
        }
         for(int i=nums.length-1;i>=0;i--){
            if(i<nums.length-1){
                postfix=postfix*nums[i+1];
            }else{
                postfix=1;
            }
            bank[i]*=postfix;
        }
        return bank;
        
    }
}  
