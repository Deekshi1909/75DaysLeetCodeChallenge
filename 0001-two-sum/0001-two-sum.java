class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] array=new int[2];
        int k=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    array[k++]=i;
                    array[k++]=j;
                }
            }
        }
        return array;
    }
}