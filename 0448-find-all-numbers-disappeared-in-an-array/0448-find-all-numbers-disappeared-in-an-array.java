class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        List<Integer> res=new ArrayList<>();
        for(int num:nums){
            hs.add(num);
        }
        int n=nums.length;
        for(int i=1;i<=n;i++){
            if(!hs.contains(i)){
                res.add(i);
            }
        }
        return res;
    }
}