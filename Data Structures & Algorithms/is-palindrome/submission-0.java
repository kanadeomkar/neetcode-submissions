class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        StringBuffer sb=new StringBuffer(s);
        String s1=sb.reverse().toString();


        if(s1.equals(s)){
            return true;
        }
        return false;
    }
}
