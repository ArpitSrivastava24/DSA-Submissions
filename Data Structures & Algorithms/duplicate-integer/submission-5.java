class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> ls=new HashSet<>();
        for(int i:nums){
            if(ls.contains(i)) return true;
            ls.add(i);
        }

        return false;
    }
}