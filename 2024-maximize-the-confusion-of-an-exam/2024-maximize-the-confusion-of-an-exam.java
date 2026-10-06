class Solution {
    public int maxConsecutiveAnswers(String answer, int k) {
        // Two pass sliding window 
        int i=0;
        int j =0;
        int result = 0;
        int countF = 0;
        int n = answer.length();
        while(j<n){
            if(answer.charAt(j)=='F'){
countF++;
            }
            while(countF>k){
                if(answer.charAt(i)=='F'){
                    countF--;
                }
                i++;
            }
            result = Math.max(result, j-i+1);
            j++;
        }


        i=0;
        j=0;
        int countT=0;
        while(j<n){
            if(answer.charAt(j)=='T'){
countT++;
            }
            
            while(countT>k){
                if(answer.charAt(i)=='T'){
                    countT--;
                }
                i++;
            }
            result = Math.max(result, j-i+1);
            j++;
        }
         return result;
    }
}