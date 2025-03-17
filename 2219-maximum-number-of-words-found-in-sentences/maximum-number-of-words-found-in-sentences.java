class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(String i:sentences){
            int len=i.split(" ").length;
            if(len>max){
                max=len;
            }
        }
        return max;
    }
}