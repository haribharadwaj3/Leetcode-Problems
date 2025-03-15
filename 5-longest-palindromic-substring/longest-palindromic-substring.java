class Solution {
    public String longestPalindrome(String s) {
        String ans="";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String temp=s.substring(i,j);
                if(palindrome(temp) && temp.length()>ans.length()){
                    ans=temp;
                }
            }
        }
        return ans;
    }
    boolean palindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}