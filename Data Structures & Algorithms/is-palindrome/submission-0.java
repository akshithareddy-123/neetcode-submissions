class Solution {
    public boolean isPalindrome(String s) {
        String rev="";
        s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
       return s.equals(rev);
    }
}
