class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        int s1freq[]=new int[26];
        int s2freq[]=new int[26];
        for(int i=0;i<s1.length();i++){
            s1freq[s1.charAt(i)-'a']++;
            s2freq[s2.charAt(i)-'a']++;
        }
        if(matches(s1freq,s2freq)){
            return true;
        }
        for(int right=s1.length();right<s2.length();right++){
            s2freq[s2.charAt(right)-'a']++;
            s2freq[s2.charAt(right-s1.length())-'a']--;
            if(matches(s1freq,s2freq)){
                return true;
            }
        }
        return false;
    }
    private boolean matches(int[] s1freq,int[] s2freq){
        for(int i=0;i<26;i++){
            if(s1freq[i]!=s2freq[i]){
                return false;
            }
        }
        return true;
    }
}
