class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        for(char c:s.toCharArray()){
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        for(char c:t.toCharArray()){
            map2.put(c,map2.getOrDefault(c,0)+1);
        }
        if(s.length()!=t.length())
        return false;
        for(char c:s.toCharArray()){
            int val=map1.get(c);
            if(map2.containsKey(c)){
                if(val!=map2.get(c))
                return false;
            }
            else
            return false;
        }
        return true;
    }
}