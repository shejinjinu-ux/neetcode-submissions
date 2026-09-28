class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer>ht=new HashSet<>();
        for(int n:nums)
        {
            if(ht.contains(n))
                return true;
            ht.add(n);

        }
        return false;
    
    }
}