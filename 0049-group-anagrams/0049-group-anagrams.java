class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String s:strs){
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String st=new String(ch);
            List<String> list=map.getOrDefault(st,new ArrayList<>());
            list.add(s);
            map.put(st,list);
        }
        return new ArrayList<>(map.values());
    }
}