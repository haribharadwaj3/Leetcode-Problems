class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        for(int i=0;i<details.length;i++){
            String age=details[i].substring(11,13);
            int ans=Integer.parseInt(age);
            if(ans>60){
                count++;
            }
        }
        return count;
    }
}