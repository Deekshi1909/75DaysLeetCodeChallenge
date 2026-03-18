class Solution {
    public int[] productExceptSelf(int[] nums) {
       /* int[] a=new int[nums.length];
        int p=0;
        for(int i=0;i<nums.length;i++){
            int idx=i;int temp=1;
            for(int j=0;j<nums.length;j++){
                if(j==idx)
                continue;
                temp*=nums[j];
            }
            a[p++]=temp;
        }
        return a;*/
        int[] ans=new int[nums.length];
        ans[0]=1;
        int n=nums.length;
        for(int i=1;i<n;i++){
            ans[i]=ans[i-1]*nums[i-1];
        }
        int suffix=1;
        for(int i=n-1;i>=0;i--){
            ans[i]=ans[i]*suffix;
            suffix*=nums[i];
        }
        return ans;
    }
}