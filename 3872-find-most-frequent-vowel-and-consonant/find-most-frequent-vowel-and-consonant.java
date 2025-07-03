class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int vowel=0;
        int consonant=0;
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(isVowel(entry.getKey())){
                vowel=Math.max(vowel,entry.getValue());
            }else{
                consonant=Math.max(consonant,entry.getValue());
            }
        }
        int ans=vowel+consonant;
        return ans;
    }
    public boolean isVowel(char s){
        return s=='a' || s=='e' || s=='i' || s=='o' || s=='u';
    }
}