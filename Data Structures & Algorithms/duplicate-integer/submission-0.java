class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        if(nums.length<2) return false;
        int i=0;
        int j=1;
        while(i<nums.length-1){
            if(nums[i]==nums[i+1]) return true;
            i++;
        }

        return false;
    }    
}