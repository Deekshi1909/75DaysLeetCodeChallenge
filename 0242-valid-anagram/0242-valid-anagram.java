class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char ch:s.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        for(char c:t.toCharArray()){
            if(!hm.containsKey(c)){
                return false;
            }
            hm.put(c,hm.get(c)-1);
            if(hm.get(c)==0){
                hm.remove(c);
            }
        }
        return hm.isEmpty();    
    }
}