class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer>[] li=new List[nums.length+1];
        for(int key:map.keySet()){
            int freq=map.get(key);
            if(li[freq]==null){
                li[freq]=new ArrayList<>();
            }
            li[freq].add(key);
        }
        int[] res=new int[k];
        int idx=0;
        for(int i=li.length-1;i>=0&&idx<k;i--){
            if(li[i]!=null){
                for(int num:li[i]){
                    res[idx++]=num;
                    if(idx==k)
                    break;
                }
            }
        }
        return res;
    }
}