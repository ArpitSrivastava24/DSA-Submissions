class Solution {
    public boolean isPalindrome(String k) {
        String s="";
        for(char i:k.toCharArray()){
            if((i>='a' && i<='z') || (i>='A' && i<='z') || (i>='0' && i<='9')){
                s+=i;
            }
        }
        System.out.println(s);
       s= s.toLowerCase();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }

        return true;
    }
}
