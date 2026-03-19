class Solution {
    public boolean isPalindrome(String s) {
        String str="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch))
            str+=Character.toLowerCase(ch);
        }
        String sb=new StringBuilder(str).reverse().toString();
        return (str.equals(sb));
    }
}