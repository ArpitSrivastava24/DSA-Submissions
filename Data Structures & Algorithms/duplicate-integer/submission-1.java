class Solution {
    public boolean hasDuplicate(int[] nums) {
        ArrayList<Integer> ls=new ArrayList<>();
        for(int i:nums){
            if(ls.contains(i)) return true;
            ls.add(i);
        }

        return false;
    }
    
}