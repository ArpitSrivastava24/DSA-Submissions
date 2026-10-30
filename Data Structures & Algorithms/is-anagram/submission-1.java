class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] alphabet=new int[26];
        for(char i:s.toCharArray()){
            alphabet[i-'a']++;
        }

        for(char i:t.toCharArray()){
            alphabet[i-'a']--;
        }

        for(int i:alphabet){
            if(i>0) return false;
        }

        return true;
    }
}
