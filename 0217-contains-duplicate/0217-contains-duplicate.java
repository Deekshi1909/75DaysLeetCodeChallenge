class Solution {
    public boolean containsDuplicate(int[] nums) {
        //TLE-Due to 2 loops
       /* for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j])
                return true;
            }
        }
        return false;*/
        HashSet<Integer> hs=new HashSet<>();
        for( int num:nums){
            if(hs.contains(num))
            return true;
            hs.add(num);
        }
        return false;
    }
}