class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int a[] =new int[2];
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int val=nums[i];
            int ele=target-val;
            if(map.containsKey(ele)&&map.get(ele)!=i){
                a[0]=i;
                a[1]=map.get(ele);
                return a;
            }
        }
        return a;
    }
}