class Solution {
    public int pivotIndex(int[] nums) {
        
        int sum = 0;
        for(int i =0; i<nums.length; i++){
            sum +=nums[i];
        }
        if(sum-nums[0] == 0){
            return 0;
        }
        int Sum = 0;
        for(int i =0; i<nums.length; i++){
            sum -= nums[i];
            if(sum == Sum){
                return i;
            }
            Sum +=nums[i];
        }
        return -1;
    }
}